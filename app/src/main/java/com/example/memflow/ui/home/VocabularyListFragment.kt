package com.example.memflow.ui.home

import VocabularyListAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.memflow.R
import com.example.memflow.utils.InjectUtils

class VocabularyListFragment : Fragment() {
    private lateinit var viewModel: VocabularyListViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            InjectUtils.provideVocabularyListViewModelFactory(this).createVocabularyListViewModel()
        return inflater.inflate(R.layout.fragment_vocabulary_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.dictionary.observe(viewLifecycleOwner, Observer {
            viewManager = LinearLayoutManager(this.requireContext())
            viewAdapter = VocabularyListAdapter(it)

            recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view).apply {
                layoutManager = viewManager
                adapter = viewAdapter
            }
        })
    }
}
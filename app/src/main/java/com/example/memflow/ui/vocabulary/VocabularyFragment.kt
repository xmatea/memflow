package com.example.memflow.ui.vocabulary

import VocabularyListAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.memflow.R
import com.example.memflow.data.WordEntry
import com.example.memflow.utils.InjectUtils
import kotlinx.android.synthetic.main.fragment_home.*

class VocabularyFragment : Fragment() {

    private lateinit var viewModel: VocabularyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            InjectUtils.provideVocabularyViewModelFactory(this).createVocabularyViewModel()
        return inflater.inflate(R.layout.fragment_vocabulary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton(view)
    }

    private fun setupButton(root: View) {
        val addButton: Button = root.findViewById(R.id.button_add_to_vocabulary)
        addButton.setOnClickListener {
            val entry = WordEntry("привет", "hei", "RU", "NO")
            viewModel.submitEntry(entry)
            println(entry.entryValue)
        }
    }
}

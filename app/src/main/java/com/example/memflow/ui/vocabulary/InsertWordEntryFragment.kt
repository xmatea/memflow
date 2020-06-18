package com.example.memflow.ui.vocabulary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.memflow.R

class InsertWordEntryFragment : Fragment() {
    private lateinit var viewModel : InsertWordEntryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProviders.of(this).get(InsertWordEntryViewModel::class.java)
        return inflater.inflate(R.layout.fragment_vocabulary, container, false)
    }
}
package com.example.memflow.ui.vocabulary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.memflow.R

class VocabularyFragment : Fragment() {

    private lateinit var vocabularyViewModel: VocabularyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vocabularyViewModel =
            ViewModelProviders.of(this).get(VocabularyViewModel::class.java)
        return inflater.inflate(R.layout.fragment_vocabulary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton(view)
        setupTextView(view)
    }

    private fun setupTextView(root: View) {
        val textView: TextView = root.findViewById(R.id.text_vocabulary)
        vocabularyViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
    }

    private fun setupButton(root: View) {
        val addButton: Button = root.findViewById(R.id.button_add_to_vocabulary)
        addButton.setOnClickListener {
            addToVocab()
        }
    }

    private fun addToVocab() {
        Toast.makeText(context, "added to vocabulary!", Toast.LENGTH_SHORT).show()
    }
}
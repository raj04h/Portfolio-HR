package com.HR.portfolio.ui.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.HR.portfolio.R
import com.HR.portfolio.databinding.FragmentEducationBinding

class EducationFragment : Fragment() {
    private var _binding: FragmentEducationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEducationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Find the TextView in your layout where you want to display the text
        val educationDetailsTextView: TextView = binding.textEdu // Replace with your TextView's ID

        // Set the text from the string resource
        educationDetailsTextView.text = getString(R.string.det_education)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
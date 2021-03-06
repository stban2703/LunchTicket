package com.example.lunchticket.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lunchticket.R
import com.example.lunchticket.databinding.FragmentStudentProfileBinding
import com.example.lunchticket.util.Constants

class StudentProfileFragment : Fragment() {

    // Fragmento que muestra el perfil del estudiante

    private var _binding: FragmentStudentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStudentProfileBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        binding.studentCodeTV.text = Constants.code
        binding.studentNameTV.text = Constants.name
        return view
    }

    companion object {
        fun newInstance() = StudentProfileFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
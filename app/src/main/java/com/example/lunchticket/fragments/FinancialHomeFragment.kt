package com.example.lunchticket.fragments

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lunchticket.FinancialRejectedLunchActivity
import com.example.lunchticket.FinancialRestaurantsDataActivity
import com.example.lunchticket.PostListActivity
import com.example.lunchticket.R
import com.example.lunchticket.databinding.FragmentFinancialHomeBinding
import com.example.lunchticket.util.Constants

class FinancialHomeFragment : Fragment() {

    private var _binding: FragmentFinancialHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFinancialHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        binding.financialRestaurantDataBtn.setOnClickListener {
            val intent = Intent(context, FinancialRestaurantsDataActivity::class.java)
            startActivity(intent)
        }

        binding.financialRejectedBtn.setOnClickListener {
            val intent = Intent(context, FinancialRejectedLunchActivity::class.java)
            startActivity(intent)
        }

        binding.financialPostBtn.setOnClickListener {
            val intent = Intent(context, PostListActivity::class.java)
            startActivity(intent)
        }

        binding.financialHomeNameTV.text = Constants.name
        return view
    }

    companion object {
        fun newInstance() = FinancialHomeFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
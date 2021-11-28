package com.example.lunchticket

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lunchticket.databinding.ActivityProfilePictureBinding
import com.example.lunchticket.fragments.NotPictureFragment
import com.example.lunchticket.fragments.SelectedPictureFragment

class ProfilePictureActivity : AppCompatActivity() {

    lateinit var notPictureFragment: NotPictureFragment
    lateinit var selectedPictureFragment: SelectedPictureFragment
    lateinit var binding: ActivityProfilePictureBinding
    var bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilePictureBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        notPictureFragment = NotPictureFragment.newInstance()
        selectedPictureFragment = SelectedPictureFragment.newInstance()
        showFragment(notPictureFragment)

    }

    private fun showFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.ppFragmentContainer, fragment)
        transaction.commit()
    }
}
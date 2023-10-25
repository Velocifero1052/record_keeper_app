package com.example.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recordkeeper.databinding.FragmentRunningBinding

class RunningFragment : Fragment() {

    private lateinit var binding: FragmentRunningBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
     ): View {
        binding = FragmentRunningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.container3km.setOnClickListener{ launchRunningRecordScreen() }
        binding.container5km.setOnClickListener{ launchRunningRecordScreen() }
        binding.containerHalfMarathon.setOnClickListener{ launchRunningRecordScreen() }
        binding.containerFullMarathon.setOnClickListener{ launchRunningRecordScreen() }
    }

    private fun launchRunningRecordScreen() {
        val intent = Intent(context, EditRunningRecordActivity::class.java)
        startActivity(intent)
    }

}
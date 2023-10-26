package com.example.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recordkeeper.databinding.FragmentCyclingBinding

class CyclingFragment: Fragment() {

    private lateinit var binding: FragmentCyclingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.longestRideContainer.setOnClickListener {
            launchRunningRecordScreen(binding.longestRideTextView.text.toString())
        }
        binding.biggestClimbContainer.setOnClickListener {
            launchRunningRecordScreen(binding.biggestClimbTextView.text.toString())
        }
        binding.bestAverageSpeedContainer.setOnClickListener {
            launchRunningRecordScreen(binding.bestAverageSpeedTextView.text.toString())
        }
    }

    private fun launchRunningRecordScreen(distance: String) {
        val intent = Intent(context, EditCyclingRecordActivity::class.java)
        intent.putExtra("distance", distance)
        startActivity(intent)
    }
}
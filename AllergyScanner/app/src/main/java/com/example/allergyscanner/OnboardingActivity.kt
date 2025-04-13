package com.example.allergyscanner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.allergyscanner.databinding.ActivityOnboardingBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: OnboardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager()
        setupButtons()
    }

    private fun setupViewPager() {
        adapter = OnboardingAdapter(this)
        viewPager = binding.onboardingViewPager
        viewPager.adapter = adapter

        val indicator: DotsIndicator = binding.indicatorLayout
        indicator.setViewPager2(viewPager)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateButtonText(position)
            }
        })
    }

    private fun setupButtons() {
        binding.skipButton.setOnClickListener {
            finishOnboarding()
        }

        binding.nextButton.setOnClickListener {
            if (viewPager.currentItem < adapter.itemCount - 1) {
                viewPager.currentItem = viewPager.currentItem + 1
            } else {
                finishOnboarding()
            }
        }
    }

    private fun updateButtonText(position: Int) {
        binding.nextButton.text = if (position == adapter.itemCount - 1) {
            getString(R.string.get_started)
        } else {
            getString(R.string.next)
        }
    }

    private fun finishOnboarding() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
package com.example.allergyscanner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.allergyscanner.databinding.ActivityAllergenDetailBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AllergenDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllergenDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllergenDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val matches = intent.getParcelableArrayListExtra<AllergenDetector.AllergenMatch>("matches")
        if (matches.isNullOrEmpty()) {
            finish()
            return
        }

        displayAllergenInfo(matches[0])
    }

    private fun displayAllergenInfo(match: AllergenDetector.AllergenMatch) {
        binding.allergenName.text = match.allergen
        binding.confidenceLevel.text = "Confidence: ${(match.confidence * 100).toInt()}%"
        binding.matchedText.text = "Matched text: \"${match.matchedText}\""
        
        val safetyInfo = when {
            match.confidence > 0.9 -> getString(R.string.high_risk_warning)
            match.confidence > 0.7 -> getString(R.string.medium_risk_warning)
            else -> getString(R.string.low_risk_warning)
        }
        binding.safetyInfo.text = safetyInfo
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
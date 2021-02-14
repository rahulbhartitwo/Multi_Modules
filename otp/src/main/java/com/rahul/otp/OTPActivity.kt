package com.rahul.otp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.rahul.otp.databinding.ActivityOTPBinding

class OTPActivity : AppCompatActivity(),  OnOtpCompletionListener {
    lateinit var binding : ActivityOTPBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOTPBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.otpView.setOtpCompletionListener(this)
    }

    override fun onOtpCompleted(otp: String?) {
        binding.textView.text = "OTP is $otp"
    }

}
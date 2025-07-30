package com.saikou.sozo_tv.presentation.activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.saikou.sozo_tv.databinding.ActivityLoginBinding

class LoginActivity : FragmentActivity() {

    private lateinit var viewBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }
}
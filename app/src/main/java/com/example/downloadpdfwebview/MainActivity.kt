package com.example.downloadpdfwebview

import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.downloadpdfwebview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //var pdf="https://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf"
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.webView.setWebViewClient(WebViewClient())
        binding.webView.getSettings().setSupportZoom(true);
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.settings.allowContentAccess = true
        binding.webView.settings.allowFileAccess = true
        val settings: WebSettings = binding.webView.getSettings()
      settings.allowFileAccess = true

        binding.webView.loadUrl("https://docs.google.com/gview?url=http%3A%2F%2Finfolab.stanford.edu%2Fpub%2Fpapers%2Fgoogle.pdf");
//binding.webView.loadUrl("file:///assets/hamdard.pdf")


    }
}
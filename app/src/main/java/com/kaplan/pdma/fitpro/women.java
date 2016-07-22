package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class women extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        WebView webView2 = (WebView) findViewById(R.id.webView2); //linking to women fitness website

        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("http://www.womenfitness.net/");
    }
}

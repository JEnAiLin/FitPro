package com.kaplan.pdma.fitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class men extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);

        WebView webView = (WebView) findViewById(R.id.webView); //linking to men fitness website

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.mensfitness.com/");
    }
}

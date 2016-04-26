package com.example.ama.explorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.Toast;

import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    private Button mButtonGO;
    private WebView mWebView;
    private EditText mEditTextURL;
   // private Pattern mPattern = Pattern.compile("^http",Pattern.CASE_INSENSITIVE);
    private Matcher mMatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonGO = (Button) findViewById(R.id.btnGO);
        mWebView = (WebView) findViewById(R.id.webView);
        mEditTextURL = (EditText) findViewById(R.id.edtURL);
     //   mMatcher = mPattern.matcher(mEditTextURL.getText().toString());

        mWebView.setWebViewClient(new WebViewClient(){
           @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
              view.loadUrl(url);
               return true;
            }
       });

        mButtonGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if(!mMatcher.matches()){
               //     Toast.makeText(MainActivity.this, "Введите корректный адрес",Toast.LENGTH_SHORT).show();
              //  }else
               mWebView.loadUrl(mEditTextURL.getText().toString());
            }
        });
    }
}

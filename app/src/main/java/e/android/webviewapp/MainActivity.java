package e.android.webviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());

        editText = findViewById(R.id.edit_url);

    }

    public void Back(View view) {
        if (webView.canGoBack()) {
            webView.goBack();
        }
    }

    public void Forward(View view) {
        if(webView.canGoForward()) {
            webView.goForward();
        }
    }

    public void Reload(View view) {
        webView.reload();
    }

    public void Go(View view) {
        String url = editText.getText().toString();
        if (!url.isEmpty()) {
            webView.loadUrl(url);
        }
    }
}

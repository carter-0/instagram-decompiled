package X;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public final class Q9m extends LinearLayout {
    public final WebView A00;

    public Q9m(Context context) {
        super(context, (AttributeSet) null, 0);
        WebView webView = new WebView(context);
        this.A00 = webView;
        WebSettings settings = webView.getSettings();
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        webView.setWebViewClient(new Q95(this, 7));
    }
}

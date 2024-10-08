package com.facebookpay.webview;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0cm;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C7890QcI;
import X.C9569Rd9;
import X.C9950Rk3;
import X.S0R;
import X.S4j;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.secure.securewebview.SecureWebView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class WebViewActivity extends FragmentActivity {
    public SecureWebView A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0bY] */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int A002 = AnonymousClass0fD.A00(-2146071051);
        WebViewActivity.super.onCreate(bundle);
        setContentView(R.layout.web_view_activity);
        this.A00 = (SecureWebView) findViewById(R.id.web_view);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        AnonymousClass0cm r0 = C9950Rk3.A00;
        0qQ.A07(r0);
        A1C2.add(r0);
        S4j s4j = new S4j(new Object(), new C9569Rd9(), A1C, A1C2);
        C7890QcI qcI = new C7890QcI();
        SecureWebView secureWebView = this.A00;
        if (secureWebView != null) {
            secureWebView.A01 = s4j;
            secureWebView.A02(qcI);
            SecureWebView secureWebView2 = this.A00;
            if (secureWebView2 != null) {
                secureWebView2.A01(new S0R());
                Intent intent = getIntent();
                if (intent == null || (stringExtra = intent.getStringExtra("WEB_VIEW_URL")) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                SecureWebView secureWebView3 = this.A00;
                if (secureWebView3 != null) {
                    secureWebView3.loadUrl(stringExtra);
                    AnonymousClass0fD.A07(307843907, A002);
                    return;
                }
            }
        }
        0qQ.A0F("webView");
        throw AnonymousClass00P.createAndThrow();
    }
}

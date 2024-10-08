package com.facebook.secure.securewebview;

import X.0KC;
import X.0bY;
import X.0cp;
import X.AnonymousClass0cm;
import X.AnonymousClass7TE;
import X.C10236Row;
import X.C10417Rrt;
import X.C11355SOr;
import X.C9950Rk3;
import X.Q8u;
import X.Q96;
import X.S0R;
import X.S4j;
import X.S7B;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class SecureWebView extends WebView {
    public 0bY A00;
    public S4j A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final C10417Rrt A06 = new C10417Rrt(this);
    public final Context A07;

    public final void A03(AnonymousClass0cm r4, String str, Collection collection, Map map) {
        if (this.A01.A00(getContext(), str).intValue() == 0) {
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("execute");
            }
            setCookieStrings(str, r4, collection, (ValueCallback) null);
            super.loadUrl(str, map);
        }
    }

    public final void setCookieStringsSecure(String str, AnonymousClass0cm r3, Collection collection) {
        setCookieStrings(str, r3, collection, (ValueCallback) null);
    }

    public final void A01(S0R s0r) {
        0bY r3;
        if (this.A04 && (r3 = this.A00) != null) {
            r3.EFT("webview.SecureWebView", "WebChromeClient has been set already", (Throwable) null);
        }
        this.A04 = true;
        super.setWebChromeClient(new Q8u(s0r));
    }

    public final void A02(S7B s7b) {
        0bY r3;
        if (this.A05 && (r3 = this.A00) != null) {
            r3.EFT("webview.SecureWebView", "WebViewClient has been set already", (Throwable) null);
        }
        this.A05 = true;
        super.setWebViewClient(new Q96(s7b));
    }

    public final C10417Rrt getSecureJsBridgeAuth() {
        return this.A06;
    }

    public final S4j getUriHandler() {
        return this.A01;
    }

    public final void loadUrl(String str, Map map) {
        A03(C9950Rk3.A00, str, (Collection) null, map);
    }

    public final void setCookieStrings(String str, AnonymousClass0cm r6, Collection collection, ValueCallback valueCallback) {
        if (collection != null) {
            try {
                if (!r6.A01(0cp.A03(str))) {
                    0KC.A0O(this.A02, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", new Object[]{str});
                    return;
                }
                try {
                    CookieManager instance = CookieManager.getInstance();
                    instance.flush();
                    instance.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String A18 = AnonymousClass7TE.A18(it);
                        if (valueCallback != null) {
                            instance.setCookie(str, A18, valueCallback);
                        } else {
                            instance.setCookie(str, A18);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                0KC.A0L(this.A02, "Parse url run triggers the exception on url: \n%s\n", e, new Object[]{str});
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection collection) {
        setCookieStrings(str, C9950Rk3.A00, collection, (ValueCallback) null);
    }

    public final void setReporter(0bY r1) {
        this.A00 = r1;
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = C11355SOr.A00(context, this);
        A00();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0bY] */
    private void A00() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        ? obj = new Object();
        this.A03 = AnonymousClass7TE.A1C();
        this.A00 = obj;
        this.A05 = false;
        this.A04 = false;
    }

    public C10236Row getSecureSettings() {
        return new C10236Row(getSettings());
    }

    public SecureWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = C11355SOr.A00(context, this);
        A00();
    }

    public final void loadUrl(String str) {
        loadUrl(str, (Map) null);
    }

    public SecureWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A07 = C11355SOr.A00(context, this);
        A00();
    }

    @Deprecated
    public SecureWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        this.A07 = C11355SOr.A00(context, this);
        A00();
    }

    public SecureWebView(Context context) {
        super(context);
        this.A07 = C11355SOr.A00(context, this);
        A00();
    }
}

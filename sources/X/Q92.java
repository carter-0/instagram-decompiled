package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

public final class Q92 extends WebViewClient {
    public ReadableArray A00;
    public List A01;
    public boolean A02 = false;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[SYNTHETIC, Splitter:B:32:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "about:blank"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x000a
            r9 = 0
        L_0x0009:
            return r9
        L_0x000a:
            com.facebook.react.bridge.ReadableArray r0 = r10.A00
            r9 = 1
            if (r0 == 0) goto L_0x003f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003f
            com.facebook.react.bridge.ReadableArray r0 = r10.A00
            java.util.ArrayList r0 = r0.toArrayList()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L_0x001f
        L_0x002f:
            android.content.Context r5 = r11.getContext()
            java.lang.String r8 = "intent://"
            boolean r0 = r12.startsWith(r8)
            java.lang.String r3 = "ReactNative"
            r7 = 0
            if (r0 == 0) goto L_0x009d
            goto L_0x0092
        L_0x003f:
            java.util.List r4 = r10.A01
            if (r4 == 0) goto L_0x002f
            android.net.Uri r3 = X.Pxg.A0L(r12)
            if (r3 == 0) goto L_0x002f
            java.lang.String r0 = r3.getScheme()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0090
            java.lang.String r1 = r3.getScheme()
        L_0x0055:
            java.lang.String r0 = r3.getAuthority()
            if (r0 == 0) goto L_0x005f
            java.lang.String r2 = r3.getAuthority()
        L_0x005f:
            java.lang.String r0 = "://"
            java.lang.String r2 = X.002.A0g(r1, r0, r2)
            java.util.Iterator r1 = r4.iterator()
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.DbV.A1b(r2, r0)
            if (r0 == 0) goto L_0x0069
            int r3 = com.facebook.react.uimanager.UIManagerHelper.A01(r11)
            int r2 = r11.getId()
            com.facebook.react.bridge.WritableNativeMap r1 = r10.A00(r11, r12)
            X.QbN r0 = new X.QbN
            r0.<init>(r1, r3, r2)
            com.facebook.react.views.webview.ReactWebViewManager.dispatchEvent(r11, r0)
            return r9
        L_0x0090:
            r1 = r2
            goto L_0x0055
        L_0x0092:
            android.content.Intent r6 = X.0b8.A00(r12)     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x009e
        L_0x0097:
            r1 = move-exception
            java.lang.String r0 = "Can't parse intent:// URI"
            X.0I1.A05(r3, r0, r1)
        L_0x009d:
            r6 = r7
        L_0x009e:
            java.lang.String r4 = "android.intent.category.BROWSABLE"
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r6 == 0) goto L_0x00d0
            r6.addCategory(r4)
            r6.setComponent(r7)
            r6.setSelector(r7)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r6, r0)
            if (r0 == 0) goto L_0x00bd
            X.AnonymousClass0b5.A01(r5, r6)
            return r9
        L_0x00bd:
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r1 = r6.getStringExtra(r0)
            if (r1 == 0) goto L_0x0009
            boolean r0 = r1.startsWith(r8)
            if (r0 != 0) goto L_0x0009
            android.net.Uri r0 = X.0cp.A03(r1)
            goto L_0x00d4
        L_0x00d0:
            android.net.Uri r0 = X.0cp.A03(r12)
        L_0x00d4:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x00e5 }
            r1.addCategory(r4)     // Catch:{ ActivityNotFoundException -> 0x00e5 }
            X.AnonymousClass0b5.A01(r5, r1)     // Catch:{ ActivityNotFoundException -> 0x00e5 }
            return r9
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "activity not found to handle uri scheme for: "
            java.lang.String r0 = X.002.A0R(r0, r12)
            X.0I1.A06(r3, r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q92.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r5.getProgress() == 100) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.react.bridge.WritableNativeMap A00(android.webkit.WebView r5, java.lang.String r6) {
        /*
            r4 = this;
            com.facebook.react.bridge.WritableNativeMap r3 = X.Pxe.A0U()
            int r0 = r5.getId()
            double r1 = (double) r0
            java.lang.String r0 = "target"
            r3.putDouble(r0, r1)
            java.lang.String r0 = "url"
            r3.putString(r0, r6)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0022
            int r2 = r5.getProgress()
            r0 = 100
            r1 = 1
            if (r2 != r0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.String r0 = "loading"
            r3.putBoolean(r0, r1)
            java.lang.String r1 = r5.getTitle()
            java.lang.String r0 = "title"
            r3.putString(r0, r1)
            boolean r1 = r5.canGoBack()
            java.lang.String r0 = "canGoBack"
            r3.putBoolean(r0, r1)
            boolean r1 = r5.canGoForward()
            java.lang.String r0 = "canGoForward"
            r3.putBoolean(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q92.A00(android.webkit.WebView, java.lang.String):com.facebook.react.bridge.WritableNativeMap");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.W0S, X.QbK] */
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (!this.A02) {
            Q8z q8z = (Q8z) webView;
            if (q8z.A03) {
                q8z.evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", (ValueCallback) null);
            }
            if (q8z.getSettings().getJavaScriptEnabled() && (str2 = q8z.A01) != null && !TextUtils.isEmpty(str2)) {
                q8z.evaluateJavascript(002.A0g("(function() {\n", q8z.A01, ";\n})();"), (ValueCallback) null);
            }
            int A012 = UIManagerHelper.A01(webView);
            int id = webView.getId();
            WritableNativeMap A002 = A00(webView, str);
            ? w0s = new W0S(A012, id);
            w0s.A00 = A002;
            ReactWebViewManager.dispatchEvent(webView, w0s);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.W0S, X.QbL] */
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02 = false;
        int A012 = UIManagerHelper.A01(webView);
        int id = webView.getId();
        WritableNativeMap A002 = A00(webView, str);
        ? w0s = new W0S(A012, id);
        w0s.A00 = A002;
        ReactWebViewManager.dispatchEvent(webView, w0s);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.W0S, X.QbK] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.W0S, X.QbJ] */
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.A02 = true;
        int A012 = UIManagerHelper.A01(webView);
        int id = webView.getId();
        WritableNativeMap A002 = A00(webView, str2);
        ? w0s = new W0S(A012, id);
        w0s.A00 = A002;
        ReactWebViewManager.dispatchEvent(webView, w0s);
        WritableNativeMap A003 = A00(webView, str2);
        A003.putDouble(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, (double) i);
        A003.putString(DevServerEntity.COLUMN_DESCRIPTION, str);
        ? w0s2 = new W0S(UIManagerHelper.A01(webView), webView.getId());
        w0s2.A00 = A003;
        ReactWebViewManager.dispatchEvent(webView, w0s2);
    }
}

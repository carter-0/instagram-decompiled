package X;

import android.view.View;
import android.webkit.WebView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.Qb8  reason: case insensitive filesystem */
public final class C7832Qb8 extends C19068WIz {
    public final void E6x(View view, String str, ReadableArray readableArray) {
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    ((WebView) view).goBack();
                    return;
                }
                return;
            case -948122918:
                if (str.equals("stopLoading")) {
                    ((WebView) view).stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (str.equals("reload")) {
                    ((WebView) view).reload();
                    return;
                }
                return;
            case -318289731:
                if (str.equals("goForward")) {
                    ((WebView) view).goForward();
                    return;
                }
                return;
            case 336631465:
                if (str.equals("loadUrl")) {
                    ((WebView) view).loadUrl(readableArray.getString(0));
                    return;
                }
                return;
            case 1490029383:
                if (str.equals("postMessage")) {
                    ((ReactWebViewManager) this.A00).postMessage(view, readableArray.getString(0), readableArray.getString(1));
                    return;
                }
                return;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    ((ReactWebViewManager) this.A00).injectJavaScript(view, readableArray.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        r0 = (com.facebook.react.views.webview.ReactWebViewManager) r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e5, code lost:
        if (r6 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e7, code lost:
        r1 = (java.lang.String) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ea, code lost:
        r0.setInjectedJavaScript(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ee, code lost:
        ((com.facebook.react.views.webview.ReactWebViewManager) r4.A00).setOriginAllowlist(r5, (com.facebook.react.bridge.ReadableArray) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        super.EhN(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r7.equals("originAllowlist") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f8, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        switch(r0) {
            case 10: goto L_0x01e1;
            case 11: goto L_0x01ee;
            default: goto L_0x00fc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        r0 = (com.facebook.react.views.webview.ReactWebViewManager) r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r6 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        r1 = (java.lang.String) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        r0.setUserAgent(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0108, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EhN(android.view.View r5, java.lang.Object r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r7.hashCode()
            r3 = 1
            r2 = 0
            switch(r0) {
                case -1725560121: goto L_0x000d;
                case -1607633676: goto L_0x0022;
                case -1562001507: goto L_0x0036;
                case -1423657812: goto L_0x004b;
                case -1146673624: goto L_0x005f;
                case -906998080: goto L_0x0073;
                case -896505829: goto L_0x0087;
                case -728016272: goto L_0x009a;
                case -141225571: goto L_0x00ae;
                case -79996127: goto L_0x00c3;
                case 215255965: goto L_0x00d7;
                case 237216481: goto L_0x00e2;
                case 311430650: goto L_0x00ed;
                case 475851404: goto L_0x0109;
                case 621834221: goto L_0x011a;
                case 760962753: goto L_0x012f;
                case 857041362: goto L_0x0142;
                case 872929727: goto L_0x0155;
                case 952189583: goto L_0x0169;
                case 1138246185: goto L_0x017b;
                case 1774874798: goto L_0x018f;
                case 1812525393: goto L_0x01a4;
                case 1873176931: goto L_0x01b9;
                case 2074641374: goto L_0x01cc;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.EhN(r5, r6, r7)
            return
        L_0x000d:
            java.lang.String r0 = "saveFormDataDisabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setSaveFormDataDisabled((android.view.View) r5, (boolean) r0)
            return
        L_0x0022:
            java.lang.String r0 = "javaScriptEnabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r3)
            r1.setJavaScriptEnabled((android.view.View) r5, (boolean) r0)
            return
        L_0x0036:
            java.lang.String r0 = "messagingEnabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setMessagingEnabled((android.view.View) r5, (boolean) r0)
            return
        L_0x004b:
            java.lang.String r0 = "incognito"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setIncognito((android.view.View) r5, (boolean) r0)
            return
        L_0x005f:
            java.lang.String r0 = "domStorageEnabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setDomStorageEnabled((android.view.View) r5, (boolean) r0)
            return
        L_0x0073:
            java.lang.String r0 = "forceDarkOn"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setForceDarkOn((android.view.View) r5, (boolean) r0)
            return
        L_0x0087:
            java.lang.String r0 = "source"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            com.facebook.react.bridge.ReadableMap r6 = (com.facebook.react.bridge.ReadableMap) r6
            r0.setSource((android.view.View) r5, (com.facebook.react.bridge.ReadableMap) r6)
            return
        L_0x009a:
            java.lang.String r0 = "allowUniversalAccessFromFileURLs"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setAllowUniversalAccessFromFileURLs((android.view.View) r5, (boolean) r0)
            return
        L_0x00ae:
            java.lang.String r0 = "reportContentSizeChanges"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setReportContentSizeChanges((android.view.View) r5, (boolean) r0)
            return
        L_0x00c3:
            java.lang.String r0 = "hardwareAccelerationEnabledExperimental"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r3)
            r1.setHardwareAccelerationEnabledExperimental((android.view.View) r5, (boolean) r0)
            return
        L_0x00d7:
            java.lang.String r0 = "injectedJavaScript"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            r0 = 10
            goto L_0x00f8
        L_0x00e2:
            java.lang.String r0 = "originAllowlist"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x01ee
            goto L_0x0009
        L_0x00ed:
            java.lang.String r0 = "userAgent"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            r0 = 12
        L_0x00f8:
            r1 = 0
            switch(r0) {
                case 10: goto L_0x01e1;
                case 11: goto L_0x01ee;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            if (r6 == 0) goto L_0x0105
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
        L_0x0105:
            r0.setUserAgent((android.view.View) r5, (java.lang.String) r1)
            return
        L_0x0109:
            java.lang.String r0 = "webviewDebuggingEnabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = X.Pxi.A1Y(r6, r2)
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)
            return
        L_0x011a:
            java.lang.String r0 = "openNewWindowLinksInNewView"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setOpenNewWindowLinksInNewView((android.view.View) r5, (boolean) r0)
            return
        L_0x012f:
            java.lang.String r0 = "mixedContentMode"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            java.lang.String r6 = (java.lang.String) r6
            r0.setMixedContentMode((android.view.View) r5, (java.lang.String) r6)
            return
        L_0x0142:
            java.lang.String r0 = "alwaysReloadOnSourceChange"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.mAlwaysReloadOnSourceChange = r0
            return
        L_0x0155:
            java.lang.String r0 = "clearCookiesOnExit"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setClearCookiesOnExit((android.view.View) r5, (boolean) r0)
            return
        L_0x0169:
            java.lang.String r0 = "cookies"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            com.facebook.react.bridge.ReadableArray r6 = (com.facebook.react.bridge.ReadableArray) r6
            r0.setCookies((android.view.View) r5, (com.facebook.react.bridge.ReadableArray) r6)
            return
        L_0x017b:
            java.lang.String r0 = "allowFileAccess"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r2)
            r1.setAllowFileAccess((android.view.View) r5, (boolean) r0)
            return
        L_0x018f:
            java.lang.String r0 = "mediaPlaybackRequiresUserAction"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r3)
            r1.setMediaPlaybackRequiresUserAction((android.view.View) r5, (boolean) r0)
            return
        L_0x01a4:
            java.lang.String r0 = "thirdPartyCookiesEnabled"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r3)
            r1.setThirdPartyCookiesEnabled((android.view.View) r5, (boolean) r0)
            return
        L_0x01b9:
            java.lang.String r0 = "urlPrefixesForDefaultIntent"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            com.facebook.react.bridge.ReadableArray r6 = (com.facebook.react.bridge.ReadableArray) r6
            r0.setUrlPrefixesForDefaultIntent((android.view.View) r5, (com.facebook.react.bridge.ReadableArray) r6)
            return
        L_0x01cc:
            java.lang.String r0 = "scalesPageToFit"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.facebook.react.uimanager.BaseViewManager r1 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r1 = (com.facebook.react.views.webview.ReactWebViewManager) r1
            boolean r0 = X.Pxi.A1Y(r6, r3)
            r1.setScalesPageToFit((android.view.View) r5, (boolean) r0)
            return
        L_0x01e1:
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            if (r6 == 0) goto L_0x01ea
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
        L_0x01ea:
            r0.setInjectedJavaScript((android.view.View) r5, (java.lang.String) r1)
            return
        L_0x01ee:
            com.facebook.react.uimanager.BaseViewManager r0 = r4.A00
            com.facebook.react.views.webview.ReactWebViewManager r0 = (com.facebook.react.views.webview.ReactWebViewManager) r0
            com.facebook.react.bridge.ReadableArray r6 = (com.facebook.react.bridge.ReadableArray) r6
            r0.setOriginAllowlist((android.view.View) r5, (com.facebook.react.bridge.ReadableArray) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7832Qb8.EhN(android.view.View, java.lang.Object, java.lang.String):void");
    }
}

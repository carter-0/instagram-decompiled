package com.facebook.react.views.webview;

import X.002;
import X.0I1;
import X.0cp;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11523Sbk;
import X.C11529Sbq;
import X.C12227Spg;
import X.C13439TaS;
import X.C13573Tcx;
import X.C19068WIz;
import X.C20877X2e;
import X.C273654mx;
import X.C41845B3m;
import X.C66580MXl;
import X.C7478QFh;
import X.C9890Rj5;
import X.DbS;
import X.DbT;
import X.DbV;
import X.Dba;
import X.Pxe;
import X.Q6H;
import X.Q8z;
import X.Q92;
import X.QZK;
import X.QZL;
import X.RSB;
import X.SDO;
import X.SL3;
import X.W0S;
import X.X62;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "RCTWebView")
public class ReactWebViewManager extends SimpleViewManager {
    public static final String BLANK_URL = "about:blank";
    public static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String INTENT_URL_PREFIX = "intent://";
    public static final String[] META_DOMAINS = {IGPixelRequestBuffer.URL_PREFIX, "workplace.com", "meta.com"};
    public static final String REACT_CLASS = "RCTWebView";
    public static C13439TaS customClientCertRequestHandler;
    public boolean mAlwaysReloadOnSourceChange;
    public final X62 mDelegate;
    public List mFBSessionCookies;
    public WebView.PictureListener mPictureListener;
    public C13573Tcx mWebViewConfig;

    public ReactWebViewManager(C13573Tcx tcx, List list) {
        super((QZK) null);
        this.mAlwaysReloadOnSourceChange = false;
        this.mWebViewConfig = tcx == null ? new C12227Spg(this) : tcx;
        this.mFBSessionCookies = list;
        this.mDelegate = new C19068WIz(this);
    }

    private void handlePostMessageCommand(WebView webView, ReadableArray readableArray) {
        postMessage(webView, readableArray.getString(0), readableArray.getString(1));
    }

    public Map getCommandsMap() {
        Integer A0q = C66580MXl.A0q();
        Integer A0l = Pxe.A0l();
        Integer A0m = Pxe.A0m();
        HashMap A0f = Dba.A0f("goBack", 1);
        A0f.put("goForward", A0q);
        A0f.put("reload", 3);
        A0f.put("stopLoading", 4);
        A0f.put("postMessage", A0l);
        A0f.put("injectJavaScript", 6);
        A0f.put("loadUrl", A0m);
        return A0f;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r0 != null) goto L_0x007c;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "source")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSource(android.webkit.WebView r14, com.facebook.react.bridge.ReadableMap r15) {
        /*
            r13 = this;
            r7 = r14
            if (r15 == 0) goto L_0x00cb
            java.lang.String r1 = "html"
            boolean r0 = r15.hasKey(r1)
            java.lang.String r11 = "UTF-8"
            if (r0 == 0) goto L_0x002c
            java.lang.String r9 = r15.getString(r1)
            java.lang.String r1 = "baseUrl"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r8 = r15.getString(r1)
            r12 = 0
            java.lang.String r10 = "text/html"
            r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            return
        L_0x0025:
            java.lang.String r0 = "text/html"
            r14.loadData(r9, r0, r11)
            return
        L_0x002c:
            java.lang.String r1 = "uri"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r4 = r15.getString(r1)
            r13.setSessionCookiesForFacebookURL(r4)
            java.lang.String r1 = r14.getUrl()
            boolean r0 = r13.mAlwaysReloadOnSourceChange
            if (r0 != 0) goto L_0x004d
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x004d
            return
        L_0x004d:
            java.lang.String r1 = "method"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r0 = "POST"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = "body"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r15.getString(r1)
            byte[] r0 = r0.getBytes(r11)     // Catch:{ UnsupportedEncodingException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            byte[] r0 = r0.getBytes()
        L_0x0077:
            if (r0 != 0) goto L_0x007c
        L_0x0079:
            r0 = 0
            byte[] r0 = new byte[r0]
        L_0x007c:
            r14.postUrl(r4, r0)
            return
        L_0x0080:
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "headers"
            boolean r0 = r15.hasKey(r1)
            if (r0 == 0) goto L_0x00c7
            com.facebook.react.bridge.ReadableMap r6 = r15.getMap(r1)
            com.facebook.react.bridge.ReadableMapKeySetIterator r3 = r6.keySetIterator()
        L_0x0094:
            boolean r0 = r3.CKI()
            if (r0 == 0) goto L_0x00c7
            java.lang.String r2 = r3.Crc()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r2.toLowerCase(r0)
            java.lang.String r0 = "user-agent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bf
            android.webkit.WebSettings r0 = r14.getSettings()
            if (r0 == 0) goto L_0x0094
            android.webkit.WebSettings r1 = r14.getSettings()
            java.lang.String r0 = r6.getString(r2)
            r1.setUserAgentString(r0)
            goto L_0x0094
        L_0x00bf:
            java.lang.String r0 = r6.getString(r2)
            r5.put(r2, r0)
            goto L_0x0094
        L_0x00c7:
            r14.loadUrl(r4, r5)
            return
        L_0x00cb:
            java.lang.String r0 = "about:blank"
            r14.loadUrl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.setSource(android.webkit.WebView, com.facebook.react.bridge.ReadableMap):void");
    }

    public static /* synthetic */ C13439TaS access$000() {
        return null;
    }

    public static String parseOrigin(String str) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            StringBuilder A0n = AnonymousClass7TF.A0n(protocol);
            A0n.append("://");
            A0n.append(host);
            if (!(port == -1 || port == url.getDefaultPort())) {
                A0n.append(":");
                A0n.append(port);
            }
            return A0n.toString();
        } catch (MalformedURLException unused) {
            ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException("Error parsing origin: ReactWebView returned malformed URL for current page"));
            return null;
        }
    }

    public static void setCustomClientCertRequestHandler(C13439TaS taS) {
        customClientCertRequestHandler = taS;
    }

    private void setSessionCookiesForFacebookURL(String str) {
        String host;
        if (str != null && (host = 0cp.A03(str).getHost()) != null) {
            for (String str2 : META_DOMAINS) {
                if (host.equals(str2) || host.endsWith(002.A0R(".", str2))) {
                    List list = this.mFBSessionCookies;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CookieManager.getInstance().setCookie(str, AnonymousClass7TE.A18(it));
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void addEventEmitters(QZL qzl, WebView webView) {
        webView.setWebViewClient(new Q92());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Q8z, android.webkit.WebView] */
    public Q8z createReactWebViewInstance(QZL qzl) {
        ? webView = new WebView(qzl);
        webView.A03 = false;
        webView.A02 = false;
        return webView;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q8z, X.Tgo, android.view.View, android.webkit.WebView] */
    public WebView createViewInstance(QZL qzl) {
        ? webView = new WebView(qzl);
        webView.A03 = false;
        webView.A02 = false;
        webView.setWebChromeClient(new WebChromeClient());
        qzl.A09(webView);
        this.mWebViewConfig.AIu(webView);
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs((WebView) webView, false);
        setMixedContentMode((WebView) webView, "never");
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        settings.setGeolocationEnabled(false);
        return webView;
    }

    public X62 getDelegate() {
        return this.mDelegate;
    }

    public WebView.PictureListener getPictureListener() {
        WebView.PictureListener pictureListener = this.mPictureListener;
        if (pictureListener != null) {
            return pictureListener;
        }
        C11529Sbq sbq = new C11529Sbq(this);
        this.mPictureListener = sbq;
        return sbq;
    }

    public /* bridge */ /* synthetic */ void goBack(View view) {
        ((WebView) view).goBack();
    }

    public /* bridge */ /* synthetic */ void goForward(View view) {
        ((WebView) view).goForward();
    }

    public /* bridge */ /* synthetic */ void injectJavaScript(View view, String str) {
        ((WebView) view).evaluateJavascript(str, (ValueCallback) null);
    }

    public /* bridge */ /* synthetic */ void loadUrl(View view, String str) {
        ((WebView) view).loadUrl(str);
    }

    public void postMessage(WebView webView, String str, String str2) {
        Q8z q8z = (Q8z) webView;
        if (TextUtils.isEmpty(str2) || "*".equals(str2)) {
            0I1.A04("ReactNative", "Always provide specific targetOrigin when using WebView.postMessage command");
        } else {
            String parseOrigin = parseOrigin(q8z.getUrl());
            if (!str2.equals(parseOrigin)) {
                0I1.A08("ReactNative", "Cross-origin request blocked: postMessage was sent to %s, but current origin is %s", new Object[]{str2, parseOrigin});
                return;
            }
        }
        postWebMessage(q8z, str);
    }

    public /* bridge */ /* synthetic */ void reload(View view) {
        ((WebView) view).reload();
    }

    @ReactProp(name = "clearCookiesOnExit")
    public /* bridge */ /* synthetic */ void setClearCookiesOnExit(View view, boolean z) {
        ((Q8z) ((WebView) view)).A02 = z;
    }

    @ReactProp(name = "cookies")
    public void setCookies(WebView webView, ReadableArray readableArray) {
        if (readableArray != null) {
            Iterator it = readableArray.toArrayList().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                ArrayList A14 = DbV.A14(002.A0g(DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), "=", DbT.A11(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, map)));
                Iterator it2 = Arrays.asList(new String[]{"path", "domain", "secure", "httpOnly", "sameSite"}).iterator();
                while (it2.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it2);
                    Object obj = map.get(A18);
                    if (obj instanceof String) {
                        A18 = AnonymousClass7TG.A0m(obj, "=", AnonymousClass7TF.A0n(A18));
                    } else if (obj instanceof Boolean) {
                        if (!AnonymousClass7TE.A1a(obj)) {
                        }
                    }
                    A14.add(A18);
                }
                String A11 = DbT.A11("domain", map);
                String join = TextUtils.join("; ", A14);
                if (A11 != null) {
                    if (Boolean.TRUE.equals(map.get("secure"))) {
                        A11 = 002.A0R("https://", A11);
                    }
                    CookieManager.getInstance().setCookie(A11, join);
                }
            }
        }
    }

    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            if (SDO.A00("FORCE_DARK")) {
                WebSettings settings = webView.getSettings();
                int i = 0;
                if (z) {
                    i = 2;
                }
                C7478QFh qFh = SDO.A0p;
                if (qFh.A00()) {
                    RSB.A00(settings, i);
                } else if (qFh.A01()) {
                    ((WebSettingsBoundaryInterface) SL3.A00(WebSettingsBoundaryInterface.class, C9890Rj5.A00.A00.convertSettings(settings))).setForceDark(i);
                } else {
                    throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
            if (SDO.A00("FORCE_DARK_STRATEGY")) {
                WebSettings settings2 = webView.getSettings();
                if (SDO.A0O.A01()) {
                    ((WebSettingsBoundaryInterface) SL3.A00(WebSettingsBoundaryInterface.class, C9890Rj5.A00.A00.convertSettings(settings2))).setForceDarkBehavior(1);
                    return;
                }
                throw AnonymousClass7TE.A1B("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void setHardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (!z) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (z) {
            CookieManager.getInstance().removeAllCookies(new C11523Sbk(1));
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public /* bridge */ /* synthetic */ void setInjectedJavaScript(View view, String str) {
        ((Q8z) ((WebView) view)).A01 = str;
    }

    @ReactProp(name = "messagingEnabled")
    public /* bridge */ /* synthetic */ void setMessagingEnabled(View view, boolean z) {
        ((Q8z) ((WebView) view)).setMessagingEnabled(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        WebSettings settings;
        int i;
        if (str == null || "never".equals(str)) {
            settings = webView.getSettings();
            i = 1;
        } else if (C273654mx.A00(232).equals(str)) {
            settings = webView.getSettings();
            i = 0;
        } else if ("compatibility".equals(str)) {
            settings = webView.getSettings();
            i = 2;
        } else {
            return;
        }
        settings.setMixedContentMode(i);
    }

    @ReactProp(name = "originAllowlist")
    public void setOriginAllowlist(WebView webView, ReadableArray readableArray) {
        Q92 q92 = ((Q8z) webView).A00;
        if (q92 != null && readableArray != null) {
            LinkedList A1A = Pxe.A1A();
            for (int i = 0; i < readableArray.size(); i++) {
                A1A.add(Pattern.compile(readableArray.getString(i)));
            }
            q92.A01 = A1A;
        }
    }

    @ReactProp(name = "reportContentSizeChanges")
    public void setReportContentSizeChanges(WebView webView, boolean z) {
        WebView.PictureListener pictureListener;
        if (z) {
            pictureListener = getPictureListener();
        } else {
            pictureListener = null;
        }
        webView.setPictureListener(pictureListener);
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        Q92 q92 = ((Q8z) webView).A00;
        if (q92 != null && readableArray != null) {
            q92.A00 = readableArray;
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    public /* bridge */ /* synthetic */ void stopLoading(View view) {
        ((WebView) view).stopLoading();
    }

    public static void dispatchEvent(WebView webView, W0S w0s) {
        C20877X2e A05 = UIManagerHelper.A05((Q6H) webView.getContext(), webView.getId());
        if (A05 != null) {
            A05.APe(w0s);
        }
    }

    private void postWebMessage(Q8z q8z, String str) {
        try {
            JSONObject A11 = DbS.A11();
            A11.put("data", str);
            q8z.evaluateJavascript(002.A0g("(function () {var event;var data = ", A11.toString(), ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();"), (ValueCallback) null);
        } catch (JSONException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", Dba.A0f("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put("topContentSizeChange", Dba.A0f("registrationName", "onContentSizeChange"));
        return exportedCustomDirectEventTypeConstants;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        Q8z q8z = (Q8z) webView;
        ((Q6H) webView.getContext()).A0A(q8z);
        if (q8z.A02) {
            CookieManager.getInstance().removeAllCookies(new C11523Sbk(1));
        }
        q8z.setWebViewClient((WebViewClient) null);
        q8z.destroy();
    }

    public void receiveCommand(WebView webView, String str, ReadableArray readableArray) {
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    webView.goBack();
                    return;
                }
                return;
            case -948122918:
                if (str.equals("stopLoading")) {
                    webView.stopLoading();
                    return;
                }
                return;
            case -934641255:
                if (str.equals("reload")) {
                    webView.reload();
                    return;
                }
                return;
            case -318289731:
                if (str.equals("goForward")) {
                    webView.goForward();
                    return;
                }
                return;
            case 336631465:
                if (str.equals("loadUrl") && readableArray != null) {
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                return;
            case 1490029383:
                if (str.equals("postMessage") && readableArray != null) {
                    handlePostMessageCommand(webView, readableArray);
                    return;
                }
                return;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    webView.evaluateJavascript(readableArray.getString(0), (ValueCallback) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccess(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public /* bridge */ /* synthetic */ void setAlwaysReloadOnSourceChange(View view, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "openNewWindowLinksInNewView")
    public void setOpenNewWindowLinksInNewView(WebView webView, boolean z) {
        webView.getSettings().setSupportMultipleWindows(z);
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
    }

    @ReactProp(name = "webviewDebuggingEnabled")
    public /* bridge */ /* synthetic */ void setWebviewDebuggingEnabled(View view, boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public ReactWebViewManager(C13573Tcx tcx) {
        this(tcx, (List) null);
    }

    public void goBack(WebView webView) {
        webView.goBack();
    }

    public void goForward(WebView webView) {
        webView.goForward();
    }

    public void injectJavaScript(WebView webView, String str) {
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    public void loadUrl(WebView webView, String str) {
        webView.loadUrl(str);
    }

    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                if (readableArray != null) {
                    handlePostMessageCommand(webView, readableArray);
                    return;
                }
                return;
            case 6:
                webView.evaluateJavascript(readableArray.getString(0), (ValueCallback) null);
                return;
            case 7:
                if (readableArray != null) {
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void reload(WebView webView) {
        webView.reload();
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public void setAlwaysReloadOnSourceChange(WebView webView, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "clearCookiesOnExit")
    public void setClearCookiesOnExit(WebView webView, boolean z) {
        ((Q8z) webView).A02 = z;
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((Q8z) webView).A01 = str;
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((Q8z) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(WebView webView, boolean z) {
        WebView.setWebContentsDebuggingEnabled(z);
    }

    public void stopLoading(WebView webView) {
        webView.stopLoading();
    }

    public ReactWebViewManager(List list) {
        this((C13573Tcx) null, list);
    }

    public ReactWebViewManager() {
        this((C13573Tcx) null, (List) null);
    }
}

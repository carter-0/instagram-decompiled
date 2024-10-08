package com.facebook.browser.lite;

import X.002;
import X.00Y;
import X.0KC;
import X.0M7;
import X.0Tu;
import X.0cp;
import X.0qQ;
import X.182;
import X.2IL;
import X.A30;
import X.A33;
import X.A34;
import X.A6U;
import X.A9z;
import X.AH7;
import X.AP5;
import X.APN;
import X.AQD;
import X.AWE;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0HM;
import X.AnonymousClass0LO;
import X.AnonymousClass0Mw;
import X.AnonymousClass0fD;
import X.AnonymousClass2Fj;
import X.AnonymousClass3KG;
import X.AnonymousClass3KQ;
import X.AnonymousClass9Y2;
import X.B3J;
import X.B3K;
import X.C10190Ro6;
import X.C10635RvU;
import X.C10646Rvf;
import X.C11429STt;
import X.C13415TZv;
import X.C13847TiP;
import X.C13887TjA;
import X.C13906Tl6;
import X.C13907Tl7;
import X.C13923TlR;
import X.C340017kY;
import X.C340027ka;
import X.C340037kb;
import X.C391409su;
import X.C391449t6;
import X.C391769tc;
import X.C391779td;
import X.C39624A2o;
import X.C39666A4g;
import X.C39703A5t;
import X.C39730A6v;
import X.C39774A8t;
import X.C39872ACt;
import X.C39884ADg;
import X.C39896ADy;
import X.C40266AYf;
import X.C41785B0o;
import X.C41803B1i;
import X.C41833B2o;
import X.C66579MXk;
import X.C7558QJi;
import X.C7560QJk;
import X.C7562QJq;
import X.C7566QJu;
import X.C7568QJw;
import X.C7574QKp;
import X.C7578QKt;
import X.C7580QKv;
import X.Pxd;
import X.Pxm;
import X.Q98;
import X.QJc;
import X.QL8;
import X.QLA;
import X.REW;
import X.RFY;
import X.RIX;
import X.RIg;
import X.RRE;
import X.S4Q;
import X.S78;
import X.SB5;
import X.SCX;
import X.SHI;
import X.SPF;
import X.SQO;
import X.SRY;
import X.SSR;
import X.T9q;
import X.TA1;
import X.TB9;
import X.TFT;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.views.BrowserLiteWrapperView;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabeventlogging.model.IABChangeViewModeEvent;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABNonViewableEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.iabeventlogging.model.IABViewableEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ScreenCapturerAndroid;

public class BrowserLiteFragment extends Fragment implements C340027ka, C340037kb {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public Context A05;
    public Intent A06;
    public Uri A07;
    public Bundle A08;
    public View A09;
    public View A0A;
    public View A0B;
    public FrameLayout A0C;
    public TextView A0D;
    public C7574QKp A0E;
    public C391779td A0F;
    @Deprecated
    public BrowserLiteJSBridgeProxy A0G;
    public C10646Rvf A0H;
    public SHI A0I;
    public SPF A0J;
    public C41785B0o A0K;
    public SRY A0L;
    public C41803B1i A0M;
    public C39774A8t A0N;
    public C39884ADg A0O = new C39884ADg();
    public C39666A4g A0P;
    public A34 A0Q;
    public C13906Tl6 A0R;
    public C13415TZv A0S;
    public C13415TZv A0T;
    public C13847TiP A0U;
    public C41833B2o A0V;
    public C39896ADy A0W;
    public C13887TjA A0X;
    public C39703A5t A0Y;
    public A6U A0Z;
    public BrowserLiteErrorScreen A0a;
    public BrowserLiteErrorScreen A0b;
    public BrowserLiteWrapperView A0c;
    public A9z A0d;
    public ZonePolicy A0e = ZonePolicy.A05;
    public C10635RvU A0f;
    public Boolean A0g = true;
    public Integer A0h = 0;
    public Long A0i = null;
    public String A0j = "BrowserLiteFragment";
    public String A0k;
    public String A0l;
    public String A0m;
    public List A0n = Collections.emptyList();
    public List A0o = Collections.emptyList();
    public List A0p = Collections.emptyList();
    public ExecutorService A0q;
    public boolean A0r = false;
    public boolean A0s;
    public boolean A0t = true;
    public boolean A0u = false;
    public boolean A0v;
    public boolean A0w = false;
    public boolean A0x = false;
    public boolean A0y = false;
    public boolean A0z = false;
    public boolean A10 = false;
    public int A11 = -1;
    public int A12;
    public long A13 = -1;
    public C13907Tl7 A14;
    public A33 A15;
    public C40266AYf A16;
    public String A17;
    public String A18;
    public List A19 = Collections.emptyList();
    public boolean A1A = false;
    public boolean A1B;
    public boolean A1C = true;
    public boolean A1D = false;
    public boolean A1E = false;
    public boolean A1F;
    public boolean A1G = false;
    public boolean A1H = true;
    public boolean A1I;
    public boolean A1J;
    public final AP5 A1K = new Object();
    public final Set A1L = new HashSet();
    public final Stack A1M = new Stack();
    public final 00Y A1N = registerForActivityResult(new Object(), new APN(this));
    public final A30 A1O = new A30(this);
    public final HashMap A1P = new HashMap();
    public volatile String A1Q;

    public static QL8 A05(QLA qla) {
        S78 s78;
        Q98 q98 = ((SystemWebView) qla).A03;
        if (q98 == null || (s78 = q98.A00) == null) {
            s78 = null;
        }
        if (s78 instanceof QL8) {
            return (QL8) s78;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.facebook.browser.lite.webview.SystemWebView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.facebook.browser.lite.webview.SystemWebView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.facebook.browser.lite.webview.SystemWebView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.QLA} */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.QcV, android.view.View, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r2v7, types: [com.facebook.browser.lite.BrowserLiteWebChromeClient, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v25, types: [X.Q8q, android.webkit.WebChromeClient] */
    /* JADX WARNING: type inference failed for: r1v71, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v252, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v268, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v14, types: [X.QcV, android.view.View, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r16 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0778, code lost:
        if (X.182.A06(r6, r8.A0Q.A00, 2342156588337203341L) != false) goto L_0x077a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0173, code lost:
        if (java.lang.Integer.parseInt(r1.group(1)) >= 128) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0183, code lost:
        if (X.182.A06(r6, r8.A0Q.A00, 36313579123116167L) == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ff, code lost:
        if (r2 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.QLA A06() {
        /*
            r34 = this;
            r9 = 0
            r8 = r34
            r8.A1G = r9
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.createWebView.Start"
            r1.A04(r0)
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = A0L(r0)
            r17 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0264
            X.A6v r13 = X.C39624A2o.A02
            if (r13 != 0) goto L_0x0020
            r13 = 0
        L_0x0020:
            android.content.Intent r0 = r8.A06
            boolean r0 = A0M(r0)
            if (r0 == 0) goto L_0x0047
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            android.content.Intent r0 = r8.getIntent()
            java.lang.Integer r1 = A07(r0)
            X.A6v r0 = X.C39624A2o.A02
            if (r0 == 0) goto L_0x0047
            X.QLA r4 = r0.A02
            boolean r0 = r4.A0Y
            if (r0 == 0) goto L_0x0202
            java.lang.String r1 = "HotInstanceManagerForWebView"
            java.lang.String r0 = "resumeWebViewAndReleaseHotInstance find WebView is destroyed"
            X.0KC.A0E(r1, r0)
            X.C39624A2o.A02 = r17
        L_0x0047:
            X.A6v r0 = X.C39624A2o.A02
            if (r0 == 0) goto L_0x004e
            X.C39624A2o.A00()
        L_0x004e:
            android.content.Context r0 = r8.A05
            android.content.Context r2 = r0.getApplicationContext()
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            com.facebook.browser.lite.HotInstanceManagerForWebView$ApplicationScopeWebViewContext r0 = new com.facebook.browser.lite.HotInstanceManagerForWebView$ApplicationScopeWebViewContext
            r0.<init>(r2, r1)
            com.facebook.browser.lite.webview.SystemWebView r4 = new com.facebook.browser.lite.webview.SystemWebView
            r4.<init>(r0)
            r16 = 0
        L_0x0064:
            if (r16 != 0) goto L_0x0085
        L_0x0066:
            android.content.Intent r0 = r8.A06
            if (r0 == 0) goto L_0x006d
            r4.A0C(r0)
        L_0x006d:
            X.A4g r0 = r8.A0P
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321284292289774(0x810a04000724ee, double:3.033064668292174E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0085
            X.Rx8 r0 = r4.A0G
            r0.A04 = r10
            X.QLA.A00(r4)
        L_0x0085:
            X.A31 r0 = new X.A31
            r0.<init>(r8)
            r4.A0B = r0
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.createWebView.inflate_end"
            r1.A04(r0)
            boolean r0 = r8.A0v
            if (r0 == 0) goto L_0x00af
            android.content.Intent r1 = r8.A06
            r0 = 134(0x86, float:1.88E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            int r0 = r1.getIntExtra(r0, r9)
            if (r0 != r10) goto L_0x00af
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.setBackgroundColor(r9)
        L_0x00af:
            X.Ro1 r0 = new X.Ro1
            r0.<init>(r8)
            r4.A0C = r0
            android.content.Intent r0 = r8.A06
            android.os.Bundle r2 = r0.getExtras()
            r18 = -1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r1 = r18
            r3.<init>(r1, r1)
            android.content.Intent r1 = r8.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_HW_ACCELERATION_DISABLED"
            boolean r0 = r1.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x00d9
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r1 = r0.A04
            r0 = r17
            r1.setLayerType(r10, r0)
        L_0x00d9:
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            r33 = r0
            X.QcV r7 = r0.A04
            r7.setLayoutParams(r3)
            r7.setFocusable(r10)
            r7.setFocusableInTouchMode(r10)
            r7.setScrollbarFadingEnabled(r10)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r7.setScrollBarStyle(r0)
            X.API r0 = new X.API
            r0.<init>(r8, r4)
            r7.setDownloadListener(r0)
            android.content.Intent r0 = r8.A06
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_INITIAL_SCALE"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x010c
            android.content.Intent r0 = r8.A06
            int r0 = r0.getIntExtra(r1, r9)
            r7.setInitialScale(r0)
        L_0x010c:
            X.SPF r0 = r8.A0J
            boolean r0 = r0.A03()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0J = r0
            X.SHI r0 = r8.A0I
            boolean r0 = r0.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0J = r0
            X.A34 r0 = r8.A0Q
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36313579123771537(0x81030200320891, double:3.0281918886950176E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0K = r0
            android.webkit.WebSettings r5 = r7.getSettings()
            r5.setSaveFormData(r9)
            r5.setSavePassword(r9)
            r5.setSupportZoom(r10)
            r5.setBuiltInZoomControls(r10)
            X.TfK r0 = X.C249113j9.A01
            if (r0 != 0) goto L_0x0175
            java.util.regex.Pattern r0 = X.SCX.A01
            android.webkit.WebSettings r0 = r7.getSettings()
            java.lang.String r1 = r0.getUserAgentString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0185
            java.util.regex.Pattern r0 = X.SCX.A01
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = r1.group(r10)
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 < r0) goto L_0x0185
        L_0x0175:
            X.A34 r0 = r8.A0Q
            com.instagram.common.session.UserSession r3 = r0.A00
            r0 = 36313579123116167(0x81030200280887, double:3.028191888280559E-306)
            boolean r1 = X.182.A06(r6, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0186
        L_0x0185:
            r0 = 0
        L_0x0186:
            r5.setSupportMultipleWindows(r0)
            r5.setDisplayZoomControls(r9)
            android.content.Intent r1 = r8.A06
            r0 = 416(0x1a0, float:5.83E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r5.setUseWideViewPort(r0)
            r5.setLoadWithOverviewMode(r10)
            android.content.Intent r1 = r8.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_RESOURCE_MEDIA_PLAYBACK_REQUIRE_USER_GESTURE_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x01ab
            r5.setMediaPlaybackRequiresUserGesture(r9)
        L_0x01ab:
            if (r2 == 0) goto L_0x01b8
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LAME_DUCK_MODE"
            boolean r0 = r2.getBoolean(r0, r9)
            if (r0 == 0) goto L_0x01b8
            r5.setBlockNetworkLoads(r10)
        L_0x01b8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r19 = 2
            java.lang.String r20 = ""
            if (r1 < r0) goto L_0x01ff
            if (r2 == 0) goto L_0x0271
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_FORCE_CONTENT_DARK_MODE"
            r0 = r20
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = "AUTO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01e5
            r5.setForceDark(r10)
        L_0x01d7:
            r0 = 411(0x19b, float:5.76E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r2.getBoolean(r0, r9)
            r8.A1B = r0
            goto L_0x0271
        L_0x01e5:
            java.lang.String r0 = "ON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01f3
            r0 = r19
            r5.setForceDark(r0)
            goto L_0x01d7
        L_0x01f3:
            java.lang.String r0 = "OFF"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d7
            r5.setForceDark(r9)
            goto L_0x01d7
        L_0x01ff:
            if (r2 == 0) goto L_0x0271
            goto L_0x01d7
        L_0x0202:
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            android.content.Context r0 = r0.getContext()
            com.facebook.browser.lite.HotInstanceManagerForWebView$ApplicationScopeWebViewContext r0 = (com.facebook.browser.lite.HotInstanceManagerForWebView$ApplicationScopeWebViewContext) r0
            r0.setActivityContext(r2)
            X.C39624A2o.A02 = r17
            r7 = r4
            com.facebook.browser.lite.webview.SystemWebView r7 = (com.facebook.browser.lite.webview.SystemWebView) r7
            X.QcV r3 = r7.A04
            android.webkit.WebSettings r6 = r3.getSettings()
            java.lang.String r5 = r6.getUserAgentString()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0261
            java.lang.String r2 = " FBNV/5"
        L_0x0225:
            boolean r0 = r5.endsWith(r2)
            if (r0 == 0) goto L_0x023b
            int r1 = r5.length()
            int r0 = r2.length()
            int r1 = r1 - r0
            java.lang.String r0 = r5.substring(r9, r1)
            r6.setUserAgentString(r0)
        L_0x023b:
            com.android.webview.chromium.membrane.HeliumWebViewExtensions r2 = r7.A01
            if (r2 == 0) goto L_0x0254
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "WVHI.autofillReset.Start"
            r1.A04(r0)
            r2.resetAutofillProvider()
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "WVHI.autofillReset.End"
            r1.A04(r0)
        L_0x0254:
            r3.setVisibility(r9)
            r3.onResume()
            r3.resumeTimers()
            r16 = 1
            goto L_0x0064
        L_0x0261:
            java.lang.String r2 = " FBNV/1"
            goto L_0x0225
        L_0x0264:
            android.content.Context r0 = r8.A05
            com.facebook.browser.lite.webview.SystemWebView r4 = new com.facebook.browser.lite.webview.SystemWebView
            r4.<init>(r0)
            r13 = r17
            r16 = 0
            goto L_0x0066
        L_0x0271:
            r5.setJavaScriptEnabled(r10)     // Catch:{ NullPointerException -> 0x0274 }
        L_0x0274:
            X.A4g r0 = r8.A0P
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36313579124492444(0x810302003d089c, double:3.028191889150922E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x0554
            android.content.Context r0 = r8.A05
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r0)
        L_0x0289:
            r8.A18 = r0
            android.content.Intent r1 = r8.A06
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r2 = r1.getStringExtra(r0)
            boolean r0 = r5.supportMultipleWindows()
            if (r0 == 0) goto L_0x02bf
            if (r2 == 0) goto L_0x0539
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0539
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r2.length()
            int r2 = r2 - r10
            r1 = r8
            boolean r0 = r8 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0535
            X.7kY r1 = (X.C340017kY) r1
            java.lang.String r0 = r1.A07
        L_0x02b8:
            r3.insert(r2, r0)
        L_0x02bb:
            java.lang.String r2 = r3.toString()
        L_0x02bf:
            android.content.Intent r1 = r8.A06
            r0 = 415(0x19f, float:5.82E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r1 = r1.getBooleanExtra(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x02de
            if (r1 != 0) goto L_0x02de
            java.lang.String r0 = r8.A18
            java.lang.String r0 = X.002.A0R(r0, r2)
            r8.A18 = r0
            r5.setUserAgentString(r0)
        L_0x02de:
            X.B2o r0 = r8.A0V
            X.2Fj r1 = r0.CCh()
            java.lang.String r0 = r8.A18
            r1.A0B(r0)
            X.A9z r2 = r8.A0d
            X.TfK r0 = X.C249113j9.A01
            r1 = 0
            if (r0 == 0) goto L_0x02f1
            r1 = 1
        L_0x02f1:
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x02f7
            r2.A0l = r1
        L_0x02f7:
            X.A9z r2 = r8.A0d
            android.content.Intent r1 = r8.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_HELIUM_STARTUP_CLASS"
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x0307
            r2.A0Y = r1
        L_0x0307:
            X.A8t r0 = r8.A0N
            r28 = r0
            X.TiP r0 = r8.A0U
            r30 = r0
            X.Tl6 r15 = r8.A0R
            X.QKp r14 = r8.A0E
            X.SRY r12 = r8.A0L
            X.Rvf r11 = r8.A0H
            android.content.Context r3 = r8.A05
            android.content.Intent r2 = r8.A06
            boolean r1 = r8.A1J
            boolean r0 = r8 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0531
            X.0wj r31 = X.0wj.A01
        L_0x0323:
            X.QL8 r0 = new X.QL8
            r21 = r0
            r22 = r3
            r23 = r2
            r24 = r8
            r25 = r14
            r26 = r11
            r27 = r12
            r29 = r15
            r32 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4.A0D(r0)
            X.TiP r0 = r8.A0U
            r21 = r0
            X.Tl6 r14 = r8.A0R
            android.content.Intent r1 = r8.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_THEME"
            r1.getStringExtra(r0)
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            android.content.ContentResolver r12 = r0.getContentResolver()
            android.content.Intent r1 = r8.A06
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r11 = r1.getBooleanExtra(r0, r9)
            android.content.Intent r1 = r8.A06
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r3 = r1.getBooleanExtra(r0, r9)
            android.content.Intent r1 = r8.A06
            r0 = 423(0x1a7, float:5.93E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r1 = r1.getBooleanExtra(r0, r9)
            com.facebook.browser.lite.BrowserLiteWebChromeClient r2 = new com.facebook.browser.lite.BrowserLiteWebChromeClient
            r2.<init>()
            r2.A00 = r9
            r2.A0G = r9
            r2.A0E = r4
            r2.A0A = r8
            r15 = 2131433151(0x7f0b16bf, float:1.848808E38)
            android.view.View r0 = r8.requireView()
            android.view.View r0 = r0.findViewById(r15)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.A08 = r0
            X.AH7 r15 = X.AH7.A01()
            java.lang.Class<X.TlP> r0 = X.C13921TlP.class
            java.util.ArrayList r0 = r15.A02(r0)
            r2.A0F = r0
            r0 = r21
            r2.A0D = r0
            r2.A0C = r14
            r2.A02 = r12
            r2.A0J = r11
            r2.A0H = r3
            r2.A0I = r1
            com.facebook.browser.lite.BrowserLiteFragment r0 = r2.A0A
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x03ba
            android.content.Intent r0 = r0.getIntent()
            r2.A03 = r0
        L_0x03ba:
            X.TiP r0 = r2.A0D
            if (r0 == 0) goto L_0x04ee
            r0.CMu()
        L_0x03c1:
            X.Q8q r1 = new X.Q8q
            r1.<init>()
            r1.A00 = r2
            r0 = r33
            r0.A02 = r1
            r7.setWebChromeClient(r1)
            r4.A0E = r2
            X.Rx5 r0 = new X.Rx5
            r0.<init>(r8, r4)
            r4.A0D = r0
            X.AQG r0 = new X.AQG
            r0.<init>(r8)
            r4.A0I = r0
            X.AOp r3 = new X.AOp
            r3.<init>()
            X.AP5 r1 = r8.A1K
            if (r1 == 0) goto L_0x03ed
            java.util.Set r0 = r3.A00
            r0.add(r1)
        L_0x03ed:
            X.A9z r15 = r8.A0d
            java.lang.String r14 = r8.A0l
            X.SRY r12 = r8.A0L
            java.util.List r11 = r8.A19
            java.util.List r2 = r8.A0o
            X.APR r1 = new X.APR
            r1.<init>(r8)
            X.SbW r0 = new X.SbW
            r21 = r0
            r22 = r1
            r23 = r12
            r24 = r15
            r25 = r14
            r26 = r11
            r27 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27)
            java.util.Set r2 = r3.A00
            r2.add(r0)
            android.content.Intent r1 = r8.A06
            java.lang.String r0 = "extra_enable_swipe_down_to_dismiss"
            boolean r0 = r1.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x042b
            X.Ai4 r1 = new X.Ai4
            r1.<init>(r8)
            X.AP4 r0 = new X.AP4
            r0.<init>(r1)
            r2.add(r0)
        L_0x042b:
            X.Tl6 r0 = r8.A0R
            if (r0 == 0) goto L_0x0432
            r2.add(r0)
        L_0x0432:
            r7.setOnTouchListener(r3)
            r7.setHapticFeedbackEnabled(r9)
            r7.clearSslPreferences()
            r5.setDatabaseEnabled(r10)
            r5.setDomStorageEnabled(r10)
            boolean r0 = r8.A1F
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)
            android.content.Context r2 = r8.A05
            java.lang.Boolean r0 = r8.A0g
            boolean r1 = r0.booleanValue()
            android.webkit.CookieSyncManager.createInstance(r2)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            if (r0 == 0) goto L_0x045a
            r0.setAcceptThirdPartyCookies(r7, r1)
        L_0x045a:
            android.content.Intent r1 = r8.A06
            r0 = 400(0x190, float:5.6E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x04ea
            r0 = r19
            r5.setMixedContentMode(r0)
        L_0x046d:
            com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy r1 = r8.A0G
            if (r1 == 0) goto L_0x0478
            java.lang.String r0 = r1.A06()
            r7.addJavascriptInterface(r1, r0)
        L_0x0478:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.createWebView.injectSessionCookies_start"
            r1.A04(r0)
            android.content.Intent r1 = r8.getIntent()
            r0 = 388(0x184, float:5.44E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.util.ArrayList r0 = r1.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x0568
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x049a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x055a
            java.lang.Object r1 = r11.next()
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 154(0x9a, float:2.16E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            r0 = 521(0x209, float:7.3E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x049a
            if (r1 == 0) goto L_0x049a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x049a
            java.lang.String r0 = "http"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x04e6
            r0 = 1468(0x5bc, float:2.057E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x04e6
            r0 = 3247(0xcaf, float:4.55E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = X.002.A0R(r0, r2)
        L_0x04e6:
            r3.put(r2, r1)
            goto L_0x049a
        L_0x04ea:
            r5.setMixedContentMode(r10)
            goto L_0x046d
        L_0x04ee:
            r1 = 2131438585(0x7f0b2bf9, float:1.8499101E38)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r2.A0A
            android.view.View r0 = r0.requireView()
            android.view.View r0 = r0.findViewById(r1)
            com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar r0 = (com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar) r0
            r2.A0B = r0
            if (r0 != 0) goto L_0x052d
            r1 = 2131438589(0x7f0b2bfd, float:1.849911E38)
            com.facebook.browser.lite.BrowserLiteFragment r0 = r2.A0A
            android.view.View r0 = r0.requireView()
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar r0 = (com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar) r0
            r2.A0B = r0
        L_0x0518:
            com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar r0 = r2.A0B
            r0.setProgress(r9)
            java.util.List r0 = r2.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x0523:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03c1
            r1.next()
            goto L_0x0523
        L_0x052d:
            r0.setVisibility(r9)
            goto L_0x0518
        L_0x0531:
            r31 = 0
            goto L_0x0323
        L_0x0535:
            java.lang.String r0 = ""
            goto L_0x02b8
        L_0x0539:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = " "
            r3.append(r0)
            r1 = r8
            boolean r0 = r8 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0551
            X.7kY r1 = (X.C340017kY) r1
            java.lang.String r0 = r1.A07
        L_0x054c:
            r3.append(r0)
            goto L_0x02bb
        L_0x0551:
            java.lang.String r0 = ""
            goto L_0x054c
        L_0x0554:
            java.lang.String r0 = r5.getUserAgentString()
            goto L_0x0289
        L_0x055a:
            android.content.Context r2 = r8.A05
            X.A9z r1 = r8.A0d
            java.util.regex.Pattern r0 = X.SCX.A01
            X.TJZ r0 = new X.TJZ
            r0.<init>(r2, r1, r3, r10)
            X.SB5.A00(r0)
        L_0x0568:
            r8.A0s = r10
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.createWebView.injectSessionCookies_end"
            r1.A04(r0)
            android.content.Intent r1 = r8.A06
            if (r1 == 0) goto L_0x06dd
            r0 = 540(0x21c, float:7.57E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x06dd
        L_0x0583:
            java.lang.String r0 = r8.A0T()
            if (r0 == 0) goto L_0x06d9
            java.lang.String r0 = r8.A0T()
            long r2 = java.lang.Long.parseLong(r0)
        L_0x0591:
            X.SPF r0 = r8.A0J
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05bc
            java.lang.String r12 = r8.A0S()
            android.content.Intent r1 = r8.A06
            if (r1 == 0) goto L_0x05a9
            java.lang.String r0 = "BWP_MEDIA_ID"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x05ab
        L_0x05a9:
            r0 = r20
        L_0x05ab:
            android.content.Context r11 = r8.A05
            X.SPF r1 = r8.A0J
            X.S8E.A01(r11, r1, r9)
            X.S1e r1 = new X.S1e
            r1.<init>(r2, r12, r0)
            java.lang.String r0 = "AmazonShopExternalInterfaceHandler"
            r7.addJavascriptInterface(r1, r0)
        L_0x05bc:
            X.SHI r0 = r8.A0I
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x05df
            java.lang.String r11 = r8.A0S()
            android.content.Context r1 = r8.A05
            X.SHI r0 = r8.A0I
            X.S8D.A01(r1, r0)
            X.S13 r1 = new X.S13
            r1.<init>(r2, r11)
            X.SHI r0 = r8.A0I
            X.ThJ r0 = r0.A00
            java.lang.String r0 = r0.BSD()
            r7.addJavascriptInterface(r1, r0)
        L_0x05df:
            java.lang.String r0 = r8.A0l
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r12 = r0.getHost()
            X.A4g r0 = r8.A0P
            com.instagram.common.session.UserSession r11 = r0.A00
            X.0qQ.A0B(r11, r10)
            r0 = 36324698791424271(0x810d1f0009310f, double:3.0352240112939143E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x0606
            r0 = 36324698790834446(0x810d1f0000310e, double:3.0352240109209066E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 != 0) goto L_0x062e
        L_0x0606:
            if (r12 == 0) goto L_0x0689
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0689
            r0 = 36887648744309503(0x830d1f000102ff, double:3.3912358283160474E-306)
            java.lang.String r1 = X.182.A04(r6, r11, r0)
            r0 = 39
            java.lang.String r0 = X.002.A0E(r12, r0, r0)
            boolean r0 = X.00l.A0d(r1, r0, r9)
            if (r0 == 0) goto L_0x0689
            r0 = 36324698790834446(0x810d1f0000310e, double:3.0352240109209066E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x0689
        L_0x062e:
            java.util.concurrent.ExecutorService r0 = r8.A0q
            if (r0 != 0) goto L_0x063d
            X.Asw r0 = new X.Asw
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r8.A0q = r0
        L_0x063d:
            X.QL8 r0 = A05(r4)
            if (r0 == 0) goto L_0x06d5
            X.Rtr r0 = r0.A04(r12)
            java.lang.String r9 = r0.A01
        L_0x0649:
            X.A4g r0 = r8.A0P
            com.instagram.common.session.UserSession r0 = r0.A00
            X.A8N r1 = new X.A8N
            r1.<init>(r0)
            if (r9 == 0) goto L_0x0656
            r20 = r9
        L_0x0656:
            java.util.concurrent.ExecutorService r0 = r8.A0q
            X.ADy r10 = new X.ADy
            r21 = r10
            r22 = r1
            r23 = r12
            r24 = r20
            r25 = r0
            r26 = r2
            r21.<init>(r22, r23, r24, r25, r26)
            r8.A0W = r10
            X.SRY r9 = r8.A0L
            X.A9z r3 = r8.A0d
            android.os.Bundle r2 = r8.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r8.A0e
            X.VhS r1 = new X.VhS
            r20 = r1
            r21 = r2
            r22 = r9
            r23 = r10
            r24 = r3
            r25 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            java.lang.String r0 = "IPAExperiment"
            r7.addJavascriptInterface(r1, r0)
        L_0x0689:
            android.content.Intent r2 = r8.A06
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_WEBVIEW_LAYER_TYPE"
            r0 = r18
            int r1 = r2.getIntExtra(r1, r0)
            if (r1 < 0) goto L_0x069e
            r0 = r19
            if (r1 > r0) goto L_0x069e
            r0 = r17
            r7.setLayerType(r1, r0)
        L_0x069e:
            java.util.List r10 = r8.A0o
            java.lang.String r9 = "newWebViewCreated"
            if (r10 == 0) goto L_0x071e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "BLF.plugins."
            r3.append(r2)
            r3.append(r9)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".Start"
            r3.append(r0)
            java.lang.String r0 = X.002.A0g(r2, r9, r0)
            r1.A04(r0)
            java.util.Iterator r1 = r10.iterator()
        L_0x06c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x070e
            java.lang.Object r0 = r1.next()
            X.TlR r0 = (X.C13923TlR) r0
            r0.CrW(r4)
            goto L_0x06c5
        L_0x06d5:
            r9 = r20
            goto L_0x0649
        L_0x06d9:
            r2 = 0
            goto L_0x0591
        L_0x06dd:
            android.content.Intent r2 = r8.A06
            if (r2 == 0) goto L_0x0583
            r0 = 539(0x21b, float:7.55E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = r2.getStringExtra(r1)
            if (r0 == 0) goto L_0x0583
            android.content.Context r11 = r8.A05
            android.content.Intent r0 = r8.A06
            java.lang.String r0 = r0.getStringExtra(r1)
            android.net.Uri r3 = X.0cp.A03(r0)
            java.util.regex.Pattern r0 = X.SCX.A01
            java.lang.String r2 = r3.getScheme()
            java.lang.String r1 = "://"
            java.lang.String r0 = r3.getHost()
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.C9226RUd.A00(r11, r0)
            goto L_0x0583
        L_0x070e:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".End"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.A04(r0)
        L_0x071e:
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = A0L(r0)
            if (r0 == 0) goto L_0x0737
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x0737
            android.view.ViewParent r0 = r7.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r7)
        L_0x0737:
            if (r16 == 0) goto L_0x0764
            android.content.Intent r0 = r8.getIntent()
            java.lang.Integer r1 = A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0764
            if (r13 == 0) goto L_0x0757
            java.lang.Long r0 = r13.A00
            if (r0 == 0) goto L_0x0752
            long r0 = r0.longValue()
            A0F(r8, r4, r0)
        L_0x0752:
            java.lang.String r0 = r13.A03
            r8.A0c(r0)
        L_0x0757:
            com.facebook.browser.lite.BrowserLiteWebChromeClient r1 = r4.A03()
            if (r1 == 0) goto L_0x0764
            int r0 = r7.getProgress()
            r1.A07(r4, r0)
        L_0x0764:
            boolean r0 = r5.supportMultipleWindows()
            if (r0 == 0) goto L_0x077a
            X.A34 r0 = r8.A0Q
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 2342156588337203341(0x20810302002e088d, double:4.0601415216410115E-152)
            boolean r1 = X.182.A06(r6, r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x077b
        L_0x077a:
            r0 = 1
        L_0x077b:
            r8.A1H = r0
            android.widget.FrameLayout r0 = r8.A0C
            r0.addView(r7)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.createWebView.End"
            r1.A04(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A06():X.QLA");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013b, code lost:
        if (X.QL3.A01(r7, r6.A06.getStringExtra(X.Pxd.A00(369)), r6.A06.getStringExtra(X.Pxd.A00(368)), r6.A06.getStringExtra(X.Pxd.A00(370)), r1.getBooleanExtra(X.Pxd.A00(130), false)) != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[LOOP:0: B:11:0x002e->B:13:0x0034, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0f(java.lang.String r7) {
        /*
            r6 = this;
            r4 = 1
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r1 = "handleInvalidProtocol %s"
            boolean r0 = X.SQO.A00
            if (r0 == 0) goto L_0x0010
            r0 = 0
            java.lang.String.format(r0, r1, r2)
        L_0x0010:
            X.SRY r0 = r6.A0L
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0027
            int r2 = r0.CIl(r7)     // Catch:{ RemoteException -> 0x001b }
            goto L_0x0028
        L_0x001b:
            r2 = move-exception
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "Error in handleInvalidProtocolSync"
            X.0KC.A0J(r1, r0, r2)
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.util.List r0 = r6.A0o
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            r1.next()
            goto L_0x002e
        L_0x0038:
            if (r2 == r4) goto L_0x01a7
            r0 = 2
            if (r2 == r0) goto L_0x017a
            r0 = 3
            if (r2 == r0) goto L_0x01a0
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00fc
            android.content.Intent r1 = r6.getIntent()
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x00fc
            android.content.Context r3 = r6.A05
            java.util.List r0 = X.SQY.A00
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r0 != 0) goto L_0x01a0
            android.content.Intent r1 = X.0b8.A00(r7)     // Catch:{ URISyntaxException -> 0x01a0 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r0 = 6
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.addCategory(r0)
            r1.setComponent(r2)
            r1.setSelector(r2)
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ Exception -> 0x0184 }
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r5)     // Catch:{ Exception -> 0x0184 }
            if (r0 == 0) goto L_0x01a0
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            android.content.Context r1 = r6.A05
            r0 = 2131951708(0x7f13005c, float:1.9539838E38)
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            android.app.AlertDialog$Builder r2 = r3.setTitle(r0)
            android.content.Context r1 = r6.A05
            r0 = 2131951705(0x7f130059, float:1.9539832E38)
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            android.content.Context r1 = r6.A05
            r0 = 2131951707(0x7f13005b, float:1.9539836E38)
            X.0qQ.A0B(r1, r5)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.AKJ r0 = new X.AKJ
            r0.<init>(r6, r7)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r1, r0)
            android.content.Context r1 = r6.A05
            r0 = 2131951706(0x7f13005a, float:1.9539834E38)
            X.0qQ.A0B(r1, r5)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.AJf r0 = new X.AJf
            r0.<init>(r6)
            android.app.AlertDialog$Builder r1 = r2.setNegativeButton(r1, r0)
            X.AKu r0 = new X.AKu
            r0.<init>(r6)
            r1.setOnDismissListener(r0)
            android.app.AlertDialog r0 = r3.create()
            X.AnonymousClass0fN.A00(r0)
            X.B1i r2 = r6.A0M
            if (r2 == 0) goto L_0x01a7
            X.9su r1 = X.C391409su.A0s
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.Cgm(r1, r0)
            return r4
        L_0x00fc:
            X.B2o r0 = r6.A0V
            X.2Fj r0 = r0.Avi()
            r0.A0B(r7)
            android.content.Intent r1 = r6.A06
            if (r1 == 0) goto L_0x016f
            r0 = 130(0x82, float:1.82E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r5 = r1.getBooleanExtra(r0, r5)
            android.content.Intent r1 = r6.A06
            r0 = 369(0x171, float:5.17E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r1 = r6.A06
            r0 = 368(0x170, float:5.16E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r2 = r1.getStringExtra(r0)
            android.content.Intent r1 = r6.A06
            r0 = 370(0x172, float:5.18E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r1.getStringExtra(r0)
            boolean r0 = X.QL3.A01(r7, r3, r2, r0, r5)
            if (r0 == 0) goto L_0x016f
        L_0x013d:
            android.content.Context r0 = r6.A05
            X.A4h r0 = X.SQY.A00(r0, r7, r4)
            boolean r3 = r0.A01
            if (r3 == 0) goto L_0x015f
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x015f
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            X.SRY r2 = r6.A0L
            if (r0 == 0) goto L_0x015f
            X.07V r1 = r0.getLifecycle()
            X.SdR r0 = new X.SdR
            r0.<init>(r6, r2, r7, r4)
            r1.A09(r0)
        L_0x015f:
            java.util.List r0 = r6.A0o
            java.util.Iterator r1 = r0.iterator()
        L_0x0165:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0171
            r1.next()
            goto L_0x0165
        L_0x016f:
            r4 = 0
            goto L_0x013d
        L_0x0171:
            if (r3 != 0) goto L_0x0179
            r0 = 2131951713(0x7f130061, float:1.9539848E38)
            r6.A0A(r0)
        L_0x0179:
            return r3
        L_0x017a:
            java.lang.String r1 = "INVALID_PROTOCOL"
            r0 = 4
            A0G(r6, r1)
            r6.AI4(r0, r7)
            return r4
        L_0x0184:
            r3 = move-exception
            r0 = 916(0x394, float:1.284E-42)
            java.lang.String r2 = X.Pxd.A00(r0)
            java.lang.String r1 = "\n"
            java.lang.String r0 = r3.getMessage()
            java.lang.String r2 = X.002.A0u(r2, r7, r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 366(0x16e, float:5.13E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.SQO.A02(r0, r2, r1)
        L_0x01a0:
            r0 = 2131951713(0x7f130061, float:1.9539848E38)
            r6.A0A(r0)
            r4 = 0
        L_0x01a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0f(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.QcV, android.webkit.WebView] */
    public final boolean DIV(boolean z) {
        this.A02 = 2;
        List<B3J> list = this.A0n;
        if (list != null) {
            for (B3J DIU : list) {
                DIU.DIU();
            }
        }
        QLA C8U = C8U();
        if (C8U != null) {
            BrowserLiteWebChromeClient A032 = C8U.A03();
            if (A032 != null && A032.A08.getVisibility() == 0) {
                try {
                    BrowserLiteWebChromeClient.A01(A032);
                } catch (Throwable unused) {
                }
            } else if (C8U.A0G()) {
                ((SystemWebView) C8U).A04.goBack();
            } else if (this.A1M.size() > 1) {
                A0D(this);
            }
            if (!z) {
                return true;
            }
            this.A12++;
            return true;
        }
        return false;
    }

    public static Integer A07(Intent intent) {
        String stringExtra;
        if (!(intent == null || (stringExtra = intent.getStringExtra(Pxd.A00(398))) == null)) {
            switch (stringExtra.hashCode()) {
                case -1130324112:
                    if (stringExtra.equals("instant_helium")) {
                        return AnonymousClass05K.A0Y;
                    }
                    break;
                case -934641255:
                    if (stringExtra.equals("reload")) {
                        return AnonymousClass05K.A01;
                    }
                    break;
                case 374351032:
                    if (stringExtra.equals("reload_helium")) {
                        return AnonymousClass05K.A0C;
                    }
                    break;
                case 1957570017:
                    if (stringExtra.equals("instant")) {
                        return AnonymousClass05K.A0N;
                    }
                    break;
            }
        }
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.facebook.iabeventlogging.model.IABEmptyEvent] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f1, code lost:
        if (r4.isEmpty() != false) goto L_0x00f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09() {
        /*
            r86 = this;
            r2 = r86
            boolean r0 = r2.A0y
            if (r0 != 0) goto L_0x0028
            X.A9z r1 = r2.A0d
            long r6 = r1.A0I
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x01af
            r1.A0H = r6
            com.facebook.iabeventlogging.model.IABEmptyEvent r0 = com.facebook.iabeventlogging.model.IABEvent.A04
            java.lang.String r5 = r1.A0Z
            X.0JP r0 = r1.A0m
            long r8 = r0.now()
            com.facebook.privacy.zone.api.ZonedValue r4 = r1.A0Q
            com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent r3 = new com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent
            r3.<init>(r4, r5, r6, r8)
        L_0x0021:
            android.os.Bundle r1 = r2.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r2.A0e
            r2.CjX(r1, r3, r0)
        L_0x0028:
            X.A9z r3 = r2.A0d
            int r1 = r2.A02
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x0032
            r3.A00 = r1
        L_0x0032:
            android.content.Intent r0 = r2.getIntent()
            boolean r0 = A0L(r0)
            if (r0 == 0) goto L_0x0052
            android.content.Intent r0 = r2.getIntent()
            java.lang.Integer r1 = A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x019d
            X.A9z r1 = r2.A0d
            r3 = 257(0x101, double:1.27E-321)
        L_0x004c:
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x0052
            r1.A0N = r3
        L_0x0052:
            X.A9z r3 = r2.A0d
            java.util.Stack r0 = r2.A1M
            int r1 = r0.size()
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x0060
            r3.A04 = r1
        L_0x0060:
            java.lang.String r1 = r2.A18
            java.lang.String r0 = r2.A0U()
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 != 0) goto L_0x0073
            java.lang.String r1 = r2.A0j
            java.lang.String r0 = "UserAgent changed during webview session"
            X.0KC.A0E(r1, r0)
        L_0x0073:
            X.A9z r3 = r2.A0d
            java.lang.String r16 = r2.A0U()
            X.B2o r0 = r2.A0V
            X.2Fj r0 = r0.BH6()
            java.lang.Object r5 = r0.A02()
            java.lang.String r5 = (java.lang.String) r5
            X.B2o r0 = r2.A0V
            X.2Fj r0 = r0.Avi()
            java.lang.Object r4 = r0.A02()
            java.lang.String r4 = (java.lang.String) r4
            X.B2o r0 = r2.A0V
            long r43 = r0.BYU()
            boolean r0 = r3.A0p
            if (r0 != 0) goto L_0x00a5
            com.facebook.iabeventlogging.model.IABEmptyEvent r3 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x009d:
            android.os.Bundle r1 = r2.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r2.A0e
            r2.CjX(r1, r3, r0)
            return
        L_0x00a5:
            com.facebook.iabeventlogging.model.IABEmptyEvent r0 = com.facebook.iabeventlogging.model.IABEvent.A04
            java.lang.String r0 = r3.A0Z
            r85 = r0
            long r0 = r3.A0I
            r39 = r0
            X.0JP r0 = r3.A0m
            long r37 = r0.now()
            long r0 = r3.A0L
            r41 = r0
            long r0 = r3.A0M
            r45 = r0
            long r0 = r3.A0K
            r47 = r0
            long r0 = r3.A0B
            r49 = r0
            long r0 = r3.A0F
            r51 = r0
            long r0 = r3.A0H
            r53 = r0
            java.util.ArrayList r0 = r3.A0o
            r24 = r0
            com.facebook.privacy.zone.api.ZonedValue r0 = r3.A0Q
            r84 = r0
            java.lang.String r0 = r3.A0W
            r83 = r0
            int r0 = r3.A00
            r27 = r0
            int r0 = r3.A02
            r28 = r0
            int r0 = r3.A03
            r29 = r0
            int r0 = r3.A01
            r30 = r0
            if (r4 == 0) goto L_0x00f3
            boolean r0 = r4.isEmpty()
            r69 = 1
            if (r0 == 0) goto L_0x00f5
        L_0x00f3:
            r69 = 0
        L_0x00f5:
            boolean r0 = r3.A0j
            r70 = r0
            long r0 = r3.A0N
            r55 = r0
            r33 = 0
            r20 = 0
            long r0 = r3.A0C
            r57 = r0
            long r14 = r3.A0A
            boolean r0 = r3.A0e
            r72 = r0
            boolean r0 = r3.A0f
            r73 = r0
            boolean r0 = r3.A0h
            r74 = r0
            boolean r0 = r3.A0k
            r75 = r0
            long r12 = r3.A09
            java.lang.String r0 = r3.A0a
            r82 = r0
            boolean r0 = r3.A0l
            r76 = r0
            boolean r0 = r3.A0i
            r77 = r0
            java.util.List r0 = r3.A0d
            r26 = r0
            long r10 = r3.A0D
            long r8 = r3.A0E
            long r6 = r3.A0G
            java.lang.Long r0 = r3.A0V
            r81 = r0
            java.lang.Long r0 = r3.A0U
            r80 = r0
            java.lang.Boolean r0 = r3.A0S
            r22 = r0
            java.util.ArrayList r0 = r3.A0b
            r19 = r0
            java.lang.String r0 = r3.A0Y
            r23 = r0
            java.lang.Boolean r0 = r3.A0T
            boolean r78 = r0.booleanValue()
            java.lang.Boolean r0 = r3.A0R
            boolean r79 = r0.booleanValue()
            int r0 = r3.A04
            r18 = r0
            int r0 = r3.A05
            r17 = r0
            long r0 = r3.A0J
            com.facebook.iabeventlogging.model.IABWebviewEndEvent r3 = new com.facebook.iabeventlogging.model.IABWebviewEndEvent
            r21 = r20
            r25 = r19
            r31 = r18
            r32 = r17
            r34 = r33
            r35 = r39
            r39 = r41
            r41 = r45
            r45 = r47
            r47 = r49
            r49 = r51
            r51 = r53
            r53 = r55
            r55 = r57
            r57 = r14
            r59 = r12
            r61 = r10
            r63 = r8
            r65 = r6
            r67 = r0
            r71 = r33
            r10 = r3
            r11 = r84
            r12 = r22
            r13 = r81
            r14 = r80
            r15 = r85
            r17 = r5
            r18 = r83
            r19 = r4
            r22 = r82
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
            goto L_0x009d
        L_0x019d:
            android.content.Intent r0 = r2.getIntent()
            java.lang.Integer r1 = A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0052
            X.A9z r1 = r2.A0d
            r3 = 1
            goto L_0x004c
        L_0x01af:
            com.facebook.iabeventlogging.model.IABEmptyEvent r3 = com.facebook.iabeventlogging.model.IABEvent.A04
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A09():void");
    }

    private void A0A(int i) {
        Context context = this.A05;
        0qQ.A0B(context, 0);
        String string = context.getString(i);
        0qQ.A07(string);
        int i2 = 0;
        if (string.length() > 60) {
            i2 = 1;
        }
        Toast.makeText(this.A05.getApplicationContext(), string, i2).show();
    }

    public static void A0B(Intent intent, BrowserLiteFragment browserLiteFragment) {
        List asList;
        if (intent != null) {
            IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT");
            A9z a9z = browserLiteFragment.A0d;
            if (iABAdsContext != null) {
                asList = iABAdsContext.A06;
                if (!a9z.A0p) {
                    return;
                }
            } else if (a9z.A0p) {
                asList = Arrays.asList(new RFY[]{RFY.IAB_NO_ADS_CONTEXT});
            } else {
                return;
            }
            a9z.A0c = asList;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.QcV, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.view.View, android.webkit.WebView] */
    public static void A0D(BrowserLiteFragment browserLiteFragment) {
        String str;
        Stack stack = browserLiteFragment.A1M;
        if (stack.isEmpty()) {
            str = "Pop Web View, Web View Stack Empty";
        } else {
            QLA qla = (QLA) stack.pop();
            ? r1 = ((SystemWebView) qla).A04;
            r1.setVisibility(8);
            browserLiteFragment.A0C.removeView(r1);
            List<C13923TlR> list = browserLiteFragment.A0o;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BLF.plugins.");
                sb.append("webViewPopped");
                SSR A002 = SSR.A00();
                sb.append(".Start");
                A002.A04(002.A0g("BLF.plugins.", "webViewPopped", ".Start"));
                for (C13923TlR FNP : list) {
                    FNP.FNP(qla);
                }
                SSR A003 = SSR.A00();
                sb.append(".End");
                A003.A04(sb.toString());
            }
            browserLiteFragment.A0J(qla);
            QLA C8U = browserLiteFragment.C8U();
            if (C8U == null) {
                str = "WEBVIEW_STACK_EMPTY";
            } else {
                ? r0 = ((SystemWebView) C8U).A04;
                r0.setVisibility(0);
                r0.onResume();
                browserLiteFragment.A0K(C8U);
                BrowserLiteWebChromeClient A032 = C8U.A03();
                if (A032 != null) {
                    A032.A07(C8U, r0.getProgress());
                    return;
                }
                return;
            }
        }
        A0G(browserLiteFragment, str);
        browserLiteFragment.AI4(4, (String) null);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r8v2, types: [com.facebook.iabeventlogging.model.IABEmptyEvent] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        if (r9.isEmpty() != false) goto L_0x00b1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(com.facebook.browser.lite.BrowserLiteFragment r49, X.QLA r50) {
        /*
            r0 = r50
            if (r50 == 0) goto L_0x00e6
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.pauseTimers()
            r0.onPause()     // Catch:{ Exception -> 0x000e }
        L_0x000e:
            r10 = r49
            boolean r0 = r10.A1C
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            r10.A1C = r0
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onPause"
            r1.A04(r0)
            java.util.Stack r0 = r10.A1M
            java.lang.Object r4 = r0.firstElement()
            X.QLA r4 = (X.QLA) r4
            r0 = 0
            A0H(r10, r0)
            X.A9z r3 = r10.A0d
            long r1 = r4.A01
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x0036
            r3.A0K = r1
        L_0x0036:
            java.lang.String r15 = r4.A06()
            X.B2o r0 = r10.A0V
            X.2Fj r0 = r0.BH6()
            r0.A0B(r15)
            X.A9z r0 = r10.A0d
            X.B2o r1 = r10.A0V
            X.2Fj r1 = r1.Avi()
            java.lang.Object r9 = r1.A02()
            java.lang.String r9 = (java.lang.String) r9
            X.B2o r1 = r10.A0V
            long r30 = r1.BYU()
            boolean r1 = r0.A0p
            if (r1 != 0) goto L_0x0069
            com.facebook.iabeventlogging.model.IABEmptyEvent r8 = com.facebook.iabeventlogging.model.IABEvent.A04
        L_0x005d:
            android.os.Bundle r1 = r10.A08
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r10.A0e
            r10.CjX(r1, r8, r0)
            boolean r0 = r10.A1B
            r10.A1I = r0
            return
        L_0x0069:
            com.facebook.iabeventlogging.model.IABEmptyEvent r1 = com.facebook.iabeventlogging.model.IABEvent.A04
            java.lang.String r1 = r0.A0Z
            r50 = r1
            long r1 = r0.A0I
            r48 = r1
            X.0JP r1 = r0.A0m
            long r24 = r1.now()
            long r1 = r0.A0L
            r28 = r1
            long r1 = r0.A0M
            r32 = r1
            long r1 = r0.A0K
            r34 = r1
            long r13 = r0.A0B
            long r11 = r0.A0F
            long r6 = r0.A0H
            java.util.ArrayList r1 = r0.A0o
            r23 = r1
            com.facebook.privacy.zone.api.ZonedValue r1 = r0.A0Q
            r22 = r1
            java.lang.String r1 = r0.A0W
            r17 = r1
            int r1 = r0.A00
            r18 = r1
            int r1 = r0.A02
            r19 = r1
            int r1 = r0.A03
            r20 = r1
            int r1 = r0.A01
            r21 = r1
            if (r9 == 0) goto L_0x00b1
            boolean r1 = r9.isEmpty()
            r46 = 1
            if (r1 == 0) goto L_0x00b3
        L_0x00b1:
            r46 = 0
        L_0x00b3:
            boolean r1 = r0.A0j
            r16 = r1
            long r4 = r0.A0D
            long r2 = r0.A0E
            long r0 = r0.A0J
            com.facebook.iabeventlogging.model.IABFirstPauseEvent r8 = new com.facebook.iabeventlogging.model.IABFirstPauseEvent
            r26 = r28
            r28 = r32
            r32 = r34
            r34 = r13
            r36 = r11
            r38 = r6
            r40 = r4
            r42 = r2
            r44 = r0
            r47 = r16
            r11 = r8
            r12 = r22
            r13 = r50
            r14 = r15
            r15 = r17
            r16 = r9
            r17 = r23
            r22 = r48
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r47)
            goto L_0x005d
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0E(com.facebook.browser.lite.BrowserLiteFragment, X.QLA):void");
    }

    public static void A0F(BrowserLiteFragment browserLiteFragment, QLA qla, long j) {
        A9z a9z = browserLiteFragment.A0d;
        if (a9z.A0p) {
            a9z.A0B = j;
        }
        int computeHorizontalScrollRange = ((SystemWebView) qla).A04.computeHorizontalScrollRange();
        if (a9z.A0p) {
            a9z.A06 = computeHorizontalScrollRange;
        }
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        A9z a9z2 = browserLiteFragment.A0d;
        if (a9z2.A0p) {
            a9z2.A07 = i;
        }
        browserLiteFragment.A0V.BH6().A0B(qla.A06());
    }

    public static void A0G(BrowserLiteFragment browserLiteFragment, String str) {
        C41803B1i b1i = browserLiteFragment.A0M;
        if (b1i != null) {
            boolean z = !str.equals("CREATING_WEBVIEW");
            long currentTimeMillis = System.currentTimeMillis();
            IABEmptyEvent iABEmptyEvent = IABEvent.A04;
            b1i.Cgg(new IABUnifiedEvent(C391409su.A1g, AnonymousClass05K.A00, browserLiteFragment.A08(z), str, currentTimeMillis, currentTimeMillis));
        }
    }

    public static void A0H(BrowserLiteFragment browserLiteFragment, String str) {
        Bundle extras;
        String string;
        BrowserLiteFragment browserLiteFragment2 = browserLiteFragment;
        if (!browserLiteFragment2.A1G) {
            String str2 = str;
            if (str != null) {
                Intent intent = browserLiteFragment2.A06;
                if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("BrowserLiteIntent.PERFORMANCE_LOGGER_MARKER_END_EVENT")) != null && !string.isEmpty()) {
                    Locale locale = Locale.US;
                    if (!str2.toLowerCase(locale).contains(string.toLowerCase(locale))) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Stack stack = browserLiteFragment2.A1M;
            if (stack.isEmpty()) {
                0KC.A0Q(browserLiteFragment2.A0j, "webViewStack is empty when trying to log timing event %s", new Object[]{str2});
                return;
            }
            QLA qla = (QLA) stack.firstElement();
            SRY sry = browserLiteFragment2.A0L;
            Context applicationContext = browserLiteFragment2.A05.getApplicationContext();
            String A062 = qla.A06();
            long j = browserLiteFragment2.A13;
            long j2 = qla.A07;
            long j3 = qla.A04;
            long j4 = qla.A05;
            long j5 = qla.A01;
            int i = browserLiteFragment2.A01;
            boolean z = browserLiteFragment2.A1E;
            boolean z2 = qla.A0X;
            HashMap A0V2 = browserLiteFragment2.A0V(qla);
            boolean z3 = browserLiteFragment2.A1D;
            String str3 = (String) browserLiteFragment2.A0V.Avi().A02();
            SSR A002 = SSR.A00();
            if (A002.A02) {
                SSR.A02(A002, Pxd.A00(790), 0);
            }
            Map map = A002.A04;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            SRY.A02(new C7568QJw(applicationContext, browserLiteFragment2.A08, sry, browserLiteFragment2.A0e, A062, str3, A0V2, map, i, j, j2, j3, j4, j5, z4, z5, z6), sry, false);
            browserLiteFragment2.A1G = true;
        }
    }

    public static void A0I(BrowserLiteFragment browserLiteFragment, boolean z) {
        Bundle bundle;
        Map map;
        Set set;
        HashSet hashSet;
        HashSet hashSet2;
        HashMap hashMap;
        Integer num;
        if (browserLiteFragment.A1Q != null && !browserLiteFragment.A1Q.equalsIgnoreCase(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            C39884ADg aDg = browserLiteFragment.A0O;
            Set set2 = aDg.A02;
            synchronized (set2) {
                bundle = new Bundle();
                map = aDg.A00;
                bundle.putSerializable("resource_counts", new HashMap(map));
                bundle.putSerializable("resource_domains", new HashSet(set2));
                set = aDg.A01;
                bundle.putSerializable("images_url", new HashSet(set));
            }
            List<C7578QKt> list = browserLiteFragment.A19;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BLF.plugins.");
                sb.append("logResources");
                SSR A002 = SSR.A00();
                sb.append(".Start");
                A002.A04(002.A0g("BLF.plugins.", "logResources", ".Start"));
                for (C7578QKt qKt : list) {
                    if (!qKt.A02) {
                        C39884ADg aDg2 = qKt.A03;
                        C39884ADg aDg3 = new C39884ADg(bundle);
                        Set set3 = aDg2.A02;
                        synchronized (set3) {
                            Set set4 = aDg3.A02;
                            synchronized (set4) {
                                try {
                                    hashSet = new HashSet(set4);
                                } catch (Throwable th) {
                                    while (true) {
                                        th = th;
                                    }
                                    throw th;
                                }
                            }
                            set3.addAll(hashSet);
                            Set set5 = aDg2.A01;
                            synchronized (set4) {
                                try {
                                    hashSet2 = new HashSet(aDg3.A01);
                                } catch (Throwable th2) {
                                    while (true) {
                                        th = th2;
                                        break;
                                    }
                                }
                            }
                            set5.addAll(hashSet2);
                            synchronized (set4) {
                                try {
                                    hashMap = new HashMap(aDg3.A00);
                                } catch (Throwable th3) {
                                    while (true) {
                                        th = th3;
                                        break;
                                    }
                                }
                            }
                            for (String str : hashMap.keySet()) {
                                Map map2 = aDg2.A00;
                                if (map2.containsKey(str)) {
                                    num = Integer.valueOf(((Integer) hashMap.get(str)).intValue() + ((Integer) map2.get(str)).intValue());
                                } else {
                                    num = (Integer) hashMap.get(str);
                                }
                                map2.put(str, num);
                            }
                        }
                    }
                }
                SSR A003 = SSR.A00();
                sb.append(".End");
                A003.A04(sb.toString());
            }
            synchronized (set2) {
                map.clear();
                set2.clear();
                set.clear();
            }
            if (z) {
                browserLiteFragment.A1Q = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.view.View, android.webkit.WebView, android.view.ViewGroup] */
    private void A0J(QLA qla) {
        if (qla == null) {
            return;
        }
        if (this.A1H) {
            qla.A08();
            return;
        }
        ? r0 = ((SystemWebView) qla).A04;
        r0.setTag((Object) null);
        r0.clearHistory();
        r0.removeAllViews();
        try {
            r0.onPause();
        } catch (Exception unused) {
        }
        qla.A02();
        qla.A0Y = true;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.QcV, android.webkit.WebView] */
    private void A0K(QLA qla) {
        C39774A8t a8t;
        if (!(this.A0U != null || (a8t = this.A0N) == null || qla == null)) {
            BrowserLiteWebChromeClient A032 = qla.A03();
            AnonymousClass9Y2 r1 = a8t.A00;
            if (r1 != null) {
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) r1;
                defaultBrowserLiteChrome.A0G = qla;
                defaultBrowserLiteChrome.setTitle(((SystemWebView) qla).A04.getTitle());
                if (A032 != null) {
                    BrowserLiteWebChromeClient.A02(A032, A032.A00);
                }
                defaultBrowserLiteChrome.A00(defaultBrowserLiteChrome.A0G.A05());
            }
        }
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0G;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A09(qla);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        if (r2.equals(r0) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0M(android.content.Intent r4) {
        /*
            X.A6v r3 = X.C39624A2o.A02
            if (r3 != 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            java.lang.String r2 = "iab hot instance"
            r1 = 0
            if (r4 != 0) goto L_0x0010
            java.lang.String r0 = "willReuseHotInstance returned false because intent is null"
        L_0x000c:
            X.0KC.A0E(r2, r0)
        L_0x000f:
            return r1
        L_0x0010:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_DISABLE_HOT_INSTANCE"
            boolean r0 = r4.getBooleanExtra(r0, r1)
            if (r0 != 0) goto L_0x000f
            boolean r0 = A0L(r4)
            if (r0 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0026
            X.QLA r0 = r3.A02
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x0029
        L_0x0026:
            java.lang.String r0 = "eligibleForWebViewHotInstance find WebView is destroyed"
            goto L_0x000c
        L_0x0029:
            boolean r0 = A0L(r4)
            if (r0 == 0) goto L_0x000f
            java.lang.Integer r3 = A07(r4)
            android.net.Uri r2 = r4.getData()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x000f
            X.A6v r0 = X.C39624A2o.A02
            if (r0 == 0) goto L_0x004c
            android.content.Intent r0 = r0.A01
            if (r0 == 0) goto L_0x004c
            android.net.Uri r0 = r0.getData()
        L_0x0047:
            if (r2 != 0) goto L_0x004e
            if (r0 == 0) goto L_0x0054
            return r1
        L_0x004c:
            r0 = 0
            goto L_0x0047
        L_0x004e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000f
        L_0x0054:
            X.A6v r0 = X.C39624A2o.A02
            if (r0 == 0) goto L_0x000f
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0M(android.content.Intent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.QcV, android.webkit.WebView] */
    private boolean A0N(Bundle bundle) {
        String str;
        Object[] objArr;
        String str2;
        boolean z = false;
        if (!bundle.containsKey("web_view_number")) {
            str = this.A0j;
            objArr = new Object[0];
            str2 = "The fragment is reconstructed but without webview state number info!";
        } else {
            int i = bundle.getInt("web_view_number");
            if (i == 0) {
                str = this.A0j;
                objArr = new Object[0];
                str2 = "0 webview saved!";
            } else {
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= i) {
                        break;
                    }
                    String A0O2 = 002.A0O("web_view_", i2);
                    if (!bundle.containsKey(A0O2)) {
                        SQO.A02(this.A0j, "Info for webview %d (total %d) not found!", Integer.valueOf(i2), Integer.valueOf(i));
                    } else {
                        Bundle bundle2 = bundle.getBundle(A0O2);
                        QLA A062 = A06();
                        ((SystemWebView) A062).A04.restoreState(bundle2);
                        this.A1M.push(A062);
                    }
                    i2++;
                }
                A0K((QLA) this.A1M.peek());
                List list = this.A0o;
                if (list != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BLF.plugins.");
                    sb.append("restoreWebViewStack");
                    SSR A002 = SSR.A00();
                    sb.append(".Start");
                    A002.A04(002.A0g("BLF.plugins.", "restoreWebViewStack", ".Start"));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    SSR A003 = SSR.A00();
                    sb.append(".End");
                    A003.A04(sb.toString());
                    return true;
                }
                return z;
            }
        }
        SQO.A02(str, str2, objArr);
        return z;
    }

    public final int A0P() {
        Iterator it = this.A1M.iterator();
        int i = 0;
        while (it.hasNext()) {
            T9q A012 = ((RRE) it.next()).A01();
            int i2 = A012.A00 + 1;
            List list = A012.A01;
            if (i2 > list.size()) {
                i2 = list.size();
            }
            if (i2 == 0) {
                i2 = 0;
            } else {
                TA1 A002 = A012.A00(0);
                if (i2 == 1) {
                    i2 = !ReactWebViewManager.BLANK_URL.equals(A002.A03);
                } else {
                    String str = A002.A03;
                    String str2 = A012.A00(1).A03;
                    if (ReactWebViewManager.BLANK_URL.equals(str) || str.equals(str2)) {
                        i2--;
                    }
                }
            }
            i += i2;
        }
        return i;
    }

    public final BrowserLiteErrorScreen A0Q(C10190Ro6 ro6) {
        BrowserLiteErrorScreen browserLiteErrorScreen = this.A0a;
        if (browserLiteErrorScreen == null) {
            View view = this.mView;
            browserLiteErrorScreen = null;
            if (view != null) {
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.browser_lite_error_screen_stub);
                if (viewStub != null) {
                    viewStub.setLayoutResource(R.layout.browser_lite_error_screen);
                    browserLiteErrorScreen = (BrowserLiteErrorScreen) viewStub.inflate();
                } else if (ro6 != null) {
                    ro6.A00.cancel();
                }
            }
        }
        this.A0a = browserLiteErrorScreen;
        return browserLiteErrorScreen;
    }

    public final String A0S() {
        if (182.A06(0Tu.A05, this.A0P.A00, 36313579124230296L)) {
            return this.A0V.getSessionId();
        }
        return A08(true);
    }

    public final String A0T() {
        String str;
        Intent intent = this.A06;
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_TRACKING_CODES");
        Pattern pattern = SCX.A01;
        String str2 = null;
        if (stringExtra == null) {
            str = null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length() && str2 == null; i++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                    if (jSONObject.has("adid")) {
                        str2 = jSONObject.getString("adid");
                    }
                }
            } catch (JSONException unused) {
            }
            str = str2;
        }
        if (str2 != null) {
            return str;
        }
        IABAdsContext iABAdsContext = (IABAdsContext) this.A06.getParcelableExtra("EXTRA_ADS_CONTEXT");
        if (iABAdsContext != null) {
            return iABAdsContext.A09;
        }
        return null;
    }

    public final String A0U() {
        if (182.A06(0Tu.A05, this.A0P.A00, 36313579124689055L)) {
            return (String) this.A0V.CCh().A02();
        }
        return this.A18;
    }

    public HashMap A0V(QLA qla) {
        AnonymousClass9Y2 r0;
        HashMap hashMap;
        SslError sslError;
        HashMap hashMap2 = new HashMap();
        if (this.A1J) {
            HashMap hashMap3 = new HashMap();
            long j = qla.A00;
            if (j != -1) {
                hashMap3.put("fbevents_ms", Long.toString(j));
                hashMap3.put("fbevents_prefetched", Boolean.toString(qla.A0Z));
            }
            long j2 = qla.A09;
            if (j2 != -1) {
                hashMap3.put("tr_ms", Long.toString(j2));
                hashMap3.put("tr_prefetched", Boolean.toString(qla.A0a));
            }
            long j3 = qla.A02;
            if (j3 != -1) {
                hashMap3.put("ga_collect_ms", Long.toString(j3));
                hashMap3.put("ga_collect_prefetched", Boolean.toString(qla.A0Q));
            }
            long j4 = qla.A03;
            if (j4 != -1) {
                hashMap3.put("ga_js_ms", Long.toString(j4));
                hashMap3.put("ga_js_prefetched", Boolean.toString(qla.A0R));
            }
            hashMap2.putAll(hashMap3);
        }
        hashMap2.put("user_agent", A0U());
        QL8 A052 = A05(qla);
        if (!(A052 == null || (sslError = A052.A04) == null)) {
            hashMap2.put("ssl_error_url", sslError.getUrl());
            hashMap2.put("ssl_primary_error", 002.A0O("", sslError.getPrimaryError()));
        }
        C39774A8t a8t = this.A0N;
        if (!(a8t == null || (r0 = a8t.A00) == null || (hashMap = ((DefaultBrowserLiteChrome) r0).A0J) == null)) {
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put(entry.getKey(), Integer.toString(((Number) entry.getValue()).intValue()));
            }
        }
        hashMap2.put("nav_bar_back_btn_press", Integer.toString(this.A12));
        if (this.A1E) {
            hashMap2.put("close_browser_action", Integer.toString(this.A02));
        }
        hashMap2.put("webview_provider_name", "com.facebook.browser.lite.webview.SystemWebView");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            hashMap2.put("activity_name", activity.getClass().getSimpleName());
        }
        if (hashMap2.isEmpty()) {
            return null;
        }
        return hashMap2;
    }

    public final void A0W(int i) {
        if (this.A0c != null) {
            Iterator it = AH7.A01().A02(C7580QKv.class).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (A07(getIntent()) == AnonymousClass05K.A0Y) {
            Iterator it2 = AH7.A01().A02(C7580QKv.class).iterator();
            while (it2.hasNext()) {
                C7580QKv qKv = (C7580QKv) it2.next();
                HashMap hashMap = this.A1P;
                Bundle bundle = new Bundle();
                bundle.putSerializable("mOptOutDomains", (ConcurrentHashMap) qKv.A0i);
                bundle.putSerializable("mDomainAcceptedAutofill", (HashMap) qKv.A0f);
                hashMap.put("autofill_controller", bundle);
            }
        }
        AH7 A012 = AH7.A01();
        List<B3K> list = A012.A07;
        for (B3K destroy : list) {
            destroy.destroy();
        }
        list.clear();
        WeakReference weakReference = A012.A04;
        if (weakReference != null) {
            weakReference.clear();
            A012.A04 = null;
        }
        WeakReference weakReference2 = A012.A05;
        if (weakReference2 != null) {
            weakReference2.clear();
            A012.A05 = null;
        }
        WeakReference weakReference3 = A012.A06;
        if (weakReference3 != null) {
            weakReference3.clear();
            A012.A06 = null;
        }
        A012.A03 = null;
        A012.A01 = null;
        A012.A02 = null;
        AH7.A08 = null;
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy = this.A0G;
        if (browserLiteJSBridgeProxy != null) {
            browserLiteJSBridgeProxy.A09((QLA) null);
        }
        this.A02 = i;
        this.A1E = true;
        if (182.A06(0Tu.A05, this.A0P.A00, 36313579124623518L)) {
            A9z a9z = this.A0d;
            if (a9z.A0p) {
                a9z.A0I = a9z.A0m.now();
            }
            this.A0Y.A02 = SystemClock.elapsedRealtime();
            A09();
        }
    }

    public void A0Y(View view, C391769tc r5, boolean z, boolean z2) {
        String str;
        AQD aqd;
        if (this.A0U != null && this.A0M != null && this.A06 != null) {
            SRY.A00();
            if (z2) {
                if (this.A0F != null) {
                    Intent intent = getIntent();
                    if (intent != null) {
                        intent.getIntExtra("BrowserLiteIntent.EXTRA_BONDI_FOOTER_COLLAPSE_SPEED", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
                    }
                    getIntent();
                    aqd = null;
                } else {
                    str = "BwPStaticActionHelper is null but session is BwP";
                    0KC.A0E("BrowserLiteFragment", str);
                    return;
                }
            } else if (!z) {
                return;
            } else {
                if (r5 != null) {
                    Intent intent2 = getIntent();
                    if (intent2 != null) {
                        intent2.getIntExtra("BrowserLiteIntent.EXTRA_BONDI_FOOTER_COLLAPSE_SPEED", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
                    }
                    getIntent();
                    aqd = new AQD();
                } else {
                    str = "BondiStaticActionHelper is null but bondi is enabled";
                    0KC.A0E("BrowserLiteFragment", str);
                    return;
                }
            }
            this.A0R = aqd;
        }
    }

    public final void A0b(C391409su r12, Integer num, String str) {
        C41803B1i b1i = this.A0M;
        if (b1i != null) {
            long currentTimeMillis = System.currentTimeMillis();
            IABEmptyEvent iABEmptyEvent = IABEvent.A04;
            b1i.Cgg(new IABUnifiedEvent(r12, num, A0S(), str, currentTimeMillis, currentTimeMillis));
        }
    }

    public final void A0c(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = this.A17;
        if (str2 != null) {
            str = str2;
        }
        this.A0k = str;
        C39774A8t a8t = this.A0N;
        if (a8t != null) {
            a8t.A00(str);
        }
        List<B3J> list = this.A0n;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onSetChromeTitle");
            SSR A002 = SSR.A00();
            sb.append(".Start");
            A002.A04(002.A0g("BLF.plugins.", "onSetChromeTitle", ".Start"));
            for (B3J DjT : list) {
                DjT.DjT(str);
            }
            SSR A003 = SSR.A00();
            sb.append(".End");
            A003.A04(sb.toString());
        }
    }

    public boolean A0d() {
        long j;
        Intent intent = this.A06;
        if (intent == null) {
            return false;
        }
        try {
            String A002 = AnonymousClass000.A00(878);
            C39703A5t a5t = this.A0Y;
            long j2 = a5t.A01;
            if (j2 != -1) {
                j = (SystemClock.elapsedRealtime() - j2) - a5t.A00;
            } else {
                j = 0;
            }
            intent.putExtra(A002, j);
            for (B3J b3j : this.A0n) {
                if (b3j.DIZ(this.A06, Pxd.A00(345))) {
                    return true;
                }
                if (b3j.DIZ(this.A06, "ACTION_META_REWARD_PROMPT_PRE_EXIT_DIALOG_ON_EXIT_BROWSER")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void AI4(int i, String str) {
        long j;
        long j2;
        String str2;
        long j3;
        String stringExtra;
        this.A02 = i;
        if (this.A1A || !A0d()) {
            C41803B1i b1i = this.A0M;
            if (b1i != null && i == 2 && this.A0v) {
                b1i.Cgm(C391409su.A1e, AnonymousClass05K.A00);
            }
            SPF spf = this.A0J;
            if (spf != null && spf.A03()) {
                if (A0T() != null) {
                    j3 = Long.parseLong(A0T());
                } else {
                    j3 = 0;
                }
                String A0S2 = A0S();
                String str3 = null;
                if (i == 1) {
                    str3 = "IAB_CLOSE_BUTTON_CLICK";
                } else if (i == 2) {
                    str3 = "IAB_CLOSE_SWIPE_EXIT";
                }
                Intent intent = this.A06;
                if (intent == null) {
                    stringExtra = null;
                } else {
                    stringExtra = intent.getStringExtra("BWP_MEDIA_ID");
                }
                if (str3 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pageCloseReason", str3);
                    hashMap.put("is_organic", String.valueOf(this.A0J.A02));
                    hashMap.put("media_id", stringExtra);
                    SRY.A00().A04(j3, "PAGE_CLOSED", A0S2, hashMap);
                }
            }
            SHI shi = this.A0I;
            if (shi != null && shi.A01()) {
                if (A0T() != null) {
                    j2 = Long.parseLong(A0T());
                } else {
                    j2 = 0;
                }
                String A0S3 = A0S();
                if (i == 1) {
                    str2 = "IAB_CLOSE_BUTTON_CLICK";
                } else if (i == 2) {
                    str2 = "IAB_CLOSE_SWIPE_EXIT";
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("pageCloseReason", str2);
                SRY.A00().A03(j2, "PAGE_CLOSED", A0S3, hashMap2);
            }
            BrowserLiteErrorScreen browserLiteErrorScreen = this.A0a;
            if (browserLiteErrorScreen != null) {
                browserLiteErrorScreen.A00();
            }
            BrowserLiteErrorScreen browserLiteErrorScreen2 = this.A0b;
            if (browserLiteErrorScreen2 != null) {
                browserLiteErrorScreen2.A00();
            }
            List<B3J> list = this.A0n;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("BLF.plugins.");
                sb.append("onBrowserClose");
                SSR A002 = SSR.A00();
                sb.append(".Start");
                A002.A04(002.A0g("BLF.plugins.", "onBrowserClose", ".Start"));
                for (B3J Cz8 : list) {
                    Cz8.Cz8();
                }
                SSR A003 = SSR.A00();
                sb.append(".End");
                A003.A04(sb.toString());
            }
            if (this.A0K != null) {
                Bundle bundle = new Bundle();
                C39703A5t a5t = this.A0Y;
                long j4 = a5t.A01;
                if (j4 != -1) {
                    j = (SystemClock.elapsedRealtime() - j4) - a5t.A00;
                } else {
                    j = 0;
                }
                bundle.putLong(AnonymousClass000.A00(878), j);
                this.A0K.Cz9(this.A02, str, bundle);
            }
            AnonymousClass0Mw.A00.A02(AnonymousClass0LO.A5y, 0M7.A02, "");
            return;
        }
        this.A1A = true;
    }

    public void AIE(int i, String str) {
        Intent intent = this.A06;
        if (intent != null && intent.getBooleanExtra(Pxd.A00(434), false)) {
            this.A02 = 11;
        }
    }

    public final /* synthetic */ String B4g(String str) {
        if (!(this instanceof C340017kY)) {
            return str;
        }
        C340017kY r2 = (C340017kY) this;
        2IL A012 = 2IL.A01((UserSession) r2.A08.getValue());
        0qQ.A07(A012);
        String A022 = A012.A02(new AWE(r2), str);
        0qQ.A07(A022);
        return A022;
    }

    public final QLA C8U() {
        Stack stack = this.A1M;
        if (stack.isEmpty()) {
            return null;
        }
        return (QLA) stack.peek();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r3.A0G() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CVN() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.A06
            java.lang.String r4 = r0.getDataString()
            X.QLA r3 = r5.C8U()
            r2 = 0
            if (r3 == 0) goto L_0x002b
            java.util.Stack r0 = r5.A1M
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x001d
            boolean r0 = r3.A0G()
            r1 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            java.lang.String r0 = r3.A05()
            if (r1 != 0) goto L_0x002a
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.CVN():boolean");
    }

    public final void CjX(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        if (this instanceof C340017kY) {
            0qQ.A0B(zonePolicy, 2);
        }
        A0X(bundle, iABEvent, zonePolicy, false);
    }

    public final void FMM(REW rew, Integer num) {
        String str;
        String str2;
        RIX rix;
        RIX rix2;
        C391449t6 r9;
        A6U a6u = this.A0Z;
        if (a6u != null) {
            Integer num2 = num;
            0qQ.A0B(num2, 1);
            AnonymousClass2Fj r3 = a6u.A00;
            REW rew2 = rew;
            if (r3.A02() != rew2 && !AnonymousClass05K.A04.equals(num2) && !AnonymousClass05K.A00.equals(num2)) {
                A9z a9z = a6u.A02;
                String name = rew2.name();
                a9z.A03(name);
                SRY A002 = SRY.A00();
                REW rew3 = (REW) r3.A02();
                if (rew3 != null) {
                    str = rew3.name();
                } else {
                    str = null;
                }
                switch (num2.intValue()) {
                    case 0:
                        str2 = "AUTO";
                        break;
                    case 1:
                        str2 = "AUTO_FULLY_LOADED";
                        break;
                    case 2:
                        str2 = "AUTO_INTERACTIVE";
                        break;
                    case 3:
                        str2 = "MINIMIZE_PEEK_TAP";
                        break;
                    case 4:
                        str2 = "CTA_TAP";
                        break;
                    case 5:
                        str2 = "HEADER_SWIPE";
                        break;
                    case 6:
                        str2 = "HEADER_TAP";
                        break;
                    case 7:
                        str2 = "WEBVIEW_SWIPE";
                        break;
                    case 8:
                        str2 = "WEBVIEW_TAP";
                        break;
                    case 9:
                        str2 = "SURFACE_SWIPE";
                        break;
                    case 10:
                        str2 = "SURFACE_TAP";
                        break;
                    case 11:
                        str2 = "SYSTEM_BACK_PRESS";
                        break;
                    default:
                        str2 = "UNKNOWN";
                        break;
                }
                try {
                    rix = RIX.valueOf(str);
                } catch (IllegalArgumentException e) {
                    0KC.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e);
                    rix = RIX.FULL_SCREEN;
                }
                try {
                    rix2 = RIX.valueOf(name);
                } catch (IllegalArgumentException e2) {
                    0KC.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e2);
                    rix2 = RIX.FULL_SCREEN;
                }
                try {
                    r9 = C391449t6.valueOf(str2);
                } catch (IllegalArgumentException e3) {
                    0KC.A0J("IABEventLogger", "Server and client implementations of IABChangeViewModeReason are out of sync", e3);
                    r9 = C391449t6.AUTO;
                }
                long now = a9z.A0m.now();
                A002.A06(a6u.A01, new IABChangeViewModeEvent(r9, rix, rix2, a9z.A0Z, a9z.A0W, now, now), a6u.A03);
                r3.A0A(rew2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((requireActivity() instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if ((requireActivity() instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent getIntent() {
        /*
            r2 = this;
            android.content.Intent r0 = r2.A06
            if (r0 != 0) goto L_0x0033
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x0034
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0034
            r0 = 367(0x16f, float:5.14E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0049
            r2.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            boolean r0 = r0 instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity
            if (r0 == 0) goto L_0x004c
        L_0x002b:
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            android.content.Intent r0 = r0.getIntent()
        L_0x0033:
            return r0
        L_0x0034:
            boolean r0 = r2 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0044
            r2.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            boolean r0 = r0 instanceof com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity
            if (r0 == 0) goto L_0x0047
            goto L_0x002b
        L_0x0044:
            r2.requireActivity()
        L_0x0047:
            r0 = 1
            goto L_0x004d
        L_0x0049:
            r2.requireActivity()
        L_0x004c:
            r0 = 2
        L_0x004d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0h = r0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.getIntent():android.content.Intent");
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        if (r8 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0110, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r7 = r17
            X.QLA r0 = r7.C8U()
            r4 = r20
            r5 = r19
            r6 = r18
            if (r0 == 0) goto L_0x001d
            com.facebook.browser.lite.BrowserLiteWebChromeClient r3 = r0.A03()
            if (r3 == 0) goto L_0x001d
            r12 = 4
            r11 = 2
            r10 = 1
            if (r6 == r10) goto L_0x0054
            if (r6 == r11) goto L_0x0054
            if (r6 == r12) goto L_0x0054
        L_0x001d:
            java.util.List r8 = r7.A0n
            java.lang.String r7 = "onActivityResult"
            if (r8 == 0) goto L_0x016e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "BLF.plugins."
            r3.append(r2)
            r3.append(r7)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".Start"
            r3.append(r0)
            java.lang.String r0 = X.002.A0g(r2, r7, r0)
            r1.A04(r0)
            java.util.Iterator r1 = r8.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = r1.next()
            X.B3J r0 = (X.B3J) r0
            r0.onActivityResult(r6, r5, r4)
            goto L_0x0044
        L_0x0054:
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = -1
            r2 = 0
            if (r6 != r10) goto L_0x00d6
            if (r5 != r0) goto L_0x0068
            if (r20 == 0) goto L_0x0068
            android.net.Uri r0 = r4.getData()
        L_0x0064:
            java.util.List r1 = java.util.Collections.singletonList(r0)
        L_0x0068:
            r3.A04 = r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r16 = r1.iterator()
        L_0x0073:
            boolean r0 = r16.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x0117
            java.lang.Object r14 = r16.next()
            android.net.Uri r14 = (android.net.Uri) r14
            if (r14 == 0) goto L_0x0073
            com.facebook.browser.lite.BrowserLiteFragment r13 = r3.A0A     // Catch:{ IOException | SecurityException -> 0x0114 }
            androidx.fragment.app.FragmentActivity r15 = r13.requireActivity()     // Catch:{ IOException | SecurityException -> 0x0114 }
            boolean r0 = com.facebook.secure.fileprovider.SecureFileProvider.A01(r15, r14)     // Catch:{ IOException | SecurityException -> 0x0114 }
            if (r0 == 0) goto L_0x0090
            r1 = r14
            goto L_0x00ab
        L_0x0090:
            X.OOC r0 = new X.OOC     // Catch:{ IOException | SecurityException -> 0x0114 }
            r0.<init>()     // Catch:{ IOException | SecurityException -> 0x0114 }
            r0.A02(r15, r14, r2, r2)     // Catch:{ IOException | SecurityException -> 0x0114 }
            X.Ni4 r1 = r0.A00()     // Catch:{ IOException | SecurityException -> 0x0114 }
            java.util.HashMap r0 = X.MY3.A06     // Catch:{ IOException | SecurityException -> 0x0114 }
            X.0TC r0 = new X.0TC     // Catch:{ IOException | SecurityException -> 0x0114 }
            r0.<init>()     // Catch:{ IOException | SecurityException -> 0x0114 }
            X.MY3 r0 = X.MY3.A01(r15, r2, r0)     // Catch:{ IOException | SecurityException -> 0x0114 }
            android.net.Uri r1 = r0.A04(r1)     // Catch:{ IOException | SecurityException -> 0x0114 }
        L_0x00ab:
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()     // Catch:{ IOException | SecurityException -> 0x0114 }
            boolean r0 = com.facebook.secure.fileprovider.SecureFileProvider.A01(r0, r1)     // Catch:{ IOException | SecurityException -> 0x0114 }
            if (r0 == 0) goto L_0x00b9
            r9.add(r1)     // Catch:{ IOException | SecurityException -> 0x0114 }
            goto L_0x0073
        L_0x00b9:
            r0 = 435(0x1b3, float:6.1E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException | SecurityException -> 0x0114 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException | SecurityException -> 0x0114 }
            r13.<init>()     // Catch:{ IOException | SecurityException -> 0x0114 }
            java.lang.String r1 = "File is converted but still not secured from uri = "
            r13.append(r1)     // Catch:{ IOException | SecurityException -> 0x0114 }
            r13.append(r14)     // Catch:{ IOException | SecurityException -> 0x0114 }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException | SecurityException -> 0x0114 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IOException | SecurityException -> 0x0114 }
            X.SQO.A01(r0, r13, r1)     // Catch:{ IOException | SecurityException -> 0x0114 }
            goto L_0x0073
        L_0x00d6:
            if (r6 != r11) goto L_0x010a
            if (r20 == 0) goto L_0x00fe
            android.content.ClipData r0 = r4.getClipData()
            if (r0 == 0) goto L_0x00fe
            android.content.ClipData r0 = r4.getClipData()
            int r9 = r0.getItemCount()
            android.net.Uri[] r8 = new android.net.Uri[r9]
            r1 = 0
        L_0x00eb:
            if (r1 >= r9) goto L_0x0104
            android.content.ClipData r0 = r4.getClipData()
            android.content.ClipData$Item r0 = r0.getItemAt(r1)
            android.net.Uri r0 = r0.getUri()
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x00eb
        L_0x00fe:
            android.net.Uri[] r8 = android.webkit.WebChromeClient.FileChooserParams.parseResult(r5, r4)
            if (r8 == 0) goto L_0x0068
        L_0x0104:
            java.util.List r1 = java.util.Arrays.asList(r8)
            goto L_0x0068
        L_0x010a:
            if (r6 != r12) goto L_0x0068
            if (r5 != r0) goto L_0x0068
            android.net.Uri r0 = r3.A04
            if (r0 == 0) goto L_0x0068
            goto L_0x0064
        L_0x0114:
            r9.clear()
        L_0x0117:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0128
            android.webkit.ValueCallback r0 = r3.A05
            if (r0 == 0) goto L_0x001d
            r0.onReceiveValue(r2)
            r3.A05 = r2
            goto L_0x001d
        L_0x0128:
            java.util.List r0 = r3.A0F
            java.util.Iterator r1 = r0.iterator()
        L_0x012e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0138
            r1.next()
            goto L_0x012e
        L_0x0138:
            if (r6 != r10) goto L_0x0149
            android.webkit.ValueCallback r1 = r3.A06
            if (r1 == 0) goto L_0x001d
            java.lang.Object r0 = r9.get(r8)
            r1.onReceiveValue(r0)
            r3.A06 = r2
            goto L_0x001d
        L_0x0149:
            if (r6 == r11) goto L_0x014d
            if (r6 != r12) goto L_0x001d
        L_0x014d:
            android.webkit.ValueCallback r1 = r3.A05
            if (r1 == 0) goto L_0x001d
            android.net.Uri[] r0 = new android.net.Uri[r8]
            java.lang.Object[] r0 = r9.toArray(r0)
            r1.onReceiveValue(r0)
            r3.A05 = r2
            goto L_0x001d
        L_0x015e:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".End"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.A04(r0)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.AQC} */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.B1i] */
    /* JADX WARNING: type inference failed for: r0v56, types: [X.7kY, X.07g, com.facebook.browser.lite.BrowserLiteFragment] */
    /* JADX WARNING: type inference failed for: r0v67, types: [java.lang.Object, X.Rnv] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013a, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A0P.A00, 36313579124885665L) == false) goto L_0x013c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.content.Context r23) {
        /*
            r22 = this;
            r4 = r22
            r9 = r23
            com.facebook.browser.lite.BrowserLiteFragment.super.onAttach(r9)
            r4.A05 = r9
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onSelfAttached"
            r1.A04(r0)
            android.content.Intent r1 = r4.getIntent()
            java.lang.Class<com.facebook.browser.lite.BrowserLiteFragment> r0 = com.facebook.browser.lite.BrowserLiteFragment.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setExtrasClassLoader(r0)
            android.content.Intent r1 = r4.getIntent()
            r0 = 399(0x18f, float:5.59E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r5 = 0
            boolean r0 = r1.getBooleanExtra(r0, r5)
            X.SQO.A00 = r0
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L_0x0072
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L_0x003f:
            r3 = 1
            X.0qQ.A0B(r1, r3)
            X.A4g r0 = new X.A4g
            r0.<init>(r1)
            r4.A0P = r0
            com.instagram.common.session.UserSession r1 = r0.A00
            X.A34 r0 = new X.A34
            r0.<init>(r1)
            r4.A0Q = r0
            X.SRY r1 = X.SRY.A00()
            r4.A0L = r1
            X.Rvf r0 = X.C10646Rvf.A03
            if (r0 != 0) goto L_0x0064
            X.Rvf r0 = new X.Rvf
            r0.<init>()
            X.C10646Rvf.A03 = r0
        L_0x0064:
            r1.A05 = r0
            android.content.Context r0 = r4.A05
            boolean r0 = X.SQY.A02(r0)
            if (r0 == 0) goto L_0x0087
            X.SRY r1 = r4.A0L
            monitor-enter(r1)
            goto L_0x007b
        L_0x0072:
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            goto L_0x003f
        L_0x007b:
            X.Rnv r0 = new X.Rnv     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r1.A04 = r0     // Catch:{ all -> 0x0083 }
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0086:
            monitor-exit(r1)
        L_0x0087:
            X.SRY r1 = r4.A0L
            android.content.Context r0 = r4.A05
            android.content.Context r0 = r0.getApplicationContext()
            r1.A05(r0, r3)
            android.content.Intent r1 = r4.getIntent()
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r8 = X.Pxd.A00(r0)
            android.os.Bundle r0 = r1.getBundleExtra(r8)
            r4.A08 = r0
            android.content.Intent r1 = r4.getIntent()
            r0 = 132(0x84, float:1.85E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2 = 1
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x00ec
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r4.A0e
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A05
            if (r1 != r0) goto L_0x00ec
        L_0x00b9:
            r4.A0t = r2
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "iab_click_source"
            java.lang.String r6 = r1.getStringExtra(r0)
            android.content.Intent r1 = r4.getIntent()
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r11 = r1.getStringExtra(r0)
            if (r11 == 0) goto L_0x00f2
            com.facebook.privacy.zone.policy.ZonePolicy[] r10 = com.facebook.privacy.zone.policy.ZonePolicy.values()
            int r7 = r10.length
            r2 = 0
        L_0x00db:
            if (r2 >= r7) goto L_0x00ee
            r1 = r10[r2]
            java.lang.String r0 = r1.name()
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x00f0
            int r2 = r2 + 1
            goto L_0x00db
        L_0x00ec:
            r2 = 0
            goto L_0x00b9
        L_0x00ee:
            com.facebook.privacy.zone.policy.ZonePolicy r1 = com.facebook.privacy.zone.policy.ZonePolicy.A05
        L_0x00f0:
            r4.A0e = r1
        L_0x00f2:
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r4.A0e
            r0.A00()
            boolean r2 = r4.A0t
            boolean r0 = r9 instanceof X.C41785B0o
            if (r0 == 0) goto L_0x0101
            X.B0o r9 = (X.C41785B0o) r9
            r4.A0K = r9
        L_0x0101:
            X.0Gt r1 = X.AnonymousClass0Gt.A00
            com.facebook.privacy.zone.policy.ZonePolicy r0 = r4.A0e
            X.A9z r11 = new X.A9z
            r11.<init>(r1, r0, r2)
            r4.A0d = r11
            boolean r10 = r11.A0p
            if (r10 == 0) goto L_0x0112
            r11.A0W = r6
        L_0x0112:
            android.content.Intent r6 = r4.getIntent()
            r1 = -1
            r0 = 420(0x1a4, float:5.89E-43)
            java.lang.String r9 = X.Pxd.A00(r0)
            long r6 = r6.getLongExtra(r9, r1)
            if (r10 == 0) goto L_0x0126
            r11.A0L = r6
        L_0x0126:
            boolean r0 = r4.A0t
            if (r0 == 0) goto L_0x013c
            X.A4g r0 = r4.A0P
            com.instagram.common.session.UserSession r10 = r0.A00
            X.0Tu r0 = X.0Tu.A05
            r6 = 36313579124885665(0x810302004308a1, double:3.0281918893995967E-306)
            boolean r6 = X.182.A06(r0, r10, r6)
            r0 = 1
            if (r6 != 0) goto L_0x013d
        L_0x013c:
            r0 = 0
        L_0x013d:
            r11.A0i = r0
            java.lang.String r14 = r4.A08(r3)
            android.os.Bundle r6 = r4.A08
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            if (r6 == 0) goto L_0x0241
            r7.<init>(r6)
        L_0x0151:
            X.0qQ.A0B(r14, r5)
            r0 = 578(0x242, float:8.1E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r7.putString(r0, r14)
            boolean r6 = r4.A0t
            r0 = 17
            java.lang.String r0 = X.Pxd.A00(r0)
            r7.putBoolean(r0, r6)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r7)
            r4.A08 = r0
            android.content.Intent r6 = r4.getIntent()
            android.os.Bundle r0 = r4.A08
            r6.putExtra(r8, r0)
            long r6 = java.lang.System.currentTimeMillis()
            r0 = r4
            boolean r8 = r4 instanceof X.C340017kY
            if (r8 == 0) goto L_0x0246
            X.7kY r0 = (X.C340017kY) r0
            X.A6w r8 = r0.A01
            if (r8 != 0) goto L_0x01b3
            android.content.Intent r8 = r0.getIntent()
            if (r8 == 0) goto L_0x01b3
            android.net.Uri r16 = r8.getData()
            if (r16 == 0) goto L_0x01b3
            android.content.Intent r8 = r0.getIntent()
            r19 = -1
            if (r8 == 0) goto L_0x019f
            long r19 = r8.getLongExtra(r9, r1)
        L_0x019f:
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$FullScreen r18 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.FullScreen.A00
            X.0sn r2 = X.0sn.A00
            com.facebook.iabadscontext.IABDummyContext r1 = new com.facebook.iabadscontext.IABDummyContext
            r1.<init>(r2)
            X.A6w r15 = new X.A6w
            r17 = r1
            r21 = r5
            r15.<init>(r16, r17, r18, r19, r21)
            r0.A01 = r15
        L_0x01b3:
            X.A6w r8 = r0.A01
            if (r8 == 0) goto L_0x0233
            android.net.Uri r11 = r8.A01
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig r13 = r8.A03
            com.facebook.browser.iabcontext.IabCommonTrait r12 = r8.A02
            long r1 = r8.A00
            boolean r8 = r8.A04
            X.APw r10 = new X.APw
            r19 = r8
            r15 = r6
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r17, r19)
            X.2YN r2 = new X.2YN
            r2.<init>(r10, r0)
            java.lang.Class<X.9YF> r1 = X.AnonymousClass9YF.class
            X.2YL r1 = r2.A00(r1)
            X.9YF r1 = (X.AnonymousClass9YF) r1
            r0.A02 = r1
            X.A9z r7 = r0.A0d
            if (r7 == 0) goto L_0x0231
            com.facebook.privacy.zone.policy.ZonePolicy r9 = r0.A0e
            if (r9 == 0) goto L_0x0231
            android.os.Bundle r6 = r0.A08
            X.0qQ.A06(r6)
            X.9YF r1 = r0.A02
            java.lang.String r8 = "viewModel"
            if (r1 == 0) goto L_0x0239
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig r1 = r1.A02
            X.REW r2 = r1.A00
            X.A6U r1 = new X.A6U
            r1.<init>(r6, r2, r7, r9)
            r0.A0Z = r1
            X.9YF r2 = r0.A02
            if (r2 == 0) goto L_0x0239
            java.lang.String r1 = r2.A03
            boolean r6 = r7.A0p
            if (r6 == 0) goto L_0x0204
            r7.A0Z = r1
        L_0x0204:
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig r1 = r2.A02
            if (r6 == 0) goto L_0x020a
            r7.A0P = r1
        L_0x020a:
            X.REW r1 = r1.A00
            java.lang.String r1 = r1.name()
            r7.A03(r1)
            X.9YF r2 = r0.A02
            if (r2 == 0) goto L_0x0239
            com.facebook.browser.iabcontext.IabCommonTrait r1 = r2.A01
            if (r6 == 0) goto L_0x021d
            r7.A0O = r1
        L_0x021d:
            java.util.Map r1 = r2.A04
            if (r6 == 0) goto L_0x0227
            java.lang.String r1 = r1.toString()
            r7.A0X = r1
        L_0x0227:
            X.9YF r1 = r0.A02
            if (r1 == 0) goto L_0x0239
            long r1 = r1.A00
            if (r6 == 0) goto L_0x0231
            r7.A0L = r1
        L_0x0231:
            r0.A00 = r10
        L_0x0233:
            X.9YF r0 = r0.A02
            if (r0 != 0) goto L_0x024b
            java.lang.String r8 = "viewModel"
        L_0x0239:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0241:
            r7.<init>()
            goto L_0x0151
        L_0x0246:
            X.AQF r0 = new X.AQF
            r0.<init>(r14, r6)
        L_0x024b:
            r4.A0V = r0
            X.A9z r1 = r4.A0d
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x0255
            r1.A0Z = r14
        L_0x0255:
            boolean r0 = r4.A0t
            if (r0 == 0) goto L_0x02bb
            X.SRY r0 = r4.A0L
            X.AQC r2 = new X.AQC
            r2.<init>(r0, r14)
        L_0x0260:
            r4.A0M = r2
            X.AH7 r0 = X.AH7.A01()
            r0.A00 = r2
            java.lang.Integer r0 = r4.A0h
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0279
            if (r0 != r3) goto L_0x02b8
            X.9su r1 = X.C391409su.A0n
        L_0x0274:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.Cgm(r1, r0)
        L_0x0279:
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_LITE_FRAGMENT_INVOKE_ORIGIN"
            java.io.Serializable r2 = r1.getSerializableExtra(r0)
            X.9su r2 = (X.C391409su) r2
            X.B1i r1 = r4.A0M
            if (r2 != 0) goto L_0x028b
            X.9su r2 = X.C391409su.A08
        L_0x028b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.Cgm(r2, r0)
            android.content.Intent r0 = r4.getIntent()
            A0B(r0, r4)
            X.A5t r0 = new X.A5t
            r0.<init>()
            r4.A0Y = r0
            X.0Ms r2 = X.AnonymousClass0Mw.A00
            X.0i1 r1 = X.AnonymousClass0LO.A5y
            X.0M7 r0 = X.0M7.A02
            r2.A02(r1, r0, r14)
            android.content.Intent r1 = r4.getIntent()
            r0 = 418(0x1a2, float:5.86E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r4.A0u = r0
            return
        L_0x02b8:
            X.9su r1 = X.C391409su.A0o
            goto L_0x0274
        L_0x02bb:
            X.AQB r2 = new X.AQB
            r2.<init>()
            goto L_0x0260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onAttach(android.content.Context):void");
    }

    public final void onAttachFragment(Fragment fragment) {
        List<B3J> list = this.A0n;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("onAttachFragment");
            SSR A002 = SSR.A00();
            sb.append(".Start");
            A002.A04(002.A0g("BLF.plugins.", "onAttachFragment", ".Start"));
            for (B3J CwH : list) {
                CwH.CwH(fragment);
            }
            SSR A003 = SSR.A00();
            sb.append(".End");
            A003.A04(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveInstanceState(android.os.Bundle r13) {
        /*
            r12 = this;
            X.B1i r2 = r12.A0M
            if (r2 == 0) goto L_0x000f
            boolean r0 = r12.A1E
            if (r0 != 0) goto L_0x000f
            X.9su r1 = X.C391409su.A0U
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.Cgm(r1, r0)
        L_0x000f:
            X.A33 r0 = r12.A15
            if (r0 == 0) goto L_0x00fa
            r3 = 0
        L_0x0014:
            java.util.Stack r2 = r12.A1M
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x003a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Object r0 = r2.get(r3)
            X.RRE r0 = (X.RRE) r0
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.saveState(r1)
            java.lang.String r0 = "web_view_"
            java.lang.String r0 = X.002.A0O(r0, r3)
            r13.putBundle(r0, r1)
            int r3 = r3 + 1
            goto L_0x0014
        L_0x003a:
            int r1 = r2.size()
            java.lang.String r0 = "web_view_number"
            r13.putInt(r0, r1)
            X.A33 r0 = r12.A15
            android.content.Context r9 = r12.getContext()
            java.lang.String r10 = "iab_fragment"
            if (r9 == 0) goto L_0x00fa
            X.A32 r2 = r0.A00
            android.os.Parcel r4 = android.os.Parcel.obtain()
            X.0qQ.A07(r4)
            r8 = 0
            r13.writeToParcel(r4, r8)     // Catch:{ IOException -> 0x00e9 }
            int r1 = r4.dataSize()     // Catch:{ IOException -> 0x00e9 }
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 <= r0) goto L_0x00f7
            byte[] r5 = r4.marshall()     // Catch:{ IOException -> 0x00e9 }
            X.1BJ r7 = r2.A00     // Catch:{ IOException -> 0x00e9 }
            r6 = 216637974(0xce9a216, float:3.5996886E-31)
            r3 = 0
            java.lang.String r0 = "__subdir__"
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ IOException -> 0x00e9 }
            r2.<init>()     // Catch:{ IOException -> 0x00e9 }
            r2.put(r0, r10)     // Catch:{ IOException -> 0x00e9 }
            java.lang.String r0 = "bigbundle_"
            java.lang.String r0 = X.002.A0R(r0, r10)     // Catch:{ IOException -> 0x00e9 }
            java.io.File r1 = r9.getDir(r0, r8)     // Catch:{ IOException -> 0x00e9 }
            X.1LJ r0 = new X.1LJ     // Catch:{ IOException -> 0x00e9 }
            r0.<init>(r3, r1, r2, r3)     // Catch:{ IOException -> 0x00e9 }
            java.io.File r8 = r7.AXT(r0, r6)     // Catch:{ IOException -> 0x00e9 }
            r8.mkdir()     // Catch:{ IOException -> 0x00e9 }
            java.io.File[] r0 = r8.listFiles()     // Catch:{ IOException -> 0x00e9 }
            if (r0 == 0) goto L_0x00bc
            X.0sC r9 = new X.0sC     // Catch:{ IOException -> 0x00e9 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x00e9 }
        L_0x0097:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x00e9 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r3 = r9.next()     // Catch:{ IOException -> 0x00e9 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException -> 0x00e9 }
            long r10 = r3.lastModified()     // Catch:{ IOException -> 0x00e9 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00e9 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ IOException -> 0x00e9 }
            r0 = 12
            long r0 = r2.toMillis(r0)     // Catch:{ IOException -> 0x00e9 }
            long r6 = r6 - r0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            r3.delete()     // Catch:{ IOException -> 0x00e9 }
            goto L_0x0097
        L_0x00bc:
            java.lang.String r1 = "bundle"
            java.lang.String r0 = ""
            java.io.File r3 = java.io.File.createTempFile(r1, r0, r8)     // Catch:{ IOException -> 0x00e9 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e9 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00e9 }
            r2.write(r5)     // Catch:{ all -> 0x00e2 }
            r2.close()     // Catch:{ IOException -> 0x00e9 }
            r13.clear()     // Catch:{ IOException -> 0x00e9 }
            java.lang.String r1 = "_bigbundle_length_"
            int r0 = r5.length     // Catch:{ IOException -> 0x00e9 }
            r13.putInt(r1, r0)     // Catch:{ IOException -> 0x00e9 }
            java.lang.String r1 = "_bigbundle_path_"
            java.lang.String r0 = r3.getPath()     // Catch:{ IOException -> 0x00e9 }
            r13.putString(r1, r0)     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00f7
        L_0x00e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x00e9 }
            throw r0     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            r2 = move-exception
            java.lang.String r1 = "BigBundle"
            java.lang.String r0 = "Could not save to file"
            X.0KC.A0H(r1, r0, r2)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f7
        L_0x00f2:
            r0 = move-exception
            r4.recycle()
            throw r0
        L_0x00f7:
            r4.recycle()
        L_0x00fa:
            X.A33 r0 = r12.A15
            if (r0 != 0) goto L_0x0105
            java.lang.String r1 = r12.A0j
            java.lang.String r0 = "big bundle save/restore enabled but big bundle is null"
            X.0KC.A0E(r1, r0)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.0bY] */
    private int A03(int i) {
        QLA C8U = C8U();
        int i2 = 0;
        if (C8U == null) {
            return 0;
        }
        int i3 = 1;
        if (C8U.A0G()) {
            T9q A012 = C8U.A01();
            int i4 = A012.A00;
            for (int i5 = i4 - 1; i5 > -1; i5--) {
                if (C11429STt.A04(0cp.A01(new Object(), A012.A00(i5).A03)) && (i2 = i2 + 1) == i) {
                    return i5 - i4;
                }
            }
            i3 = A012.A01.size();
        }
        return i - i3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.0bY] */
    public static int A04(BrowserLiteFragment browserLiteFragment) {
        QLA C8U = browserLiteFragment.C8U();
        if (C8U != null) {
            T9q A012 = C8U.A01();
            int i = A012.A00;
            for (int i2 = i + 1; i2 < A012.A01.size(); i2++) {
                if (C11429STt.A04(0cp.A01(new Object(), A012.A00(i2).A03))) {
                    return i2 - i;
                }
            }
        }
        return 0;
    }

    private String A08(boolean z) {
        String str;
        C39730A6v a6v;
        Intent intent;
        Intent intent2 = getIntent();
        String A002 = Pxd.A00(55);
        String stringExtra = intent2.getStringExtra(A002);
        if (!(!A0M(getIntent()) || (a6v = C39624A2o.A02) == null || (intent = a6v.A01) == null)) {
            stringExtra = intent.getStringExtra(A002);
            getIntent().putExtra(A002, stringExtra);
        }
        if (str == null) {
            if (z) {
                str = AnonymousClass0HM.A00().toString();
            } else {
                str = "";
            }
            getIntent().putExtra(A002, str);
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r6 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        if ("dialtone".equals(r1) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
        if (android.webkit.URLUtil.isHttpsUrl(r2.toString()) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(android.os.Bundle r6, boolean r7) {
        /*
            r5 = this;
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TAB_ID"
            boolean r0 = r1.hasExtra(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.Class<X.SEd> r2 = X.C11177SEd.class
            monitor-enter(r2)
            X.SEd r0 = X.C11177SEd.A02     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = "IABTabs.initializeStack.Start"
            X.SSR r0 = X.SSR.A00()     // Catch:{ all -> 0x003d }
            r0.A04(r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "IABTabs.initializeStack.initializeDuringLinkClick"
            X.SSR r0 = X.SSR.A00()     // Catch:{ all -> 0x003d }
            r0.A04(r1)     // Catch:{ all -> 0x003d }
            X.SEd r0 = new X.SEd     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            X.C11177SEd.A02 = r0     // Catch:{ all -> 0x003d }
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x003d }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x003d }
            r1.<init>(r0)     // Catch:{ all -> 0x003d }
            throw r1     // Catch:{ all -> 0x003d }
        L_0x0039:
            monitor-exit(r2)
            if (r6 == 0) goto L_0x004f
            goto L_0x0048
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0040:
            if (r6 == 0) goto L_0x004f
            boolean r0 = r5.A0N(r6)
            if (r0 != 0) goto L_0x00dc
        L_0x0048:
            java.lang.String r1 = "BrowserLiteFragment"
            java.lang.String r0 = "Restoring from saved state failed, fallback to initially provided URL."
            X.0KC.A0E(r1, r0)
        L_0x004f:
            if (r7 == 0) goto L_0x0057
            X.QLA r4 = r5.C8U()
            if (r4 != 0) goto L_0x005b
        L_0x0057:
            X.QLA r4 = r5.A0R()
        L_0x005b:
            android.content.Intent r1 = r5.A06
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0071
            r0 = r4
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.setBackgroundColor(r3)
        L_0x0071:
            android.content.Intent r1 = r5.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_POST_DATA"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.net.Uri r2 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00a5
            X.0bq r0 = X.C11429STt.A00
            if (r2 == 0) goto L_0x010a
            java.lang.String r1 = r2.getHost()
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "our.intern."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x00dd
            r0 = 2060(0x80c, float:2.887E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = X.C11429STt.A04(r2)
            if (r0 == 0) goto L_0x00dd
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            android.content.Intent r1 = r5.A06
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ba
            X.RQ7.A00 = r1
        L_0x00ba:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = X.RQ7.A00
            java.lang.String r0 = "Referer"
            r2.put(r0, r1)
            X.SPF r1 = r5.A0J
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x00d7
            X.S3V r0 = r1.A04
            java.util.Map r0 = r0.A00()
            r2.putAll(r0)
        L_0x00d7:
            android.net.Uri r0 = r5.A07
            r5.CgD(r0, r4, r3, r2)
        L_0x00dc:
            return
        L_0x00dd:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "fb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "fb-messenger"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "fbinternal"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "fb-work"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "dialtone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x010a
            goto L_0x00a5
        L_0x010a:
            java.lang.String r0 = r2.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x00a5
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.A0C(android.os.Bundle, boolean):void");
    }

    public static boolean A0L(Intent intent) {
        if (A07(intent) != AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public static final boolean A0O(QLA qla, String str) {
        if (qla.A0H()) {
            return false;
        }
        String A052 = qla.A05();
        if (A052 == null || ReactWebViewManager.BLANK_URL.equals(A052) || A052.equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.QcV, android.view.View, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v26, types: [X.QcV, android.webkit.WebView] */
    public final QLA A0R() {
        QLA C8U = C8U();
        if (C8U != null) {
            try {
                ((SystemWebView) C8U).A04.onPause();
            } catch (Exception unused) {
            }
            ? r4 = ((SystemWebView) C8U).A04;
            r4.setVisibility(8);
            if (!182.A06(0Tu.A05, this.A0Q.A00, 36313579124164759L)) {
                r4.stopLoading();
            }
        }
        QLA A062 = A06();
        List list = this.A0o;
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BLF.plugins.");
            sb.append("pushNewWebView");
            SSR A002 = SSR.A00();
            sb.append(".Start");
            A002.A04(002.A0g("BLF.plugins.", "pushNewWebView", ".Start"));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            SSR A003 = SSR.A00();
            sb.append(".End");
            A003.A04(sb.toString());
        }
        Stack stack = this.A1M;
        stack.push(A062);
        A9z a9z = this.A0d;
        int size = stack.size();
        if (a9z.A0p) {
            a9z.A05 = Math.max(a9z.A05, size);
        }
        A0K(A062);
        Intent intent = getIntent();
        String A004 = Pxd.A00(419);
        RIg rIg = (RIg) intent.getSerializableExtra(A004);
        if (rIg != null) {
            A0Z(rIg);
            getIntent().removeExtra(A004);
        }
        Intent intent2 = this.A06;
        if (intent2 != null) {
            if (!Pxd.A00(574).equals(intent2.getStringExtra("BrowserLiteIntent.EXTRA_BROWSER_THEME"))) {
                Intent intent3 = new Intent();
                intent3.setAction(C66579MXk.A00(207));
                this.A05.sendBroadcast(intent3);
            }
        }
        return A062;
    }

    public void A0X(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy, boolean z) {
        SRY A002 = SRY.A00();
        SRY.A02(new C7558QJi(bundle, A002, iABEvent, zonePolicy), A002, z);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.webkit.WebView] */
    public final void A0Z(RIg rIg) {
        QLA C8U = C8U();
        if (C8U != null && this.A0u) {
            if (182.A06(0Tu.A05, this.A0P.A00, 36313579124820128L)) {
                A9z a9z = this.A0d;
                long now = a9z.A0m.now();
                RIg rIg2 = rIg;
                CjX(this.A08, new IABNonViewableEvent(rIg2, a9z.A0Q, a9z.A0Z, now, now, a9z.A0L), this.A0e);
                WebSettings settings = ((SystemWebView) C8U).A04.getSettings();
                String A0U2 = A0U();
                StringBuilder sb = new StringBuilder();
                sb.append(" NV/");
                sb.append(Long.valueOf(rIg.A00));
                settings.setUserAgentString(002.A0R(A0U2, sb.toString()));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.QcV, android.webkit.WebView] */
    public final void A0a(RIg rIg) {
        QLA C8U = C8U();
        if (C8U != null && this.A0u) {
            if (182.A06(0Tu.A05, this.A0P.A00, 36313579124820128L)) {
                A9z a9z = this.A0d;
                long now = a9z.A0m.now();
                RIg rIg2 = rIg;
                CjX(this.A08, new IABViewableEvent(rIg2, a9z.A0Q, a9z.A0Z, (String) null, now, now, a9z.A0L), this.A0e);
                ((SystemWebView) C8U).A04.getSettings().setUserAgentString(A0U());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.webkit.WebView] */
    public final boolean A0e(int i) {
        QLA C8U = C8U();
        if (C8U == null) {
            return false;
        }
        BrowserLiteWebChromeClient A032 = C8U.A03();
        if (A032 == null || A032.A08.getVisibility() != 0) {
            int A033 = A03(i);
            if (A033 < 0) {
                ((SystemWebView) C8U).A04.goBackOrForward(A033);
            } else if (this.A1M.size() <= 1) {
                return false;
            } else {
                A0D(this);
                if (A033 == 0 || A0e(A033)) {
                    return true;
                }
                return false;
            }
        } else {
            try {
                BrowserLiteWebChromeClient.A01(A032);
                return true;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v39, types: [X.QcV, android.webkit.WebView] */
    public final void CgD(Uri uri, QLA qla, String str, Map map) {
        IABEvent iABEvent;
        if (!A0L(getIntent()) || (!(A07(getIntent()) == AnonymousClass05K.A0N || A07(getIntent()) == AnonymousClass05K.A0Y) || !qla.A0W)) {
            if (this.A13 < 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.A13 = currentTimeMillis;
                A9z a9z = this.A0d;
                if (a9z.A0p) {
                    a9z.A0M = currentTimeMillis;
                    IABEmptyEvent iABEmptyEvent = IABEvent.A04;
                    iABEvent = new IABLandingPageStartedEvent(a9z.A0Q, a9z.A0Z, currentTimeMillis, a9z.A0m.now(), a9z.A0g);
                } else {
                    iABEvent = IABEvent.A04;
                }
                CjX(this.A08, iABEvent, this.A0e);
                qla.A06 = this.A13;
            }
            String obj = uri.toString();
            if (!TextUtils.isEmpty(str)) {
                try {
                    ((SystemWebView) qla).A04.postUrl(obj, str.getBytes(ReactWebViewManager.HTML_ENCODING));
                } catch (UnsupportedEncodingException e) {
                    String str2 = this.A0j;
                    if (SQO.A00) {
                        Log.e(str2, "Failed postUrl", e);
                    }
                }
            } else {
                if (uri == this.A07) {
                    PrefetchCacheEntry prefetchCacheEntry = this.A0H.A00;
                    String str3 = null;
                    if (prefetchCacheEntry != null) {
                        str3 = prefetchCacheEntry.A03;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        if (!obj.equals(str3)) {
                            SQO.A01(this.A0j, "Prefetch resolved final url %s -> %s", obj, str3);
                        }
                        obj = str3;
                    }
                }
                List<C13923TlR> list = this.A0o;
                if (list != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("BLF.plugins.");
                    sb.append("onLoadExternalUrl");
                    SSR A002 = SSR.A00();
                    sb.append(".Start");
                    A002.A04(002.A0g("BLF.plugins.", "onLoadExternalUrl", ".Start"));
                    for (C13923TlR DOE : list) {
                        try {
                            DOE.DOE(qla, obj);
                        } catch (Exception e2) {
                            0KC.A0J("BrowserLiteFragment", "Plugin crashed when handling onLoadExternalUrl", e2);
                            throw e2;
                        }
                    }
                    SSR A003 = SSR.A00();
                    sb.append(".End");
                    A003.A04(sb.toString());
                }
                SSR.A00().A04("BLF.loadExternalUrl.Start");
                if (!A0L(getIntent()) || (!(A07(getIntent()) == AnonymousClass05K.A01 || A07(getIntent()) == AnonymousClass05K.A0C) || !qla.A0W)) {
                    SQO.A01(this.A0j, "Loading Url-> %s with no delay", obj);
                    for (C13923TlR EsT : this.A0o) {
                        if (EsT.EsT(qla, obj)) {
                            return;
                        }
                    }
                    String str4 = this.A0m;
                    if (str4 != null && !str4.isEmpty()) {
                        map.put("Referer", str4);
                    }
                    ((SystemWebView) qla).A04.loadUrl(obj, map);
                    SSR.A00().A04("BLF.loadExternalUrl.End");
                    return;
                }
                ((SystemWebView) qla).A04.reload();
            }
        }
    }

    public final void Eow(int i) {
        QLA C8U;
        BrowserLiteWebChromeClient A032;
        if (C8U() != null && (C8U = C8U()) != null && (A032 = C8U.A03()) != null) {
            C13847TiP tiP = A032.A0D;
            if (tiP != null) {
                tiP.setProgressBarVisibility(i);
            } else {
                A032.A0B.setVisibility(i);
            }
        }
    }

    public final boolean canGoBack() {
        QLA C8U = C8U();
        if (C8U == null) {
            return false;
        }
        if (!this.A10) {
            return C8U.A0G();
        }
        if (A03(1) < 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QcV, android.webkit.WebView] */
    public final boolean canGoForward() {
        QLA C8U = C8U();
        if (C8U == null) {
            return false;
        }
        if (!this.A10) {
            return ((SystemWebView) C8U).A04.canGoForward();
        }
        if (A04(this) != 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: X.9tc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: X.SlO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: X.9tc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v230, resolved type: X.9tc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v144, resolved type: X.SlO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v146, resolved type: X.SlO} */
    /* JADX WARNING: type inference failed for: r1v57, types: [X.AYf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v102, types: [java.lang.Object, X.WFw] */
    /* JADX WARNING: type inference failed for: r0v268, types: [java.lang.Object, X.9td] */
    /* JADX WARNING: type inference failed for: r1v145 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r12.A06.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_ALLOW_CHROME_URLS", false) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x053f, code lost:
        if (r2.isEnabled() == false) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0891, code lost:
        if (r5 != null) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0969, code lost:
        if (r1.getBooleanExtra("BrowserLiteIntent.EXTRA_BONDI_ENABLED", false) == false) goto L_0x096b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0b32, code lost:
        if (X.RQ7.A01 != false) goto L_0x0b34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02fd A[LOOP:3: B:126:0x02f7->B:128:0x02fd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x09d9  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x09f2  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0a1a  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0a3f  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0a73  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0ac8  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0cb6  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0cbe  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0ca0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = -1873553545(0xffffffff9053d777, float:-4.17784E-29)
            int r16 = X.AnonymousClass0fD.A02(r0)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onActivityCreated.Start"
            r1.A04(r0)
            r12 = r32
            r17 = r33
            r0 = r17
            com.facebook.browser.lite.BrowserLiteFragment.super.onActivityCreated(r0)
            android.content.Intent r0 = r12.getIntent()
            r12.A06 = r0
            android.net.Uri r0 = r0.getData()
            r12.A07 = r0
            X.APV r1 = new X.APV
            r1.<init>(r12)
            r12.A14 = r1
            X.Pxm r0 = X.Pxm.A08
            X.07V r0 = r0.getLifecycle()
            r0.A09(r1)
            android.net.Uri r1 = r12.A07
            X.0bq r0 = X.C11429STt.A00
            r2 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = r1.getScheme()
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "chrome"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            r2 = 1
        L_0x004f:
            r11 = 1
            r10 = 0
            if (r2 == 0) goto L_0x005e
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_ALLOW_CHROME_URLS"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r6 = 1
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.IAB_WHATSAPP_INTERSTITIAL_DISABLED"
            boolean r2 = r1.getBooleanExtra(r0, r10)
            r1 = 0
        L_0x0068:
            java.util.List r3 = X.SQY.A00
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x007b
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r0 instanceof X.C12052Slf
            if (r0 != 0) goto L_0x007c
            int r1 = r1 + 1
            goto L_0x0068
        L_0x007b:
            r1 = -1
        L_0x007c:
            r18 = -1
            if (r2 == 0) goto L_0x009e
            r0 = r18
            if (r1 != r0) goto L_0x009e
            X.Slf r0 = new X.Slf
            r0.<init>()
            r3.add(r0)
        L_0x008c:
            r5 = 0
        L_0x008d:
            int r0 = r3.size()
            if (r5 >= r0) goto L_0x00a6
            java.lang.Object r0 = r3.get(r5)
            boolean r0 = r0 instanceof X.C12051Sle
            if (r0 != 0) goto L_0x00a7
            int r5 = r5 + 1
            goto L_0x008d
        L_0x009e:
            r0 = r18
            if (r1 == r0) goto L_0x008c
            r3.remove(r1)
            goto L_0x008c
        L_0x00a6:
            r5 = -1
        L_0x00a7:
            X.A4g r0 = r12.A0P
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36327778282388160(0x810fec00003ac0, double:3.0371714937795925E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x00bf
            r0 = r18
            if (r5 == r0) goto L_0x00bf
            r3.remove(r5)
        L_0x00bf:
            android.net.Uri r0 = r12.A07
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C11429STt.A04(r0)
            if (r0 != 0) goto L_0x00d4
            if (r6 != 0) goto L_0x00d4
        L_0x00cb:
            r1 = 1851865155(0x6e613843, float:1.7425536E28)
        L_0x00ce:
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x00d4:
            android.content.Intent r1 = r12.A06
            X.RzR r0 = X.SPF.A08
            X.SPF r0 = r0.A00(r1)
            r12.A0J = r0
            boolean r21 = r0.A03()
            android.content.Intent r0 = r12.A06
            X.SHI r0 = X.SHI.A00(r0)
            r12.A0I = r0
            android.net.Uri r0 = r12.A07
            java.lang.String r2 = r0.getHost()
            java.lang.String r0 = r12.A0j
            r31 = r0
            r19 = 2
            android.net.Uri r0 = r12.A07
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "Pre-resolve DNS for %s for URL %s"
            r0 = r31
            X.SQO.A01(r0, r1, r3)
            java.util.concurrent.ExecutorService r1 = r12.A0q
            if (r1 != 0) goto L_0x0112
            X.Asv r0 = new X.Asv
            r0.<init>()
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r12.A0q = r1
        L_0x0112:
            X.TBE r0 = new X.TBE
            r0.<init>(r2)
            r1.execute(r0)
            X.A9z r3 = r12.A0d
            android.net.Uri r0 = r12.A07
            java.lang.String r2 = r0.toString()
            boolean r0 = r3.A0p
            if (r0 == 0) goto L_0x012f
            com.facebook.privacy.zone.policy.ZonePolicy r1 = r3.A0n
            com.facebook.privacy.zone.api.ZonedValue r0 = new com.facebook.privacy.zone.api.ZonedValue
            r0.<init>(r1, r2)
            r3.A0Q = r0
        L_0x012f:
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = A0L(r0)
            if (r0 == 0) goto L_0x015c
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = A0M(r0)
            if (r0 == 0) goto L_0x015c
            android.content.Intent r0 = r12.getIntent()
            java.lang.Integer r1 = A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0229
            X.A9z r5 = r12.A0d
            r2 = 257(0x101, double:1.27E-321)
        L_0x0153:
            boolean r0 = r5.A0p
            if (r0 == 0) goto L_0x015c
            long r0 = r5.A08
            long r2 = r2 | r0
            r5.A08 = r2
        L_0x015c:
            X.A9z r2 = r12.A0d
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TRACKING_NODES"
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x016c
            r2.A0a = r1
        L_0x016c:
            android.content.Intent r1 = r12.A06
            r0 = 410(0x19a, float:5.75E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 != 0) goto L_0x019a
            X.A9z r2 = r12.A0d
            X.B2o r0 = r12.A0V
            long r0 = r0.BYU()
            com.facebook.iabeventlogging.model.IABEvent r6 = r2.A01(r0)
            android.os.Bundle r5 = r12.A08
            com.facebook.privacy.zone.policy.ZonePolicy r3 = r12.A0e
            X.A4g r0 = r12.A0P
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36313579121674354(0x81030200120872, double:3.0281918873687507E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            r12.A0X(r5, r6, r3, r0)
        L_0x019a:
            android.content.Intent r2 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TRANSPARENT_IAB_BACKGROUND_ALPHA"
            r1 = 255(0xff, float:3.57E-43)
            int r0 = r2.getIntExtra(r0, r1)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            r12.A11 = r0
            android.view.View r9 = r12.requireView()
            r0 = 2131443983(0x7f0b410f, float:1.851005E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r12.A0C = r0
            r0 = 2131429118(0x7f0b06fe, float:1.84799E38)
            android.view.View r0 = r9.findViewById(r0)
            r12.A0A = r0
            r0 = 2131429115(0x7f0b06fb, float:1.8479894E38)
            android.view.View r0 = r9.findViewById(r0)
            r12.A09 = r0
            android.content.Intent r2 = r12.A06
            r0 = 134(0x86, float:1.88E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            int r20 = r2.getIntExtra(r1, r10)
            android.content.Intent r0 = r12.A06
            r2 = 0
            int r0 = r0.getIntExtra(r1, r10)
            if (r0 == 0) goto L_0x01e1
            r2 = 1
        L_0x01e1:
            X.A9z r1 = r12.A0d
            boolean r0 = r1.A0p
            if (r0 == 0) goto L_0x01e9
            r1.A0j = r2
        L_0x01e9:
            r12.A0v = r2
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "watch_and_browse_is_in_watch_and_browse"
            boolean r2 = r1.getBooleanExtra(r0, r10)
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "xnb_is_using_xnb_launcher"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r2 != 0) goto L_0x023e
            if (r0 != 0) goto L_0x023e
            android.content.Intent r1 = r12.A06
            if (r1 == 0) goto L_0x023e
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x023e
            X.AH7 r0 = X.AH7.A01()
            java.util.List r2 = r0.A07
            java.util.Iterator r1 = r2.iterator()
        L_0x0219:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r1.next()
            X.B3K r0 = (X.B3K) r0
            r0.destroy()
            goto L_0x0219
        L_0x0229:
            android.content.Intent r0 = r12.getIntent()
            java.lang.Integer r1 = A07(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x015c
            X.A9z r5 = r12.A0d
            r2 = 1
            goto L_0x0153
        L_0x023b:
            r2.clear()
        L_0x023e:
            X.AH7 r2 = X.AH7.A01()
            android.content.Context r1 = r12.A05
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.A04 = r0
            X.AH7 r2 = X.AH7.A01()
            android.content.Intent r1 = r12.A06
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.A05 = r0
            X.AH7 r1 = X.AH7.A01()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r9)
            r1.A06 = r0
            X.AH7 r0 = X.AH7.A01()
            r0.A03 = r12
            X.AH7 r0 = X.AH7.A01()
            r0.A01 = r12
            X.AH7 r1 = X.AH7.A01()
            X.TiP r0 = r12.A0U
            r1.A02 = r0
            X.AH7 r8 = X.AH7.A01()
            java.lang.ref.WeakReference r0 = r8.A04
            r1 = 0
            if (r0 != 0) goto L_0x0895
            r0 = r1
        L_0x0281:
            java.lang.ref.WeakReference r2 = r8.A05
            if (r2 == 0) goto L_0x028b
            java.lang.Object r1 = r2.get()
            android.content.Intent r1 = (android.content.Intent) r1
        L_0x028b:
            if (r0 == 0) goto L_0x08b6
            if (r1 == 0) goto L_0x08b6
            X.SPF r3 = X.SPF.A06
            if (r3 == 0) goto L_0x0335
            boolean r2 = r3.A01()
            if (r2 == 0) goto L_0x031b
            r2 = 131(0x83, float:1.84E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            if (r2 == 0) goto L_0x02ae
            java.util.List r3 = r8.A07
            X.Slb r2 = X.AH7.A00(r1, r8)
            r3.add(r2)
        L_0x02ae:
            X.7ka r5 = r8.A01
            if (r5 == 0) goto L_0x02c2
            X.7kb r4 = r8.A03
            if (r4 == 0) goto L_0x02c2
            java.util.List r3 = r8.A07
            X.Sla r2 = new X.Sla
            r2.<init>(r0, r1, r5, r4)
            X.C12048Sla.A0A = r2
            r3.add(r2)
        L_0x02c2:
            r8.A03(r1)
        L_0x02c5:
            java.lang.ref.WeakReference r2 = r8.A04
            if (r2 == 0) goto L_0x089d
            java.lang.ref.WeakReference r1 = r8.A05
            if (r1 == 0) goto L_0x089d
            java.lang.ref.WeakReference r0 = r8.A06
            if (r0 == 0) goto L_0x089d
            java.lang.Object r6 = r2.get()
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r1.get()
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r6 == 0) goto L_0x089d
            if (r5 == 0) goto L_0x089d
            if (r4 == 0) goto L_0x089d
            X.7ka r0 = r8.A01
            if (r0 == 0) goto L_0x089d
            X.7kb r0 = r8.A03
            if (r0 == 0) goto L_0x089d
            java.util.List r0 = r8.A07
            java.util.Iterator r7 = r0.iterator()
        L_0x02f7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x08b6
            java.lang.Object r3 = r7.next()
            X.B3K r3 = (X.B3K) r3
            X.7ka r2 = r8.A01
            X.7kb r1 = r8.A03
            X.TiP r0 = r8.A02
            r27 = r0
            r28 = r1
            r22 = r3
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r2
            r22.DDj(r23, r24, r25, r26, r27, r28)
            goto L_0x02f7
        L_0x031b:
            boolean r2 = r3.A02()
            if (r2 == 0) goto L_0x0335
            X.7ka r5 = r8.A01
            if (r5 == 0) goto L_0x0335
            X.7kb r4 = r8.A03
            if (r4 == 0) goto L_0x0335
            java.util.List r3 = r8.A07
            X.Sla r2 = new X.Sla
            r2.<init>(r0, r1, r5, r4)
            X.C12048Sla.A0A = r2
            r3.add(r2)
        L_0x0335:
            X.SHI r2 = X.SHI.A04
            if (r2 == 0) goto L_0x0353
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x0353
            X.7ka r5 = r8.A01
            if (r5 == 0) goto L_0x0353
            X.7kb r4 = r8.A03
            if (r4 == 0) goto L_0x0353
            java.util.List r3 = r8.A07
            X.QKR r2 = new X.QKR
            r2.<init>(r0, r1, r5, r4)
            X.QKR.A01 = r2
            r3.add(r2)
        L_0x0353:
            java.util.List r7 = r8.A07
            X.QKz r2 = new X.QKz
            r2.<init>()
            r7.add(r2)
            android.os.Bundle r3 = r1.getExtras()
            r3.getClass()
            X.08y r2 = X.09i.A0A
            com.instagram.common.session.UserSession r6 = r2.A06(r3)
            java.lang.String r4 = "EXTRA_ADS_CONTEXT"
            android.os.Parcelable r5 = r1.getParcelableExtra(r4)
            com.facebook.iabadscontext.IABAdsContext r5 = (com.facebook.iabadscontext.IABAdsContext) r5
            r2 = 375(0x177, float:5.25E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            if (r2 == 0) goto L_0x05ba
            java.util.HashMap r23 = new java.util.HashMap
            r23.<init>()
            r2 = 429(0x1ad, float:6.01E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            android.os.Bundle r3 = r1.getBundleExtra(r2)
            if (r3 == 0) goto L_0x03b2
            r2 = 377(0x179, float:5.28E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r13 = r3.containsKey(r2)
            if (r13 == 0) goto L_0x03b2
            java.lang.String r13 = r3.getString(r2)
            r2 = 378(0x17a, float:5.3E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r3.getBoolean(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r2 = r23
            r2.put(r13, r3)
        L_0x03b2:
            r2 = 55
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r27 = r1.getStringExtra(r2)
            android.os.Parcelable r13 = r1.getParcelableExtra(r4)
            com.facebook.iabadscontext.IABAdsContext r13 = (com.facebook.iabadscontext.IABAdsContext) r13
            r2 = 379(0x17b, float:5.31E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = ","
            if (r2 == 0) goto L_0x040f
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r2)
        L_0x03dd:
            r2 = 372(0x174, float:5.21E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r2 = r1.getStringExtra(r2)
            if (r2 == 0) goto L_0x0409
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r2)
        L_0x03f6:
            X.RF6 r25 = X.RF6.NOT_OPT_IN
            r2 = 373(0x175, float:5.23E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r3 = r1.getStringExtra(r2)
            boolean r2 = X.C296675qS.A03(r3)
            if (r2 != 0) goto L_0x0463
            goto L_0x0415
        L_0x0409:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            goto L_0x03f6
        L_0x040f:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            goto L_0x03dd
        L_0x0415:
            X.0qQ.A0B(r3, r10)     // Catch:{ IllegalArgumentException -> 0x0448 }
            kotlin.enums.EnumEntries r2 = X.RF6.A01     // Catch:{ IllegalArgumentException -> 0x0448 }
            java.util.Iterator r22 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x0448 }
        L_0x041e:
            boolean r2 = r22.hasNext()     // Catch:{ IllegalArgumentException -> 0x0448 }
            if (r2 == 0) goto L_0x0438
            java.lang.Object r2 = r22.next()     // Catch:{ IllegalArgumentException -> 0x0448 }
            r15 = r2
            X.RF6 r15 = (X.RF6) r15     // Catch:{ IllegalArgumentException -> 0x0448 }
            java.lang.String r15 = r15.A00     // Catch:{ IllegalArgumentException -> 0x0448 }
            boolean r15 = X.0qQ.A0K(r15, r3)     // Catch:{ IllegalArgumentException -> 0x0448 }
            if (r15 == 0) goto L_0x041e
        L_0x0433:
            X.RF6 r2 = (X.RF6) r2     // Catch:{ IllegalArgumentException -> 0x0448 }
            if (r2 == 0) goto L_0x043a
            goto L_0x0461
        L_0x0438:
            r2 = 0
            goto L_0x0433
        L_0x043a:
            java.lang.String r15 = "No matching enum value found for '"
            r2 = 39
            java.lang.String r3 = X.002.A0S(r15, r3, r2)     // Catch:{ IllegalArgumentException -> 0x0448 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0448 }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0448 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0448 }
        L_0x0448:
            r15 = move-exception
            X.0wj r2 = X.0wj.A01
            X.S0F r3 = new X.S0F
            r3.<init>(r2)
            java.lang.String r2 = r15.getMessage()
            if (r2 == 0) goto L_0x045e
            java.lang.String r2 = r15.getMessage()
        L_0x045a:
            r3.A00(r2)
            goto L_0x0463
        L_0x045e:
            java.lang.String r2 = "Failed to find matching enum"
            goto L_0x045a
        L_0x0461:
            r25 = r2
        L_0x0463:
            if (r27 != 0) goto L_0x0467
            java.lang.String r27 = ""
        L_0x0467:
            if (r13 == 0) goto L_0x0509
            java.lang.String r2 = r13.A09
        L_0x046b:
            r24 = r0
            r26 = r6
            r28 = r2
            r29 = r14
            r30 = r4
            X.4gR r3 = X.RUV.A00(r24, r25, r26, r27, r28, r29, r30)
            if (r13 == 0) goto L_0x050c
            com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension r2 = r13.A03
            if (r2 == 0) goto L_0x050c
            X.RzL r13 = r3.A00
            X.0qQ.A0B(r13, r10)
            java.util.List r2 = r2.A00
            java.util.Iterator r15 = r2.iterator()
        L_0x048a:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x050c
            java.lang.Object r14 = r15.next()
            com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType r14 = (com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType) r14
            if (r14 == 0) goto L_0x048a
            java.lang.String r4 = r14.A00
            r2 = 161(0xa1, float:2.26E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04fa
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x04a8:
            java.lang.String r2 = r14.A01
            java.lang.String r14 = "PAYMENT_SAVE_AUTOFILL_CONTACT_AND_PAYMENT_AUTOFILL"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x04c3
            java.lang.Integer r14 = X.AnonymousClass05K.A00
        L_0x04b4:
            X.JVf r2 = new X.JVf
            r2.<init>((java.lang.Integer) r4, (java.lang.Integer) r14)
            X.JwI r4 = r13.A0E
            java.lang.Object r4 = r4.A00
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L_0x048a
        L_0x04c3:
            java.lang.String r14 = "PAYMENT_SAVE_AUTOFILL_IAB_CLOSE"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x04ce
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x04b4
        L_0x04ce:
            java.lang.String r14 = "PAYMENT_SAVE_AUTOFILL_NONE"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x04d9
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x04b4
        L_0x04d9:
            java.lang.String r14 = "CONTACT_SAVE_AUTOFILL_CONTACT_AUTOFILL"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x04e4
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            goto L_0x04b4
        L_0x04e4:
            java.lang.String r14 = "CONTACT_SAVE_AUTOFILL_IAB_CLOSE"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x04ef
            java.lang.Integer r14 = X.AnonymousClass05K.A0Y
            goto L_0x04b4
        L_0x04ef:
            java.lang.String r14 = "CONTACT_SAVE_AUTOFILL_NONE"
            boolean r14 = r2.equals(r14)
            if (r14 == 0) goto L_0x0ebe
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            goto L_0x04b4
        L_0x04fa:
            r2 = 138(0x8a, float:1.93E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0ec4
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x04a8
        L_0x0509:
            r2 = 0
            goto L_0x046b
        L_0x050c:
            X.SJQ r13 = new X.SJQ
            r13.<init>(r6)
            X.S0G r2 = new X.S0G
            r2.<init>(r6)
            com.meta.vault.service.base.DefaultVaultService r27 = new com.meta.vault.service.base.DefaultVaultService
            r27.<init>()
            X.QKv r4 = new X.QKv
            r24 = r2
            r25 = r13
            r28 = r23
            r22 = r4
            r23 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28)
            java.lang.Class<android.view.autofill.AutofillManager> r2 = android.view.autofill.AutofillManager.class
            java.lang.Object r2 = r0.getSystemService(r2)
            android.view.autofill.AutofillManager r2 = (android.view.autofill.AutofillManager) r2
            if (r2 == 0) goto L_0x0541
            boolean r3 = r2.isAutofillSupported()
            if (r3 == 0) goto L_0x0541
            boolean r2 = r2.isEnabled()
            r13 = 1
            if (r2 != 0) goto L_0x0542
        L_0x0541:
            r13 = 0
        L_0x0542:
            r2 = 384(0x180, float:5.38E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            r4.A0S = r2
            r2 = 380(0x17c, float:5.32E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            r4.A0Q = r2
            if (r2 == 0) goto L_0x057d
            com.instagram.common.session.UserSession r2 = r4.A0d
            r22 = r2
            X.4gR r2 = r4.A0b
            r23 = r2
            X.SJQ r15 = r4.A0B
            X.S0G r14 = r4.A0A
            com.meta.vault.service.base.DefaultVaultService r3 = r4.A0H
            X.STY r2 = new X.STY
            r26 = r15
            r27 = r22
            r28 = r3
            r22 = r2
            r24 = r4
            r25 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r4.A07 = r2
        L_0x057d:
            r4.A0T = r13
            r2 = 401(0x191, float:5.62E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            r1.getStringExtra(r2)
            r2 = 383(0x17f, float:5.37E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            r4.A0R = r2
            r2 = 382(0x17e, float:5.35E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            r1.getBooleanExtra(r2, r10)
            r2 = 381(0x17d, float:5.34E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            int r2 = r1.getIntExtra(r2, r11)
            r4.A00 = r2
            r2 = 385(0x181, float:5.4E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            r4.A0Y = r2
            java.util.List r2 = r8.A07
            r2.add(r4)
        L_0x05ba:
            r2 = 390(0x186, float:5.47E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            if (r2 == 0) goto L_0x05eb
            boolean r2 = X.SQY.A02(r0)
            if (r2 != 0) goto L_0x05eb
            X.QL1 r3 = new X.QL1
            r3.<init>(r5, r6)
            r3.A02 = r6
            r2 = 389(0x185, float:5.45E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r4 = r1.hasExtra(r2)
            if (r4 == 0) goto L_0x05e8
            java.util.ArrayList r2 = r1.getStringArrayListExtra(r2)
            r2.getClass()
            r3.A07 = r2
        L_0x05e8:
            r7.add(r3)
        L_0x05eb:
            r2 = 391(0x187, float:5.48E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            boolean r2 = r1.getBooleanExtra(r2, r10)
            if (r2 == 0) goto L_0x0731
            if (r5 == 0) goto L_0x0731
            com.google.common.collect.ImmutableList r3 = r5.A06
            X.RFY r2 = X.RFY.IAB_META_CHECKOUT_SDK
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0731
            r2 = 55
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r28 = r1.getStringExtra(r2)
            java.lang.String r2 = "LITE_CHECKOUT"
            X.QKY r4 = new X.QKY
            r4.<init>(r0, r6, r2)
            java.lang.String r2 = r5.A09
            r27 = r2
            r26 = 0
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r2 = r5.A01
            com.facebook.iabadscontext.MetaCheckoutExperienceType r2 = r2.A00
            r29 = r2
            r2 = r28
            X.0qQ.A0B(r2, r11)
            java.lang.String r25 = "is_ads_context_valid"
            r14 = 0
            r2 = 4582(0x11e6, float:6.421E-42)
            java.lang.String r24 = X.AnonymousClass000.A00(r2)
            java.lang.String r22 = ""
            r2 = 5004(0x138c, float:7.012E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r2)
            X.0wc r15 = r4.A0C()
            r2 = 672(0x2a0, float:9.42E-43)
            java.lang.String r3 = X.Pxd.A00(r2)
            X.0kJ r2 = r15.A00
            X.0Aj r15 = r15.A00(r2, r3)
            r2 = 103(0x67, float:1.44E-43)
            X.1Ln r3 = new X.1Ln
            r3.<init>(r15, r2)
            X.0Aj r2 = r3.A00
            boolean r2 = r2.isSampled()
            if (r2 == 0) goto L_0x0717
            r2 = r22
            r3.A0v(r2)
            X.2M7 r15 = X.2M7.A0G
            java.lang.String r2 = "product_type"
            r3.A0M(r15, r2)
            X.59v r15 = X.C2818559v.ANDROID
            java.lang.String r2 = "platform"
            r3.A0M(r15, r2)
            long r22 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r22)
            java.lang.String r2 = "actual_event_time"
            r3.A0Q(r2, r15)
            X.QIq r15 = new X.QIq
            r15.<init>()
            java.lang.String r2 = "target_name"
            r15.A06(r2, r13)
            java.lang.String r2 = "view_name"
            r15.A06(r2, r13)
            java.lang.String r2 = "event_payload"
            r3.A0N(r15, r2)
            X.QHj r13 = new X.QHj
            r13.<init>()
            r2 = 2785(0xae1, float:3.903E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            r2 = r24
            r13.A06(r15, r2)
            r2 = 223(0xdf, float:3.12E-43)
            java.lang.String r15 = X.Pxd.A00(r2)
            r2 = r28
            r13.A06(r15, r2)
            X.RId r15 = r4.A00
            r2 = 4137(0x1029, float:5.797E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r13.A01(r15, r2)
            java.lang.String r15 = r4.A01
            r2 = 3618(0xe22, float:5.07E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r13.A06(r2, r15)
            java.lang.String r15 = r4.A02
            r2 = 1331(0x533, float:1.865E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r13.A06(r2, r15)
            if (r27 == 0) goto L_0x06cf
            long r14 = java.lang.Long.parseLong(r27)
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
        L_0x06cf:
            java.lang.String r2 = "ad_id"
            r13.A05(r2, r14)
            r2 = 802(0x322, float:1.124E-42)
            java.lang.String r14 = X.Pxd.A00(r2)
            r2 = r26
            r13.A06(r14, r2)
            r2 = 903(0x387, float:1.265E-42)
            java.lang.String r14 = X.Pxd.A00(r2)
            r2 = r26
            r13.A06(r14, r2)
            r2 = 2971(0xb9b, float:4.163E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r3.A0N(r13, r2)
            java.lang.String r13 = java.lang.String.valueOf(r11)
            X.0eP r14 = new X.0eP
            r2 = r25
            r14.<init>(r2, r13)
            java.lang.String r15 = java.lang.String.valueOf(r29)
            java.lang.String r13 = "meta_checkout_experience_type"
            X.0eP r2 = new X.0eP
            r2.<init>(r13, r15)
            X.0eP[] r2 = new X.0eP[]{r14, r2}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r2)
            r3.A0x(r2)
            r3.Cgf()
        L_0x0717:
            com.facebook.iabadscontext.MetaCheckoutExperienceType r3 = com.facebook.iabadscontext.MetaCheckoutExperienceType.ONSITE_SHOPIFY_SDK_CHECKOUT
            r2 = r29
            if (r2 != r3) goto L_0x0731
            X.QKc r2 = new X.QKc
            r22 = r2
            r23 = r0
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r28
            r22.<init>(r23, r24, r25, r26, r27)
            r7.add(r2)
        L_0x0731:
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r2, r10)
            if (r0 != 0) goto L_0x0749
            r0 = 427(0x1ab, float:5.98E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0751
        L_0x0749:
            X.QKx r0 = new X.QKx
            r0.<init>()
            r7.add(r0)
        L_0x0751:
            boolean r0 = r1.getBooleanExtra(r2, r10)
            if (r0 == 0) goto L_0x075f
            X.QKy r0 = new X.QKy
            r0.<init>()
            r7.add(r0)
        L_0x075f:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_THEME"
            java.lang.String r2 = r1.getStringExtra(r0)
            r0 = 69
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0779
            X.QL0 r0 = new X.QL0
            r0.<init>()
            r7.add(r0)
        L_0x0779:
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0891
            if (r5 == 0) goto L_0x07a9
            com.facebook.iabadscontext.IgPromoAdsExtension r4 = r5.A04
            if (r4 == 0) goto L_0x0799
            java.lang.String r3 = r5.A09
            if (r3 == 0) goto L_0x0799
            java.lang.String r2 = r5.A0A
            X.QKu r0 = new X.QKu
            r0.<init>(r4, r6, r3, r2)
            r7.add(r0)
        L_0x0799:
            java.lang.String r3 = r5.A09
            if (r3 == 0) goto L_0x07a9
            com.facebook.iabadscontext.IgPromoAdsExtension r2 = r5.A04
            java.lang.String r4 = r5.A0A
            X.QKq r0 = new X.QKq
            r0.<init>(r2, r6, r3, r4)
            r7.add(r0)
        L_0x07a9:
            r0 = 397(0x18d, float:5.56E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x07d3
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_START_WITH_PEEK_STATE"
            boolean r4 = r1.getBooleanExtra(r0, r10)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_START_WITH_FULL_SHEET"
            boolean r3 = r1.getBooleanExtra(r0, r10)
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r2 = r1.getBooleanExtra(r0, r10)
            X.QKo r0 = new X.QKo
            r0.<init>(r4, r3, r2)
            r7.add(r0)
        L_0x07d3:
            r8.A03(r1)
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x07eb
            java.util.List r2 = r8.A07
            X.Slb r0 = X.AH7.A00(r1, r8)
            r2.add(r0)
        L_0x07eb:
            r0 = 480(0x1e0, float:6.73E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0819
            r0 = 431(0x1af, float:6.04E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r1.hasExtra(r2)
            if (r0 == 0) goto L_0x0819
            android.os.Parcelable r0 = r1.getParcelableExtra(r2)
            if (r0 == 0) goto L_0x0819
            java.util.List r3 = r8.A07
            android.os.Parcelable r2 = r1.getParcelableExtra(r2)
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r2 = (com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel) r2
            X.QKa r0 = new X.QKa
            r0.<init>(r2, r6)
            r3.add(r0)
        L_0x0819:
            r0 = 432(0x1b0, float:6.05E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r1.hasExtra(r2)
            if (r0 == 0) goto L_0x0845
            android.os.Parcelable r0 = r1.getParcelableExtra(r2)
            if (r0 == 0) goto L_0x0845
            android.os.Parcelable r3 = r1.getParcelableExtra(r2)
            com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel r3 = (com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel) r3
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x0845
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0845
            java.util.List r2 = r8.A07
            X.UHW r0 = new X.UHW
            r0.<init>(r3, r6)
            r2.add(r0)
        L_0x0845:
            r0 = 430(0x1ae, float:6.03E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r1.hasExtra(r2)
            if (r0 == 0) goto L_0x0867
            android.os.Parcelable r0 = r1.getParcelableExtra(r2)
            if (r0 == 0) goto L_0x0867
            java.util.List r3 = r8.A07
            android.os.Parcelable r2 = r1.getParcelableExtra(r2)
            com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel r2 = (com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel) r2
            X.QKb r0 = new X.QKb
            r0.<init>(r2, r6)
            r3.add(r0)
        L_0x0867:
            r0 = 433(0x1b1, float:6.07E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r1.hasExtra(r2)
            if (r0 == 0) goto L_0x02c5
            android.os.Parcelable r0 = r1.getParcelableExtra(r2)
            if (r0 == 0) goto L_0x02c5
            android.os.Parcelable r3 = r1.getParcelableExtra(r2)
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r3 = (com.instagram.api.schemas.IGAdsIABScreenshotDataDict) r3
            java.lang.String r2 = r3.Bq0()
            if (r2 == 0) goto L_0x02c5
            java.util.List r1 = r8.A07
            X.QKw r0 = new X.QKw
            r0.<init>(r3, r6, r2)
            r1.add(r0)
            goto L_0x02c5
        L_0x0891:
            if (r5 == 0) goto L_0x07a9
            goto L_0x0799
        L_0x0895:
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0281
        L_0x089d:
            java.util.List r2 = r8.A07
            java.util.Iterator r1 = r2.iterator()
        L_0x08a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08b3
            java.lang.Object r0 = r1.next()
            X.B3K r0 = (X.B3K) r0
            r0.destroy()
            goto L_0x08a3
        L_0x08b3:
            r2.clear()
        L_0x08b6:
            X.AH7 r1 = X.AH7.A01()
            java.lang.Class<X.B3J> r0 = X.B3J.class
            java.util.ArrayList r0 = r1.A02(r0)
            r12.A0n = r0
            X.AH7 r1 = X.AH7.A01()
            java.lang.Class<X.TlR> r0 = X.C13923TlR.class
            java.util.ArrayList r0 = r1.A02(r0)
            r12.A0o = r0
            X.AH7 r1 = X.AH7.A01()
            java.lang.Class<X.QKt> r0 = X.C7578QKt.class
            java.util.ArrayList r0 = r1.A02(r0)
            r12.A19 = r0
            X.AH7 r1 = X.AH7.A01()
            java.lang.Class<X.QL0> r0 = X.QL0.class
            java.util.ArrayList r0 = r1.A02(r0)
            r12.A0p = r0
            android.content.Intent r0 = r12.getIntent()
            A07(r0)
            android.content.Intent r1 = r12.A06
            r0 = 371(0x173, float:5.2E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.A0g = r0
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = A0L(r0)
            if (r0 == 0) goto L_0x095a
            X.A6v r3 = X.C39624A2o.A02
            if (r3 == 0) goto L_0x095a
            X.AH7 r1 = X.AH7.A01()
            java.lang.Class<X.QKv> r0 = X.C7580QKv.class
            java.util.ArrayList r0 = r1.A02(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x091b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x095a
            java.lang.Object r1 = r6.next()
            X.QKv r1 = (X.C7580QKv) r1
            java.lang.String r2 = "autofill_controller"
            java.util.HashMap r0 = r3.A04
            java.lang.Object r4 = r0.get(r2)
            android.os.BaseBundle r4 = (android.os.BaseBundle) r4
            if (r4 == 0) goto L_0x091b
            java.lang.String r5 = "mOptOutDomains"
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x0946
            java.util.Map r2 = r1.A0i
            java.lang.Object r0 = r4.get(r5)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r2.putAll(r0)
        L_0x0946:
            java.lang.String r2 = "mDomainAcceptedAutofill"
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x091b
            java.util.Map r1 = r1.A0f
            java.lang.Object r0 = r4.get(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r1.putAll(r0)
            goto L_0x091b
        L_0x095a:
            boolean r0 = r12.A0v
            if (r0 == 0) goto L_0x096b
            android.content.Intent r1 = r12.A06
            if (r1 == 0) goto L_0x096b
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BONDI_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r3 = 1
            if (r0 != 0) goto L_0x096c
        L_0x096b:
            r3 = 0
        L_0x096c:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TRACKING_CODES"
            r1.getStringExtra(r0)
            android.net.Uri r0 = r12.A07
            java.lang.String r0 = r0.toString()
            r12.A0l = r0
            android.content.Intent r1 = r12.A06
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0992
            android.widget.FrameLayout r1 = r12.A0C
            if (r1 == 0) goto L_0x0992
            int r0 = r12.A11
            r1.setBackgroundColor(r0)
        L_0x0992:
            boolean r0 = r12.A0v
            if (r0 == 0) goto L_0x0cec
            android.view.View r1 = r12.A09
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r10)
            r1.setBackground(r0)
            android.view.View r1 = r12.A0A
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r10)
            r1.setBackground(r0)
            r0 = 2131429132(0x7f0b070c, float:1.8479928E38)
            android.view.View r0 = r9.findViewById(r0)
            com.facebook.browser.lite.views.BrowserLiteWrapperView r0 = (com.facebook.browser.lite.views.BrowserLiteWrapperView) r0
            r12.A0c = r0
            if (r21 == 0) goto L_0x0ce1
            r12.A0S()
            r12.A0T()
            r6 = 1
            X.9td r0 = new X.9td
            r0.<init>()
            r12.A0F = r0
        L_0x09c6:
            r2 = 0
        L_0x09c7:
            r0 = 2131438174(0x7f0b2a5e, float:1.8498267E38)
            android.view.View r4 = r9.requireViewById(r0)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            r4.setBackgroundColor(r10)
            if (r21 == 0) goto L_0x0cbe
            X.9td r0 = r12.A0F
            if (r0 == 0) goto L_0x0cbe
            X.SlO r1 = new X.SlO
            r1.<init>(r4, r12, r12)
        L_0x09de:
            r12.A0U = r1
            android.content.Intent r1 = r12.A06
            r8 = 0
            if (r1 != 0) goto L_0x0cb6
            r5 = r8
        L_0x09e6:
            java.util.List r0 = r12.A0p
            java.util.Iterator r14 = r0.iterator()
        L_0x09ec:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0ca0
            java.lang.Object r0 = r14.next()
            X.SPc r0 = (X.C11364SPc) r0
            android.content.Intent r4 = r12.A06
            r1 = 69
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r13 = r1.equals(r5)
            if (r13 == 0) goto L_0x09ec
            X.7ka r0 = r0.A03
            if (r0 == 0) goto L_0x09ec
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.TiP r0 = r0.A0U
            if (r0 == 0) goto L_0x09ec
            r5 = 2131626040(0x7f0e0838, float:1.8879305E38)
            r0.Egj(r4, r1, r5)
        L_0x0a16:
            com.facebook.browser.lite.views.BrowserLiteWrapperView r5 = r12.A0c
            if (r5 == 0) goto L_0x0a26
            X.TiP r4 = r12.A0U
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "extra_is_fragment_mode"
            r1.getBooleanExtra(r0, r10)
            r5.A04(r12, r4, r12)
        L_0x0a26:
            android.view.View r1 = r12.requireView()
            X.TiP r0 = r12.A0U
            if (r0 == 0) goto L_0x0a61
            X.B1i r0 = r12.A0M
            if (r0 == 0) goto L_0x0a61
            android.content.Intent r0 = r12.A06
            if (r0 == 0) goto L_0x0a61
            r0 = r21
            r12.A0Y(r1, r2, r3, r0)
            X.Tl6 r1 = r12.A0R
            if (r1 == 0) goto L_0x0a61
            java.util.List r0 = r12.A0n
            r0.add(r1)
            java.util.List r1 = r12.A0o
            X.Tl6 r0 = r12.A0R
            r1.add(r0)
            r12.getIntent()
            X.QKp r1 = new X.QKp
            r1.<init>(r2)
            r12.A0E = r1
            java.util.List r0 = r12.A0n
            r0.add(r1)
            java.util.List r1 = r12.A0o
            X.QKp r0 = r12.A0E
            r1.add(r0)
        L_0x0a61:
            r0 = 2131429119(0x7f0b06ff, float:1.8479902E38)
            android.view.View r2 = r9.requireViewById(r0)
            com.facebook.browser.lite.views.BrowserLiteGestureDelegateView r2 = (com.facebook.browser.lite.views.BrowserLiteGestureDelegateView) r2
            com.facebook.browser.lite.views.BrowserLiteWrapperView r5 = r12.A0c
            r4 = 0
            r1 = r20
            r0 = r19
            if (r1 == r0) goto L_0x0a74
            r4 = 1
        L_0x0a74:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOULD_ADJUST_DRAG_DISTANCE"
            r1.getBooleanExtra(r0, r10)
            android.content.Intent r1 = r12.A06
            r0 = 409(0x199, float:5.73E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r13 = r1.getBooleanExtra(r0, r10)
            android.content.Intent r8 = r12.A06
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_DRAG_TO_CLOSE_THRESHOLD"
            r8.getDoubleExtra(r3, r0)
            r2.A03 = r5
            r0 = 2131429118(0x7f0b06fe, float:1.84799E38)
            android.view.View r0 = r5.requireViewById(r0)
            r2.A02 = r0
            r2.A08 = r4
            r2.A07 = r13
            android.content.Context r3 = r2.getContext()
            r1 = 1092616192(0x41200000, float:10.0)
            java.util.regex.Pattern r0 = X.SCX.A01
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A00 = r0
            X.Q8R r1 = new X.Q8R
            r1.<init>(r2)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r3, r1)
            r2.A01 = r0
            com.facebook.browser.lite.views.BrowserLiteWrapperView r0 = r12.A0c
            if (r0 == 0) goto L_0x0acb
            r0.A01()
        L_0x0acb:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_IS_DEBUG_OVERLAY_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0b27
            r0 = 2131429122(0x7f0b0702, float:1.8479908E38)
            android.view.View r1 = r9.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131624337(0x7f0e0191, float:1.887585E38)
            r1.setLayoutResource(r0)
            android.view.View r0 = r1.inflate()
            if (r0 == 0) goto L_0x0b27
            android.widget.TextView r0 = (android.widget.TextView) r0
            r12.A0D = r0
            X.S2G.A04 = r11
            r0.bringToFront()
            android.widget.TextView r1 = r12.A0D
            android.text.method.ScrollingMovementMethod r0 = new android.text.method.ScrollingMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
            X.S2G r1 = X.S2G.A03
            if (r1 != 0) goto L_0x0b08
            X.S2G r1 = new X.S2G
            r1.<init>()
            X.S2G.A03 = r1
        L_0x0b08:
            android.widget.TextView r0 = r12.A0D
            r1.A00 = r0
            boolean r0 = r12.A0z
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "iab_click_source"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "debug overlay. separate data dir: %s, click source %s"
            r0 = r31
            X.SQO.A01(r0, r1, r2)
        L_0x0b27:
            android.content.Context r0 = r12.A05
            boolean r8 = X.SQY.A02(r0)
            if (r8 == 0) goto L_0x0b34
            boolean r1 = X.RQ7.A01
            r0 = 0
            if (r1 == 0) goto L_0x0b35
        L_0x0b34:
            r0 = 1
        L_0x0b35:
            r12.A1D = r0
            X.RQ7.A01 = r11
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.JS_BRIDGE"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy r0 = (com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy) r0
            r12.A0G = r0
            android.content.Intent r1 = r12.A06
            r0 = 395(0x18b, float:5.54E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A1F = r0
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOG_FB_TRACKING_REQUEST"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A1J = r0
            android.content.Intent r1 = r12.A06
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A1Q = r0
            java.lang.String r0 = r12.A1Q
            if (r0 == 0) goto L_0x0c9c
            java.lang.String r0 = r12.A1Q
        L_0x0b71:
            r12.A1Q = r0
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_HTTP_REFERRER_FOR_UNSHIMMED_URL"
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A0m = r0
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SAFE_BROWSING_ENABLED"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A10 = r0
            android.content.Intent r1 = r12.A06
            r0 = 413(0x19d, float:5.79E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A17 = r0
            X.Rvf r0 = X.C10646Rvf.A03
            if (r0 != 0) goto L_0x0ba0
            X.Rvf r0 = new X.Rvf
            r0.<init>()
            X.C10646Rvf.A03 = r0
        L_0x0ba0:
            r12.A0H = r0
            android.content.Intent r1 = r12.A06
            r0 = 403(0x193, float:5.65E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r1 = (com.facebook.browser.lite.ipc.PrefetchCacheEntry) r1
            if (r1 == 0) goto L_0x0c85
            X.Rvf r0 = r12.A0H
            r0.A00 = r1
        L_0x0bb6:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_start"
            r1.A04(r0)
            boolean r0 = r12.A0v
            if (r0 != 0) goto L_0x0c0d
            android.content.Intent r1 = r12.A06
            if (r1 != 0) goto L_0x0c7d
            r4 = 0
        L_0x0bc8:
            r0 = 2131438174(0x7f0b2a5e, float:1.8498267E38)
            android.view.View r1 = r9.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = r19
            X.0qQ.A0B(r1, r0)
            X.A8t r0 = new X.A8t
            r0.<init>(r1, r12, r12)
            r12.A0N = r0
            java.util.List r0 = r12.A0p
            java.util.Iterator r5 = r0.iterator()
        L_0x0be3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0c56
            java.lang.Object r1 = r5.next()
            X.SPc r1 = (X.C11364SPc) r1
            android.content.Intent r3 = r12.A06
            r0 = 69
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x0be3
            X.7ka r0 = r1.A03
            if (r0 == 0) goto L_0x0be3
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            X.TiP r1 = r0.A0U
            if (r1 == 0) goto L_0x0be3
            r0 = 2131626040(0x7f0e0838, float:1.8879305E38)
            r1.Egj(r3, r2, r0)
        L_0x0c0d:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onActivityCreated.setUpBrowserChromeControllerByTheme_end"
            r1.A04(r0)
            android.content.Intent r2 = r12.A06
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_TOAST_RES_ID"
            r0 = r18
            int r0 = r2.getIntExtra(r1, r0)
            if (r0 <= 0) goto L_0x0c25
            r12.A0A(r0)
        L_0x0c25:
            java.util.List r5 = r12.A0n
            java.lang.String r4 = "onActivityCreated"
            if (r5 == 0) goto L_0x0d00
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "BLF.plugins."
            r3.append(r2)
            r3.append(r4)
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".Start"
            r3.append(r0)
            java.lang.String r0 = X.002.A0g(r2, r4, r0)
            r1.A04(r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x0c4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0cf0
            r1.next()
            goto L_0x0c4c
        L_0x0c56:
            X.A8t r3 = r12.A0N
            X.0qQ.A0B(r3, r10)
            r1 = 2131624786(0x7f0e0352, float:1.8876762E38)
            android.view.ViewStub r0 = r3.A02
            r0.setLayoutResource(r1)
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.browser.lite.chrome.container.base.AbstractBrowserLiteChrome"
            X.0qQ.A0C(r2, r0)
            X.9Y2 r2 = (X.AnonymousClass9Y2) r2
            r3.A00 = r2
            if (r2 == 0) goto L_0x0c0d
            X.7kb r1 = r3.A01
            X.7ka r0 = r3.A03
            r2.setControllers(r1, r0)
            r2.bringToFront()
            goto L_0x0c0d
        L_0x0c7d:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_THEME"
            java.lang.String r4 = r1.getStringExtra(r0)
            goto L_0x0bc8
        L_0x0c85:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_NO_PREFETCH_REASON"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x0bb6
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "No prefetch reason: %s"
            r0 = r31
            X.SQO.A01(r0, r1, r2)
            goto L_0x0bb6
        L_0x0c9c:
            java.lang.String r0 = "NONE"
            goto L_0x0b71
        L_0x0ca0:
            if (r3 != 0) goto L_0x0a16
            X.SPF r0 = r12.A0J
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0a16
            X.TiP r4 = r12.A0U
            r1 = 2131624790(0x7f0e0356, float:1.887677E38)
            android.content.Intent r0 = r12.A06
            r4.Egj(r0, r8, r1)
            goto L_0x0a16
        L_0x0cb6:
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BROWSER_THEME"
            java.lang.String r5 = r1.getStringExtra(r0)
            goto L_0x09e6
        L_0x0cbe:
            if (r3 == 0) goto L_0x0cc9
            if (r2 == 0) goto L_0x0cc9
            X.AQE r1 = new X.AQE
            r1.<init>()
            goto L_0x09de
        L_0x0cc9:
            r0 = 2131440854(0x7f0b34d6, float:1.8503703E38)
            android.view.View r0 = r9.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.WFw r1 = new X.WFw
            r1.<init>()
            r1.A03 = r12
            r1.A04 = r12
            r1.A00 = r4
            r1.A01 = r0
            goto L_0x09de
        L_0x0ce1:
            r6 = 1
            if (r3 == 0) goto L_0x09c6
            X.9tc r2 = new X.9tc
            r2.<init>()
            goto L_0x09c7
        L_0x0cec:
            r6 = 1
            goto L_0x0acb
        L_0x0cf0:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = ".End"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.A04(r0)
        L_0x0d00:
            android.content.Intent r1 = r12.getIntent()
            r0 = 387(0x183, float:5.42E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r1.getStringExtra(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0d12
            r2 = 1
        L_0x0d12:
            android.content.Intent r1 = r12.getIntent()
            r0 = 406(0x196, float:5.69E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r1 = r1.getBooleanExtra(r0, r10)
            android.os.Bundle r0 = r12.mArguments
            if (r0 == 0) goto L_0x0d37
            if (r2 != 0) goto L_0x0d28
            if (r1 == 0) goto L_0x0d37
        L_0x0d28:
            r2 = 1
            r12.A0N(r0)
        L_0x0d2c:
            android.content.Intent r1 = r12.A06
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_DISABLE_INIT_EXCEPTION_HANDLING"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 != 0) goto L_0x0d3f
            goto L_0x0d39
        L_0x0d37:
            r2 = 0
            goto L_0x0d2c
        L_0x0d39:
            r0 = r17
            r12.A0C(r0, r2)     // Catch:{ Exception -> 0x0d45 }
            goto L_0x0d9e
        L_0x0d3f:
            r0 = r17
            r12.A0C(r0, r2)
            goto L_0x0d9e
        L_0x0d45:
            r4 = move-exception
            java.lang.String r1 = "BrowserLiteFragment"
            java.lang.String r0 = "Exception while creating WebView."
            X.0KC.A0J(r1, r0, r4)
            X.A9z r0 = r12.A0d
            long r1 = r0.A08
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r3 = 0
            if (r0 != 0) goto L_0x0d57
            r3 = 1
        L_0x0d57:
            boolean r0 = r12 instanceof X.C340017kY
            if (r0 == 0) goto L_0x0da4
            X.0wj r2 = X.0wj.A01
            r1 = 19796747(0x12e130b, float:3.1972415E-38)
            r0 = 3267(0xcc3, float:4.578E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0f9 r2 = r2.AEf(r0, r1)
            r2.ERJ(r4)
            java.lang.String r0 = "is_hot_instance"
            r2.ABR(r0, r3)
            java.lang.String r1 = r12.A0T()
            if (r1 != 0) goto L_0x0d7a
            java.lang.String r1 = "0"
        L_0x0d7a:
            java.lang.String r0 = "ad_id"
            r2.ABQ(r0, r1)
            android.content.Context r0 = r12.A05
            X.0qQ.A06(r0)
            boolean r1 = X.C249103j8.A01(r0)
            r0 = 926(0x39e, float:1.298E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.ABR(r0, r1)
            r2.report()
        L_0x0d94:
            java.lang.String r2 = "CREATING_WEBVIEW"
            r1 = 0
            r0 = 4
            A0G(r12, r2)
            r12.AI4(r0, r1)
        L_0x0d9e:
            X.ACt r5 = X.C39872ACt.A00()
            monitor-enter(r5)
            goto L_0x0dac
        L_0x0da4:
            java.lang.String r1 = r12.A0j
            java.lang.String r0 = "Unexpected error"
            X.0KC.A0I(r1, r0, r4)
            goto L_0x0d94
        L_0x0dac:
            java.util.LinkedList r4 = r5.A00     // Catch:{ all -> 0x0eca }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0eca }
            r2 = 0
        L_0x0db3:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0eca }
            if (r0 == 0) goto L_0x0dd1
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0eca }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0eca }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0eca }
            if (r0 != 0) goto L_0x0dc9
            r3.remove()     // Catch:{ all -> 0x0eca }
            goto L_0x0db3
        L_0x0dc9:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0eca }
            if (r12 != r0) goto L_0x0db3
            r2 = 1
            goto L_0x0db3
        L_0x0dd1:
            if (r2 != 0) goto L_0x0ddb
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0eca }
            r0.<init>(r12)     // Catch:{ all -> 0x0eca }
            r4.addLast(r0)     // Catch:{ all -> 0x0eca }
        L_0x0ddb:
            monitor-exit(r5)
            X.SRY r3 = r12.A0L
            android.net.Uri r0 = r12.A07
            java.lang.String r2 = r0.toString()
            android.os.Bundle r1 = r12.A08
            X.QJg r0 = new X.QJg
            r0.<init>(r1, r3, r2)
            X.SRY.A02(r0, r3, r10)
            java.util.regex.Pattern r0 = X.SCX.A01
            if (r8 == 0) goto L_0x0df4
            r12.A0z = r11
        L_0x0df4:
            X.SSR r1 = X.SSR.A00()
            java.lang.String r0 = "BLF.onActivityCreated.End"
            r1.A04(r0)
            X.B1i r2 = r12.A0M
            if (r2 == 0) goto L_0x0e0e
            boolean r0 = r12.A1E
            if (r0 != 0) goto L_0x0e0e
            if (r33 == 0) goto L_0x0e0e
            X.9su r1 = X.C391409su.A0T
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.Cgm(r1, r0)
        L_0x0e0e:
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = A0L(r0)
            if (r0 == 0) goto L_0x0e20
            android.os.Handler r1 = X.C39624A2o.A00
            if (r1 == 0) goto L_0x0e20
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
        L_0x0e20:
            android.content.Context r3 = r12.A05
            android.content.Intent r0 = r12.A06
            android.os.Bundle r2 = r0.getExtras()
            X.0qQ.A0B(r3, r11)
            X.AYf r1 = new X.AYf
            r1.<init>()
            X.08y r0 = X.09i.A0A
            com.instagram.common.session.UserSession r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x0e3e
            X.3KG r0 = X.AnonymousClass3KF.A00(r3, r0)
            r1.A01 = r0
        L_0x0e3e:
            r12.A16 = r1
            X.A30 r0 = r12.A1O
            X.0qQ.A0B(r0, r10)
            r1.A00 = r0
            android.content.Intent r1 = r12.A06
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r10)
            if (r0 == 0) goto L_0x0eb9
            java.lang.String r0 = "com.facebook.ui.browser.requests.PixelRequestBuffer"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            android.content.Context r0 = r12.A05     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            X.TjA r0 = (X.C13887TjA) r0     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            r12.A0X = r0     // Catch:{ ClassNotFoundException -> 0x0e78, IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0e74 }
            goto L_0x0eb9
        L_0x0e74:
            r2 = move-exception
            java.lang.String r1 = "Failed to instantiate fb pixel buffer"
            goto L_0x0eb4
        L_0x0e78:
            java.lang.String r0 = "com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            android.content.Context r1 = r12.A05     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            android.os.Bundle r0 = r0.getExtras()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            if (r0 != 0) goto L_0x0ea8
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            r0.<init>()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
        L_0x0e9b:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            java.lang.Object r0 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            X.TjA r0 = (X.C13887TjA) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            r12.A0X = r0     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            goto L_0x0eb9
        L_0x0ea8:
            android.content.Intent r0 = r12.getIntent()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            android.os.Bundle r0 = r0.getExtras()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0eb1 }
            goto L_0x0e9b
        L_0x0eb1:
            r2 = move-exception
            java.lang.String r1 = "Failed to instantiate ig pixel buffer"
        L_0x0eb4:
            r0 = r31
            X.0KC.A0F(r0, r1, r2)
        L_0x0eb9:
            r1 = -281484841(0xffffffffef38e1d7, float:-5.7218265E28)
            goto L_0x00ce
        L_0x0ebe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0ec4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r4)
            throw r0
        L_0x0eca:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r1 = (com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            com.facebook.browser.lite.BrowserLiteFragment.super.onConfigurationChanged(r4)
            X.B1i r2 = r3.A0M
            if (r2 == 0) goto L_0x0012
            boolean r0 = r3.A1E
            if (r0 != 0) goto L_0x0012
            X.9su r1 = X.C391409su.A0S
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.Cgm(r1, r0)
        L_0x0012:
            com.facebook.browser.lite.views.BrowserLiteWrapperView r0 = r3.A0c
            if (r0 == 0) goto L_0x0019
            r0.A02()
        L_0x0019:
            X.A8t r0 = r3.A0N
            if (r0 == 0) goto L_0x0035
            X.9Y2 r1 = r0.A00
            if (r1 == 0) goto L_0x0035
            com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome r1 = (com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome) r1
            X.QA3 r0 = r1.A0C
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0035
            X.QA3 r0 = r1.A0C
            r0.dismiss()
            r0 = 0
            r1.A0C = r0
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 854155533(0x32e9610d, float:2.7168904E-8)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.A33 r0 = r13.A15
            if (r0 != 0) goto L_0x0012
            X.A33 r0 = new X.A33
            r0.<init>()
            r13.A15 = r0
        L_0x0012:
            if (r14 == 0) goto L_0x00b7
            android.content.Context r12 = r13.getContext()
            if (r12 == 0) goto L_0x00b7
            java.lang.String r9 = "_bigbundle_length_"
            java.lang.Object r0 = r14.get(r9)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r8 = "_bigbundle_path_"
            java.lang.Object r0 = r14.get(r8)
            if (r0 == 0) goto L_0x00b7
            int r11 = r14.getInt(r9)
            java.lang.String r0 = r14.getString(r8)
            java.lang.String r2 = "BigBundle"
            r10 = 0
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "BigBundle file path is null"
            X.0KC.A0D(r2, r0)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b6
        L_0x003d:
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00ae }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00ae }
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x00ae }
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "BigBundle file missing"
            X.0KC.A0D(r2, r0)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b6
        L_0x004e:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00a9 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a9 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00a9 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a9 }
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ all -> 0x00a2 }
            r7.<init>(r6)     // Catch:{ all -> 0x00a2 }
            byte[] r1 = new byte[r11]     // Catch:{ all -> 0x009b }
            r7.readFully(r1)     // Catch:{ all -> 0x009b }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ all -> 0x009b }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x009b }
            r0 = 0
            r4.unmarshall(r1, r0, r11)     // Catch:{ all -> 0x0096 }
            r4.setDataPosition(r0)     // Catch:{ all -> 0x0096 }
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x0096 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ all -> 0x0096 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0096 }
            r0.<init>(r1)     // Catch:{ all -> 0x0096 }
            r0.readFromParcel(r4)     // Catch:{ all -> 0x0096 }
            r14.remove(r9)     // Catch:{ all -> 0x0096 }
            r14.remove(r8)     // Catch:{ all -> 0x0096 }
            r14.putAll(r0)     // Catch:{ all -> 0x0096 }
            r4.recycle()     // Catch:{ all -> 0x009b }
            r7.close()     // Catch:{ all -> 0x00a2 }
            r6.close()     // Catch:{ all -> 0x00a9 }
            r5.delete()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b7
        L_0x0096:
            r0 = move-exception
            r4.recycle()     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.1zE.A00(r7, r1)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            r5.delete()     // Catch:{ IOException -> 0x00ae }
            throw r0     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "Could not restore"
            X.0KC.A0H(r2, r0, r1)
            r14 = r10
            goto L_0x00b7
        L_0x00b6:
            r14 = r10
        L_0x00b7:
            com.facebook.browser.lite.BrowserLiteFragment.super.onCreate(r14)
            r0 = -1374976343(0xffffffffae0b86a9, float:-3.1724543E-11)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.BrowserLiteFragment.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-578117275);
        SSR.A00().A04("BLF.onCreateView");
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.browser_lite_fragment, viewGroup, false);
        0qQ.A07(inflate);
        this.A0B = inflate;
        AnonymousClass0fD.A09(411889245, A022);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.QcV, android.view.View, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.S78, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v29, types: [X.ASS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.9uk, java.lang.Object] */
    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(302275037);
        C13907Tl7 tl7 = this.A14;
        if (tl7 != null) {
            Pxm.A08.getLifecycle().A0A(tl7);
        }
        SRY sry = this.A0L;
        Context applicationContext = this.A05.getApplicationContext();
        if (sry.A01 != null) {
            sry.A02.post(new TFT(applicationContext, sry));
        }
        C39872ACt A002 = C39872ACt.A00();
        synchronized (A002) {
            Iterator it = A002.A00.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || weakReference.get() == this) {
                    it.remove();
                }
            }
        }
        ExecutorService executorService = this.A0q;
        if (executorService != null) {
            executorService.shutdownNow();
            this.A0q = null;
        }
        while (true) {
            Stack stack = this.A1M;
            if (!stack.isEmpty()) {
                QLA qla = (QLA) stack.pop();
                qla.A0B = null;
                if (!A0L(getIntent())) {
                    A0J(qla);
                } else if (stack.isEmpty()) {
                    C39730A6v a6v = new C39730A6v(getIntent(), qla, this.A0k);
                    a6v.A00 = this.A0i;
                    HashMap hashMap = this.A1P;
                    for (Object next : hashMap.keySet()) {
                        Object obj = hashMap.get(next);
                        if (obj != null) {
                            a6v.A04.put(next, obj);
                        }
                    }
                    Intent intent = this.A06;
                    Integer A072 = A07(getIntent());
                    boolean booleanExtra = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_WEBVIEW_HOT_INSTANCE_MEMORY_PRESSURE_ENABLED", false);
                    long longExtra = intent.getLongExtra("BrowserLiteIntent.EXTRA_WEBVIEW_HOT_INSTANCE_CACHE_TTL", LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    C39624A2o.A02 = a6v;
                    QLA qla2 = a6v.A02;
                    ? r7 = ((SystemWebView) qla2).A04;
                    Context context = r7.getContext();
                    Handler handler = C39624A2o.A00;
                    if (handler == null) {
                        handler = new Handler(context.getApplicationContext().getMainLooper());
                        C39624A2o.A00 = handler;
                    }
                    handler.postDelayed(new Object(), longExtra);
                    qla2.A0C = null;
                    r7.setDownloadListener((DownloadListener) null);
                    qla2.A0D(new Object());
                    r7.setWebChromeClient((WebChromeClient) null);
                    qla2.A0E = null;
                    qla2.A0D = null;
                    r7.setOnTouchListener((View.OnTouchListener) null);
                    qla2.A0I = null;
                    qla2.A0W = true;
                    WebSettings settings = r7.getSettings();
                    String userAgentString = settings.getUserAgentString();
                    if (A072 == AnonymousClass05K.A0Y) {
                        str = " FBNV/5";
                    } else {
                        str = " FBNV/1";
                    }
                    if (!userAgentString.endsWith(str)) {
                        settings.setUserAgentString(002.A0R(userAgentString, str));
                    }
                    if (booleanExtra) {
                        if (C39624A2o.A03 == null) {
                            C39624A2o.A03 = new Object();
                        }
                        if (C39624A2o.A01 == null) {
                            C39624A2o.A01 = new Object();
                        }
                    }
                } else {
                    A0J(qla);
                }
            } else {
                BrowserLiteFragment.super.onDestroy();
                AnonymousClass0fD.A09(1453376115, A022);
                return;
            }
        }
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(962977713);
        FrameLayout frameLayout = this.A0C;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.A0C = null;
        }
        this.A0B = null;
        C39774A8t a8t = this.A0N;
        if (a8t != null) {
            a8t.A00 = null;
        }
        BrowserLiteFragment.super.onDestroyView();
        AnonymousClass0fD.A09(-585307556, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(1519663965);
        BrowserLiteFragment.super.onDetach();
        AnonymousClass0fD.A09(679101474, A022);
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [X.QcV, android.webkit.WebView] */
    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1482343754);
        BrowserLiteFragment.super.onPause();
        QLA C8U = C8U();
        String str2 = null;
        if (C8U != null) {
            str = C8U.A05();
            str2 = ((SystemWebView) C8U).A04.getTitle();
        } else {
            str = null;
        }
        SRY sry = this.A0L;
        boolean z = this.A1E;
        Bundle bundle = this.A08;
        S4Q s4q = S4Q.A02;
        if (s4q == null) {
            s4q = new S4Q();
            S4Q.A02 = s4q;
        }
        SRY.A02(new C7566QJu(bundle, sry, this.A0e, str, s4q.A01(), z), sry, false);
        A9z a9z = this.A0d;
        if (a9z.A0p) {
            a9z.A0I = a9z.A0m.now();
        }
        this.A0Y.A02 = SystemClock.elapsedRealtime();
        List<B3J> list = this.A0n;
        if (list != null) {
            for (B3J DWO : list) {
                DWO.DWO(this.A1E);
            }
        }
        if (this.A1E) {
            A9z a9z2 = this.A0d;
            if (a9z2.A0p) {
                a9z2.A0N = 0;
            }
            A0E(this, C8U);
            if (!182.A06(0Tu.A05, this.A0P.A00, 36313579124623518L)) {
                A09();
            }
            A0I(this, true);
            SRY sry2 = this.A0L;
            HashMap hashMap = new HashMap();
            Intent intent = getIntent();
            hashMap.put("tap_point", Integer.valueOf(this.A02));
            hashMap.put("total_navigation_number", Integer.valueOf(this.A04));
            hashMap.put("same_domain_navigation_number", Integer.valueOf(this.A03));
            hashMap.put("number_scrolls", Integer.valueOf(this.A1K.A00));
            hashMap.put("EXTRA_HOT_INSTANCE_WILL_BE_USED", Boolean.valueOf(A0L(getIntent())));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                hashMap.put("EXTRA_REFERENCE_ID", extras.getString("EXTRA_REFERENCE_ID"));
            }
            SRY.A02(new C7562QJq(this.A08, sry2, this.A0e, str, str2, hashMap), sry2, false);
        }
        SRY sry3 = this.A0L;
        SRY.A02(new QJc(this.A05.getApplicationContext(), sry3), sry3, false);
        C40266AYf aYf = this.A16;
        if (aYf != null) {
            AnonymousClass3KG r1 = aYf.A01;
            if (r1 != null) {
                r1.A06(aYf.A02);
                r1.A04();
            }
            aYf.A02 = null;
        }
        AnonymousClass0fD.A09(1501722259, A022);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.QcV, android.webkit.WebView] */
    public void onResume() {
        AnonymousClass3KG r1;
        int A022 = AnonymousClass0fD.A02(858974070);
        BrowserLiteFragment.super.onResume();
        BrowserLiteWrapperView browserLiteWrapperView = this.A0c;
        if (browserLiteWrapperView != null) {
            browserLiteWrapperView.A03();
        }
        Intent intent = this.A06;
        if (intent == null) {
            intent = new Intent();
        }
        this.A0J = SPF.A08.A00(intent);
        Intent intent2 = this.A06;
        if (intent2 == null) {
            intent2 = new Intent();
        }
        this.A0I = SHI.A00(intent2);
        if (this.A06 == null) {
            new Intent();
        }
        SRY sry = this.A0L;
        SRY.A02(new C7560QJk(this.A06.getBundleExtra(Pxd.A00(135)), sry, this.A0e, this.A0l), sry, false);
        A9z a9z = this.A0d;
        if (a9z.A0p) {
            long j = a9z.A0I;
            if (j != -1) {
                a9z.A0o.add(new ArrayList(Arrays.asList(new Long[]{Long.valueOf(j), Long.valueOf(a9z.A0m.now())})));
            }
        }
        C39703A5t a5t = this.A0Y;
        long j2 = a5t.A02;
        if (j2 != -1) {
            a5t.A00 += SystemClock.elapsedRealtime() - j2;
            a5t.A02 = -1;
        }
        QLA C8U = C8U();
        if (C8U != null) {
            ? r0 = ((SystemWebView) C8U).A04;
            r0.onResume();
            r0.resumeTimers();
        }
        if (this.A1I) {
            SB5.A00(new TB9(this));
            this.A1I = false;
        }
        List list = this.A0n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        C40266AYf aYf = this.A16;
        if (!(aYf == null || (r1 = aYf.A01) == null)) {
            r1.A03();
            AnonymousClass3KQ A002 = AnonymousClass3KG.A00(aYf);
            aYf.A02 = A002;
            r1.A05(A002);
        }
        AnonymousClass0fD.A09(-1537495745, A022);
    }

    public final void onAttach(Activity activity) {
        int A022 = AnonymousClass0fD.A02(-745114919);
        BrowserLiteFragment.super.onAttach(activity);
        this.A05 = activity;
        AnonymousClass0fD.A09(787829324, A022);
    }
}

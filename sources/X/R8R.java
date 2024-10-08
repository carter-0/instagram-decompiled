package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.List;
import java.util.Set;
import org.apache.http.util.EncodingUtils;

public class R8R extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final 0bY A06 = DbW.A0G();
    public static final Set A07 = C66580MXl.A12(0sr.A1M(new String[]{"geo", "maps", "mailto", "sms", "tel"}));
    public static final String __redex_internal_original_name = "SimpleWebViewFragment";
    public View A00;
    public ValueCallback A01;
    public WebView A02;
    public AnonymousClass0wW A03;
    public SimpleWebViewConfig A04;
    public int A05;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e7, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fc, code lost:
        if (r8 != null) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(android.net.Uri r12, android.webkit.WebView r13) {
        /*
            r11 = this;
            r10 = 0
            java.lang.String r2 = "uri"
            r4 = 1
            java.lang.String r5 = X.DbT.A10(r12)
            com.instagram.simplewebview.SimpleWebViewConfig r3 = r11.A04
            java.lang.String r9 = "Required value was null."
            if (r3 == 0) goto L_0x0129
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x011b
            android.net.Uri r0 = X.0cp.A03(r0)
            java.lang.String r1 = r0.getHost()
        L_0x001f:
            androidx.fragment.app.FragmentActivity r8 = r11.requireActivity()
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = r12.getHost()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != r4) goto L_0x0033
            r13.loadUrl(r5)
        L_0x0032:
            return r4
        L_0x0033:
            java.lang.String r1 = r12.getScheme()
            if (r1 == 0) goto L_0x004c
            java.util.Set r0 = A07
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x004c
            android.content.Intent r0 = X.Pxe.A0F(r12)
            boolean r0 = X.0kR.A0H(r0, r11)
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            java.lang.String r5 = r12.getPath()
            java.lang.String r7 = r12.getHost()
            if (r1 == 0) goto L_0x0128
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r6 = r12.getPath()
            java.lang.String r1 = r12.getHost()
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = "checkpoint"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a2
            if (r6 == 0) goto L_0x00a2
            java.lang.String r0 = "/dismiss"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "/switch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00a2
        L_0x0082:
            X.0wW r1 = r11.A03
            if (r5 == 0) goto L_0x009e
            java.lang.String r0 = "/switch"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            X.FZ1 r0 = X.F5E.A00(r1)
            r0.A01()
            android.content.Context r0 = r8.getBaseContext()
            X.F5E.A01(r0, r12, r1)
        L_0x009e:
            r8.finish()
            return r4
        L_0x00a2:
            java.lang.String r0 = "browser"
            if (r7 == 0) goto L_0x0123
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L_0x00ff
            if (r5 == 0) goto L_0x00ff
            java.lang.String r0 = "/dismiss"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "message"
            java.lang.String r1 = r12.getQueryParameter(r0)
            if (r1 == 0) goto L_0x00ca
            android.content.Context r0 = r11.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            X.C59689JTv.A09(r0, r1)
        L_0x00ca:
            java.lang.String r0 = "action"
            java.lang.String r2 = r12.getQueryParameter(r0)
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x00f8
            if (r2 == 0) goto L_0x00f8
            java.lang.String r0 = "updated"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f8
            X.0wW r3 = r11.A03
            if (r3 == 0) goto L_0x00f8
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00f8
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.1Xj r2 = X.DbV.A0U(r3, r1)
            if (r2 == 0) goto L_0x00f8
            X.1Xy r1 = r2.A0C
            r0 = 0
            r1.EdA(r0)
            r2.AE7(r3)
        L_0x00f8:
            androidx.fragment.app.FragmentActivity r8 = r11.getActivity()
            if (r8 == 0) goto L_0x0032
            goto L_0x009e
        L_0x00ff:
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = r12.getQueryParameter(r2)
            if (r0 == 0) goto L_0x0123
            java.lang.String r1 = r12.getQueryParameter(r2)
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x011e
            android.net.Uri r0 = X.0cp.A03(r1)
            X.0kR.A04(r0, r11)
            return r4
        L_0x011b:
            r1 = 0
            goto L_0x001f
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0123:
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0128
            return r4
        L_0x0128:
            return r10
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R8R.A03(android.net.Uri, android.webkit.WebView):boolean");
    }

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        SimpleWebViewConfig simpleWebViewConfig = this.A04;
        if (simpleWebViewConfig == null) {
            throw AnonymousClass7TE.A0y();
        } else if (simpleWebViewConfig.A08) {
            r6.Etr(false);
        } else {
            r6.Etr(true);
            String str = simpleWebViewConfig.A02;
            if (str != null) {
                if (simpleWebViewConfig.A0B) {
                    r6.ErN(str);
                } else {
                    WebView webView = this.A02;
                    if (!simpleWebViewConfig.A0E || webView == null || webView.getUrl() == null) {
                        r6.setTitle(str);
                    } else {
                        String host = Uri.parse(webView.getUrl()).getHost();
                        2dZ r1 = (2dZ) r6;
                        2dZ.A0J(r1, str, false);
                        r1.EnO(host);
                    }
                }
            }
            r6.Ett(new C11495SbI(this, 22), simpleWebViewConfig.A0D);
            r6.Eu4(simpleWebViewConfig.A0C);
        }
    }

    public final String getModuleName() {
        return "web_view";
    }

    public void A02(WebView webView) {
        if (this instanceof RBS) {
            ((RBS) this).A00 = webView;
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public boolean onBackPressed() {
        WebView webView = this.A02;
        if (webView == null) {
            return false;
        }
        boolean equals = "file:///android_asset/webview_error.html".equals(webView.getUrl());
        SimpleWebViewConfig simpleWebViewConfig = this.A04;
        if (simpleWebViewConfig == null) {
            throw AnonymousClass7TE.A0y();
        } else if (!simpleWebViewConfig.A06 || equals || !webView.canGoBack()) {
            return false;
        } else {
            webView.goBack();
            return true;
        }
    }

    public static final void A01(FrameLayout frameLayout, R8R r8r) {
        r8r.A00 = frameLayout.requireViewById(R.id.loading_indicator);
        r8r.A02 = (WebView) frameLayout.requireViewById(R.id.web_view);
        r8r.requireContext();
        AnonymousClass0wW r1 = r8r.A03;
        if (r1 != null) {
            SAX.A00(r1, (List) null);
        }
        WebView webView = r8r.A02;
        if (webView != null) {
            webView.setScrollBarStyle(0);
            webView.setDownloadListener(new C11521Sbi(r8r));
            webView.setWebChromeClient(new Q8v(r8r, 4));
            WebSettings settings = webView.getSettings();
            0qQ.A07(settings);
            settings.setJavaScriptEnabled(true);
            SimpleWebViewConfig simpleWebViewConfig = r8r.A04;
            if (simpleWebViewConfig != null) {
                if (simpleWebViewConfig.A05 || 1Q6.A01(simpleWebViewConfig.A03)) {
                    String userAgentString = settings.getUserAgentString();
                    0qQ.A07(userAgentString);
                    settings.setUserAgentString(1Ch.A01(userAgentString));
                }
                webView.setWebViewClient(new Q95(r8r, 6));
                String str = simpleWebViewConfig.A03;
                if (str != null) {
                    String str2 = simpleWebViewConfig.A01;
                    if (str2 == null || str2.length() == 0) {
                        webView.loadUrl(str);
                    } else {
                        byte[] bytes = EncodingUtils.getBytes(str2, "BASE64");
                        if (bytes != null) {
                            webView.postUrl(str, bytes);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                WebView webView2 = r8r.A02;
                if (webView2 != null) {
                    r8r.A02(webView2);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            ValueCallback valueCallback = this.A01;
            if (i2 == -1 && intent != null && intent.getData() != null) {
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        OOC ooc = new OOC();
                        ooc.A01(requireActivity(), data);
                        Uri fromFile = Uri.fromFile(ooc.A00());
                        if (valueCallback != null) {
                            boolean z = true;
                            Uri[] uriArr = {fromFile};
                            if (fromFile == null) {
                                z = false;
                            }
                            if (!C66581MXm.A1a(z)) {
                                uriArr = null;
                            }
                            valueCallback.onReceiveValue(uriArr);
                            this.A01 = null;
                        }
                    }
                } catch (SecurityException unused) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("failed to open file from uri = ");
                    0wb.A03(__redex_internal_original_name, AnonymousClass7TF.A0i(intent.getData(), A1A));
                }
            } else if (valueCallback != null) {
                AnonymousClass0wW r5 = this.A03;
                if (r5 == null || DbY.A1Y(0Tu.A05, r5, 2342160750157501940L)) {
                    valueCallback.onReceiveValue((Object) null);
                    this.A01 = null;
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(705742582);
        R8R.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (requireArguments.getString("IgSessionManager.SESSION_TOKEN_KEY") != null) {
            this.A03 = 09i.A0A.A04(requireArguments);
        }
        this.A04 = (SimpleWebViewConfig) C320236s2.A00(requireArguments, SimpleWebViewConfig.class, "SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG");
        AnonymousClass0fD.A09(31362087, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int A022 = AnonymousClass0fD.A02(-650125492);
        0qQ.A0B(layoutInflater, 0);
        try {
            View inflate = layoutInflater.inflate(R.layout.simple_web_view, viewGroup, false);
            0qQ.A0C(inflate, C273654mx.A00(2));
            FrameLayout frameLayout2 = (FrameLayout) inflate;
            A01(frameLayout2, this);
            frameLayout = frameLayout2;
        } catch (InflateException unused) {
            View inflate2 = layoutInflater.inflate(R.layout.simple_web_view_stub, viewGroup, false);
            0qQ.A0C(inflate2, C273654mx.A00(2));
            ViewStub A0X = JTR.A0X(inflate2, R.id.web_view_stub);
            this.A02 = null;
            this.A00 = null;
            AnonymousClass7TF.A0D().postDelayed(new C13010THs(A0X, this), 500);
            frameLayout = inflate2;
        }
        AnonymousClass0fD.A09(1606445307, A022);
        return frameLayout;
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(107568648);
        this.A00 = null;
        WebView webView = this.A02;
        if (webView != null) {
            webView.destroy();
            this.A02 = null;
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(-1384815293, A022);
    }

    public void onStart() {
        int A022 = AnonymousClass0fD.A02(-1846874484);
        R8R.super.onStart();
        Activity rootActivity = getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            this.A05 = ((AnonymousClass2ZP) rootActivity).C3p();
            SimpleWebViewConfig simpleWebViewConfig = this.A04;
            if (simpleWebViewConfig == null) {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(1658451451, A022);
                throw A0y;
            } else if (simpleWebViewConfig.A07) {
                Activity rootActivity2 = getRootActivity();
                if (rootActivity2 instanceof AnonymousClass2ZP) {
                    ((AnonymousClass2ZP) rootActivity2).Enj(8);
                }
            }
        }
        AnonymousClass0fD.A09(-11748405, A022);
    }

    public void onStop() {
        int A022 = AnonymousClass0fD.A02(-1434085798);
        R8R.super.onStop();
        Activity rootActivity = getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) rootActivity).Enj(this.A05);
        }
        AnonymousClass0fD.A09(130692516, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        R8R.super.onCreate(bundle);
        BaseFragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, C66579MXk.A00(7));
        requireActivity.A0a();
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import org.apache.http.util.EncodingUtils;

public final class R8Q extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final Set A0A = C66580MXl.A12(0sr.A1P(new String[]{"geo", "maps", "mailto", "sms", "tel"}));
    public static final String __redex_internal_original_name = "BoostWebViewAdPreviewFragment";
    public View A00;
    public ValueCallback A01;
    public WebView A02;
    public BoostWebViewAdPreviewFragment$Config A03;
    public int A04;
    public Handler A05;
    public GestureDetector.OnGestureListener A06;
    public S1N A07;
    public final 0bY A08 = DbW.A0G();
    public final AnonymousClass0eM A09;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
        if (boostWebViewAdPreviewFragment$Config != null) {
            if (boostWebViewAdPreviewFragment$Config.A07) {
                r5.Etr(false);
                return;
            }
            String str = boostWebViewAdPreviewFragment$Config.A02;
            if (str != null) {
                if (boostWebViewAdPreviewFragment$Config.A0A) {
                    r5.ErN(str);
                } else {
                    r5.setTitle(str);
                }
            }
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config2 = this.A03;
            if (boostWebViewAdPreviewFragment$Config2 != null) {
                r5.Ett(new C11495SbI(this, 4), boostWebViewAdPreviewFragment$Config2.A0C);
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config3 = this.A03;
                if (boostWebViewAdPreviewFragment$Config3 != null) {
                    r5.Eu4(boostWebViewAdPreviewFragment$Config3.A0B);
                    return;
                }
            }
        }
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "boost_webview_ad_preview_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        BaseFragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, C66579MXk.A00(7));
        requireActivity.A0a();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean onBackPressed() {
        WebView webView = this.A02;
        if (webView == null) {
            return false;
        }
        boolean equals = "file:///android_asset/webview_error.html".equals(webView.getUrl());
        BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
        if (boostWebViewAdPreviewFragment$Config == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        } else if (!boostWebViewAdPreviewFragment$Config.A05 || equals || !webView.canGoBack()) {
            return false;
        } else {
            webView.goBack();
            return true;
        }
    }

    public R8Q() {
        S1N s1n;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            s1n = new S1N(activity, new TDW(activity));
        } else {
            s1n = null;
        }
        this.A07 = s1n;
        this.A06 = new C14979UHx(this, 1);
        this.A09 = C227642jf.A02(this);
    }

    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i, i2, intent);
        if (i != 101) {
            return;
        }
        if (i2 != -1 || intent == null || intent.getData() == null) {
            ValueCallback valueCallback = this.A01;
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                this.A01 = null;
                return;
            }
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                OOC ooc = new OOC();
                ooc.A01(requireActivity(), data);
                Uri fromFile = Uri.fromFile(ooc.A00());
                ValueCallback valueCallback2 = this.A01;
                if (valueCallback2 != null) {
                    if (fromFile != null) {
                        uriArr = new Uri[]{fromFile};
                    } else {
                        uriArr = null;
                    }
                    valueCallback2.onReceiveValue(uriArr);
                    this.A01 = null;
                }
            }
        } catch (SecurityException unused) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("failed to open file from uri = ");
            0wb.A03(__redex_internal_original_name, AnonymousClass7TF.A0i(intent.getData(), A1A));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2015385986);
        R8Q.super.onCreate(bundle);
        this.A03 = (BoostWebViewAdPreviewFragment$Config) C320236s2.A00(requireArguments(), BoostWebViewAdPreviewFragment$Config.class, "simple_web_view_config");
        AnonymousClass0fD.A09(519024963, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1915800286);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_webview_layout, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(2));
        C11495SbI.A00(AnonymousClass7TF.A0G(inflate, R.id.boost_webview_back_button), 5, this);
        this.A00 = inflate.requireViewById(R.id.loading_indicator);
        this.A02 = (WebView) inflate.requireViewById(R.id.boost_webview_container);
        Context requireContext = requireContext();
        0lg A0X = DbT.A0X(this.A09);
        if (A0X != null) {
            SAX.A00(A0X, (List) null);
        }
        WebView webView = this.A02;
        if (webView != null) {
            webView.setScrollBarStyle(0);
            webView.setDownloadListener(new C11522Sbj(webView, this));
            webView.setWebChromeClient(new Q8v(this, 3));
            WebSettings settings = webView.getSettings();
            0qQ.A07(settings);
            settings.setJavaScriptEnabled(true);
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
            if (boostWebViewAdPreviewFragment$Config != null) {
                if (boostWebViewAdPreviewFragment$Config.A04 || 1Q6.A01(boostWebViewAdPreviewFragment$Config.A03)) {
                    String userAgentString = settings.getUserAgentString();
                    0qQ.A07(userAgentString);
                    settings.setUserAgentString(1Ch.A01(userAgentString));
                }
                webView.setWebViewClient(new Q94(0, this, webView));
                S1N s1n = this.A07;
                if (s1n != null) {
                    webView.addJavascriptInterface(s1n, "js_interface");
                }
                GestureDetector.OnGestureListener onGestureListener = this.A06;
                Handler handler = new Handler();
                this.A05 = handler;
                C11507SbU.A00(webView, 9, new GestureDetector(requireContext, onGestureListener, handler));
                BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config2 = this.A03;
                if (boostWebViewAdPreviewFragment$Config2 != null) {
                    String str = boostWebViewAdPreviewFragment$Config2.A03;
                    if (str != null) {
                        String str2 = boostWebViewAdPreviewFragment$Config2.A01;
                        if (str2 == null || str2.length() == 0) {
                            webView.loadUrl(str);
                        } else {
                            byte[] bytes = EncodingUtils.getBytes(str2, "BASE64");
                            if (bytes != null) {
                                webView.postUrl(str, bytes);
                            } else {
                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                i = 167805542;
                            }
                        }
                    }
                    AnonymousClass0fD.A09(548298778, A022);
                    return inflate;
                }
            }
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        }
        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
        i = -335784419;
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2029127600);
        this.A00 = null;
        WebView webView = this.A02;
        if (webView != null) {
            webView.destroy();
        }
        this.A02 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1944355319, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-136584630);
        R8Q.super.onStart();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            String A002 = C66579MXk.A00(16);
            0qQ.A0C(rootActivity, A002);
            this.A04 = ((AnonymousClass2ZP) rootActivity).C3p();
            BoostWebViewAdPreviewFragment$Config boostWebViewAdPreviewFragment$Config = this.A03;
            if (boostWebViewAdPreviewFragment$Config == null) {
                0qQ.A0F("config");
                throw AnonymousClass00P.createAndThrow();
            } else if (boostWebViewAdPreviewFragment$Config.A06 && (getRootActivity() instanceof AnonymousClass2ZP)) {
                Activity rootActivity2 = getRootActivity();
                0qQ.A0C(rootActivity2, A002);
                ((AnonymousClass2ZP) rootActivity2).Enj(8);
            }
        }
        AnonymousClass0fD.A09(-602917374, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(932865812);
        R8Q.super.onStop();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, C66579MXk.A00(16));
            ((AnonymousClass2ZP) rootActivity).Enj(this.A04);
        }
        AnonymousClass0fD.A09(487013335, A022);
    }
}

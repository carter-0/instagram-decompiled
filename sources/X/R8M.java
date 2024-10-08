package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

@Deprecated
public final class R8M extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ReportWebViewFragment";
    public int A00 = 2131954722;
    public WebView A01;
    public ProgressBar A02;
    public UserSession A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public boolean A08 = true;
    public String A09;

    public final String getModuleName() {
        return "report_web_view";
    }

    public final void configureActionBar(2da r4) {
        String str = this.A07;
        if (str != null) {
            r4.setTitle(str);
        }
        r4.Eu4(this.A08);
        if (this.A04 == AnonymousClass05K.A00) {
            r4.AA9(new C11495SbI(this, 25), this.A00);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int A022 = AnonymousClass0fD.A02(-1590224024);
        R8M.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = AnonymousClass7TE.A0l(C227642jf.A02(this));
        String A0l = DbU.A0l(requireArguments, "extra_url");
        this.A09 = A0l;
        this.A06 = 0cp.A03(A0l).getHost();
        String string = requireArguments.getString("extra_page");
        if (string == null || string.equals("REPORT")) {
            num = AnonymousClass05K.A00;
        } else if (string.equals("SUPPORT_INFO")) {
            num = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A0w(string);
        }
        this.A04 = num;
        String string2 = requireArguments.getString("extra_report_target");
        if (string2 == null || string2.equals("MEDIA")) {
            num2 = AnonymousClass05K.A00;
        } else if (string2.equals("DIRECT_CONVERSATION")) {
            num2 = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A0w(string2);
        }
        this.A05 = num2;
        if (this.A04 == AnonymousClass05K.A00) {
            this.A07 = DbV.A05(this).getString(2131972171);
        }
        AnonymousClass0fD.A09(-2061090580, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1221003465);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.report_webview);
        AnonymousClass0fD.A09(1743272912, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(912455418);
        super.onDestroyView();
        this.A01.stopLoading();
        this.A01.destroy();
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(1461168634, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = (WebView) view.requireViewById(R.id.web_view);
        this.A02 = (ProgressBar) view.requireViewById(R.id.progress);
        this.A01.setScrollBarStyle(0);
        WebSettings settings = this.A01.getSettings();
        settings.setJavaScriptEnabled(true);
        Context context = getContext();
        if (context != null) {
            SAX.A00(this.A03, (List) null);
        }
        if (1Q6.A01(this.A09)) {
            settings.setUserAgentString(1Ch.A01(settings.getUserAgentString()));
        }
        this.A01.setWebViewClient(new Q94(1, context, this));
        this.A01.loadUrl(this.A09);
    }
}

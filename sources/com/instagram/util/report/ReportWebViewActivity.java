package com.instagram.util.report;

import X.0s1;
import X.AnonymousClass0wW;
import X.C49199Er4;
import X.C51585FwZ;
import X.DbS;
import X.DbU;
import X.DbW;
import X.R8M;
import android.os.Bundle;
import android.webkit.WebView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public class ReportWebViewActivity extends BaseFragmentActivity {
    public UserSession A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.util.report.ReportWebViewActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        this.A00 = DbS.A0U(DbU.A06(this));
        if (getSupportFragmentManager().A0P(R.id.layout_container_main) == null) {
            R8M r8m = new R8M();
            r8m.setArguments(DbU.A06(this));
            0s1 A0D = DbW.A0D(this);
            A0D.A0A(r8m, R.id.layout_container_main);
            A0D.A00();
        }
    }

    public final void onBackPressed() {
        R8M A0P = getSupportFragmentManager().A0P(R.id.layout_container_main);
        WebView webView = A0P.A01;
        boolean z = A0P.A08;
        if (!webView.canGoBack() || !z) {
            this.A00.A01(C49199Er4.class, new C51585FwZ(4));
            super.onBackPressed();
            return;
        }
        webView.goBack();
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

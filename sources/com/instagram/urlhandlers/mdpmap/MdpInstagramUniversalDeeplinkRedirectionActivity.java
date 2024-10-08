package com.instagram.urlhandlers.mdpmap;

import X.00l;
import X.0b6;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.Pxd;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class MdpInstagramUniversalDeeplinkRedirectionActivity extends BaseFragmentActivity {
    public static final HashMap A01;
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A01 = A1E;
        A1E.put("settings", "instagram://settings");
        A1E.put("news", "instagram://news");
        A1E.put("professional_dashboard", "instagram://professional_dashboard");
        A1E.put("news", "instagram://news");
        A1E.put("saved", "instagram://saved");
        A1E.put("search", "instagram://search");
        A1E.put("facebook_page_onboarding", "instagram://facebook_page_onboarding");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int i;
        int A002 = AnonymousClass0fD.A00(1223818202);
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        Bundle A0A = DbT.A0A(intent2);
        if (A0A == null) {
            finish();
            i = -1088362035;
        } else {
            this.A00 = DbT.A0W(A0A);
            String stringExtra = intent2.getStringExtra("deeplink");
            String A0r = DbS.A0r(stringExtra, A01);
            if (A0r != null) {
                intent = DbX.A09(A0r).addCategory(Pxd.A00(6));
            } else {
                intent = null;
            }
            UserSession userSession = this.A00;
            if (userSession != null && (!(userSession instanceof UserSession) || ((stringExtra == null || !00l.A0d(stringExtra, "facebook_page_onboarding", false)) && !AnonymousClass0t1.A01.A01(userSession).A1M()))) {
                FFQ.A01(this, A0A, userSession);
            }
            if (intent != null) {
                0b6.A00().A06().A0G(this, intent);
            }
            finish();
            i = -1538536660;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

package com.instagram.urlhandlers.adtopics;

import X.08y;
import X.09i;
import X.0Tu;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C229382nI;
import X.C359988do;
import X.C360678ey;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import X.E84;
import X.FFQ;
import X.FHB;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

public final class AdTopicsUrlHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.adtopics.AdTopicsUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.adtopics.AdTopicsUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = AnonymousClass0fD.A00(1235956759);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -209499447;
        } else {
            if (DbT.A1Z(this)) {
                UserSession A0U = DbS.A0U(A0A);
                this.A00 = A0U;
                if (A0U != null) {
                    C229382nI A0L = DbY.A0L(this, A0U, "deep_link_util");
                    Map singletonMap = Collections.singletonMap("referer", "settings_ad_options");
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        if (DbY.A1Y(0Tu.A05, userSession, 36311474586583578L)) {
                            singletonMap = FHB.A01();
                            str = AnonymousClass000.A00(138);
                        } else {
                            str = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view";
                        }
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            C360678ey A05 = C359988do.A05(userSession2, str, singletonMap);
                            E84.A00(A05, A0L, 18);
                            schedule(A05);
                        }
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            FFQ.A03(A0A, this);
            finish();
            i = 1902399597;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}

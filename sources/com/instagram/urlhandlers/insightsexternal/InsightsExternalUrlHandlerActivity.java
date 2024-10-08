package com.instagram.urlhandlers.insightsexternal;

import X.0qQ;
import X.1ES;
import X.1OC;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.C3724090s;
import X.DbT;
import X.DbU;
import X.EDV;
import X.FFQ;
import X.FG2;
import X.FHB;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.net.URLEncoder;

public class InsightsExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "insights_external_url_handler";
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.insightsexternal.InsightsExternalUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, X.0iw, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1155522125);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        A0A.getClass();
        this.A00 = DbT.A0W(A0A);
        A0A.putString("media_id", intent.getStringExtra("media_id"));
        UserSession userSession = this.A00;
        if (!(userSession instanceof UserSession)) {
            FFQ.A00().A00(this, A0A, this.A00);
        } else {
            UserSession userSession2 = userSession;
            String string = A0A.getString("media_id");
            if (string != null) {
                String encode = URLEncoder.encode(string);
                DbU.A1D(A0A, userSession2);
                1OC A04 = C3724090s.A04(userSession2, encode);
                EDV.A00(A04, this, userSession2, 43);
                1ES.A03(A04);
                i = -869657981;
            } else {
                String stringExtra = intent.getStringExtra("pk");
                if (stringExtra == null || stringExtra.equals(userSession2.A06)) {
                    User A0j = DbT.A0j(userSession2);
                    0qQ.A0B(userSession2, 0);
                    FG2.A03(this, this, userSession2, A0j, true);
                } else {
                    A0A.putString("destination_id", "mainfeed");
                    FHB.A03(this, A0A);
                    i = -917220224;
                }
            }
            AnonymousClass0fD.A07(i, A002);
        }
        i = 1618001620;
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

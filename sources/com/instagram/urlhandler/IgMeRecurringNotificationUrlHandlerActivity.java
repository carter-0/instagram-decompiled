package com.instagram.urlhandler;

import X.08y;
import X.09i;
import X.1ES;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C229382nI;
import X.C359988do;
import X.C360678ey;
import X.C50128FQl;
import X.C66588MXu;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.E84;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class IgMeRecurringNotificationUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final AnonymousClass06Q A00 = new C50128FQl(this, 2);

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "IgRecurringNotificationBottomSheet";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandler.IgMeRecurringNotificationUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandler.IgMeRecurringNotificationUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, X.0iw, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(630925661);
        super.onCreate(C66588MXu.A00(bundle));
        Bundle A0A = DbX.A0A(this);
        AnonymousClass0wW session = getSession();
        if (A0A == null || session == null) {
            finish();
            i = -447179337;
        } else if (!(session instanceof UserSession)) {
            FFQ.A01(this, A0A, session);
            finish();
            i = 117744773;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = 635778247;
            } else {
                Uri A09 = DbT.A09(A0m);
                String queryParameter = A09.getQueryParameter("page_info");
                if (DbV.A03(A09) != 2) {
                    if (queryParameter == null) {
                        finish();
                        i = 1996768918;
                    }
                } else if (queryParameter == null && (queryParameter = A09.getPathSegments().get(1)) == null) {
                    finish();
                    i = -1658604102;
                }
                HashMap A0f = Dba.A0f("page_info", queryParameter);
                Dba.A0u(A09, "topic", A0f);
                Dba.A0u(A09, "app_id", A0f);
                Dba.A0u(A09, "cadence", A0f);
                Dba.A0u(A09, "ref", A0f);
                Dba.A0u(A09, "mm_user_ref", A0f);
                DbZ.A0u(this, getWindow());
                getSupportFragmentManager().A0s(this.A00);
                C229382nI A01 = C229382nI.A01((SparseArray) null, this, this, getSession());
                C360678ey A05 = C359988do.A05(session, "com.bloks.www.igdotme.rn.validate", A0f);
                E84.A00(A05, A01, 17);
                1ES.A03(A05);
                i = -1148353920;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandler.IgMeRecurringNotificationUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onStart() {
        int A002 = AnonymousClass0fD.A00(-1569356124);
        overridePendingTransition(0, 0);
        super.onStart();
        AnonymousClass0fD.A07(-989366249, A002);
    }
}

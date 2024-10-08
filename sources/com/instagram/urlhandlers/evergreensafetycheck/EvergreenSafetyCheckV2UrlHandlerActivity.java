package com.instagram.urlhandlers.evergreensafetycheck;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C47449E2v;
import X.DbT;
import X.DbW;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class EvergreenSafetyCheckV2UrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.evergreensafetycheck.EvergreenSafetyCheckV2UrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandlers.evergreensafetycheck.EvergreenSafetyCheckV2UrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-550968815);
        super.onCreate(bundle);
        if (!DbT.A1Z(this)) {
            FFQ.A03(DbX.A0A(this), this);
        } else {
            C309516Yo A0B = Dba.A0B(this, getSession());
            A0B.A0F = true;
            C47449E2v e2v = new C47449E2v();
            Bundle A0a = AnonymousClass7TE.A0a();
            Intent intent = getIntent();
            String str = null;
            if (intent != null) {
                str = intent.getStringExtra("trigger");
            }
            A0a.putString("trigger", str);
            DbW.A0y(A0a, e2v, A0B);
        }
        AnonymousClass0fD.A07(-1624924765, A00);
    }
}

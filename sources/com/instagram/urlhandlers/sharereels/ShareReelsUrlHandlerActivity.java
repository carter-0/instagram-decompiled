package com.instagram.urlhandlers.sharereels;

import X.08y;
import X.09i;
import X.28D;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C250563lf;
import X.C56044Hrt;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ShareReelsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.sharereels.ShareReelsUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.sharereels.ShareReelsUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1877959846);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            A0A = AnonymousClass7TE.A0a();
        }
        if (!DbT.A1Z(this)) {
            FFQ.A03(A0A, this);
        } else {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putAll(A0A);
            DbS.A1Z(getSession());
            C56044Hrt A0C = C250563lf.A0C(28D.A3r);
            A0C.A0m = true;
            A0a.putAll(A0C.A00());
            A0a.putBoolean("modal_dismiss_on_cancel", true);
            Dba.A0l(this, A0a, getSession(), "clips_camera");
            finish();
        }
        AnonymousClass0fD.A07(-1847603606, A00);
    }
}

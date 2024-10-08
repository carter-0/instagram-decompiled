package com.instagram.urlhandlers.directwelcomemessagesetting;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbT;
import X.DbX;
import X.Dba;
import X.E3B;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class DirectWelcomeMessageSettingUriHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.directwelcomemessagesetting.DirectWelcomeMessageSettingUriHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.directwelcomemessagesetting.DirectWelcomeMessageSettingUriHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(1789310853);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!DbT.A1Z(this)) {
            FFQ.A03(A0A, this);
        } else {
            C309516Yo A0B = Dba.A0B(this, getSession());
            A0B.A0F = true;
            A0B.A0D(new E3B());
            A0B.A04();
        }
        AnonymousClass0fD.A07(1829304051, A00);
    }
}

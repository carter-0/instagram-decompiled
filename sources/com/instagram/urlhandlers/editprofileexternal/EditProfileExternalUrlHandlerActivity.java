package com.instagram.urlhandlers.editprofileexternal;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C46447Df9;
import X.C46656Dib;
import X.DbU;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class EditProfileExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.editprofileexternal.EditProfileExternalUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-214540607);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        08y r0 = 09i.A0A;
        0qQ.A0A(A0A);
        UserSession A04 = r0.A04(A0A);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            FFQ.A01(this, A0A, A04);
        } else {
            DbU.A1D(A0A, A04);
            C46656Dib A042 = C46447Df9.A02().A04("deeplink_unknown");
            A0A.putString("edit_profile_entry", "deeplink_unknown");
            A042.setArguments(A0A);
            Dbb.A13(A042, this, this.A00);
        }
        AnonymousClass0fD.A07(1261870632, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

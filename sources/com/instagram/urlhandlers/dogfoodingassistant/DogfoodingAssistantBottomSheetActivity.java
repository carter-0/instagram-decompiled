package com.instagram.urlhandlers.dogfoodingassistant;

import X.0cp;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.FC7;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class DogfoodingAssistantBottomSheetActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.dogfoodingassistant.DogfoodingAssistantBottomSheetActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        Uri A03;
        int A00 = AnonymousClass0fD.A00(98993134);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            UserSession A0W = DbT.A0W(A0A);
            if (!(A0W instanceof UserSession)) {
                FFQ.A01(this, A0A, A0W);
            } else {
                UserSession userSession = A0W;
                if (C71172bH.A00() != null) {
                    FC7.A02(this, userSession, DbS.A0m(A0A), (String) null, true);
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (!(A0m == null || (A03 = 0cp.A03(A0m)) == null)) {
                        DbZ.A0v(this, A03);
                    }
                }
            }
            finish();
            AnonymousClass0fD.A07(1805641992, A00);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(-1224468171, A00);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}

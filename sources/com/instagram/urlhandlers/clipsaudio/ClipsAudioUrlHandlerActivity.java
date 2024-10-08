package com.instagram.urlhandlers.clipsaudio;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3GL;
import X.AnonymousClass4DU;
import X.AnonymousClass7TF;
import X.C238833Dp;
import X.C340057kd;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.FG7;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public class ClipsAudioUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final C340057kd getGnvGestureHandler() {
        AnonymousClass0wW r2 = this.A00;
        if (!AnonymousClass3GL.A02(r2)) {
            return null;
        }
        C340057kd A002 = C340057kd.A00(r2);
        C238833Dp A003 = C238833Dp.A00(r2);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.clipsaudio.ClipsAudioUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1658449567);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -644313518;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (!(A0W instanceof UserSession)) {
                FFQ.A00().A00(this, A0A, this.A00);
                finish();
                i = 253425519;
            } else {
                String A0m = DbS.A0m(A0A);
                if (TextUtils.isEmpty(A0m)) {
                    finish();
                    i = 1415340967;
                } else {
                    UserSession userSession = this.A00;
                    AnonymousClass7TF.A1B(userSession, 0, A0m);
                    if (!FG7.A02(FG7.A00(userSession, A0m, (String) null, false), this, userSession, (AnonymousClass4DU) null, false)) {
                        finish();
                    }
                    i = 797943933;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

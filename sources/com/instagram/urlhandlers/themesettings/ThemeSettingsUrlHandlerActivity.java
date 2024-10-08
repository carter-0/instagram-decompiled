package com.instagram.urlhandlers.themesettings;

import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C48029ERs;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ThemeSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.themesettings.ThemeSettingsUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A002 = AnonymousClass0fD.A00(-1529676894);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0) {
            finish();
            i = 1382676714;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (!(A0W instanceof UserSession)) {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r0 = this.A00;
                if (r0 != null) {
                    A003.A00(this, A0A, r0);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                0qQ.A0A(A0W);
                DbW.A0w(A0A, A0W);
                Dbb.A13(new C48029ERs(), this, this.A00);
            }
            i = -64476906;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

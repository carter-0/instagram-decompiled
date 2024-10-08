package com.instagram.urlhandlers.directmessageoptions;

import X.0Gl;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.DbT;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

public final class DirectMessageOptionsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.directmessageoptions.DirectMessageOptionsUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1982992571);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            i = 1123029025;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (A0W == null) {
                i = 303472053;
            } else {
                if (!(A0W instanceof UserSession)) {
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r0 = this.A00;
                    0qQ.A0A(r0);
                    A003.A00(this, A0A, r0);
                } else {
                    C309516Yo A0B = Dba.A0B(this, 0Gl.A00(A0W));
                    A0B.A0F = true;
                    A0B.A0D(new DirectMessagesOptionsFragment());
                    A0B.A04();
                }
                i = 814449489;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

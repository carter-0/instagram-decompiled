package com.instagram.urlhandlers.followandinvitefriends;

import X.0Gl;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.DbT;
import X.Dba;
import X.ES0;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class FollowAndInviteFriendsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.followandinvitefriends.FollowAndInviteFriendsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-1447095756);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = 904730028;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(bundleExtra);
            this.A00 = A0W;
            if (A0W == null) {
                i = -1995130025;
            } else {
                if (!(A0W instanceof UserSession)) {
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r1 = this.A00;
                    0qQ.A0A(r1);
                    A003.A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), r1);
                } else {
                    C309516Yo A0B = Dba.A0B(this, 0Gl.A00(A0W));
                    A0B.A0F = true;
                    A0B.A0D(new ES0());
                    A0B.A04();
                }
                i = 1327169534;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

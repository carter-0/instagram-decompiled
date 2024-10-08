package com.instagram.urlhandlers.followexternal;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FHB;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public final class FollowExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.followexternal.FollowExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1011774531);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                i = -924608750;
            } else {
                A0A.putString("short_url", A0m);
                List<String> pathSegments = DbT.A09(A0m).getPathSegments();
                if (pathSegments.size() < 2) {
                    i = -1487049383;
                } else {
                    A0A.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", AnonymousClass7TE.A19(pathSegments, 1));
                    FHB.A0A(A0A, this, A0W);
                    i = 696437493;
                }
            }
            AnonymousClass0fD.A07(i, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(315873242, A002);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

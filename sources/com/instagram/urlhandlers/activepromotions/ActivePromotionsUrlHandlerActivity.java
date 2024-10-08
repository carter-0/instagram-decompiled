package com.instagram.urlhandlers.activepromotions;

import X.08y;
import X.09i;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C48732EjH;
import X.DbS;
import X.DbT;
import X.DbU;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ActivePromotionsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.activepromotions.ActivePromotionsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1582337933);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        08y r0 = 09i.A0A;
        if (A0A != null) {
            this.A00 = r0.A04(A0A);
            String A0m = DbS.A0m(A0A);
            if (A0m != null) {
                Uri A09 = DbT.A09(A0m);
                DbU.A1B(A09, A0A, "coupon_offer_id");
                DbU.A1B(A09, A0A, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                DbU.A1B(A09, A0A, "dummy_param_random_uuid");
                DbT.A1E(A09, A0A, "has_relaunched_from_main_activity");
            }
            UserSession userSession = this.A00;
            if (!(userSession instanceof UserSession)) {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r02 = this.A00;
                0qQ.A0A(r02);
                A003.A00(this, A0A, r02);
            } else {
                DbS.A1Z(userSession);
                UserSession userSession2 = userSession;
                String stringExtra = intent.getStringExtra("entrypoint");
                if (stringExtra == null) {
                    stringExtra = "DEEPLINK_UNKNOWN";
                }
                if ("inbox_tool".equals(stringExtra)) {
                    C48732EjH.A00().A02(this, userSession2, stringExtra, (String) null, true);
                } else {
                    C48732EjH.A00().A00(A0A, this, userSession2, stringExtra);
                }
            }
            AnonymousClass0fD.A07(1988256361, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(-157344732, A002);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

package com.instagram.urlhandlers.proinspiration;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.FFQ;
import X.FHB;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ProInspirationUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.proinspiration.ProInspirationUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.urlhandlers.proinspiration.ProInspirationUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A00 = AnonymousClass0fD.A00(-1042626729);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
            finish();
            i = 588382744;
        } else {
            Uri A09 = DbT.A09(A0m);
            String queryParameter = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            String queryParameter2 = A09.getQueryParameter("media_id");
            boolean booleanQueryParameter = A09.getBooleanQueryParameter("should_show_promotion_content", false);
            if (0qQ.A0K(A09.toString(), "https://www.instagram.com/linking/inspiration_hub") || 0qQ.A0K(A09.toString(), "https://instagram.com/linking/inspiration_hub")) {
                booleanQueryParameter = true;
                queryParameter = "deep_link";
            }
            A0A.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
            A0A.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
            A0A.putString("media_id", queryParameter2);
            A0A.putBoolean("should_show_promotion_content", booleanQueryParameter);
            DbU.A1B(A09, A0A, "dummy_param_random_uuid");
            DbT.A1E(A09, A0A, "has_relaunched_from_main_activity");
            if (!DbT.A1Z(this)) {
                FFQ.A03(A0A, this);
            } else {
                FHB.A07(A0A, this, getSession());
            }
            i = 662183060;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}

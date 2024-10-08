package com.instagram.urlhandlers.viewleadgenguidancehub;

import X.AnonymousClass7TG;
import X.DbT;
import X.W2F;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import java.util.HashMap;

public final class ViewLeadGenGuidanceHubUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.urlhandlers.viewleadgenguidancehub.ViewLeadGenGuidanceHubUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string == null || string.length() == 0) {
            finish();
            return;
        }
        Uri A09 = DbT.A09(string);
        HashMap A00 = W2F.A00(A09);
        String queryParameter = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter != null) {
            A00.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
        }
        W2F.A01(this, userSession, "com.bloks.www.ig.smb.lead_gen.lead_gen_guide", A00);
    }
}

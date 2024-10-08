package com.instagram.urlhandlers.bloksaymtmetaproengagementdeeplink;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.DbT;
import X.DbV;
import X.DbX;
import X.FFQ;
import X.Pxd;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

public final class BloksMetaProEngagementAndroidDeeplinkHandler extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.bloksaymtmetaproengagementdeeplink.BloksMetaProEngagementAndroidDeeplinkHandler, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksaymtmetaproengagementdeeplink.BloksMetaProEngagementAndroidDeeplinkHandler, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle bundleExtra;
        int A00 = AnonymousClass0fD.A00(2044079121);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra(Pxd.A00(13))) == null) {
            finish();
            i = 2069892403;
        } else {
            AnonymousClass0wW session = getSession();
            if (!(session instanceof UserSession)) {
                FFQ.A00().A00(this, bundleExtra, session);
            } else {
                String string = bundleExtra.getString("original_url");
                if (string == null) {
                    finish();
                    i = -535504333;
                } else {
                    Uri A09 = DbT.A09(string);
                    HashMap hashMap = new HashMap();
                    String queryParameter = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    0qQ.A0C(queryParameter, "null cannot be cast to non-null type kotlin.String");
                    hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                    String queryParameter2 = A09.getQueryParameter("lead_source");
                    0qQ.A0C(queryParameter2, "null cannot be cast to non-null type kotlin.String");
                    hashMap.put("lead_source", queryParameter2);
                    C309516Yo A0M = DbV.A0M(C46649DiU.A02(session, "com.bloks.www.ig.meta.pro.engagement", hashMap), this, session);
                    A0M.A0D = false;
                    A0M.A04();
                }
            }
            i = -100720020;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}

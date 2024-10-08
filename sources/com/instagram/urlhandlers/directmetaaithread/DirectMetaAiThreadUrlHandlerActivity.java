package com.instagram.urlhandlers.directmetaaithread;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass4D6;
import X.AnonymousClass7TE;
import X.AnonymousClass9B2;
import X.C15829UjC;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.JTR;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class DirectMetaAiThreadUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "direct_meta_ai_thread_url_handler";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.directmetaaithread.DirectMetaAiThreadUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.directmetaaithread.DirectMetaAiThreadUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1130232558);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1831998638;
        } else {
            super.onCreate(bundle);
            String string = A0A.getString("original_url");
            if (!(string == null || string.length() == 0)) {
                if (!(getSession() instanceof UserSession)) {
                    FFQ.A03(A0A, this);
                } else {
                    FragmentActivity A002 = C71172bH.A00();
                    DbS.A1X(A002);
                    FragmentActivity fragmentActivity = A002;
                    UserSession session = getSession();
                    DbS.A1Z(session);
                    UserSession userSession = session;
                    Uri A09 = DbT.A09(string);
                    String queryParameter = A09.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    AnonymousClass9B2.A04.A00(userSession, new C15829UjC(fragmentActivity, this, userSession, A09.getQueryParameter("prompt"), queryParameter, JTR.A0L()), (AnonymousClass4D6) null, 2);
                }
            }
            finish();
            i = -1436240291;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}

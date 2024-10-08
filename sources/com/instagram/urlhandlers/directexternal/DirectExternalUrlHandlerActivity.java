package com.instagram.urlhandlers.directexternal;

import X.08y;
import X.09i;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbS;
import X.DbT;
import X.DbU;
import X.E5H;
import X.FFQ;
import X.OW4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class DirectExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.content.ContextWrapper, android.app.Activity, com.instagram.urlhandlers.directexternal.DirectExternalUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-2007325575);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        08y r0 = 09i.A0A;
        0qQ.A0A(A0A);
        UserSession A04 = r0.A04(A0A);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            1WK A003 = FFQ.A00();
            AnonymousClass0wW r02 = this.A00;
            0qQ.A0A(r02);
            A003.A00(this, A0A, r02);
        } else {
            DbS.A1Z(A04);
            UserSession userSession = A04;
            Context baseContext = getBaseContext();
            0qQ.A07(baseContext);
            OW4 ow4 = new OW4(userSession, baseContext);
            if (ow4.A01()) {
                ow4.A00();
            } else {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, intent.getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
                E5H e5h = new E5H();
                e5h.setArguments(A0a);
                C309516Yo A0Q = DbU.A0Q(this, userSession);
                A0Q.A0D = false;
                A0Q.A0D(e5h);
                A0Q.A04();
            }
        }
        AnonymousClass0fD.A07(-1063657406, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

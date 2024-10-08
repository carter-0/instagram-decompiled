package com.instagram.urlhandlers.professionalsignupnuxexternal;

import X.0kR;
import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C48729EjE;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbX;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ProfessionalSignupNuxExternalUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, com.instagram.urlhandlers.professionalsignupnuxexternal.ProfessionalSignupNuxExternalUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(320878370);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        this.A00 = A0S;
        Bundle A0A = DbX.A0A(this);
        if (!(this.A00 instanceof UserSession)) {
            FFQ.A01(this, A0A, A0S);
        } else {
            DbS.A1Z(A0S);
            if (A0A != null) {
                AnonymousClass0Dg.A00(A0A, A0S);
                String stringExtra = getIntent().getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (stringExtra == null) {
                    stringExtra = "deep_link";
                }
                C48729EjE.A00();
                Intent A04 = DbU.A04(this);
                A0A.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, stringExtra);
                A0A.putBoolean("only_show_nux_screens", true);
                DbV.A1C(A04, 7, A0A);
                0kR.A07(this, A04, 11);
                finish();
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A07(-551730173, A002);
                throw A0y;
            }
        }
        AnonymousClass0fD.A07(-1391051839, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

package com.instagram.urlhandlers.businessconversionexternal;

import X.08y;
import X.09i;
import X.0Ic;
import X.0kR;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0BO;
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
import com.instagram.user.model.User;

public final class BusinessConversionExternalUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, com.instagram.urlhandlers.businessconversionexternal.BusinessConversionExternalUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A002 = AnonymousClass0fD.A00(-805269175);
        super.onCreate(bundle);
        UserSession A0S = DbS.A0S(this);
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            String str = null;
            String string = A06.getString("target_user_name", (String) null);
            if (string != null) {
                09i A003 = 08y.A00();
                synchronized (A003) {
                    User BNx = A003.A03.BNx(string);
                    String str2 = null;
                    if (BNx == null) {
                        userSession = null;
                    } else {
                        String id = BNx.getId();
                        0Ic r3 = A003.A05;
                        UserSession userSession2 = r3.A00;
                        if (userSession2 != null) {
                            str2 = userSession2.A06;
                        }
                        if (0qQ.A0K(id, str2)) {
                            userSession = r3.A00;
                        } else {
                            userSession = r3.A03(BNx, false);
                        }
                    }
                }
                User BNx2 = AnonymousClass0BO.A00(A0S).BNx(string);
                if (BNx2 != null) {
                    if (userSession != null) {
                        str = userSession.A06;
                    }
                    if (DbV.A1Z(BNx2, str)) {
                        A0S = userSession;
                    }
                }
                throw AnonymousClass7TE.A0z("Invalid target user name");
            }
        }
        this.A00 = A0S;
        Bundle A0A = DbX.A0A(this);
        AnonymousClass0wW r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            1WK A004 = FFQ.A00();
            AnonymousClass0wW r0 = this.A00;
            0qQ.A0A(r0);
            A004.A00(this, A0A, r0);
        } else {
            DbS.A1Z(r1);
            if (A0A != null) {
                AnonymousClass0Dg.A00(A0A, r1);
                C48729EjE.A00();
                Intent A04 = DbU.A04(this);
                A0A.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deep_link");
                A0A.putInt("intro_entry_position", 0);
                DbV.A1C(A04, 3, A0A);
                0kR.A07(this, A04, 11);
                finish();
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A07(644335758, A002);
                throw A0y;
            }
        }
        AnonymousClass0fD.A07(1193712406, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}

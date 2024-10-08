package com.instagram.canvas;

import X.0qQ;
import X.0s1;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass3GL;
import X.AnonymousClass7TE;
import X.C15295Ua1;
import X.C238833Dp;
import X.C340057kd;
import X.DbS;
import X.DbU;
import X.DbW;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

public final class CanvasActivity extends IgFragmentActivity {
    public UserSession A00;
    public C15295Ua1 A01;

    public final C340057kd getGnvGestureHandler() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            if (!AnonymousClass3GL.A02(userSession)) {
                return null;
            }
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                C340057kd A002 = C340057kd.A00(userSession2);
                0qQ.A07(A002);
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    C238833Dp A003 = C238833Dp.A00(userSession3);
                    0qQ.A07(A003);
                    A002.A03(A003);
                    A002.A02(A003);
                    return A002;
                }
            }
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBackPressed() {
        C15295Ua1 ua1 = this.A01;
        if (ua1 == null) {
            0qQ.A0F("canvasFragment");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ua1.onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.canvas.CanvasActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(1797511702);
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            UserSession A0U = DbS.A0U(A06);
            0qQ.A0B(A0U, 0);
            this.A00 = A0U;
            super.onCreate(bundle);
            setContentView((int) R.layout.activity_canvas);
            C15295Ua1 A0P = getSupportFragmentManager().A0P(R.id.layout_container_main);
            if (A0P != null) {
                this.A01 = A0P;
            } else {
                A06.putBoolean(AnonymousClass000.A00(2138), true);
                C15295Ua1 ua1 = new C15295Ua1();
                ua1.setArguments(A06);
                this.A01 = ua1;
                0s1 A0D = DbW.A0D(this);
                C15295Ua1 ua12 = this.A01;
                if (ua12 == null) {
                    0qQ.A0F("canvasFragment");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    A0D.A0A(ua12, R.id.layout_container_main);
                    A0D.A00();
                }
            }
            AnonymousClass0fD.A07(1443687882, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(184355600, A002);
        throw A0y;
    }
}

package X;

import com.facebook.systrace.Systrace;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.2ip  reason: invalid class name and case insensitive filesystem */
public final class C227212ip implements C227222iq {
    public CameraConfiguration A00;
    public final 2bB A01;

    public final void DU8(String str, float f) {
        0lp A002;
        AnonymousClass80Q r0;
        0qQ.A0B(str, 1);
        if (Systrace.A0E(1)) {
            0fS.A01("SwipeNavigationListener.onNewPositionStart", -1349551765);
        }
        try {
            2bB r3 = this.A01;
            r3.A0S.A02 = str;
            A002 = 0lq.A00("SwipeNavigationController.onNewPosition");
            if (f == -1.0f && str != "camera_action_bar_button_main_feed") {
                28D A003 = C348017xk.A00(str);
                AnonymousClass9PE A0A = r3.A0A();
                if (!(A0A == null || (r0 = A0A.A06) == null)) {
                    r0.A00.A0y.A00(A003);
                }
                C360908fL.A00(A003);
            }
            A002.close();
            if (Systrace.A0E(1)) {
                0fS.A00(1671919532);
                return;
            }
            return;
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1020199131);
            }
            throw th;
        }
        throw th;
    }

    public C227212ip(2bB r1) {
        this.A01 = r1;
    }
}

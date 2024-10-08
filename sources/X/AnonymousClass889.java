package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.889  reason: invalid class name */
public final class AnonymousClass889 {
    public C357028Wd A00;
    public AnonymousClass8VZ A01;
    public C356848Vl A02;
    public AnonymousClass8E5 A03;
    public AnonymousClass8D8 A04;
    public final Activity A05;
    public final 28D A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final AnonymousClass888 A09;
    public final C3499482o A0A;
    public final AnonymousClass80D A0B;

    public AnonymousClass889(Activity activity, 28D r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass888 r6, C3499582p r7, AnonymousClass80D r8) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(activity, 4);
        0qQ.A0B(userSession, 5);
        this.A06 = r3;
        this.A0B = r8;
        this.A05 = activity;
        this.A08 = userSession;
        this.A07 = r4;
        this.A09 = r6;
        this.A0A = r7.A02;
    }

    public static final void A00(AnonymousClass889 r2) {
        String str;
        C356848Vl r0 = r2.A02;
        if (r0 == null) {
            str = "visibilityControllerComponentProvider";
        } else if (r0.A00().A02 != 1) {
            C59689JTv.A0B(r2.A05, "import_failed");
            C357028Wd r02 = r2.A00;
            if (r02 != null) {
                r02.A00();
                return;
            }
            str = "backPressDelegate";
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(Medium medium) {
        C356848Vl r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("visibilityControllerComponentProvider");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A00().A02 != 1) {
            this.A0A.A08(C348017xk.A01(this.A06));
            LI5.A00(this.A05, medium, this.A08, new C40338AaX(this));
        }
    }
}

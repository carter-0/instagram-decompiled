package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.9ld  reason: invalid class name and case insensitive filesystem */
public final class C387079ld extends 0vM {
    public final /* synthetic */ C238663Ct A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387079ld(C238663Ct r7) {
        super("scrolling_speed_update", 1636287877, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C238663Ct r6 = this.A00;
        UserSession userSession = r6.A01;
        02m r7 = 02m.A0p;
        0qQ.A07(r7);
        r7.markerStart(424099727);
        String str = Build.MANUFACTURER;
        0qQ.A08(str);
        r7.markerAnnotate(424099727, "manufacturer", AnonymousClass7TF.A0j(str));
        double d = (double) C3731094a.A00(userSession).A00.A00.getFloat(002.A0T("scroll_speed", "Result", '_'), 1.0f);
        r7.markerAnnotate(424099727, "multiplier", d);
        r7.markerEnd(424099727, 2);
        11Z.A02(new C41100AoM(r6, d));
    }
}

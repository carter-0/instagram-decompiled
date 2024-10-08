package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HcC  reason: case insensitive filesystem */
public abstract class C55103HcC {
    public static final boolean A00(C266474Za r6, UserSession userSession, L70 l70, C63881LAk lAk) {
        boolean A1Y = C51970G9q.A1Y(lAk);
        if (r6 == null) {
            return A1Y;
        }
        boolean A1R = AnonymousClass7TF.A1R(((System.currentTimeMillis() - r6.A00) > l70.A00 ? 1 : ((System.currentTimeMillis() - r6.A00) == l70.A00 ? 0 : -1)));
        boolean z = true;
        AnonymousClass1Gh r0 = (AnonymousClass1Gh) 1Gc.A00(userSession).A00.get(AnonymousClass000.A00(1287));
        if (r0 != null) {
            boolean z2 = r0.A03;
            if (Boolean.valueOf(z2) != null) {
                z = !z2;
            }
        }
        if (A1R || !z) {
            return false;
        }
        return true;
    }
}

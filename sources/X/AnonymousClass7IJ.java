package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7IJ  reason: invalid class name */
public final class AnonymousClass7IJ {
    public static final List A01;
    public static final List A02;
    public final UserSession A00;

    public AnonymousClass7IJ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    static {
        2FW r3 = 2FW.A1g;
        2FW r2 = 2FW.A17;
        2FW r0 = 2FW.A1s;
        2FW r1 = 2FW.A1A;
        A01 = 0sr.A1P(new 2FW[]{r3, r2, r0, r1});
        A02 = 0sr.A1P(new 2FW[]{r3, r1});
    }

    public final boolean A00() {
        return 182.A06(0Tu.A05, this.A00, 36319858362752697L);
    }

    public final boolean A01(2FW r5) {
        if (00k.A0u(A02, r5) && !A00()) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36318307879491661L) || !182.A06(r2, userSession, 36316924900086478L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02(2FW r5, boolean z) {
        UserSession userSession;
        0Tu r2;
        long j;
        if (00k.A0u(A01, r5)) {
            boolean A002 = A00();
            if (z) {
                if (!A002) {
                    userSession = this.A00;
                    r2 = 0Tu.A05;
                    j = 36320906335036358L;
                }
            } else if (!A002) {
                userSession = this.A00;
                r2 = 0Tu.A05;
                j = 36316924900020941L;
            }
            if (!182.A06(r2, userSession, j)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

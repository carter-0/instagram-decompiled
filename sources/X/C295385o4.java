package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5o4  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C295385o4 {
    public static String A01(C267334bO r3, UserSession userSession) {
        User A2A;
        0qQ.A0B(userSession, 1);
        1Xj BPf = r3.BPf();
        boolean z = true;
        if (BPf == null || !BPf.A4j()) {
            z = false;
        }
        1Xj BPf2 = r3.BPf();
        if (z) {
            if (BPf2 == null) {
                return null;
            }
            A2A = BPf2.A0C.B9t();
        } else if (BPf2 == null) {
            return null;
        } else {
            A2A = BPf2.A2A(userSession);
        }
        if (A2A != null) {
            return A2A.getUsername();
        }
        return null;
    }

    public static 1iA A00(C267334bO r0) {
        1Xj BPf = r0.BPf();
        if (BPf != null) {
            return BPf.BR7();
        }
        return null;
    }

    public static boolean A02(C267334bO r0) {
        1Xj BPf = r0.BPf();
        if (BPf != null) {
            return BPf.A4Y();
        }
        return false;
    }
}

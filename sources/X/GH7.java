package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GH7 {
    /* JADX WARNING: type inference failed for: r1v3, types: [X.GlH, java.lang.Object] */
    public static final boolean A00(C267324bN r9, UserSession userSession) {
        boolean z;
        String A1A;
        boolean CcK;
        1Xj r0;
        if (A01(userSession)) {
            return false;
        }
        boolean z2 = false;
        if (r9.CcK() && !r9.A0E() && !r9.A0F() && (r0 = r9.A02) != null && r0.CeS()) {
            z2 = true;
        }
        boolean z3 = z;
        if (182.A06(0Tu.A06, userSession, 2342165925593361057L)) {
            z = false;
            if (!r9.CcK() || !r9.A06().A0t) {
                CcK = false;
            } else {
                CcK = true;
                if (z3) {
                    z = true;
                }
            }
            A1A = G9t.A1A(r9);
        } else {
            A1A = G9t.A1A(r9);
            CcK = r9.CcK();
        }
        Boolean valueOf = Boolean.valueOf(CcK);
        Boolean A0l = DbT.A0l(z);
        if (A1A != null) {
            ConcurrentHashMap concurrentHashMap = C55136Hck.A00(userSession).A00;
            C53269GlH glH = (C53269GlH) concurrentHashMap.get(A1A);
            C53269GlH glH2 = glH;
            if (glH == null) {
                ? obj = new Object();
                obj.A02 = false;
                obj.A01 = false;
                obj.A00 = null;
                glH2 = obj;
            }
            if (valueOf != null) {
                glH2.A01 = valueOf.booleanValue();
            }
            if (A0l != null) {
                glH2.A02 = A0l.booleanValue();
            }
            concurrentHashMap.put(A1A, glH2);
        }
        return z;
    }

    public static final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A06;
        if (!182.A06(r2, userSession, 36322916379404959L)) {
            return true;
        }
        if (182.A06(r2, userSession, 36322916379798179L) || C52368GPp.A00(userSession) || 182.A06(C51968G9o.A0b(userSession), userSession, 36322916380125860L) || 182.A06(C51968G9o.A0b(userSession), userSession, 36322916380322470L)) {
            return false;
        }
        return true;
    }
}

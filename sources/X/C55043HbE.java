package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HbE  reason: case insensitive filesystem */
public abstract class C55043HbE {
    public static final boolean A00(UserSession userSession, C54077Gz1 gz1) {
        Integer num;
        C42049BFc bFc = gz1.A03;
        if (bFc != null) {
            num = Integer.valueOf(bFc.A00);
        } else {
            num = null;
        }
        if (AnonymousClass59V.A00.A01(num)) {
            if (gz1.A0B.size() != 1) {
                return false;
            }
            0Tu r3 = 0Tu.A06;
            if (182.A06(r3, userSession, 36312887633905033L) || 182.A06(r3, userSession, 36312887639999947L)) {
                return true;
            }
            return false;
        } else if (num == null || num.intValue() != 7) {
            return false;
        } else {
            return DbY.A1Z(0Tu.A06, userSession, 36312887634691473L);
        }
    }
}

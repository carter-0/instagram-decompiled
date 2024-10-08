package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.7LW  reason: invalid class name */
public final class AnonymousClass7LW {
    public final boolean A01(UserSession userSession, 2Er r6) {
        Integer Bjj;
        if (!(!r6.BRZ().isEmpty()) || (Bjj = ((User) r6.BRZ().get(0)).Bjj()) == null || Bjj.intValue() != 5) {
            return false;
        }
        if ((A02(userSession, r6) || A03(userSession, r6)) && !182.A06(0Tu.A05, userSession, 36316409504665955L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0.A2A() != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(com.instagram.common.session.UserSession r4, X.2Er r5) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r4, r0)
            boolean r0 = r3.A00(r4, r5)
            if (r0 == 0) goto L_0x0044
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316409504600418(0x810595000a1162, double:3.029981832928231E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x003d
            X.3sy r1 = r5.BJz()
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x003d
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A04(r1)
            if (r1 == 0) goto L_0x003d
            X.2Dm r0 = X.2L2.A00(r4)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r0 = X.2Dr.A03(r0, r1)
            if (r0 == 0) goto L_0x003d
            com.instagram.user.model.User r0 = r0.BZK()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.A2A()
            if (r0 != 0) goto L_0x0044
        L_0x003d:
            boolean r1 = X.C272094k5.A00(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LW.A02(com.instagram.common.session.UserSession, X.2Er):boolean");
    }

    public final boolean A03(UserSession userSession, 2Er r5) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(userSession, 1);
        if (!A00(userSession, r5) || 0eE.A00(userSession).A00().A0J() == 16V.A05 || !182.A06(0Tu.A06, userSession, 36329616528392411L)) {
            return false;
        }
        return true;
    }

    private final boolean A00(UserSession userSession, 2Er r6) {
        DirectThreadKey A04;
        AnonymousClass3U9 A03;
        if (!r6.CUG() && !(r6.BJz() instanceof MsysThreadId) && !r6.CJt() && !r6.CJZ() && !AnonymousClass48O.A06(Integer.valueOf(r6.C6a())) && (!r6.BRZ().isEmpty()) && ((User) r6.BRZ().get(0)).A0J() != 16V.A05 && ((User) r6.BRZ().get(0)).A2R() && r6.CBk() == null) {
            if (!182.A06(0Tu.A05, userSession, 36316409504534881L)) {
                return true;
            }
            C254743sy BJz = r6.BJz();
            if (!(BJz instanceof DirectThreadKey) || (A04 = C66647MaG.A04(BJz)) == null || (A03 = 2Dr.A03(2L2.A00(userSession), A04)) == null) {
                return true;
            }
            User BZK = A03.BZK();
            C254703su BLG = A03.BLG();
            if (BLG == null || BZK == null || !BLG.A1u.equals(BZK.getId())) {
                return true;
            }
        }
        return false;
    }
}

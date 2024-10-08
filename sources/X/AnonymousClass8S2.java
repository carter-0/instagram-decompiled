package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.8S2  reason: invalid class name */
public final class AnonymousClass8S2 {
    public final UserSession A00;
    public final AnonymousClass8S1 A01;
    public final C352538Dt A02;

    public AnonymousClass8S2(UserSession userSession, AnonymousClass8S1 r3, C352538Dt r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r5 = this;
            X.8S1 r2 = r5.A01
            boolean r0 = r2.A02()
            r3 = 0
            if (r0 != 0) goto L_0x003b
            X.8Rz r4 = r2.A00
            X.8Fl r0 = r4.A0C
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = r2.A01()
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x003b
            r0 = 3
            if (r1 == r0) goto L_0x003b
        L_0x0021:
            X.8Yz r0 = r4.A0A
            X.80m r0 = r0.A09
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            X.8aL r0 = X.C358088aL.A0C
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x003b
            X.8BA r0 = r4.A0B
            X.89Y r0 = r0.A0D
            if (r0 == 0) goto L_0x0056
        L_0x003b:
            return r3
        L_0x003c:
            X.4yO r0 = r2.A00()
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0058
            X.8Hx r0 = r4.A0O
            X.8IY r2 = r0.AuT()
            X.8IW r1 = r2.A00
            X.8IW r0 = X.AnonymousClass8IW.EMPTY
            if (r1 != r0) goto L_0x003b
            X.8IX r1 = r2.A01
            X.8IX r0 = X.AnonymousClass8IX.CAMERA_IDLE
            if (r1 != r0) goto L_0x003b
        L_0x0056:
            r3 = 1
            return r3
        L_0x0058:
            X.80D r0 = r4.A0F
            boolean r0 = r0.A3K
            if (r0 != 0) goto L_0x003b
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x003b
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S2.A00():boolean");
    }

    public final boolean A01() {
        C279284yO A002;
        AnonymousClass8S1 r1 = this.A01;
        C355948Rz r3 = r1.A00;
        if (!r3.A0F.A3Q || (A002 = r1.A00()) == AnonymousClass80L.A00 || A002 == C3494080g.A00 || A002 == AnonymousClass80K.A00) {
            return false;
        }
        if (!(A002 instanceof AnonymousClass80O) || r3.A0O.AuT().A01 == AnonymousClass8IX.CAMERA_IDLE) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        int intValue;
        AnonymousClass8S1 r2 = this.A01;
        C355948Rz r3 = r2.A00;
        if (!r3.A0C.A0V() ? !((Set) r3.A0A.A09.A00).contains(C358088aL.A0C) || (r3.A0B.A0D == null && !r3.A01) : !((intValue = r2.A01().intValue()) == 1 || intValue == 3)) {
            if (r2.A02()) {
                return false;
            }
            return true;
        }
        return false;
    }
}

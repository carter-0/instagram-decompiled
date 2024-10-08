package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Ka  reason: invalid class name and case insensitive filesystem */
public abstract class C329737Ka {
    public static final C329757Kc A01(UserSession userSession, AnonymousClass7SD r9, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        if (r9 == null) {
            return C329747Kb.A00;
        }
        boolean z2 = r9.A0r;
        boolean z3 = r9.A0y;
        boolean z4 = r9.A0o;
        return A02(userSession2, r9.A0H, r9.A0b, z, z2, z3, z4, r9.A1G);
    }

    public static final C329757Kc A02(UserSession userSession, C242373Tu r2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C329757Kc r0;
        0qQ.A0B(list, 5);
        if (z) {
            if (C308556Us.A0W(list, z2, z3, z4, z5) && C308556Us.A0G(userSession, r2)) {
                r0 = C72294P0l.A00;
                return r0;
            } else if (C308556Us.A0W(list, z2, z3, z4, z5) && C308556Us.A0H(userSession, r2)) {
                r0 = AnonymousClass9O3.A00;
                return r0;
            }
        }
        r0 = C329747Kb.A00;
        return r0;
    }

    public static final C329757Kc A03(UserSession userSession, AnonymousClass2Ep r12) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        boolean A06 = C66640Ma9.A06(r12.BRZ(), r12.isPending(), r12.CUG());
        boolean CUG = r12.CUG();
        boolean CVr = r12.CVr();
        boolean COb = r12.COb();
        List BRZ = r12.BRZ();
        ArrayList arrayList = new ArrayList();
        for (Object next : BRZ) {
            if (!0qQ.A0K(AnonymousClass3ZA.A00((User) next), userSession2.A06)) {
                arrayList.add(next);
            }
        }
        return A02(userSession2, r12.AiM(), arrayList, true, CUG, CVr, COb, A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r3 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C329757Kc A00(com.instagram.common.session.UserSession r2, X.AnonymousClass7SD r3, boolean r4) {
        /*
            if (r3 == 0) goto L_0x0030
            X.3Tu r0 = r3.A0H
        L_0x0004:
            boolean r0 = X.C308556Us.A0I(r2, r0)
            r1 = 1
            if (r0 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x002d
            X.4li r0 = r3.A0N
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x001c
            X.P0l r0 = X.C72294P0l.A00
        L_0x0017:
            X.7Kc r0 = (X.C329757Kc) r0
            return r0
        L_0x001a:
            if (r3 == 0) goto L_0x002d
        L_0x001c:
            boolean r0 = X.C308556Us.A0D(r2, r3, r4)
            if (r0 == 0) goto L_0x002d
            X.4li r0 = r3.A0N
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x002d
            X.9O3 r0 = X.AnonymousClass9O3.A00
            goto L_0x0017
        L_0x002d:
            X.7Kb r0 = X.C329747Kb.A00
            goto L_0x0017
        L_0x0030:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329737Ka.A00(com.instagram.common.session.UserSession, X.7SD, boolean):X.7Kc");
    }
}

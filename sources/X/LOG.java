package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class LOG {
    public final 2Fk A00;
    public final AnonymousClass2Fj A01;
    public final UserSession A02;
    public final AnonymousClass8IU A03;
    public final Map A04 = AnonymousClass7TE.A1E();
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Map A06 = AnonymousClass7TE.A1E();

    public LOG(UserSession userSession, AnonymousClass8IU r3) {
        this.A02 = userSession;
        this.A03 = r3;
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A01 = A0K;
        this.A00 = A0K;
    }

    public static final Object A00(LOG log, String str, AnonymousClass4D7 r7) {
        1IW A0q = C51973G9u.A0q(r7);
        UserSession userSession = log.A02;
        AnonymousClass1CO A002 = AnonymousClass1CO.A00();
        0qQ.A07(A002);
        LDi lDi = new LDi(A002, userSession, AnonymousClass000.A00(3312));
        lDi.A00 = new C65011Llo(str, A0q);
        A0q.CO0(C66336MNt.A00);
        lDi.A00(str);
        return A0q.A0E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
        if (X.LQE.A01(r0) == false) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.util.List r14, java.util.Map r15, java.util.Map r16) {
        /*
            r13 = this;
            X.AnonymousClass7TG.A1N(r15, r14)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r14.iterator()
            r9 = 0
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r5 = r12.next()
            int r11 = r9 + 1
            if (r9 >= 0) goto L_0x0022
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            X.51N r5 = (X.AnonymousClass51N) r5
            boolean r0 = r5 instanceof X.KN4
            if (r0 == 0) goto L_0x002f
            X.0sn r4 = X.0sn.A00
        L_0x002a:
            X.018.A16(r4, r6)
            r9 = r11
            goto L_0x000c
        L_0x002f:
            boolean r0 = r5 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x012c
            r7 = r5
            X.51M r7 = (X.AnonymousClass51M) r7
            int r1 = r7.A09
            int r0 = r7.A08
            X.2HY r8 = X.C229632nm.A0C(r1, r0)
            float r4 = r7.A00
            java.util.Iterator r2 = r14.iterator()
            r3 = 0
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r1 = r2.next()
            X.51N r1 = (X.AnonymousClass51N) r1
            int r0 = r14.indexOf(r1)
            if (r0 >= r9) goto L_0x005d
            int r0 = r1.BrP()
        L_0x005b:
            int r3 = r3 + r0
            goto L_0x0045
        L_0x005d:
            r0 = 0
            goto L_0x005b
        L_0x005f:
            int r0 = r7.A09
            int r3 = r3 - r0
            java.lang.Object r0 = r15.get(r5)
            X.JwF r0 = (X.C61077JwF) r0
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00e2
            java.util.Iterator r2 = r0.iterator()
        L_0x0074:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.GNY r0 = (X.GNY) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x0074
        L_0x0089:
            X.GNY r1 = (X.GNY) r1
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x009b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r1.next()
            X.UOk r0 = (X.C15092UOk) r0
            r0.A03 = r3
            r0.A01 = r4
            r2.add(r0)
            goto L_0x009b
        L_0x00af:
            r1 = 0
            goto L_0x0089
        L_0x00b1:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r2.iterator()
        L_0x00b9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r7 = r10.next()
            r9 = r7
            X.UOk r9 = (X.C15092UOk) r9
            int r3 = r8.A00
            int r2 = r8.A01
            int r0 = r9.A04
            float r0 = (float) r0
            float r1 = r9.A01
            float r0 = r0 / r1
            int r0 = (int) r0
            if (r3 > r0) goto L_0x00b9
            if (r0 > r2) goto L_0x00b9
            int r0 = r9.A02
            float r0 = (float) r0
            float r0 = r0 / r1
            int r0 = (int) r0
            if (r3 > r0) goto L_0x00b9
            if (r0 > r2) goto L_0x00b9
            r4.add(r7)
            goto L_0x00b9
        L_0x00e2:
            X.0sn r4 = X.0sn.A00
        L_0x00e4:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r4.iterator()
        L_0x00ec:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r2 = r8.next()
            X.UOk r2 = (X.C15092UOk) r2
            java.util.Map r7 = r13.A04
            java.lang.String r0 = r2.A05
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = r2.A05
            java.lang.String r0 = X.DbT.A11(r0, r7)
            if (r0 == 0) goto L_0x0111
            boolean r0 = X.LQE.A01(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0112
        L_0x0111:
            r1 = 0
        L_0x0112:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = r2.A05
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0122
        L_0x011e:
            X.JTU.A1B(r2, r3)
            goto L_0x00ec
        L_0x0122:
            if (r1 == 0) goto L_0x00ec
            goto L_0x011e
        L_0x0125:
            r0 = r16
            r0.put(r5, r3)
            goto L_0x002a
        L_0x012c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0131:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOG.A01(java.util.List, java.util.Map, java.util.Map):java.util.List");
    }
}

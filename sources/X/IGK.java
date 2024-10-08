package X;

import java.util.List;

public final class IGK implements AnonymousClass5RD {
    public boolean A00;
    public final IEM A01;

    public IGK(IEM iem) {
        this.A01 = iem;
    }

    public final int CmW(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CmV(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CmV(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    public final int CmZ(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CmY(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CmY(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r10.A00 == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cnx(X.C268004cb r11, java.util.List r12, long r13) {
        /*
            r10 = this;
            java.util.ArrayList r6 = X.C51970G9q.A0m(r12)
            int r2 = r12.size()
            r5 = 0
            r1 = 0
        L_0x000a:
            if (r1 >= r2) goto L_0x001c
            java.lang.Object r0 = r12.get(r1)
            X.4ci r0 = (X.C268074ci) r0
            X.4cY r0 = r0.Cnz(r13)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001c:
            boolean r0 = r6.isEmpty()
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0055
            r9 = r7
        L_0x0025:
            X.4cY r9 = (X.C267974cY) r9
            if (r9 == 0) goto L_0x0053
            int r9 = r9.A01
        L_0x002b:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0077
            java.lang.Object r7 = r6.get(r5)
            r0 = r7
            X.4cY r0 = (X.C267974cY) r0
            int r4 = r0.A00
            int r3 = X.C51970G9q.A0A(r6)
            if (r8 > r3) goto L_0x0077
            r2 = 1
        L_0x0041:
            java.lang.Object r1 = r6.get(r2)
            r0 = r1
            X.4cY r0 = (X.C267974cY) r0
            int r0 = r0.A00
            if (r4 >= r0) goto L_0x004e
            r7 = r1
            r4 = r0
        L_0x004e:
            if (r2 == r3) goto L_0x0077
            int r2 = r2 + 1
            goto L_0x0041
        L_0x0053:
            r9 = 0
            goto L_0x002b
        L_0x0055:
            java.lang.Object r9 = r6.get(r5)
            r0 = r9
            X.4cY r0 = (X.C267974cY) r0
            int r4 = r0.A01
            int r3 = X.C51970G9q.A0A(r6)
            if (r8 > r3) goto L_0x0025
            r2 = 1
        L_0x0065:
            java.lang.Object r1 = r6.get(r2)
            r0 = r1
            X.4cY r0 = (X.C267974cY) r0
            int r0 = r0.A01
            if (r4 >= r0) goto L_0x0072
            r9 = r1
            r4 = r0
        L_0x0072:
            if (r2 == r3) goto L_0x0025
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0077:
            X.4cY r7 = (X.C267974cY) r7
            if (r7 == 0) goto L_0x007d
            int r5 = r7.A00
        L_0x007d:
            boolean r0 = r11.CWf()
            if (r0 == 0) goto L_0x009f
            r10.A00 = r8
        L_0x0085:
            X.IEM r0 = r10.A01
            X.5Oz r3 = r0.A01
            long r0 = X.C289155d7.A00(r9, r5)
            X.5cr r2 = new X.5cr
            r2.<init>(r0)
            r3.Epw(r2)
        L_0x0095:
            r0 = 2
            X.J6G r0 = X.J6G.A00(r6, r0)
            X.5d6 r0 = X.C51969G9p.A0a(r11, r0, r9, r5)
            return r0
        L_0x009f:
            boolean r0 = r10.A00
            if (r0 != 0) goto L_0x0095
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IGK.Cnx(X.4cb, java.util.List, long):X.5d6");
    }

    public final int CoP(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CoO(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CoO(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }

    public final int CoS(C268014cc r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(G9w.A0J(list, 0).CoR(i));
        int A06 = C51966G9m.A06(list);
        int i2 = 1;
        if (1 <= A06) {
            while (true) {
                valueOf = C51975G9x.A0d(valueOf, G9w.A0J(list, i2).CoR(i));
                if (i2 == A06) {
                    break;
                }
                i2++;
            }
        }
        return C51967G9n.A04(valueOf, 0);
    }
}

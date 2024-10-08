package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.7sV  reason: invalid class name and case insensitive filesystem */
public final class C344837sV implements C344847sW, C344777sP {
    public final C344857sX A00 = new C344857sX();
    public final C344867sY A01 = new C344867sY();
    public final HashMap A02 = new HashMap();

    public final void E4c(C344907sc r2) {
        E4d(r2, (C345237tA) null);
    }

    public final void EBc(C345237tA r5, C344877sZ r6) {
        C344857sX r0 = this.A00;
        C345787u5 A002 = C344857sX.A00(r0, r5);
        if (A002 == null) {
            A002 = new C345787u5(r5);
            r0.A00.A01(A002);
        }
        A002.A01.add(r6);
        C344867sY r3 = this.A01;
        if (r6.A02) {
            int ordinal = r6.ordinal();
            r3.A02[ordinal] = true;
            C344887sa[] r1 = r3.A01;
            if (r1[ordinal] != null && r3.A00.get()) {
                r1[ordinal].ARH();
            }
        }
        C344907sc r02 = (C344907sc) this.A02.get(r6);
        if (r02 != null) {
            r5.Ddr(r02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r3 = r8.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FIu(X.C345237tA r10) {
        /*
            r9 = this;
            X.7sX r6 = r9.A00
            X.7u5 r1 = X.C344857sX.A00(r6, r10)
            if (r1 == 0) goto L_0x0012
            java.util.HashSet r0 = r1.A01
            r0.clear()
            X.81j r0 = r6.A00
            r0.A02(r1)
        L_0x0012:
            X.7sZ[] r7 = X.C344877sZ.values()
            int r5 = r7.length
            r4 = 0
        L_0x0018:
            if (r4 >= r5) goto L_0x0057
            r8 = r7[r4]
            X.81j r0 = r6.A00
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0038
            java.lang.Object r0 = r3.get(r1)
            X.7u5 r0 = (X.C345787u5) r0
            java.util.HashSet r0 = r0.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0054
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0038:
            X.7sY r1 = r9.A01
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0054
            int r3 = r8.ordinal()
            X.7sa[] r0 = r1.A01
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0054
            boolean[] r1 = r1.A02
            boolean r0 = r1[r3]
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r1[r3] = r0
            r2.APC()
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344837sV.FIu(X.7tA):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r3 = r6.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FIv(X.C345237tA r5, X.C344877sZ r6) {
        /*
            r4 = this;
            X.7sX r2 = r4.A00
            X.7u5 r1 = X.C344857sX.A00(r2, r5)
            if (r1 == 0) goto L_0x0018
            java.util.HashSet r0 = r1.A01
            r0.remove(r6)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0018
            X.81j r0 = r2.A00
            r0.A02(r1)
        L_0x0018:
            X.81j r0 = r2.A00
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0021:
            if (r1 >= r2) goto L_0x0034
            java.lang.Object r0 = r3.get(r1)
            X.7u5 r0 = (X.C345787u5) r0
            java.util.HashSet r0 = r0.A01
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x0050
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0034:
            X.7sY r1 = r4.A01
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0050
            int r3 = r6.ordinal()
            X.7sa[] r0 = r1.A01
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0050
            boolean[] r1 = r1.A02
            boolean r0 = r1[r3]
            if (r0 == 0) goto L_0x0050
            r0 = 0
            r1[r3] = r0
            r2.APC()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344837sV.FIv(X.7tA, X.7sZ):void");
    }

    public final void E4d(C344907sc r7, C345237tA r8) {
        C344877sZ CAG = r7.CAG();
        if (CAG.A00) {
            this.A02.put(CAG, r7);
        }
        C344857sX r1 = this.A00;
        if (r1.A01.get()) {
            List list = r1.A00.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C345787u5 r12 = (C345787u5) list.get(i);
                if ((r8 == null || r8 == r12.A00) && r12.A01.contains(CAG)) {
                    r12.A00.Ddr(r7);
                }
            }
        }
    }
}

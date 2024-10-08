package X;

import java.util.Arrays;
import java.util.List;

public final class SPM {
    public static final SPM A02 = new SPM("COMPOSITION");
    public C13688Tf5 A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SPM spm = (SPM) obj;
            if (this.A01.equals(spm.A01)) {
                C13688Tf5 tf5 = this.A00;
                C13688Tf5 tf52 = spm.A00;
                if (tf5 != null) {
                    return tf5.equals(tf52);
                }
                return tf52 == null;
            }
        }
        return false;
    }

    public final int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!AnonymousClass7TE.A19(list, i).equals("**")) {
                return 1;
            }
            if (i == DbT.A02(list, 1) || !AnonymousClass7TE.A19(list, i + 1).equals(str)) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1.equals("*") != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            int r0 = r3.size()
            r6 = 0
            if (r9 >= r0) goto L_0x0048
            int r0 = r3.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r4 = X.AnonymousClass7TF.A1S(r9, r0)
            java.lang.String r1 = X.AnonymousClass7TE.A19(r3, r9)
            java.lang.String r2 = "**"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "*"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            if (r4 != 0) goto L_0x0045
            int r1 = r3.size()
            int r1 = r1 + -2
            if (r9 != r1) goto L_0x0048
            java.lang.Object r1 = X.C66582MXn.A0r(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0048
        L_0x0045:
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            return r6
        L_0x0049:
            if (r4 != 0) goto L_0x0081
            int r1 = r9 + 1
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r1)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0072
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 == r0) goto L_0x0047
            int r0 = r3.size()
            int r0 = r0 + -3
            if (r9 != r0) goto L_0x0048
            java.lang.Object r0 = X.C66582MXn.A0r(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r2)
            goto L_0x0045
        L_0x0072:
            int r0 = X.DbT.A02(r3, r5)
            if (r1 < r0) goto L_0x0048
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r1)
            boolean r0 = r0.equals(r8)
            return r0
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPM.A01(java.lang.String, int):boolean");
    }

    public final boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size() || (!AnonymousClass7TE.A19(list, i).equals(str) && !AnonymousClass7TE.A19(list, i).equals("**") && !AnonymousClass7TE.A19(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public final boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        if (i < DbT.A02(list, 1) || AnonymousClass7TE.A19(list, i).equals("**")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + C51971G9r.A0E(this.A00);
    }

    public SPM(SPM spm) {
        this.A01 = AnonymousClass7TE.A1D(spm.A01);
        this.A00 = spm.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("KeyPath{keys=");
        A1A.append(this.A01);
        A1A.append(",resolved=");
        A1A.append(AnonymousClass7TF.A1V(this.A00));
        return Pxg.A0x(A1A);
    }

    public SPM(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}

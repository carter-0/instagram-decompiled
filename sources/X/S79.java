package X;

import com.google.common.collect.Multisets$ImmutableEntry;

public abstract class S79 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (X.2PP.A00(r5.A01, r2.A06[r4]) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.R0z
            if (r0 == 0) goto L_0x0016
            r1 = r6
            X.R0z r1 = (X.R0z) r1
            X.SU9 r2 = r1.A00
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0015
            com.google.common.collect.TreeMultiset r1 = r1.A01
            java.lang.Object r0 = r2.A08
            int r0 = r1.AKq(r0)
        L_0x0015:
            return r0
        L_0x0016:
            boolean r0 = r6 instanceof X.R10
            if (r0 == 0) goto L_0x0049
            r5 = r6
            X.R10 r5 = (X.R10) r5
            int r4 = r5.A00
            r3 = -1
            if (r4 == r3) goto L_0x0034
            X.SK2 r2 = r5.A02
            int r0 = r2.A02
            if (r4 >= r0) goto L_0x0034
            java.lang.Object r1 = r5.A01
            java.lang.Object[] r0 = r2.A06
            r0 = r0[r4]
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 != 0) goto L_0x003e
        L_0x0034:
            X.SK2 r2 = r5.A02
            java.lang.Object r0 = r5.A01
            int r0 = r2.A05(r0)
            r5.A00 = r0
        L_0x003e:
            int r1 = r5.A00
            if (r1 != r3) goto L_0x0044
            r0 = 0
            return r0
        L_0x0044:
            int[] r0 = r2.A05
            r0 = r0[r1]
            return r0
        L_0x0049:
            r0 = r6
            com.google.common.collect.Multisets$ImmutableEntry r0 = (com.google.common.collect.Multisets$ImmutableEntry) r0
            int r0 = r0.count
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S79.A00():int");
    }

    public final Object A01() {
        if (this instanceof R0z) {
            return ((R0z) this).A00.A08;
        }
        if (this instanceof R10) {
            return ((R10) this).A01;
        }
        return ((Multisets$ImmutableEntry) this).element;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S79)) {
            return false;
        }
        S79 s79 = (S79) obj;
        if (A00() != s79.A00() || !2PP.A00(A01(), s79.A01())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(A01()) ^ A00();
    }

    public final String toString() {
        String valueOf = String.valueOf(A01());
        int A00 = A00();
        if (A00 != 1) {
            return 002.A0b(valueOf, " x ", A00);
        }
        return valueOf;
    }
}

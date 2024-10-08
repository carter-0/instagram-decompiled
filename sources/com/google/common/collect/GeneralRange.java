package com.google.common.collect;

import X.17k;
import X.2PP;
import X.AnonymousClass7TE;
import X.C51967G9n;
import X.Dba;
import X.Pxf;
import java.io.Serializable;
import java.util.Comparator;

public final class GeneralRange implements Serializable {
    public final Comparator comparator;
    public final boolean hasLowerBound;
    public final boolean hasUpperBound;
    public final BoundType lowerBoundType;
    public final Object lowerEndpoint;
    public final BoundType upperBoundType;
    public final Object upperEndpoint;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r10.upperBoundType == com.google.common.collect.BoundType.OPEN) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r10.lowerBoundType == com.google.common.collect.BoundType.OPEN) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.GeneralRange A00(com.google.common.collect.GeneralRange r10) {
        /*
            r9 = this;
            java.util.Comparator r1 = r9.comparator
            java.util.Comparator r0 = r10.comparator
            boolean r0 = r1.equals(r0)
            X.17k.A0E(r0)
            boolean r7 = r9.hasLowerBound
            java.lang.Object r4 = r9.lowerEndpoint
            com.google.common.collect.BoundType r2 = r9.lowerBoundType
            if (r7 != 0) goto L_0x005f
            boolean r7 = r10.hasLowerBound
        L_0x0015:
            java.lang.Object r4 = r10.lowerEndpoint
            com.google.common.collect.BoundType r2 = r10.lowerBoundType
        L_0x0019:
            boolean r8 = r9.hasUpperBound
            java.lang.Object r5 = r9.upperEndpoint
            com.google.common.collect.BoundType r3 = r9.upperBoundType
            if (r8 != 0) goto L_0x0048
            boolean r8 = r10.hasUpperBound
        L_0x0023:
            java.lang.Object r5 = r10.upperEndpoint
            com.google.common.collect.BoundType r3 = r10.upperBoundType
        L_0x0027:
            if (r7 == 0) goto L_0x0040
            if (r8 == 0) goto L_0x0040
            java.util.Comparator r0 = r9.comparator
            int r0 = r0.compare(r4, r5)
            if (r0 > 0) goto L_0x003b
            if (r0 != 0) goto L_0x0040
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r2 != r0) goto L_0x0040
            if (r3 != r0) goto L_0x0040
        L_0x003b:
            com.google.common.collect.BoundType r2 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r3 = com.google.common.collect.BoundType.CLOSED
            r4 = r5
        L_0x0040:
            java.util.Comparator r6 = r9.comparator
            com.google.common.collect.GeneralRange r1 = new com.google.common.collect.GeneralRange
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0048:
            boolean r0 = r10.hasUpperBound
            if (r0 == 0) goto L_0x0027
            java.util.Comparator r1 = r9.comparator
            java.lang.Object r0 = r10.upperEndpoint
            int r0 = r1.compare(r5, r0)
            if (r0 > 0) goto L_0x0023
            if (r0 != 0) goto L_0x0027
            com.google.common.collect.BoundType r1 = r10.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x0027
            goto L_0x0023
        L_0x005f:
            boolean r0 = r10.hasLowerBound
            if (r0 == 0) goto L_0x0019
            java.util.Comparator r1 = r9.comparator
            java.lang.Object r0 = r10.lowerEndpoint
            int r0 = r1.compare(r4, r0)
            if (r0 < 0) goto L_0x0015
            if (r0 != 0) goto L_0x0019
            com.google.common.collect.BoundType r1 = r10.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x0019
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A00(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasUpperBound
            r4 = 0
            if (r0 != 0) goto L_0x0006
            return r4
        L_0x0006:
            java.lang.Object r1 = r5.upperEndpoint
            java.util.Comparator r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 > 0) goto L_0x0015
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            com.google.common.collect.BoundType r1 = r5.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x001d
            r4 = 1
        L_0x001d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A02(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.hasLowerBound
            r4 = 0
            if (r0 != 0) goto L_0x0006
            return r4
        L_0x0006:
            java.lang.Object r1 = r5.lowerEndpoint
            java.util.Comparator r0 = r5.comparator
            int r0 = r0.compare(r6, r1)
            r3 = 1
            if (r0 < 0) goto L_0x0015
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            com.google.common.collect.BoundType r1 = r5.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x001d
            r4 = 1
        L_0x001d:
            r2 = r2 & r4
            r2 = r2 | r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.A03(java.lang.Object):boolean");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        if (!this.comparator.equals(generalRange.comparator) || this.hasLowerBound != generalRange.hasLowerBound || this.hasUpperBound != generalRange.hasUpperBound || !this.lowerBoundType.equals(generalRange.lowerBoundType) || !this.upperBoundType.equals(generalRange.upperBoundType) || !2PP.A00(this.lowerEndpoint, generalRange.lowerEndpoint) || !2PP.A00(this.upperEndpoint, generalRange.upperEndpoint)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType);
    }

    public GeneralRange(BoundType boundType, BoundType boundType2, Object obj, Object obj2, Comparator comparator2, boolean z, boolean z2) {
        comparator2.getClass();
        this.comparator = comparator2;
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = obj;
        boundType.getClass();
        this.lowerBoundType = boundType;
        this.upperEndpoint = obj2;
        boundType2.getClass();
        this.upperBoundType = boundType2;
        if (z) {
            comparator2.compare(obj, obj);
        }
        if (z2) {
            comparator2.compare(obj2, obj2);
        }
        if (z && z2) {
            int compare = comparator2.compare(obj, obj2);
            boolean z3 = true;
            17k.A09(obj, obj2, "lowerEndpoint (%s) > upperEndpoint (%s)", Dba.A1U(compare));
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                17k.A0E(z3);
            }
        }
    }

    public final boolean A01(Object obj) {
        if (A03(obj) || A02(obj)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        Object obj2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.comparator);
        A1A.append(":");
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = '(';
        if (boundType == boundType2) {
            c = '[';
        }
        A1A.append(c);
        if (this.hasLowerBound) {
            obj = this.lowerEndpoint;
        } else {
            obj = "-∞";
        }
        A1A.append(obj);
        A1A.append(',');
        if (this.hasUpperBound) {
            obj2 = this.upperEndpoint;
        } else {
            obj2 = "∞";
        }
        A1A.append(obj2);
        char c2 = ')';
        if (this.upperBoundType == boundType2) {
            c2 = ']';
        }
        return C51967G9n.A0r(A1A, c2);
    }
}

package X;

import com.google.common.collect.TreeMultiset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class TMY implements Iterator {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r7.comparator.compare(r3, r2.A08) == 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r7.comparator.compare(r3, r2.A08) == 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TMY(com.google.common.collect.TreeMultiset r7, int r8) {
        /*
            r6 = this;
            r6.A02 = r8
            r6.A03 = r7
            r6.<init>()
            X.S0i r0 = r7.A02
            java.lang.Object r1 = r0.A00
            X.SU9 r1 = (X.SU9) r1
            r5 = 0
            int r8 = 1 - r8
            if (r8 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x0046
            com.google.common.collect.GeneralRange r4 = r7.A00
            boolean r0 = r4.hasUpperBound
            if (r0 == 0) goto L_0x004c
            java.lang.Object r3 = r4.upperEndpoint
            java.util.Comparator r0 = r7.comparator
            X.SU9 r2 = X.SU9.A05(r1, r3, r0)
            if (r2 == 0) goto L_0x0046
            com.google.common.collect.BoundType r1 = r4.upperBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x0039
            java.util.Comparator r1 = r7.comparator
            java.lang.Object r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L_0x0039
        L_0x0034:
            X.SU9 r2 = r2.A05
            r2.getClass()
        L_0x0039:
            X.SU9 r0 = r7.A01
            if (r2 == r0) goto L_0x0046
            java.lang.Object r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 == 0) goto L_0x0046
            r5 = r2
        L_0x0046:
            r6.A00 = r5
            r0 = 0
            r6.A01 = r0
            return
        L_0x004c:
            X.SU9 r2 = r7.A01
            goto L_0x0034
        L_0x004f:
            if (r1 == 0) goto L_0x0083
            com.google.common.collect.GeneralRange r4 = r7.A00
            boolean r0 = r4.hasLowerBound
            if (r0 == 0) goto L_0x0086
            java.lang.Object r3 = r4.lowerEndpoint
            java.util.Comparator r0 = r7.comparator
            X.SU9 r2 = X.SU9.A04(r1, r3, r0)
            if (r2 == 0) goto L_0x0083
            com.google.common.collect.BoundType r1 = r4.lowerBoundType
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            if (r1 != r0) goto L_0x0076
            java.util.Comparator r1 = r7.comparator
            java.lang.Object r0 = r2.A08
            int r0 = r1.compare(r3, r0)
            if (r0 != 0) goto L_0x0076
        L_0x0071:
            X.SU9 r2 = r2.A07
            r2.getClass()
        L_0x0076:
            X.SU9 r0 = r7.A01
            if (r2 == r0) goto L_0x0083
            java.lang.Object r0 = r2.A08
            boolean r0 = r4.A01(r0)
            if (r0 == 0) goto L_0x0083
            r5 = r2
        L_0x0083:
            r6.A00 = r5
            return
        L_0x0086:
            X.SU9 r2 = r7.A01
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMY.<init>(com.google.common.collect.TreeMultiset, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A00
            X.SU9 r2 = (X.SU9) r2
            r3 = 0
            if (r2 == 0) goto L_0x001d
            java.lang.Object r0 = r4.A03
            com.google.common.collect.TreeMultiset r0 = (com.google.common.collect.TreeMultiset) r0
            com.google.common.collect.GeneralRange r1 = r0.A00
            java.lang.Object r0 = r2.A08
            boolean r0 = r1.A03(r0)
        L_0x0018:
            if (r0 == 0) goto L_0x0032
            r0 = 0
            r4.A00 = r0
        L_0x001d:
            return r3
        L_0x001e:
            java.lang.Object r2 = r4.A00
            X.SU9 r2 = (X.SU9) r2
            r3 = 0
            if (r2 == 0) goto L_0x001d
            java.lang.Object r0 = r4.A03
            com.google.common.collect.TreeMultiset r0 = (com.google.common.collect.TreeMultiset) r0
            com.google.common.collect.GeneralRange r1 = r0.A00
            java.lang.Object r0 = r2.A08
            boolean r0 = r1.A02(r0)
            goto L_0x0018
        L_0x0032:
            r3 = 1
            return r3
        L_0x0034:
            java.lang.Object r0 = r4.A03
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r3 = r0.hasNext()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMY.hasNext():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object next() {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0034;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r4.A00
            r0.getClass()
            java.lang.Object r2 = r4.A03
            com.google.common.collect.TreeMultiset r2 = (com.google.common.collect.TreeMultiset) r2
            java.lang.Object r0 = r4.A00
            X.SU9 r0 = (X.SU9) r0
            X.R0z r3 = new X.R0z
            r3.<init>(r0, r2)
            r4.A01 = r3
            X.SU9 r1 = r0.A05
            r1.getClass()
            X.SU9 r0 = r2.A01
            if (r1 == r0) goto L_0x0060
            java.lang.Object r0 = r4.A00
            X.SU9 r0 = (X.SU9) r0
            X.SU9 r0 = r0.A05
        L_0x002e:
            r0.getClass()
        L_0x0031:
            r4.A00 = r0
            return r3
        L_0x0034:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r4.A03
            com.google.common.collect.TreeMultiset r2 = (com.google.common.collect.TreeMultiset) r2
            java.lang.Object r0 = r4.A00
            X.SU9 r0 = (X.SU9) r0
            r0.getClass()
            X.R0z r3 = new X.R0z
            r3.<init>(r0, r2)
            r4.A01 = r3
            java.lang.Object r0 = r4.A00
            X.SU9 r0 = (X.SU9) r0
            X.SU9 r1 = r0.A07
            r1.getClass()
            X.SU9 r0 = r2.A01
            if (r1 == r0) goto L_0x0060
            java.lang.Object r0 = r4.A00
            X.SU9 r0 = (X.SU9) r0
            X.SU9 r0 = r0.A07
            goto L_0x002e
        L_0x0060:
            r0 = 0
            goto L_0x0031
        L_0x0062:
            java.util.NoSuchElementException r0 = X.Pxe.A1C()
            throw r0
        L_0x0067:
            java.lang.Object r0 = r4.A03
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r0)
            r4.A00 = r0
            java.lang.Object r3 = r0.getKey()
            return r3
        L_0x0076:
            java.util.NoSuchElementException r0 = X.Pxe.A1C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMY.next():java.lang.Object");
    }

    public final void remove() {
        if (this.A02 != 0) {
            Pxh.A1T(AnonymousClass7TF.A1V(this.A01));
            TreeMultiset treeMultiset = (TreeMultiset) this.A03;
            Object A012 = ((S79) this.A01).A01();
            if (treeMultiset.A00.A01(A012)) {
                C10908S0i s0i = treeMultiset.A02;
                SU9 su9 = (SU9) s0i.A00;
                if (su9 != null) {
                    s0i.A00(su9, su9.A09(A012, treeMultiset.comparator, new int[1]));
                }
            }
            this.A01 = null;
            return;
        }
        Pxh.A1T(AnonymousClass7TF.A1V(this.A00));
        Collection A18 = Pxe.A18((Map.Entry) this.A00);
        ((Iterator) this.A03).remove();
        ((R0r) this.A01).A00.A00 -= A18.size();
        A18.clear();
        this.A00 = null;
    }

    public TMY(R0r r0r, Iterator it) {
        this.A02 = 0;
        this.A01 = r0r;
        this.A03 = it;
    }
}

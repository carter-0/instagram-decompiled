package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.QDe  reason: case insensitive filesystem */
public final class C7439QDe extends C11268SIf {
    @Deprecated
    public static final C7439QDe A09;
    public static final C7439QDe A0A;
    public final SparseArray A00;
    public final SparseBooleanArray A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x00bd
            r2 = 0
            if (r11 == 0) goto L_0x00bc
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x00bc
            X.QDe r11 = (X.C7439QDe) r11
            boolean r0 = super.equals(r11)
            if (r0 == 0) goto L_0x00b7
            boolean r1 = r10.A08
            boolean r0 = r11.A08
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A04
            boolean r0 = r11.A04
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A02
            boolean r0 = r11.A02
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A05
            boolean r0 = r11.A05
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A07
            boolean r0 = r11.A07
            if (r1 != r0) goto L_0x00b7
            boolean r1 = r10.A03
            boolean r0 = r11.A03
            if (r1 != r0) goto L_0x00b7
            android.util.SparseBooleanArray r4 = r10.A01
            android.util.SparseBooleanArray r3 = r11.A01
            int r2 = r4.size()
            int r0 = r3.size()
            if (r0 != r2) goto L_0x00b7
            r1 = 0
        L_0x0051:
            if (r1 >= r2) goto L_0x0060
            int r0 = r4.keyAt(r1)
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x00b7
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0060:
            android.util.SparseArray r7 = r10.A00
            android.util.SparseArray r8 = r11.A00
            int r6 = r7.size()
            int r0 = r8.size()
            if (r0 != r6) goto L_0x00b7
            r5 = 0
        L_0x006f:
            if (r5 >= r6) goto L_0x00bd
            int r0 = r7.keyAt(r5)
            int r0 = r8.indexOfKey(r0)
            if (r0 < 0) goto L_0x00b7
            java.lang.Object r2 = r7.valueAt(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r8.valueAt(r0)
            java.util.Map r4 = (java.util.Map) r4
            int r1 = r2.size()
            int r0 = r4.size()
            if (r0 != r1) goto L_0x00b7
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r2)
        L_0x0095:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r1.getKey()
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = androidx.media3.common.util.Util.A0E(r1, r0)
            if (r0 != 0) goto L_0x0095
        L_0x00b7:
            r9 = 0
            return r9
        L_0x00b9:
            int r5 = r5 + 1
            goto L_0x006f
        L_0x00bc:
            return r2
        L_0x00bd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7439QDe.equals(java.lang.Object):boolean");
    }

    static {
        C7439QDe qDe = new C7439QDe(new C7438QDd());
        A0A = qDe;
        A09 = qDe;
    }

    public C7439QDe(C7438QDd qDd) {
        super(qDd);
        this.A08 = qDd.A06;
        this.A04 = qDd.A02;
        this.A06 = qDd.A04;
        this.A02 = qDd.A00;
        this.A05 = qDd.A03;
        this.A07 = qDd.A05;
        this.A03 = qDd.A01;
        this.A00 = qDd.A07;
        this.A01 = qDd.A08;
    }

    public final int hashCode() {
        return ((((((((G9w.A02((((((super.hashCode() + 31) * 31) + (this.A08 ? 1 : 0)) * 31 * 31) + (this.A04 ? 1 : 0)) * 31 * 31, this.A06 ? 1 : 0) * 31 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31 * 31) + (this.A03 ? 1 : 0)) * 31;
    }
}

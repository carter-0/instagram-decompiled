package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.4Qb  reason: invalid class name and case insensitive filesystem */
public final class C264484Qb extends C264494Qc {
    @Deprecated
    public static final C264484Qb A0G;
    public static final C264484Qb A0H;
    public final SparseArray A00;
    public final SparseBooleanArray A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x00e7
            r2 = 0
            if (r11 == 0) goto L_0x00e6
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x00e6
            X.4Qb r11 = (X.C264484Qb) r11
            boolean r0 = super.equals(r11)
            if (r0 == 0) goto L_0x00e1
            boolean r1 = r10.A0E
            boolean r0 = r11.A0E
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A08
            boolean r0 = r11.A08
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A09
            boolean r0 = r11.A09
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A07
            boolean r0 = r11.A07
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A0B
            boolean r0 = r11.A0B
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A04
            boolean r0 = r11.A04
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A05
            boolean r0 = r11.A05
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A02
            boolean r0 = r11.A02
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A03
            boolean r0 = r11.A03
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A0A
            boolean r0 = r11.A0A
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A0D
            boolean r0 = r11.A0D
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A0F
            boolean r0 = r11.A0F
            if (r1 != r0) goto L_0x00e1
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 != r0) goto L_0x00e1
            android.util.SparseBooleanArray r4 = r10.A01
            android.util.SparseBooleanArray r3 = r11.A01
            int r2 = r4.size()
            int r0 = r3.size()
            if (r0 != r2) goto L_0x00e1
            r1 = 0
        L_0x0075:
            if (r1 >= r2) goto L_0x0084
            int r0 = r4.keyAt(r1)
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L_0x00e1
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0084:
            android.util.SparseArray r7 = r10.A00
            android.util.SparseArray r8 = r11.A00
            int r6 = r7.size()
            int r0 = r8.size()
            if (r0 != r6) goto L_0x00e1
            r5 = 0
        L_0x0093:
            if (r5 >= r6) goto L_0x00e7
            int r0 = r7.keyAt(r5)
            int r0 = r8.indexOfKey(r0)
            if (r0 < 0) goto L_0x00e1
            java.lang.Object r2 = r7.valueAt(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r8.valueAt(r0)
            java.util.Map r4 = (java.util.Map) r4
            int r1 = r2.size()
            int r0 = r4.size()
            if (r0 != r1) goto L_0x00e1
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x00bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r4.get(r2)
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 != 0) goto L_0x00bd
        L_0x00e1:
            r9 = 0
            return r9
        L_0x00e3:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x00e6:
            return r2
        L_0x00e7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264484Qb.equals(java.lang.Object):boolean");
    }

    static {
        C264484Qb r0 = new C264484Qb(new C264504Qd());
        A0H = r0;
        A0G = r0;
    }

    public C264484Qb(C264504Qd r2) {
        super(r2);
        this.A0E = r2.A0C;
        this.A08 = r2.A06;
        this.A09 = r2.A07;
        this.A07 = r2.A05;
        this.A0B = r2.A09;
        this.A04 = r2.A02;
        this.A05 = r2.A03;
        this.A02 = r2.A00;
        this.A03 = r2.A01;
        this.A0A = r2.A08;
        this.A0D = r2.A0B;
        this.A0F = r2.A0D;
        this.A06 = r2.A04;
        this.A00 = r2.A0E;
        this.A01 = r2.A0F;
        this.A0C = r2.A0A;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A06 ? 1 : 0);
    }
}

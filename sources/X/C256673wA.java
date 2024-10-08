package X;

/* renamed from: X.3wA  reason: invalid class name and case insensitive filesystem */
public final class C256673wA {
    public int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C256673wA(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A07 = str6;
        this.A0H = z9;
        this.A0I = z10;
        this.A0E = z6;
        this.A0D = z5;
        this.A0C = z4;
        this.A0B = z3;
        this.A0A = z2;
        this.A09 = z;
        this.A0J = z11;
        this.A05 = str4;
        this.A06 = str5;
        this.A04 = str3;
        this.A08 = str7;
        this.A02 = str;
        this.A0G = z8;
        this.A01 = i;
        this.A0F = z7;
        this.A0K = z12;
        this.A03 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x00b3
            r2 = 0
            if (r5 == 0) goto L_0x001c
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001c
            X.3wA r5 = (X.C256673wA) r5
            int r1 = r4.A00
            if (r1 == 0) goto L_0x001d
            int r0 = r5.A00
            if (r0 == 0) goto L_0x001d
            if (r1 == r0) goto L_0x001d
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.String r1 = r4.A07
            java.lang.String r0 = r5.A07
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r4.A0H
            boolean r0 = r5.A0H
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0I
            boolean r0 = r5.A0I
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0E
            boolean r0 = r5.A0E
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0D
            boolean r0 = r5.A0D
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0C
            boolean r0 = r5.A0C
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0B
            boolean r0 = r5.A0B
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0A
            boolean r0 = r5.A0A
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A09
            boolean r0 = r5.A09
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0J
            boolean r0 = r5.A0J
            if (r1 != r0) goto L_0x00b2
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A06
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r4.A08
            java.lang.String r0 = r5.A08
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r4.A0G
            boolean r0 = r5.A0G
            if (r1 != r0) goto L_0x00b2
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0F
            boolean r0 = r5.A0F
            if (r1 != r0) goto L_0x00b2
            boolean r1 = r4.A0K
            boolean r0 = r5.A0K
            if (r1 != r0) goto L_0x00b2
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 == 0) goto L_0x00b2
            return r3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256673wA.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        String str = this.A07;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (((((((((((((((((((527 + hashCode) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.A06;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.A04;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str5 = this.A08;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        String str6 = this.A02;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i8 = (((((((((i7 + hashCode6) * 31) + (this.A0G ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31;
        String str7 = this.A03;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i9 = i8 + i2;
        this.A00 = i9;
        return i9;
    }

    public C256673wA(C256663w9 r2) {
        this.A07 = r2.A06;
        this.A0H = r2.A0G;
        this.A0I = r2.A0H;
        this.A0E = r2.A0D;
        this.A0D = r2.A0C;
        this.A0C = r2.A0B;
        this.A0B = r2.A0A;
        this.A0A = r2.A09;
        this.A09 = r2.A08;
        this.A0J = r2.A0I;
        this.A05 = r2.A04;
        this.A06 = r2.A05;
        this.A04 = r2.A03;
        this.A08 = r2.A07;
        this.A02 = r2.A01;
        this.A0G = r2.A0F;
        this.A01 = r2.A00;
        this.A0F = r2.A0E;
        this.A0K = r2.A0J;
        this.A03 = r2.A02;
    }
}

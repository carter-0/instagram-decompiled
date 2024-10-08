package X;

/* renamed from: X.49S  reason: invalid class name */
public final class AnonymousClass49S extends AnonymousClass0T0 {
    public boolean A00;
    public final AnonymousClass49T A01;
    public final AnonymousClass49U A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.49U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.49U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.49U} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r5 != X.AnonymousClass05K.A00) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r6 != X.AnonymousClass05K.A00) goto L_0x006c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass49S(X.AnonymousClass49T r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, int r8, boolean r9, boolean r10, boolean r11) {
        /*
            r3 = this;
            r2 = 0
            r0 = r8 & 4
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x0007:
            r0 = r8 & 8
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r6 = X.AnonymousClass05K.A01
        L_0x000d:
            r0 = r8 & 16
            if (r0 == 0) goto L_0x0017
            r0 = 0
            X.49T r4 = new X.49T
            r4.<init>(r0)
        L_0x0017:
            r0 = r8 & 32
            if (r0 == 0) goto L_0x0020
            X.49U r2 = new X.49U
            r2.<init>()
        L_0x0020:
            r0 = r8 & 64
            if (r0 == 0) goto L_0x0026
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0026:
            r0 = r8 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 == 0) goto L_0x002c
            r1 = 1
        L_0x002c:
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0031
            r11 = 0
        L_0x0031:
            r0 = 3
            X.0qQ.A0B(r5, r0)
            r0 = 4
            X.0qQ.A0B(r6, r0)
            r0 = 5
            X.0qQ.A0B(r4, r0)
            r0 = 6
            X.0qQ.A0B(r2, r0)
            r0 = 7
            X.0qQ.A0B(r7, r0)
            r3.<init>()
            r3.A07 = r9
            r3.A08 = r10
            r3.A04 = r5
            r3.A05 = r6
            r3.A01 = r4
            r3.A02 = r2
            r3.A03 = r7
            r3.A00 = r1
            r3.A06 = r11
            r2 = 1
            if (r9 == 0) goto L_0x0062
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            if (r5 == r1) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r3.A09 = r0
            if (r10 == 0) goto L_0x006c
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 1
            if (r6 == r1) goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            r3.A0A = r0
            if (r10 == 0) goto L_0x0078
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x0078
        L_0x0075:
            r3.A0B = r2
            return
        L_0x0078:
            r2 = 0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49S.<init>(X.49T, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, boolean, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass49S) {
                AnonymousClass49S r5 = (AnonymousClass49S) obj;
                if (!(this.A07 == r5.A07 && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A05 == r5.A05 && 0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A02, r5.A02) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int intValue = this.A04.intValue();
        if (1 != intValue) {
            str = "ViewPoint";
        } else {
            str = "Vista";
        }
        int hashCode = (i4 + str.hashCode() + intValue) * 31;
        int intValue2 = this.A05.intValue();
        if (1 != intValue2) {
            str2 = "ViewPoint";
        } else {
            str2 = "Vista";
        }
        int hashCode2 = (((((hashCode + str2.hashCode() + intValue2) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int intValue3 = this.A03.intValue();
        if (1 != intValue3) {
            str3 = AnonymousClass000.A00(965);
        } else {
            str3 = "VPV";
        }
        int hashCode3 = (hashCode2 + str3.hashCode() + intValue3) * 31;
        int i5 = 1237;
        if (this.A00) {
            i5 = 1231;
        }
        int i6 = (hashCode3 + i5) * 31;
        int i7 = 1237;
        if (this.A06) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}

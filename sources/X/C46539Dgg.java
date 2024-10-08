package X;

/* renamed from: X.Dgg  reason: case insensitive filesystem */
public final class C46539Dgg extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46539Dgg(java.lang.String r3, java.lang.String r4, int r5, int r6, boolean r7) {
        /*
            r2 = this;
            r2.A00 = r6
            switch(r6) {
                case 2: goto L_0x0021;
                case 3: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x000a
            r7 = 0
        L_0x000a:
            r0 = 4
        L_0x000b:
            r2.<init>(r3, r4, r0, r7)
            return
        L_0x000f:
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r3 = r1
        L_0x0015:
            r0 = r5 & 2
            if (r0 == 0) goto L_0x001a
            r4 = r1
        L_0x001a:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x001f
            r7 = 0
        L_0x001f:
            r0 = 3
            goto L_0x000b
        L_0x0021:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0026
            r7 = 0
        L_0x0026:
            r0 = 2
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46539Dgg.<init>(java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C46539Dgg)) {
                    return false;
                }
                C46539Dgg dgg = (C46539Dgg) obj;
                if (dgg.A00 != 1 || !0qQ.A0K(this.A01, dgg.A01) || this.A03 != dgg.A03 || !0qQ.A0K(this.A02, dgg.A02)) {
                    return false;
                }
                return true;
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C46539Dgg)) {
            return false;
        }
        C46539Dgg dgg2 = (C46539Dgg) obj;
        if (dgg2.A00 != i || !0qQ.A0K(this.A01, dgg2.A01) || !0qQ.A0K(this.A02, dgg2.A02) || this.A03 != dgg2.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int A0E;
        switch (this.A00) {
            case 1:
                int A0O = AnonymousClass7TE.A0O(this.A01);
                int i2 = 1237;
                if (this.A03) {
                    i2 = 1231;
                }
                i = (A0O + i2) * 31;
                hashCode = this.A02.hashCode();
                break;
            case 3:
                A0E = (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A02);
                break;
            default:
                A0E = C41845B3m.A01(this.A02, AnonymousClass7TE.A0O(this.A01));
                break;
        }
        i = A0E * 31;
        hashCode = 1237;
        if (this.A03) {
            hashCode = 1231;
        }
        return i + hashCode;
    }

    public C46539Dgg(String str, String str2, int i, boolean z) {
        this.A00 = i;
        switch (i) {
            case 2:
            case 4:
            case 5:
                AnonymousClass7TG.A1O(str, str2);
                break;
        }
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    public C46539Dgg(String str, boolean z, String str2) {
        this.A00 = 1;
        AnonymousClass7TF.A1C(str, 1, str2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = str2;
    }
}

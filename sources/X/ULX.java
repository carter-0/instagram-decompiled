package X;

public final class ULX extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public ULX(Object obj, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj;
        this.A02 = str3;
        this.A05 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ULX)) {
            return false;
        }
        ULX ulx = (ULX) obj;
        if (ulx.A00 != 1 || !0qQ.A0K(this.A04, ulx.A04) || !0qQ.A0K(this.A03, ulx.A03) || !0qQ.A0K(this.A01, ulx.A01) || !0qQ.A0K(this.A02, ulx.A02) || this.A05 != ulx.A05 || this.A06 != ulx.A06) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A05, ((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31));
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("IntentBasedInsertionResult(isIntentBasedPushupMet=");
        sb.append(this.A05);
        sb.append(", isTimeBasedInsertionConfigChangeMet=");
        sb.append(this.A06);
        sb.append(", timeBasedInsertionGapInSeconds=");
        sb.append(this.A01);
        sb.append(", pushUpMinGap=");
        sb.append(this.A02);
        sb.append(", pushUpReason=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(2044));
        return C51975G9x.A0i(this.A04, sb);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ULX(java.lang.Double r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16, boolean r17) {
        /*
            r10 = this;
            r4 = r14
            r5 = r13
            r6 = r12
            r3 = r11
            r8 = r16
            r7 = 0
            r2 = r10
            r10.A00 = r7
            r0 = r15 & 1
            r9 = 0
            if (r0 == 0) goto L_0x0010
            r8 = 0
        L_0x0010:
            r0 = r15 & 2
            if (r0 != 0) goto L_0x0016
            r9 = r17
        L_0x0016:
            r0 = r15 & 4
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r3 = r1
        L_0x001c:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x0021
            r6 = r1
        L_0x0021:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0026
            r5 = r1
        L_0x0026:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x002b
            r4 = r1
        L_0x002b:
            r2.<init>((java.lang.Object) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7, (boolean) r8, (boolean) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULX.<init>(java.lang.Double, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }
}

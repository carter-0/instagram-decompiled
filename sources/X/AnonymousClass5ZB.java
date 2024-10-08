package X;

/* renamed from: X.5ZB  reason: invalid class name */
public final class AnonymousClass5ZB {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C291805hu A03;
    public final C289645dx A04;
    public final C268454dQ A05;
    public final C291715hl A06;
    public final C291725hm A07;
    public final AnonymousClass5ZD A08;
    public final C286155Ud A09;
    public final C291735hn A0A;
    public final C291795ht A0B;
    public final AnonymousClass5ZA A0C;
    public final C291745ho A0D;
    public final String A0E;

    public final boolean A01(AnonymousClass5ZB r9) {
        if (this != r9) {
            long j = this.A01;
            long j2 = r9.A01;
            AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
            boolean z = false;
            if (j == j2) {
                z = true;
            }
            if (z && 0qQ.A0K(this.A08, r9.A08) && 0qQ.A0K(this.A06, r9.A06) && 0qQ.A0K(this.A07, r9.A07) && 0qQ.A0K(this.A05, r9.A05) && 0qQ.A0K(this.A0E, r9.A0E) && this.A02 == r9.A02 && 0qQ.A0K(this.A0A, r9.A0A) && 0qQ.A0K(this.A0D, r9.A0D) && 0qQ.A0K(this.A09, r9.A09)) {
                long j3 = this.A00;
                long j4 = r9.A00;
                long j5 = AnonymousClass5RW.A01;
                if (j3 == j4) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5ZB)) {
            return false;
        }
        AnonymousClass5ZB r4 = (AnonymousClass5ZB) obj;
        return A01(r4) && A02(r4);
    }

    public final AnonymousClass5ZB A00(AnonymousClass5ZB r39) {
        AnonymousClass5ZB r6 = r39;
        if (r39 == null) {
            return this;
        }
        AnonymousClass5ZA r0 = r6.A0C;
        long Aoz = r0.Aoz();
        C304786Ff AiJ = r0.AiJ();
        float AbF = r0.AbF();
        long j = r6.A01;
        AnonymousClass5ZD r17 = r6.A08;
        C291715hl r15 = r6.A06;
        C291725hm r14 = r6.A07;
        C268454dQ r13 = r6.A05;
        String str = r6.A0E;
        long j2 = r6.A02;
        C291735hn r11 = r6.A0A;
        C291745ho r10 = r6.A0D;
        C286155Ud r9 = r6.A09;
        long j3 = r6.A00;
        C291795ht r8 = r6.A0B;
        C291735hn r25 = r11;
        C291795ht r26 = r8;
        C291745ho r27 = r10;
        String str2 = str;
        C291715hl r21 = r15;
        C291725hm r22 = r14;
        AnonymousClass5ZD r23 = r17;
        C286155Ud r24 = r9;
        return C287115Zb.A00(AiJ, r6.A03, r6.A04, this, r13, r21, r22, r23, r24, r25, r26, r27, str2, AbF, Aoz, j, j2, j3);
    }

    public final boolean A02(AnonymousClass5ZB r4) {
        if (!0qQ.A0K(this.A0C, r4.A0C) || !0qQ.A0K(this.A0B, r4.A0B) || !0qQ.A0K(this.A03, r4.A03) || !0qQ.A0K(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        AnonymousClass5ZA r4 = this.A0C;
        long Aoz = r4.Aoz();
        long j = AnonymousClass5RW.A01;
        int i12 = ((int) (Aoz ^ (Aoz >>> 32))) * 31;
        C304786Ff AiJ = r4.AiJ();
        int i13 = 0;
        if (AiJ != null) {
            i = AiJ.hashCode();
        } else {
            i = 0;
        }
        long j2 = this.A01;
        AnonymousClass5Z6[] r0 = AnonymousClass5Z5.A02;
        int floatToIntBits = (((((i12 + i) * 31) + Float.floatToIntBits(r4.AbF())) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        AnonymousClass5ZD r02 = this.A08;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (floatToIntBits + i2) * 31;
        C291715hl r03 = this.A06;
        if (r03 != null) {
            i3 = r03.A00;
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        C291725hm r04 = this.A07;
        if (r04 != null) {
            i4 = r04.A00;
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        C268454dQ r05 = this.A05;
        if (r05 != null) {
            i5 = r05.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str = this.A0E;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        long j3 = this.A02;
        int i18 = (((i17 + i6) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        C291735hn r06 = this.A0A;
        if (r06 != null) {
            i7 = Float.floatToIntBits(r06.A00);
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        C291745ho r07 = this.A0D;
        if (r07 != null) {
            i8 = r07.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        C286155Ud r08 = this.A09;
        if (r08 != null) {
            i9 = r08.hashCode();
        } else {
            i9 = 0;
        }
        long j4 = this.A00;
        int i21 = (((i20 + i9) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        C291795ht r09 = this.A0B;
        if (r09 != null) {
            i10 = r09.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        C291805hu r010 = this.A03;
        if (r010 != null) {
            i11 = r010.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31 * 31;
        C289645dx r011 = this.A04;
        if (r011 != null) {
            i13 = r011.hashCode();
        }
        return i23 + i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpanStyle(color=");
        AnonymousClass5ZA r3 = this.A0C;
        sb.append(AnonymousClass5RW.A06(r3.Aoz()));
        sb.append(", brush=");
        sb.append(r3.AiJ());
        sb.append(", alpha=");
        sb.append(r3.AbF());
        sb.append(", fontSize=");
        sb.append(AnonymousClass5Z5.A02(this.A01));
        sb.append(", fontWeight=");
        sb.append(this.A08);
        sb.append(", fontStyle=");
        sb.append(this.A06);
        sb.append(", fontSynthesis=");
        sb.append(this.A07);
        sb.append(", fontFamily=");
        sb.append(this.A05);
        sb.append(", fontFeatureSettings=");
        sb.append(this.A0E);
        sb.append(", letterSpacing=");
        sb.append(AnonymousClass5Z5.A02(this.A02));
        sb.append(", baselineShift=");
        sb.append(this.A0A);
        sb.append(", textGeometricTransform=");
        sb.append(this.A0D);
        sb.append(", localeList=");
        sb.append(this.A09);
        sb.append(", background=");
        sb.append(AnonymousClass5RW.A06(this.A00));
        sb.append(", textDecoration=");
        sb.append(this.A0B);
        sb.append(", shadow=");
        sb.append(this.A03);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass5ZB(C291805hu r3, C289645dx r4, C268454dQ r5, C291715hl r6, C291725hm r7, AnonymousClass5ZD r8, C286155Ud r9, C291735hn r10, C291795ht r11, AnonymousClass5ZA r12, C291745ho r13, String str, long j, long j2, long j3) {
        this.A0C = r12;
        this.A01 = j;
        this.A08 = r8;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
        this.A0E = str;
        this.A02 = j2;
        this.A0A = r10;
        this.A0D = r13;
        this.A09 = r9;
        this.A00 = j3;
        this.A0B = r11;
        this.A03 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass5ZB(X.C268454dQ r21, X.C291715hl r22, X.C291725hm r23, X.AnonymousClass5ZD r24, X.C291795ht r25, int r26, long r27, long r29, long r31) {
        /*
            r20 = this;
            r4 = r21
            r6 = r23
            r5 = r22
            r7 = r24
            r16 = r31
            r14 = r29
            r2 = 0
            r10 = 0
            r1 = r26
            r0 = r26 & 1
            if (r0 == 0) goto L_0x0016
            long r27 = X.AnonymousClass5RW.A08
        L_0x0016:
            r0 = r26 & 2
            if (r0 == 0) goto L_0x001c
            long r14 = X.AnonymousClass5Z5.A01
        L_0x001c:
            r0 = r26 & 4
            if (r0 == 0) goto L_0x0021
            r7 = 0
        L_0x0021:
            r0 = r26 & 8
            if (r0 == 0) goto L_0x0026
            r5 = 0
        L_0x0026:
            r0 = r26 & 16
            if (r0 == 0) goto L_0x002b
            r6 = 0
        L_0x002b:
            r0 = r26 & 32
            if (r0 == 0) goto L_0x0030
            r4 = 0
        L_0x0030:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0036
            long r16 = X.AnonymousClass5Z5.A01
        L_0x0036:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0051
            long r18 = X.AnonymousClass5RW.A08
        L_0x003c:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x0042
            r10 = r25
        L_0x0042:
            X.5ZA r11 = X.AnonymousClass5Z8.A00(r27)
            r1 = r20
            r3 = r2
            r8 = r2
            r9 = r2
            r12 = r2
            r13 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            return
        L_0x0051:
            r18 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZB.<init>(X.4dQ, X.5hl, X.5hm, X.5ZD, X.5ht, int, long, long, long):void");
    }
}

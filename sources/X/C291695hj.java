package X;

/* renamed from: X.5hj  reason: invalid class name and case insensitive filesystem */
public abstract class C291695hj {
    public static final AnonymousClass5Z4 A00(AnonymousClass5Z4 r38, AnonymousClass5Q8 r39) {
        int i;
        int i2;
        float f;
        AnonymousClass5Z4 r0 = AnonymousClass5Z4.A03;
        AnonymousClass5Z4 r8 = r38;
        AnonymousClass5ZB r12 = r8.A02;
        AnonymousClass5ZA r02 = C287115Zb.A03;
        AnonymousClass5ZA r11 = r12.A0C;
        if (r11.equals(AnonymousClass5Z9.A00)) {
            r11 = C287115Zb.A03;
        }
        long j = r12.A01;
        if (AnonymousClass5Z7.A02(j)) {
            j = C287115Zb.A01;
        }
        AnonymousClass5ZD r10 = r12.A08;
        if (r10 == null) {
            r10 = AnonymousClass5ZD.A04;
        }
        C291715hl r03 = r12.A06;
        if (r03 != null) {
            i = r03.A00;
        } else {
            i = 0;
        }
        C291715hl r04 = new C291715hl(i);
        C291725hm r05 = r12.A07;
        if (r05 != null) {
            i2 = r05.A00;
        } else {
            i2 = 1;
        }
        C291725hm r06 = new C291725hm(i2);
        C268454dQ r14 = r12.A05;
        if (r14 == null) {
            r14 = C268454dQ.A01;
        }
        String str = r12.A0E;
        if (str == null) {
            str = "";
        }
        long j2 = r12.A02;
        if (AnonymousClass5Z7.A02(j2)) {
            j2 = C287115Zb.A02;
        }
        C291735hn r07 = r12.A0A;
        if (r07 != null) {
            f = r07.A00;
        } else {
            f = 0.0f;
        }
        C291735hn r08 = new C291735hn(f);
        C291745ho r15 = r12.A0D;
        if (r15 == null) {
            r15 = C291745ho.A02;
        }
        C286155Ud r9 = r12.A09;
        if (r9 == null) {
            C286155Ud r09 = C286155Ud.A02;
            r9 = C291755hp.A00.Atj();
        }
        long j3 = r12.A00;
        if (j3 == 16) {
            j3 = C287115Zb.A00;
        }
        C291795ht r3 = r12.A0B;
        if (r3 == null) {
            r3 = C291795ht.A02;
        }
        C291805hu r010 = r12.A03;
        if (r010 == null) {
            r010 = C291805hu.A03;
        }
        C289645dx r122 = r12.A04;
        if (r122 == null) {
            r122 = C289635dw.A00;
        }
        C291805hu r21 = r010;
        C289645dx r22 = r122;
        C268454dQ r23 = r14;
        C291715hl r24 = r04;
        C291725hm r25 = r06;
        AnonymousClass5ZB r20 = new AnonymousClass5ZB(r21, r22, r23, r24, r25, r10, r9, r08, r3, r11, r15, str, j, j2, j3);
        AnonymousClass5ZC r112 = r8.A00;
        long j4 = C287155Zf.A00;
        int i3 = r112.A02;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 5;
        }
        int i4 = r112.A03;
        boolean z = false;
        if (i4 == 3) {
            z = true;
        }
        if (z) {
            int ordinal = r39.ordinal();
            if (ordinal == 0) {
                i4 = 4;
            } else if (ordinal == 1) {
                i4 = 5;
            } else {
                throw new RuntimeException();
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = r39.ordinal();
            if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 2;
            } else {
                throw new RuntimeException();
            }
        }
        long j5 = r112.A04;
        if (AnonymousClass5Z7.A02(j5)) {
            j5 = C287155Zf.A00;
        }
        C291815hv r7 = r112.A06;
        if (r7 == null) {
            r7 = C291815hv.A02;
        }
        AnonymousClass5Z3 r4 = r112.A05;
        int i5 = r112.A01;
        if (i5 == 0) {
            i5 = 66305;
        }
        int i6 = r112.A00;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        C291825hw r011 = r112.A07;
        if (r011 == null) {
            r011 = C291825hw.A02;
        }
        return new AnonymousClass5Z4(new AnonymousClass5ZC(r4, r7, r011, i3, i4, i5, i6, j5), r8.A01, r20);
    }
}

package X;

/* renamed from: X.GwQ  reason: case insensitive filesystem */
public final class C53920GwQ extends C251343mx {
    public static final C56364HxH A07 = new Object();
    public final CharSequence A00;
    public final CharSequence A01;
    public final 2WX A02;
    public final C57543IcV A03;
    public final String A04;
    public final String A05;
    public final C62320sa A06;

    public static final 2Tl A00(C59535JNh jNh, C70832Wc r6, 2WX r7, C59581JPb jPb, Integer num) {
        C243583Zi r3;
        if (jPb == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            r3 = C243583Zi.FLEX_START;
        } else if (intValue == 1) {
            r3 = C243583Zi.CENTER;
        } else if (intValue == 2) {
            r3 = C243583Zi.FLEX_END;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        2WX A0x = G9t.A0x(r7, AnonymousClass05K.A0C, 0.0f);
        2Wb A0M = C51973G9u.A0M(r6);
        A0M.A00((C251263mp) jPb.CGV(jNh));
        return C243563Zg.A07(A0M, r6, A0x, (C243573Zh) null, r3);
    }

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        C53813Gug gug;
        2Tl A0Q;
        2WX r12;
        double d;
        AnonymousClass3Y5 r4 = r23;
        C59535JNh A002 = I3I.A00(r4);
        C56148Hta hta = (C56148Hta) I3I.A02(r4, this.A03);
        CharSequence charSequence = this.A00;
        C53813Gug gug2 = null;
        if (charSequence != null) {
            if (this.A01 != null) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(5.0d);
            HHT hht = new HHT(doubleToRawLongBits2, doubleToRawLongBits2);
            JT8 jt8 = hta.A06;
            AnonymousClass3XV r0 = 2WX.A02;
            gug2 = new C53813Gug(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0A, 0, doubleToRawLongBits), AnonymousClass90N.TEXT_START, AnonymousClass90P.TOP, jt8, hht, charSequence, 0);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2 != null) {
            long doubleToRawLongBits3 = Double.doubleToRawLongBits(5.0d);
            HHT hht2 = new HHT(doubleToRawLongBits3, doubleToRawLongBits3);
            gug = new C53813Gug((2WX) null, AnonymousClass90N.TEXT_START, AnonymousClass90P.TOP, hta.A07, hht2, charSequence2, 0);
        } else {
            gug = null;
        }
        C59581JPb jPb = hta.A03;
        Integer num = hta.A0F;
        AnonymousClass3XV r02 = 2WX.A02;
        long A0I = C51970G9q.A0I();
        2Tl A003 = A00(A002, r4, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A09, 0, A0I), jPb, num);
        2Tl A004 = A00(A002, r4, C51972G9s.A0S((2WX) null, 0, A0I), hta.A02, hta.A0A);
        C55667HlQ hlQ = hta.A01;
        2Tl r11 = null;
        if (hlQ != null) {
            2WX A0P = C51973G9u.A0P((2WX) null, (double) hta.A00);
            r11 = C51967G9n.A0N(new C53662GsF(hlQ.A00, hlQ.A01), C51973G9u.A0K(r4), r4, A0P);
        }
        if (A003 == null && A004 == null) {
            2WX A005 = C56364HxH.A00(this.A02, this.A05);
            C243573Zh r5 = C243573Zh.FLEX_START;
            C243583Zi r1 = C243583Zi.CENTER;
            2Wb A0J = C51973G9u.A0J(gug2, gug, r4.A05);
            A0J.A00(r11);
            A0Q = C243563Zg.A07(A0J, r4, A005, r5, r1);
        } else {
            2WX A006 = C56364HxH.A00(this.A02, this.A05);
            2V1 r03 = r4.A05;
            2Wb A0v = G9t.A0v(A003, r03);
            2WX A0x = G9t.A0x((2WX) null, AnonymousClass05K.A01, 1.0f);
            C243573Zh r52 = C243573Zh.FLEX_START;
            C243583Zi r13 = C243583Zi.CENTER;
            2Wb A0J2 = C51973G9u.A0J(gug2, gug, r03);
            A0J2.A00(r11);
            A0v.A00(C243563Zg.A07(A0J2, r4, A0x, r52, r13));
            A0Q = C51967G9n.A0Q(A004, A0v, r4, A006);
        }
        2Tl r112 = A0Q;
        C62320sa r14 = this.A06;
        if (r14 == null) {
            return A0Q;
        }
        JT7 jt7 = hta.A04;
        String str = this.A04;
        if (str != null) {
            r12 = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A15, new C58729Iwc(str, 17), 0);
        } else {
            r12 = 2WX.A02;
        }
        return new C53775Gu4(r112, r12, jt7, r14, (C62320sa) null);
    }

    public C53920GwQ(2WX r1, C57543IcV icV, CharSequence charSequence, CharSequence charSequence2, String str, String str2, C62320sa r7) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
        this.A03 = icV;
        this.A06 = r7;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = r1;
    }
}

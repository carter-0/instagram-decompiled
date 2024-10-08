package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Gw4  reason: case insensitive filesystem */
public final class C53898Gw4 extends C251343mx {
    public final CharSequence A00;
    public final 2WX A01;
    public final JT6 A02;
    public final CharSequence A03;
    public final C62320sa A04;
    public final boolean A05;

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        float f;
        GradientDrawable gradientDrawable;
        C62320sa r0;
        0qQ.A0B(r15, 0);
        C56147HtZ htZ = (C56147HtZ) I3I.A02(r15, this.A02);
        C54716HPv hPv = htZ.A06;
        float f2 = 1.0f;
        if (0qQ.A0K(hPv, HHL.A00)) {
            f = 0.0f;
        } else if (0qQ.A0K(hPv, HHM.A00)) {
            f = 1.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Integer num = htZ.A09;
        if (num != null) {
            int intValue = num.intValue();
            int i = htZ.A01;
            int i2 = htZ.A00;
            int A0A = AnonymousClass7TG.A0A(htZ.A0A);
            gradientDrawable = C51972G9s.A0H(0, intValue);
            gradientDrawable.setStroke(C51972G9s.A0B(r15, (double) i2), A0A);
            gradientDrawable.setCornerRadius((float) C51972G9s.A0B(r15, (double) i));
        } else {
            gradientDrawable = null;
        }
        boolean z = this.A05;
        if (!z) {
            f2 = 0.7f;
        }
        2WX r13 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A01;
        2WX A0x = G9t.A0x((2WX) null, num2, f);
        long A07 = C51965G9l.A07(htZ.A02);
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0x, num2, 0, A07), AnonymousClass05K.A0C, 0, A07);
        long A072 = C51965G9l.A07(htZ.A04);
        long A073 = C51965G9l.A07(htZ.A03);
        2WX A0R = C51972G9s.A0R(A002, 0, A072);
        Integer num3 = AnonymousClass05K.A1F;
        2WX A003 = AnonymousClass9JR.A00(C51971G9r.A0Y(AnonymousClass9JR.A00(A0R, num3, 0, A073), AnonymousClass05K.A00, gradientDrawable, 4), num3, 2, C51969G9p.A0D());
        CharSequence charSequence = this.A03;
        if (charSequence != null) {
            A003 = C51971G9r.A0Y(A003, AnonymousClass05K.A0N, charSequence, 0);
        }
        2WX A012 = C52112GFg.A01(C51973G9u.A0Y(C51972G9s.A0U(A003, num2, 0), AnonymousClass05K.A0F, z), f2);
        JT7 jt7 = htZ.A07;
        if (!z || (r0 = this.A04) == null) {
            return A00(A012.A00(this.A01), htZ);
        }
        C53813Gug A004 = A00(A012, htZ);
        2WX r4 = this.A01;
        if (r4 == null) {
            r4 = r13;
        }
        return new C53775Gu4(A004, r4, jt7, r0, (C62320sa) null);
    }

    private final C53813Gug A00(2WX r10, C56147HtZ htZ) {
        2WX A002 = 2WX.A02.A00(r10);
        long A0H = C51970G9q.A0H();
        HHT hht = new HHT(A0H, A0H);
        CharSequence charSequence = this.A00;
        return new C53813Gug(A002, AnonymousClass90N.CENTER, AnonymousClass90P.CENTER, htZ.A08, hht, charSequence, 1);
    }

    public C53898Gw4(2WX r1, JT6 jt6, CharSequence charSequence, CharSequence charSequence2, C62320sa r5, boolean z) {
        C51972G9s.A1B(charSequence, charSequence2);
        this.A00 = charSequence;
        this.A02 = jt6;
        this.A04 = r5;
        this.A03 = charSequence2;
        this.A05 = z;
        this.A01 = r1;
    }
}

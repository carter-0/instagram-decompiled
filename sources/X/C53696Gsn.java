package X;

import java.util.Arrays;

/* renamed from: X.Gsn  reason: case insensitive filesystem */
public final class C53696Gsn extends C251343mx {
    public final 2WX A00;
    public final C57541IcT A01;
    public final CharSequence A02;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        C54720HPz hPz;
        0qQ.A0B(r13, 0);
        C56138HtQ htQ = (C56138HtQ) I3I.A02(r13, this.A01);
        Object A002 = AnonymousClass3Zw.A00(r13, C58697Iw6.A00(htQ, r13, this, 12), Arrays.copyOf(new Object[]{htQ}, 1));
        if (A002 == null) {
            A002 = null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        long A07 = C51965G9l.A07(htQ.A02);
        long A072 = C51965G9l.A07(htQ.A01);
        long A0D = C51969G9p.A0D();
        2WX A0E = C51974G9v.A0E(C51974G9v.A0G((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, A07), 0, A0D), C51965G9l.A0c(AnonymousClass05K.A1F, 0, A072), 0, A0D);
        if (A002 == null) {
            A002 = null;
        }
        2WX A10 = G9t.A10(A0E, AnonymousClass05K.A00, A002);
        Integer num = htQ.A06;
        Integer num2 = htQ.A05;
        if (num == null || num2 == null) {
            hPz = HHU.A00;
        } else {
            hPz = new HHT(C51970G9q.A0M(num), C51970G9q.A0M(num2));
        }
        return new C53813Gug(A10.A00(this.A00), AnonymousClass90N.TEXT_START, AnonymousClass90P.TOP, htQ.A03, hPz, this.A02, 1);
    }

    public C53696Gsn(2WX r1, C57541IcT icT, CharSequence charSequence) {
        AnonymousClass7TG.A1P(charSequence, r1);
        this.A02 = charSequence;
        this.A01 = icT;
        this.A00 = r1;
    }
}

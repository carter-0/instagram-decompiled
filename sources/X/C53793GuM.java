package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.GuM  reason: case insensitive filesystem */
public final class C53793GuM extends C251343mx {
    public final int A00;
    public final long A01;
    public final C21255XRa A02;
    public final Integer A03;
    public final 2Wd A04;
    public final Float A05;

    public final C251263mp A0X(AnonymousClass3Y5 r20) {
        C52733Gbk gbk;
        C21255XRa xRa;
        C54642HLz hLz;
        C54642HLz hLz2;
        2WX r3;
        2WX r2;
        int ordinal;
        int ordinal2;
        AnonymousClass3Y5 r7 = r20;
        C59535JNh A002 = I3I.A00(r7);
        C361838gt A032 = C56611I4l.A03(A002);
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            gbk = C52733Gbk.RECTANGLE;
        } else if (intValue == 1) {
            gbk = C52733Gbk.CIRCLE;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C21255XRa xRa2 = this.A02;
        if (xRa2 == null || !((ordinal2 = xRa2.ordinal()) == 144 || ordinal2 == 25 || ordinal2 == 3)) {
            xRa = C21255XRa.A12;
        } else {
            xRa = C21255XRa.A18;
        }
        int A012 = C56611I4l.A01(xRa, A002);
        if (xRa2 == null || !((ordinal = xRa2.ordinal()) == 144 || ordinal == 25 || ordinal == 3)) {
            hLz = C54642HLz.GLIMMER_MIN_OPACITY;
            hLz2 = C54642HLz.GLIMMER_MAX_OPACITY;
        } else {
            hLz = C54642HLz.GLIMMER_ON_WHITE_BACKGROUND_MIN_OPACITY;
            hLz2 = C54642HLz.GLIMMER_ON_WHITE_BACKGROUND_MAX_OPACITY;
        }
        0eP A1L = AnonymousClass7TE.A1L(hLz, hLz2);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(A012);
        2Wd A0e = C51965G9l.A0e(this.A01);
        Object obj = A1L.A00;
        Drawable A003 = C55218He9.A00(r7, new C58231IoZ(A002, gbk, this, r7, A1L, A032, A012, 1), new Object[]{A002, A032, gbk, valueOf, valueOf2, A0e, obj, A1L.A01});
        2WX r4 = 2WX.A02;
        Float f = this.A05;
        if (f != null) {
            r3 = C51971G9r.A0X((2WX) null, AnonymousClass05K.A00, f.floatValue(), 0);
        } else {
            r3 = r4;
        }
        2Wd r1 = this.A04;
        if (r1 != null) {
            r2 = C51972G9s.A0T((2WX) null, 0, r1.A00);
        } else {
            r2 = r4;
        }
        return new C53949Gwt(A003, ImageView.ScaleType.CENTER_CROP, r4.A00(r4).A00(r3).A00(r2).A00(r4), 0, false);
    }

    public C53793GuM(C21255XRa xRa, 2Wd r2, Float f, Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = xRa;
        this.A03 = num;
        this.A01 = j;
        this.A04 = r2;
        this.A05 = f;
    }
}

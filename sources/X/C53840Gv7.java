package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gv7  reason: case insensitive filesystem */
public final class C53840Gv7 extends C251343mx {
    public final C62320sa A00;
    public final C62320sa A01;
    public final long A02;
    public final long A03;
    public final Drawable A04;
    public final 2WX A05;
    public final String A06;
    public final boolean A07 = true;

    public C53840Gv7(Drawable drawable, 2WX r3, String str, C62320sa r5, C62320sa r6, long j, long j2) {
        this.A06 = str;
        this.A03 = j;
        this.A04 = drawable;
        this.A02 = j2;
        this.A00 = r5;
        this.A01 = r6;
        this.A05 = r3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        AnonymousClass3Y5 r22 = r24;
        AnonymousClass3Y5 r0 = r22;
        0qQ.A0B(r0, 0);
        2WX r2 = 2WX.A02;
        Drawable A0D = C244013aV.A0D(r0, R.drawable.spin_attribution_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, A0D, 4));
        long A072 = C51967G9n.A07(r22);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0X, num2, 0, A072);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A003 = AnonymousClass9JR.A00(C51971G9r.A0X(A002, num3, 0.0f, 1), AnonymousClass05K.A04, 0, C51970G9q.A0D()).A00(this.A05);
        J6J A004 = J6J.A00(this, 10);
        Integer num4 = AnonymousClass05K.A1F;
        AnonymousClass9JS A0d = C51965G9l.A0d(num4, A004, 4);
        if (A003 == r2) {
            A003 = null;
        }
        2WX A0X2 = C51965G9l.A0X(A003, A0d);
        2Wb A0Q = C51972G9s.A0Q(r22);
        long j = this.A02;
        2WX A0S = C51973G9u.A0S(AnonymousClass9JR.A00((2WX) null, num, 0, j), C51965G9l.A0c(num2, 0, j), num3, 0.0f, 1);
        long A0H = C51970G9q.A0H();
        2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(A0S, AnonymousClass05K.A09, 0, A0H), num4, J6J.A00(this, 11), 4);
        Drawable drawable = this.A04;
        2V1 r4 = A0Q.A00;
        C51974G9v.A0h(drawable, r4, A0Q, A0Y);
        boolean z = this.A07;
        boolean z2 = z;
        if (z) {
            2Wb A0S2 = AnonymousClass7TG.A0S(r4);
            C53616GrV A005 = C54000Gxi.A00(A0S2.A00);
            C54000Gxi gxi = A005.A01;
            AnonymousClass2V4 r14 = A005.A02;
            gxi.A00 = r14.A01(R.attr.igds_color_photo_border);
            A005.A02.set(0);
            int A006 = r14.A00(1.0f);
            C251253mo r21 = A005.A00;
            r21.A0Z().A0L(A006);
            r21.A0Z().A08(100.0f);
            r21.A0Z().A0T(C244143ai.START, r14.A00(2.0f));
            A0S2.A00(A005.A0A());
            A0Q.A00(C243563Zg.A00(A0S2));
        }
        2WX A0S3 = C51973G9u.A0S((2WX) null, C51965G9l.A0d(num2, "android.widget.Button", 0), num3, 0.0f, 1);
        if (!z2) {
            A0H = C51969G9p.A0D();
        }
        2WX A0S4 = C51972G9s.A0S(A0S3, 0, A0H);
        long j2 = this.A03;
        String str = this.A06;
        Typeface A032 = 0oh.A03(r4.A0C, Typeface.DEFAULT, num3);
        int A012 = A0Q.Bnf().A01(R.attr.igds_color_text_on_color);
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A012, j2);
        A0b.A0R(0);
        G9w.A12(A032, A0Q, A0b, A0D2);
        A0b.A0W(num);
        C51974G9v.A13(A0b, num2, 1.0f);
        G9t.A1M(A0Q, A0S4, A0b);
        return C243563Zg.A0G(A0Q, r22, A0X2);
    }
}

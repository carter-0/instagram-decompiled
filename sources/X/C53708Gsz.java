package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Gsz  reason: case insensitive filesystem */
public final class C53708Gsz extends C251343mx {
    public final HNN A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        AnonymousClass3Y5 r4 = r29;
        JSK A002 = I41.A00(I3I.A00(r4));
        Drawable A003 = C55218He9.A00(r4, C58688Ivx.A00(r4, this, 33), new Object[]{this.A00});
        AnonymousClass3XV r0 = 2WX.A02;
        long A0D = C51970G9q.A0D();
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, G9w.A07(A002, AnonymousClass05K.A0V)), AnonymousClass05K.A0F, 0, A0D);
        2Wb A0Q = C51972G9s.A0Q(r4);
        long A0F = C51970G9q.A0F();
        Integer num = AnonymousClass05K.A00;
        A0Q.A00(new C53949Gwt(A003, ImageView.ScaleType.CENTER_INSIDE, C51974G9v.A0M((2WX) null, num, 0, A0F), 0, false));
        2WX A0J = C51974G9v.A0J((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0B, 0, C51970G9q.A0I()), num);
        2Wb A0w = G9t.A0w(A0Q);
        CharSequence charSequence = this.A02;
        Integer num2 = AnonymousClass05K.A06;
        HNO hno = HNO.A0Y;
        long A0H = C51970G9q.A0H();
        AnonymousClass90N r11 = AnonymousClass90N.TEXT_START;
        A0w.A00(new C53907GwD((2WX) null, r11, hno, charSequence, num2, 0, A0H, A0D));
        AnonymousClass90N r19 = r11;
        C51971G9r.A1D(new C53907GwD((2WX) null, r19, HNO.A03, this.A01, AnonymousClass05K.A02, 0, A0H, A0H), A0w, A0Q, A0J);
        return C243563Zg.A0B(A0Q, r4, A004);
    }

    public C53708Gsz(HNN hnn, CharSequence charSequence, CharSequence charSequence2) {
        AnonymousClass7TG.A1P(hnn, charSequence2);
        this.A00 = hnn;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }
}

package X;

import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gtt  reason: case insensitive filesystem */
public final class C53764Gtt extends C251343mx {
    public final C52976GgT A00;
    public final String A01;
    public final 0sP A02;
    public final 0sP A03;
    public final int A04;

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        0qQ.A0B(r14, 0);
        Float A0g = C51967G9n.A0g();
        2V5 A002 = C247343gB.A00(r14, A0g);
        2V5 A003 = C247343gB.A00(r14, A0g);
        2V5 A0Z = C51968G9o.A0Z(r14, 1.0f);
        Integer valueOf = Integer.valueOf(this.A04);
        Object A004 = AnonymousClass3Zw.A00(r14, new MJ0(AnonymousClass3Zw.A00(r14, new C58208IoC(27, A0Z, this, A002, A003), new Object[]{valueOf}), 10), new Object[]{valueOf});
        C243773a4.A00(r14, new MJ0(A004, 9), new Object[]{A004, valueOf});
        2V1 r5 = r14.A05;
        Drawable drawable = r5.A0C.getDrawable(R.drawable.feed_like_big);
        if (drawable == null) {
            return null;
        }
        AnonymousClass7TE.A1R(drawable, r14.Bnf().A01(R.attr.feedLikeActiveColor));
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0A = C51974G9v.A0A(A003, (2WX) null, new AnonymousClass9JS(A002, AnonymousClass05K.A1F));
        Integer num = AnonymousClass05K.A00;
        return C51974G9v.A0P(drawable, r5, C51971G9r.A0Y(C51971G9r.A0Y(C51974G9v.A0N(C51971G9r.A0W(A0Z, A0A, num), AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(92.0d)), num, C243573Zh.CENTER, 3), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3));
    }

    public C53764Gtt(C52976GgT ggT, String str, 0sP r3, 0sP r4, int i) {
        this.A00 = ggT;
        this.A01 = str;
        this.A04 = i;
        this.A03 = r3;
        this.A02 = r4;
    }
}

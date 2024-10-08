package X;

import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.Gth  reason: case insensitive filesystem */
public final class C53752Gth extends C251343mx {
    public final C62320sa A00;
    public final int A01 = R.drawable.rounded_white_button;
    public final int A02;
    public final String A03;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r7 = r17;
        0qQ.A0B(r7, 0);
        2WX r9 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, "android.widget.Button", 0));
        long A0C = C244013aV.A0C(r7, R.dimen.appreciation_reels_grid_item_width);
        Integer num2 = AnonymousClass05K.A0C;
        2WX A002 = C51973G9u.A0Y(C51971G9r.A0Y(C51973G9u.A0Q(AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, num2, 0, A0C), AnonymousClass05K.A0E, 0, C244013aV.A05(r7)), C51967G9n.A0S(0, C244013aV.A03(r7)), 0, C244013aV.A06(r7)), AnonymousClass05K.A00, C244013aV.A0D(r7, this.A01), 4), num, true).A00((2WX) null);
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A1F, J6E.A00(this, 32), 4);
        if (A002 == r9) {
            A002 = null;
        }
        2WX A0X2 = C51965G9l.A0X(A002, A0d);
        2Wb A0Q = C51972G9s.A0Q(r7);
        int A022 = C244013aV.A02(A0Q, this.A02);
        long A04 = C244013aV.A04(A0Q);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        String str = this.A03;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A022, A04);
        A0b.A0R(0);
        G9w.A12(create, A0Q, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A12(A0b, num);
        A0b.A0M(1);
        C51974G9v.A0y(A0Q, A0b, false);
        return C243563Zg.A0F(A0Q, r7, A0X2);
    }

    public C53752Gth(C62320sa r2, String str, int i) {
        this.A03 = str;
        this.A02 = i;
        this.A00 = r2;
    }
}

package X;

import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.Gu9  reason: case insensitive filesystem */
public final class C53780Gu9 extends C251343mx {
    public final int A00;
    public final int A01 = R.dimen.abc_text_size_menu_header_material;
    public final 2WX A02;
    public final String A03;
    public final C62320sa A04;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r12 = r17;
        0qQ.A0B(r12, 0);
        2WX r3 = 2WX.A02;
        long A0C = C244013aV.A0C(r12, R.dimen.appreciation_reels_grid_item_width);
        Integer num = AnonymousClass05K.A0C;
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, A0C), AnonymousClass05K.A0E, 0, C244013aV.A05(r12));
        Integer num2 = AnonymousClass05K.A01;
        2WX A003 = C51971G9r.A0Y(A002, num2, true, 4).A00(this.A02);
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A1F, J6E.A00(this, 31), 4);
        if (A003 == r3) {
            A003 = null;
        }
        2WX A0X = C51965G9l.A0X(A003, A0d);
        2Wb A0Q = C51972G9s.A0Q(r12);
        int A022 = C244013aV.A02(A0Q, R.color.grey_9);
        float A0C2 = (float) C51972G9s.A0C(A0Q, 28.0d);
        2WX A0X2 = C51971G9r.A0X((2WX) null, num2, 100.0f, 0);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0K = C51974G9v.A0K(C51971G9r.A0X(A0X2, num3, 100.0f, 0), C51965G9l.A0d(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), num3);
        String str = this.A03;
        if (str != null) {
            A0K = C51971G9r.A0Y(A0K, AnonymousClass05K.A0N, str, 0);
        }
        A0Q.A00(new C53968GxC(C51972G9s.A0U(A0K, num2, 0), A0C2, A022));
        int A023 = A0Q.Bnf().A02(this.A00);
        long A0C3 = C244013aV.A0C(A0Q, this.A01);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A023, A0C3);
        A0b.A0R(0);
        G9w.A12(create, A0Q, A0b, A0D);
        A0b.A0W(num);
        C51974G9v.A12(A0b, num2);
        A0b.A0M(1);
        C51974G9v.A0y(A0Q, A0b, false);
        return C243563Zg.A0F(A0Q, r12, A0X);
    }

    public /* synthetic */ C53780Gu9(2WX r2, String str, C62320sa r4, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = r4;
    }
}

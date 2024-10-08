package X;

import android.graphics.Typeface;
import com.instagram.android.R;

public final class GZ8 extends C251343mx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final 2WX A04;
    public final C62320sa A05;
    public final AnonymousClass0Ud A06;

    public /* synthetic */ GZ8(2WX r3, C62320sa r4, AnonymousClass0Ud r5, int i, int i2, int i3, int i4) {
        r3 = (i4 & 16) != 0 ? null : r3;
        int i5 = (i4 & 64) != 0 ? R.dimen.abc_text_size_menu_header_material : 0;
        i3 = (i4 & 128) != 0 ? R.dimen.account_discovery_bottom_gap : i3;
        0qQ.A0B(r5, 1);
        this.A06 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = r3;
        this.A02 = i5;
        this.A03 = i3;
        this.A05 = r4;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r7 = r17;
        0qQ.A0B(r7, 0);
        2Wa A002 = C58703IwC.A00(r7, this, 34);
        AnonymousClass0Ud r9 = this.A06;
        AnonymousClass11O.A03(19E.A01(), new C61860pz(new C58100ImM(A002, this, (AnonymousClass4D7) null, 5), r9));
        2WX r10 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U((2WX) null, num, 0);
        long A0C = C244013aV.A0C(r7, R.dimen.appreciation_reels_grid_item_width);
        Integer num2 = AnonymousClass05K.A0C;
        2WX A003 = C51973G9u.A0Y(C51971G9r.A0Y(C51973G9u.A0Q(AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0U, num2, 0, A0C), AnonymousClass05K.A0E, 0, C244013aV.A05(r7)), C51967G9n.A0S(0, C244013aV.A03(r7)), 0, C244013aV.A0C(r7, this.A03)), AnonymousClass05K.A00, C244013aV.A0D(r7, this.A00), 4), num, true).A00(this.A04);
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A1F, J6P.A00(this, 45), 4);
        if (A003 == r10) {
            A003 = null;
        }
        2WX A0X = C51965G9l.A0X(A003, A0d);
        2Wb A0Q = C51972G9s.A0Q(r7);
        int A022 = C244013aV.A02(A0Q, this.A01);
        long A0C2 = C244013aV.A0C(A0Q, this.A02);
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, (String) r9.getValue(), 0);
        C51973G9u.A17(A0Q, A0b, A022, A0C2);
        A0b.A0R(0);
        G9w.A12(create, A0Q, A0b, A0D);
        A0b.A0W(num2);
        C51974G9v.A12(A0b, num);
        A0b.A0M(1);
        C51974G9v.A0y(A0Q, A0b, false);
        return C243563Zg.A0F(A0Q, r7, A0X);
    }
}

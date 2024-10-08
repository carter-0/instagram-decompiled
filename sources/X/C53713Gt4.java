package X;

import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gt4  reason: case insensitive filesystem */
public final class C53713Gt4 extends C251343mx {
    public final UserSession A00;
    public final JTB A01;
    public final boolean A02 = true;

    public C53713Gt4(UserSession userSession, JTB jtb) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        C243583Zi r17;
        String str;
        AnonymousClass3Y5 r7 = r33;
        0qQ.A0B(r7, 0);
        boolean A002 = C52368GPp.A00(this.A00);
        Float A0g = C51967G9n.A0g();
        2V5 A003 = C247343gB.A00(r7, A0g);
        2V5 A004 = C247343gB.A00(r7, A0g);
        2V5 A005 = C247343gB.A00(r7, A0g);
        C243673Zt A006 = C243633Zp.A00(r7, C58593IuQ.A00);
        C243673Zt A007 = C243633Zp.A00(r7, C58592IuP.A00);
        C243673Zt A008 = C243633Zp.A00(r7, C58591IuO.A00);
        boolean z = this.A02;
        if (z) {
            r17 = C243583Zi.FLEX_START;
        } else {
            r17 = C243583Zi.FLEX_END;
        }
        long A03 = C244013aV.A03(r7);
        C55996Hr2 Arh = this.A01.Arh();
        2Wa A009 = C58705IwE.A00(r7, Arh, 11);
        C58693Iw2.A00(r7, Arh, A009, new Object[]{Arh}, 17);
        if (z) {
            int i = 2131955354;
            if (A002) {
                i = 2131955355;
            }
            str = C244013aV.A0F(r7, A009.A03, i);
        } else {
            str = null;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A11 = G9t.A11(num, 100.0f, 0);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X(A11, num2, 100.0f, 0), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3);
        C243573Zh r8 = C243573Zh.FLEX_END;
        2WX A0Q = C51973G9u.A0Q(AnonymousClass9JR.A00(C51971G9r.A0Y(A0Y, num2, r8, 3), AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(500.0d)), C51967G9n.A0S(0, C244013aV.A03(r7)), 0, A03);
        2V1 r2 = r7.A05;
        2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Z(C51971G9r.A0W(A005, C51971G9r.A0Y(A0Q, num2, C244013aV.A0D(r7, 2Yu.A0H(r2.A0C, R.attr.igds_color_legibility_gradient)), 4), num2), num2, new C58810Ixv(4, A005, A008, A004, r7, A006, A007, A003), (String) null), num, new C58768IxF(33, A004, A006, A007, A008), (String) null);
        2Wb A0S = AnonymousClass7TG.A0S(r2);
        2WX A0W = C51971G9r.A0W(A004, C51971G9r.A0W(A003, C51974G9v.A0K((2WX) null, C51966G9m.A0k(0, C244013aV.A0C(A0S, R.dimen.abc_select_dialog_padding_start_material)), num2), AnonymousClass05K.A03), num2);
        2V1 r15 = A0S.A00;
        int A0C = C51971G9r.A0C(r15, A0S);
        long A0C2 = C244013aV.A0C(A0S, R.dimen.account_group_management_row_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, str, 0);
        C51973G9u.A17(A0S, A0b, A0C, A0C2);
        A0b.A0R(1);
        G9w.A12(typeface, A0S, A0b, A0D);
        A0b.A0B();
        C51974G9v.A1A(A0b, num2, false, true);
        C244123ag.A00(A0b, A0W);
        C51967G9n.A1G(A0S, A0b);
        return C243563Zg.A07(A0S, r7, A0Z, r8, r17);
    }
}

package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.GtC  reason: case insensitive filesystem */
public final class C53721GtC extends C251343mx {
    public final C267324bN A00;
    public final JTB A01;
    public final C52058GDe A02;

    public C53721GtC(C267324bN r2, C52058GDe gDe, JTB jtb) {
        0qQ.A0B(jtb, 3);
        this.A00 = r2;
        this.A02 = gDe;
        this.A01 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        String A0p;
        AnonymousClass3Y5 r20 = r22;
        boolean A1Z = C51966G9m.A1Z(r20);
        AnonymousClass3Y5 r0 = r20;
        long A0C = C244013aV.A0C(r0, R.dimen.album_preview_add_item_margin);
        long A0C2 = C244013aV.A0C(r0, R.dimen.album_preview_add_item_margin);
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0u, A1Z ? 1 : 0, A0C);
        Integer num = AnonymousClass05K.A1F;
        2WX A003 = AnonymousClass9JR.A00(A002, num, A1Z, A0C2);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(A003, num2, 100.0f, A1Z);
        2Wb A0Q = C51972G9s.A0Q(r20);
        if (this.A02.A0C == HLU.COMPLETE) {
            long A09 = C244013aV.A09(A0Q);
            Integer num3 = AnonymousClass05K.A08;
            2WX A004 = AnonymousClass9JR.A00((2WX) null, num3, A1Z, A09);
            Context A005 = C243803a8.A00(A0Q);
            C267324bN r02 = this.A00;
            0qQ.A0B(r02, 1);
            if (r02.CcK()) {
                A0p = 002.A0T(A005.getString(2131975468), A005.getString(2131975451), ' ');
            } else {
                A0p = C51967G9n.A0p(A005, 2131956125);
            }
            2V1 r4 = A0Q.A00;
            Context context = r4.A0C;
            Context context2 = context;
            int A05 = C51968G9o.A05(context, A0Q);
            long A0C3 = C244013aV.A0C(A0Q, R.dimen.account_group_management_row_text_size);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, A0p, A1Z);
            C51973G9u.A17(A0Q, A0b, A05, A0C3);
            A0b.A0R(A1Z);
            G9w.A12(typeface, A0Q, A0b, A0D);
            A0b.A0B();
            C51974G9v.A1A(A0b, num2, A1Z, true);
            C244123ag.A00(A0b, A004);
            C51967G9n.A1G(A0Q, A0b);
            2WX A10 = G9t.A10(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num3, A1Z, C244013aV.A09(A0Q)), AnonymousClass05K.A06, A1Z, C244013aV.A09(A0Q)), num, J6J.A00(this, 40));
            String A0E = C244013aV.A0E(A0Q, 2131975851);
            int A022 = A0Q.Bnf().A02(2Yu.A0D(context2));
            long A0C4 = C244013aV.A0C(A0Q, R.dimen.account_group_management_row_text_size);
            C244103ae A0b2 = C51971G9r.A0b(r4, (2V5) null, A0E, A1Z);
            C51973G9u.A17(A0Q, A0b2, A022, A0C4);
            A0b2.A0R(A1Z);
            G9w.A12(typeface, A0Q, A0b2, A0D);
            A0b2.A0W(num2);
            C51974G9v.A1A(A0b2, num2, A1Z, true);
            C244123ag.A00(A0b2, A10);
            C51967G9n.A1G(A0Q, A0b2);
        }
        return C243563Zg.A01(A0Q, r20, A0X);
    }
}

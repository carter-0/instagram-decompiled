package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.GtD  reason: case insensitive filesystem */
public final class C53722GtD extends C251343mx {
    public final C267324bN A00;
    public final JTB A01;
    public final C52058GDe A02;

    public final C251263mp A0X(AnonymousClass3Y5 r26) {
        AnonymousClass3Y5 r8 = r26;
        boolean A1Z = C51966G9m.A1Z(r8);
        long A0C = C244013aV.A0C(r8, R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Integer num = AnonymousClass05K.A00;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num, A1Z ? 1 : 0, A0C);
        long A0C2 = C244013aV.A0C(r8, R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00(A002, num2, A1Z, A0C2), num2, 0.0f, 1);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0X2 = C51971G9r.A0X(A0X, num3, 0.0f, 1);
        Drawable A0K = C51968G9o.A0K(r8, R.drawable.instagram_circle_check_pano_outline_24);
        2V1 r4 = r8.A05;
        Context context = r4.A0C;
        Context context2 = context;
        C51973G9u.A0x(A0K, r8, 2Yu.A0H(context, R.attr.igds_color_success));
        C247373gE A0P = C51974G9v.A0P(A0K, r4, A0X2);
        long A0C3 = C244013aV.A0C(r8, R.dimen.abc_dialog_padding_top_material);
        Integer num4 = AnonymousClass05K.A08;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num4, A1Z, A0C3);
        int i = 2131975460;
        String A0E = C244013aV.A0E(r8, 2131975460);
        int A09 = C51972G9s.A09(context2, r8);
        long A0C4 = C244013aV.A0C(r8, R.dimen.account_group_management_row_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, A0E, A1Z);
        C51973G9u.A16(r8, A0b, A09, A0C4);
        A0b.A0R(1);
        G9w.A11(typeface, r8, A0b, A0D);
        A0b.A0W(num3);
        C51974G9v.A1A(A0b, num, A1Z, true);
        2WW A0R = C51967G9n.A0R(A003, A0b);
        2WX A004 = AnonymousClass9JR.A00((2WX) null, num4, A1Z, C244013aV.A09(r8));
        C52058GDe gDe = this.A02;
        0qQ.A0B(gDe, A1Z);
        int ordinal = gDe.A0D.ordinal();
        if (ordinal == 17) {
            i = 2131975458;
        } else if (ordinal == 18) {
            i = 2131975457;
        }
        String A0E2 = C244013aV.A0E(r8, i);
        int A08 = C51969G9p.A08(r8, 2Yu.A08(context2));
        long A0C5 = C244013aV.A0C(r8, R.dimen.account_group_management_row_text_size);
        C244103ae A0b2 = C51971G9r.A0b(r4, (2V5) null, A0E2, A1Z);
        C51973G9u.A16(r8, A0b2, A08, A0C5);
        A0b2.A0R(A1Z);
        G9w.A11(typeface, r8, A0b2, A0D);
        A0b2.A0W(num3);
        C51974G9v.A1A(A0b2, num, A1Z, true);
        2WW A0R2 = C51967G9n.A0R(A004, A0b2);
        2WX A0X3 = C51971G9r.A0X(C51973G9u.A0W(C51973G9u.A0W((2WX) null, r8, num4, R.dimen.abc_dialog_padding_top_material, A1Z), r8, num2, R.dimen.ads_disclosure_footer_top_divider_height, A1Z), num, 100.0f, A1Z);
        int A0A = C51972G9s.A0A(context2, r8, R.attr.igds_color_elevated_separator);
        C53616GrV A005 = C54000Gxi.A00(r4);
        A005.A0B(A0A);
        C244123ag.A00(A005, A0X3);
        C54000Gxi A0A2 = A005.A0A();
        2WX A006 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num4, A1Z, C244013aV.A09(r8)), AnonymousClass05K.A06, A1Z, C244013aV.A09(r8));
        J6J A007 = J6J.A00(this, 41);
        Integer num5 = AnonymousClass05K.A1F;
        2WX A10 = G9t.A10(A006, num5, A007);
        String A0E3 = C244013aV.A0E(r8, 2131975463);
        int A082 = C51969G9p.A08(r8, 2Yu.A0D(context2));
        long A0C6 = C244013aV.A0C(r8, R.dimen.account_group_management_row_text_size);
        C244103ae A0b3 = C51971G9r.A0b(r4, (2V5) null, A0E3, A1Z);
        C51973G9u.A16(r8, A0b3, A082, A0C6);
        A0b3.A0R(A1Z);
        G9w.A11(typeface, r8, A0b3, A0D);
        A0b3.A0W(num);
        C51974G9v.A1A(A0b3, num, A1Z, true);
        2WW A0R3 = C51967G9n.A0R(A10, A0b3);
        2WX A0S = C51973G9u.A0S(C51972G9s.A0R((2WX) null, A1Z, C244013aV.A0C(r8, R.dimen.album_preview_add_item_margin)), C51965G9l.A0c(num5, A1Z, C244013aV.A0C(r8, R.dimen.album_preview_add_item_margin)), num, 100.0f, A1Z);
        2Wb A0J = C51973G9u.A0J(A0P, A0R, r4);
        A0J.A00(A0R2);
        A0J.A00(A0A2);
        A0J.A00(A0R3);
        return C243563Zg.A01(A0J, r8, A0S);
    }

    public C53722GtD(C267324bN r1, C52058GDe gDe, JTB jtb) {
        AnonymousClass7TG.A1P(r1, jtb);
        this.A00 = r1;
        this.A02 = gDe;
        this.A01 = jtb;
    }
}

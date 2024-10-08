package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.GsV  reason: case insensitive filesystem */
public final class C53678GsV extends C251343mx {
    public final JTB A00;
    public final C267324bN A01;

    public C53678GsV(C267324bN r2, JTB jtb) {
        0qQ.A0B(jtb, 2);
        this.A01 = r2;
        this.A00 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        2WW r11;
        2Tp r3;
        AnonymousClass3Y5 r8 = r29;
        0qQ.A0B(r8, 0);
        1Xj r25 = this.A01.A02;
        if (r25 != null) {
            C277994w4 BQf = r25.BQf();
            if (BQf != null) {
                AnonymousClass3XV r0 = 2WX.A02;
                long A0F = C51970G9q.A0F();
                Integer num = AnonymousClass05K.A01;
                2WX A002 = AnonymousClass9JR.A00((2WX) null, num, 0, A0F);
                Integer num2 = AnonymousClass05K.A00;
                2WX A003 = AnonymousClass9JR.A00(A002, num2, 0, A0F);
                Drawable A0D = C244013aV.A0D(r8, C69760Nrj.A00(BQf.BE7()));
                C51973G9u.A0x(A0D, r8, R.color.design_dark_default_color_on_background);
                2V1 r02 = r8.A05;
                2V1 r26 = r02;
                C247393gG A0a = C51971G9r.A0a(A0D, r02);
                A0a.A0C();
                C244123ag.A00(A0a, A003);
                C247373gE A0A = A0a.A0A();
                long A0I = C51970G9q.A0I();
                Integer num3 = AnonymousClass05K.A15;
                2WX A004 = AnonymousClass9JR.A00((2WX) null, num3, 0, A0I);
                String title = BQf.getTitle();
                int A08 = C51969G9p.A08(r8, R.color.design_dark_default_color_on_background);
                long A04 = C244013aV.A04(r8);
                Typeface typeface = Typeface.DEFAULT;
                long A0D2 = C51969G9p.A0D();
                C244103ae A0b = C51971G9r.A0b(r26, (2V5) null, title, 0);
                C51973G9u.A16(r8, A0b, A08, A04);
                A0b.A0R(1);
                G9w.A11(typeface, r8, A0b, A0D2);
                A0b.A0B();
                C51974G9v.A1A(A0b, num2, false, true);
                2WW A0R = C51967G9n.A0R(A004, A0b);
                2WX A0X = C51973G9u.A0X((2WX) null, num3, 8.0d, 0);
                String description = BQf.getDescription();
                int A082 = C51969G9p.A08(r8, R.color.baseline_neutral_80);
                long A042 = C244013aV.A04(r8);
                C244103ae A0b2 = C51971G9r.A0b(r26, (2V5) null, description, 0);
                C51973G9u.A16(r8, A0b2, A082, A042);
                A0b2.A0R(1);
                G9w.A11(typeface, r8, A0b2, A0D2);
                A0b2.A0B();
                C51974G9v.A1A(A0b2, num2, false, true);
                2WW A0R2 = C51967G9n.A0R(A0X, A0b2);
                C278014w6 A012 = C52501GVd.A01(BQf);
                if (A012 != null) {
                    2WX A0P = C51973G9u.A0P((2WX) null, 24.0d);
                    long A0C = C244013aV.A0C(r8, R.dimen.afi_margin_top);
                    long A09 = C244013aV.A09(r8);
                    long A0C2 = C244013aV.A0C(r8, R.dimen.afi_margin_top);
                    long A092 = C244013aV.A09(r8);
                    2WX A005 = AnonymousClass9JR.A00(C51972G9s.A0R(A0P, 0, A0C), num3, 0, A09);
                    Integer num4 = AnonymousClass05K.A1F;
                    2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51974G9v.A0E(A005, C51965G9l.A0c(num4, 0, A0C2), 0, A092), num2, C244013aV.A0D(r8, R.drawable.misinformation_button_background_selector), 4), num4, new C58750Iwx(11, r25, this, A012), 4);
                    int A083 = C51969G9p.A08(r8, R.color.design_dark_default_color_on_background);
                    long A043 = C244013aV.A04(r8);
                    C244103ae A0b3 = C51971G9r.A0b(r26, (2V5) null, A012.getText(), 0);
                    C51973G9u.A16(r8, A0b3, A083, A043);
                    A0b3.A0R(1);
                    G9w.A11(typeface, r8, A0b3, A0D2);
                    A0b3.A0B();
                    C51974G9v.A1A(A0b3, num2, false, true);
                    r11 = C51967G9n.A0R(A0Y, A0b3);
                } else {
                    r11 = null;
                }
                C278014w6 A006 = C52501GVd.A00(BQf);
                if (A006 != null) {
                    C244413b9 r14 = C244413b9.ABSOLUTE;
                    Integer num5 = AnonymousClass05K.A0Y;
                    2WX A0S = C51973G9u.A0S(C51971G9r.A0Y(C51971G9r.A0Y((2WX) null, num5, r14, 3), num2, C243573Zh.FLEX_END, 3), C51970G9q.A0c(r8, num, R.dimen.card_social_context_height, 0), num2, 100.0f, 0);
                    2Wb A0S2 = AnonymousClass7TG.A0S(r26);
                    2WX A0Y2 = C51971G9r.A0Y(C51971G9r.A0Y(C51973G9u.A0S((2WX) null, C51970G9q.A0c(A0S2, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 100.0f, 0), num5, r14, 3), num2, C243573Zh.FLEX_START, 3);
                    int A02 = C244013aV.A02(A0S2, R.color.grey_2);
                    2V1 r20 = A0S2.A00;
                    C53616GrV A007 = C54000Gxi.A00(r20);
                    A007.A0B(A02);
                    C244123ag.A00(A007, A0Y2);
                    A0S2.A00(A007.A0A());
                    2WX A0Z = C51973G9u.A0Z(C51973G9u.A0W((2WX) null, A0S2, num, R.dimen.abc_alert_dialog_button_dimen, 0), new C58750Iwx(10, r25, this, A006));
                    int A022 = A0S2.Bnf().A02(R.color.design_dark_default_color_on_background);
                    long A044 = C244013aV.A04(A0S2);
                    C244103ae A0b4 = C51971G9r.A0b(r20, (2V5) null, A006.getText(), 0);
                    C51973G9u.A17(A0S2, A0b4, A022, A044);
                    A0b4.A0R(1);
                    G9w.A12(typeface, A0S2, A0b4, A0D2);
                    C51974G9v.A19(A0b4, num2, false);
                    A0b4.A0M(1);
                    C51973G9u.A19(A0Z, A0b4, false);
                    C51967G9n.A1G(A0S2, A0b4);
                    r3 = C243563Zg.A0E(A0S2, r8, A0S);
                } else {
                    r3 = null;
                }
                long doubleToRawLongBits = Double.doubleToRawLongBits(30.0d);
                2WX A0O = C51974G9v.A0O(AnonymousClass9JR.A00(C51972G9s.A0R((2WX) null, 0, doubleToRawLongBits), AnonymousClass05K.A1F, 0, doubleToRawLongBits), num, num2, 100.0f, 0);
                2Wb A0S3 = AnonymousClass7TG.A0S(r26);
                2WX A0B = C51974G9v.A0B((2WX) null);
                2Wb A0J = C51973G9u.A0J(A0A, A0R, A0S3.A00);
                A0J.A00(A0R2);
                A0J.A00(r11);
                A0S3.A00(C243563Zg.A01(A0J, A0S3, A0B));
                return C51967G9n.A0O(r3, A0S3, r8, A0O);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}

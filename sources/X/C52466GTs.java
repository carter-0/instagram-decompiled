package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GTs  reason: case insensitive filesystem */
public final class C52466GTs extends C251343mx {
    public final C267324bN A00;
    public final JTB A01;
    public final UserSession A02;

    public C52466GTs(C267324bN r2, UserSession userSession, JTB jtb) {
        0qQ.A0B(jtb, 3);
        this.A00 = r2;
        this.A02 = userSession;
        this.A01 = jtb;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        C277994w4 BQf;
        C278014w6 A022;
        int color;
        C247373gE r23;
        Integer num;
        2WW r2;
        C247373gE A0P;
        String str;
        String light;
        AnonymousClass3Y5 r11 = r34;
        0qQ.A0B(r11, 0);
        C267324bN r0 = this.A00;
        C267324bN r31 = r0;
        1Xj r02 = r0.A02;
        if (r02 == null || (BQf = r02.BQf()) == null || (A022 = C52501GVd.A02(BQf)) == null) {
            return null;
        }
        int A002 = I2I.A00(C243803a8.A00(r11), A022, 2Yu.A07(C243803a8.A00(r11)));
        Context A003 = C243803a8.A00(r11);
        int A08 = 2Yu.A08(C243803a8.A00(r11));
        C46269DSy Bqj = A022.Bqj();
        if (Bqj != null) {
            if (AnonymousClass3HA.A00(A003)) {
                light = Bqj.getDark();
            } else {
                light = Bqj.getLight();
            }
            color = Color.parseColor(light);
        } else {
            color = A003.getColor(A08);
        }
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A06 = C244013aV.A06(r11);
        long A07 = C244013aV.A07(r11);
        long A0C = C244013aV.A0C(r11, R.dimen.abc_dialog_padding_top_material);
        C278034w8 BE7 = A022.BE7();
        if (BE7 != null) {
            AnonymousClass3XV r03 = 2WX.A02;
            2WX A0x = G9t.A0x(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0u, 0, A06), AnonymousClass05K.A0C, 0.0f);
            Drawable A0K = C51968G9o.A0K(r11, C69760Nrj.A00(BE7));
            AnonymousClass7TE.A1R(A0K, A002);
            r23 = C51974G9v.A0P(A0K, r11.A05, A0x);
        } else {
            r23 = null;
        }
        AnonymousClass3XV r04 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A01;
        2WX A11 = G9t.A11(num2, 1.0f, 1);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0X = C51971G9r.A0X(A11, num3, 1.0f, 1);
        String text = A022.getText();
        long A0G = C51972G9s.A0G(12.0f);
        if (0qQ.A0K(A022.Cd6(), true)) {
            num = num3;
        } else {
            num = AnonymousClass05K.A00;
        }
        long A0D = C51969G9p.A0D();
        Integer num4 = AnonymousClass05K.A00;
        2V1 r9 = r11.A05;
        C244103ae A004 = 2WW.A00(r9, 0);
        A004.A0V(text);
        A004.A0U((2V5) null);
        C51973G9u.A16(r11, A004, A002, A0G);
        A004.A0R(0);
        G9w.A11(create, r11, A004, A0D);
        C51970G9q.A1K(A004, num, num4);
        C51970G9q.A1I(A004, 1.33f, false);
        A004.A0E();
        C51973G9u.A19(A0X, A004, false);
        2WW A0A = A004.A0A();
        String secondaryText = A022.getSecondaryText();
        if (secondaryText != null) {
            2WX A0O = C51974G9v.A0O(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, 0, A07), num2, num3, 1.0f, 1);
            Integer num5 = num4;
            if (0qQ.A0K(A022.Cd6(), true)) {
                num5 = num3;
            }
            C244103ae A0b = C51971G9r.A0b(r9, (2V5) null, secondaryText, 0);
            C51973G9u.A16(r11, A0b, color, A0G);
            A0b.A0R(0);
            G9w.A11(create, r11, A0b, A0D);
            A0b.A0W(num5);
            C51974G9v.A14(A0b, num4, 1.33f, false, true);
            r2 = C51971G9r.A0c((AnonymousClass2VW) null, A0O, A0b);
        } else {
            r2 = null;
        }
        2WX A005 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A07, 0, A06);
        Integer num6 = AnonymousClass05K.A08;
        2Tl A03 = C243563Zg.A03(C51973G9u.A0J(A0A, r2, r9), r11, C51974G9v.A0F(A005, C51965G9l.A0c(num6, 0, A06), 0, A06));
        if (!0qQ.A0K(A022.BAn(), true)) {
            A0P = null;
        } else {
            long j = A0C;
            2WX A0S = C51973G9u.A0S(C51972G9s.A0R((2WX) null, 0, j), C51965G9l.A0c(AnonymousClass05K.A1F, 0, j), num3, 0.0f, 1);
            Drawable A0K2 = C51968G9o.A0K(r11, R.drawable.instagram_chevron_right_pano_outline_16);
            Context context = r9.A0C;
            AnonymousClass7TE.A1R(A0K2, context.getResources().getColor(2Yu.A09(context)));
            A0P = C51974G9v.A0P(A0K2, r9, A0S);
        }
        long A0A2 = C244013aV.A0A(r11);
        Integer num7 = num4;
        2WX A0Z = C51971G9r.A0Z(C51972G9s.A0V(C51971G9r.A0Y(C51973G9u.A0R((2WX) null, C51965G9l.A0c(num6, 0, A0A2), 0, C244013aV.A03(r11)), num7, C244013aV.A0D(r11, R.drawable.clips_viewer_inform_banner_background), 4), J6R.A00(this, A022, 27)), num4, J6N.A00(this, 15), (String) null);
        JTB jtb = this.A01;
        if (jtb.CRr(r31) || jtb.CRs(r31)) {
            str = "trans_key_inform_banner";
        } else {
            str = null;
        }
        return C51967G9n.A0Q(A0P, C51973G9u.A0J(r23, A03, r9), r11, C51971G9r.A0V(r9, A0Z, C243533Zd.GLOBAL, str));
    }
}

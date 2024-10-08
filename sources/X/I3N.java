package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class I3N {
    public static final 2Tp A00(C251263mp r33, C70832Wc r34, JPE jpe, C267324bN r36, C52058GDe gDe, UserSession userSession, String str, C62320sa r40, float f, int i, boolean z, boolean z2, boolean z3) {
        C243583Zi r19;
        C251263mp gNv;
        C251263mp r0;
        C251263mp A01;
        C52058GDe gDe2 = gDe;
        C51969G9p.A1N(gDe2, 4, userSession);
        AnonymousClass3XV r02 = 2WX.A02;
        C70832Wc r32 = r34;
        long A0C = C244013aV.A0C(r32, R.dimen.account_group_management_title_text_horizontal_padding);
        Integer num = AnonymousClass05K.A01;
        2WW r7 = null;
        2WX A00 = AnonymousClass9JR.A00((2WX) null, num, 0, A0C);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(A00, num2, 95.0f, 0);
        int i2 = 0;
        int i3 = 0;
        if (z3) {
            i3 = R.dimen.abc_select_dialog_padding_start_material;
        }
        C70832Wc r03 = r32;
        long A0C2 = C244013aV.A0C(r03, i3);
        if (!z3) {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        2WX A0U = C51972G9s.A0U(C51974G9v.A0F(AnonymousClass9JR.A00(A0X, AnonymousClass05K.A08, 0, C244013aV.A0A(r32)), C51967G9n.A0T(0, A0C2), 0, C244013aV.A0C(r03, i2)), num, 0);
        J6E A002 = J6E.A00(r40, 41);
        Integer num3 = AnonymousClass05K.A1F;
        2WX A0Y = C51971G9r.A0Y(A0U, num3, A002, 4);
        C243573Zh r21 = C243573Zh.CENTER;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num2, r21, 3);
        if (z3) {
            2V1 Aqq = r32.Aqq();
            C243533Zd r2 = C243533Zd.GLOBAL;
            A0Y2 = A0Y2.A00(C51971G9r.A0V(Aqq, (2WX) null, r2, "trans_key_clips_cta")).A00(C51971G9r.A0V(Aqq, (2WX) null, r2, "trans_key_dwell_cta"));
            r19 = C243583Zi.FLEX_START;
        } else {
            r19 = C243583Zi.SPACE_BETWEEN;
        }
        C243573Zh r18 = C243573Zh.FLEX_START;
        2Wb A0M = C51973G9u.A0M(r32);
        int A02 = C244013aV.A02(A0M, R.color.grey_2_20_transparent);
        long A0A = C244013aV.A0A(A0M);
        2WX A0O = C51974G9v.A0O((2WX) null, num, num2, 100.0f, 0);
        C244413b9 r8 = C244413b9.ABSOLUTE;
        Integer num4 = AnonymousClass05K.A0Y;
        A0M.A00(new C53802GuV(C51971G9r.A0Y(A0O, num4, r8, 3), A02, i, A0A, (long) (f * 1000.0f)));
        JPE jpe2 = jpe;
        if (jpe == null) {
            gNv = new AnonymousClass3XA();
        } else {
            gNv = new C52328GNv(C51971G9r.A0Y(C51974G9v.A0O((2WX) null, num2, num, 100.0f, 0), num4, r8, 3), jpe2, r36, gDe2);
        }
        A0M.A00(gNv);
        2WX A0X2 = C51971G9r.A0X(C51974G9v.A0O((2WX) null, num, num2, 100.0f, 0), num, 1.0f, 1);
        2Wb A0w = G9t.A0w(A0M);
        String str2 = str;
        if (str != null) {
            2WX A0Y3 = C51971G9r.A0Y(C51973G9u.A0T((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, C244013aV.A0B(A0w)), num2, r21, 3), AnonymousClass05K.A0N, str2, 0);
            2V1 Aqq2 = A0w.Aqq();
            int A0C3 = C51971G9r.A0C(Aqq2, A0w);
            long A04 = C244013aV.A04(A0w);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(Aqq2, (2V5) null, str2, 0);
            C51973G9u.A17(A0w, A0b, A0C3, A04);
            A0b.A0R(1);
            G9w.A12(typeface, A0w, A0b, A0D);
            C51970G9q.A1J(A0b, num2);
            C51972G9s.A17(A0b);
            C51974G9v.A0z(A0Y3, A0b, false);
            r0 = A0b.A0A();
        } else {
            r0 = null;
        }
        A0w.A00(r0);
        C251263mp r16 = r33;
        if (z) {
            if (r33 != null) {
                2WX A0T = C51973G9u.A0T((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, C244013aV.A0C(A0w, R.dimen.abc_edit_text_inset_bottom_material)), num2, r21, 3);
                String A0E = C244013aV.A0E(A0w, 2131960999);
                2V1 Aqq3 = A0w.Aqq();
                int A0C4 = C51971G9r.A0C(Aqq3, A0w);
                long A042 = C244013aV.A04(A0w);
                Typeface typeface2 = Typeface.DEFAULT;
                long A0D2 = C51969G9p.A0D();
                C244103ae A0b2 = C51971G9r.A0b(Aqq3, (2V5) null, A0E, 0);
                C51973G9u.A17(A0w, A0b2, A0C4, A042);
                A0b2.A0R(0);
                G9w.A12(typeface2, A0w, A0b2, A0D2);
                C51970G9q.A1J(A0b2, num2);
                C51972G9s.A17(A0b2);
                C51974G9v.A0z(A0T, A0b2, false);
                r7 = A0b2.A0A();
            }
            A0w.A00(r7);
        }
        C51971G9r.A1C(r16, A0w, A0M, A0X2);
        if (z2) {
            A01 = new C53962Gx6(C51973G9u.A0T(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, C244013aV.A0B(A0M)), num, 0, C244013aV.A0B(A0M)), C51965G9l.A0c(AnonymousClass05K.A06, 0, C51967G9n.A06(A0M)), num2, r21, 3), R.drawable.nav_spinner);
        } else {
            A01 = A01(A0M, C51973G9u.A0T((2WX) null, C51965G9l.A0c(num3, 0, C244013aV.A0B(A0M)), num2, r21, 3));
        }
        A0M.A00(A01);
        return C243563Zg.A0I(A0M, r32, A0Y2, r18, r19);
    }

    public static final C53968GxC A02(C70832Wc r6, 2WX r7, int i) {
        int A08 = C51969G9p.A08(r6, i);
        float A09 = (float) C51969G9p.A09(r6, C244013aV.A0A(r6));
        AnonymousClass3XV r0 = 2WX.A02;
        return new C53968GxC(C51974G9v.A0B(C51971G9r.A0X(G9t.A11(AnonymousClass05K.A01, 100.0f, 0), AnonymousClass05K.A00, 100.0f, 0)).A00(r7), A09, A08);
    }

    public static final C247373gE A01(C70832Wc r3, 2WX r4) {
        Drawable A0K = C51968G9o.A0K(r3, R.drawable.chevron_right);
        Context context = r3.Aqq().A0C;
        DbX.A11(context, A0K, 2Yu.A05(context));
        return C51974G9v.A0P(A0K, r3.Aqq(), r4);
    }
}

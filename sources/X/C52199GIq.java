package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;

/* renamed from: X.GIq  reason: case insensitive filesystem */
public abstract class C52199GIq {
    public static final 2WX A00(C70832Wc r5) {
        return A01(r5, (Integer) null, false, false, false, false);
    }

    public static final 2WX A01(C70832Wc r7, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        2WX A0T;
        if (!z2 || !z) {
            i = R.drawable.clips_viewer_pill_background_attribute_pill_system;
            if (z4) {
                i = R.drawable.clips_viewer_pill_background_attribute_pill_system_prompt_design;
            }
        } else {
            i = R.drawable.clips_viewer_pill_invert_background_attribute_pill_system;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        long A0C = C244013aV.A0C(r7, R.dimen.afi_margin_top);
        2WX A10 = G9t.A10(C51973G9u.A0Q((2WX) null, C51967G9n.A0S(0, A0C), 0, C244013aV.A0C(r7, R.dimen.accent_edge_thickness)), AnonymousClass05K.A00, C244013aV.A0D(r7, i));
        if (z3) {
            A0T = AnonymousClass9JR.A00(A10, AnonymousClass05K.A0Y, 0, C244013aV.A0C(r7, R.dimen.asset_picker_section_title_horizontal_padding));
        } else if (z4) {
            A0T = C51972G9s.A0T(A10, 0, C51967G9n.A06(r7));
        } else {
            A0T = C51972G9s.A0T(A10, 0, C244013aV.A0C(r7, R.dimen.asset_picker_section_title_horizontal_padding));
        }
        if (num != null) {
            A0T = AnonymousClass9JR.A00(A0T, AnonymousClass05K.A0N, 0, C51969G9p.A0G(num.intValue()));
        }
        return A0T.A00((2WX) null);
    }

    public static final 2WW A02(C70832Wc r12, 2WX r13, String str, boolean z) {
        int A0A;
        0qQ.A0B(str, 1);
        2WX r7 = 2WX.A02;
        2WX A00 = r7.A00(r13);
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A0E, 0, C244013aV.A05(r12));
        if (A00 == r7) {
            A00 = null;
        }
        2WX A002 = AnonymousClass9JR.A00(C51965G9l.A0X(A00, A0c), AnonymousClass05K.A0j, 0, C244013aV.A03(r12));
        Integer num = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A002, num, 0);
        if (z) {
            A0A = R.color.fds_white_alpha80;
        } else {
            A0A = 2Yu.A0A(C51969G9p.A0K(r12));
        }
        int A08 = C51969G9p.A08(r12, A0A);
        long A082 = C244013aV.A08(r12);
        2V1 Aqq = r12.Aqq();
        Context context = Aqq.A0C;
        Integer num2 = AnonymousClass05K.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        0qQ.A08(typeface);
        Typeface A03 = 0oh.A03(context, typeface, num2);
        long A0D = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(Aqq, str, A08);
        C51971G9r.A1J(A13, r12.Bnf(), 0, A082);
        A13.A0S(A03);
        A13.A0F();
        C51974G9v.A10(A13, r12, C51969G9p.A09(r12, A0D), A0D);
        A13.A0H((float) C51969G9p.A09(r12, A0D));
        A13.A0W(num2);
        C51974G9v.A12(A13, num);
        A13.A0M(1);
        A13.A0b(false);
        G9t.A1N(A13, false);
        return C51967G9n.A0R(A0U, A13);
    }
}

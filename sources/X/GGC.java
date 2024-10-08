package X;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class GGC extends C251343mx {
    public final boolean A00;
    public final boolean A01;

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        AnonymousClass3Y5 r9 = r21;
        0qQ.A0B(r9, 0);
        if (this.A01) {
            return new C251343mx();
        }
        if (!this.A00) {
            return null;
        }
        Drawable A0D = C244013aV.A0D(r9, R.drawable.instagram_fast_forward_pano_filled_24);
        A0D.setColorFilter(C51969G9p.A08(r9, R.color.design_dark_default_color_on_background), PorterDuff.Mode.SRC_IN);
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0U = C51973G9u.A0U(C51971G9r.A0Y(C51971G9r.A0Y(C51965G9l.A0X((2WX) null, C51968G9o.A0c(num, 0)), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), num, C243573Zh.FLEX_END, 3), r9, 2131955463);
        2Wb A0K = C51973G9u.A0K(r9);
        String A0E = C244013aV.A0E(A0K, 2131955463);
        long A05 = C244013aV.A05(A0K);
        2V1 r4 = A0K.A00;
        int A0C = C51971G9r.A0C(r4, A0K);
        long A04 = C244013aV.A04(A0K);
        long A06 = C51967G9n.A06(A0K);
        Integer num2 = AnonymousClass05K.A0A;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num2, 0, A06);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r4, (2V5) null, A0E, 0);
        C51973G9u.A17(A0K, A0b, A0C, A04);
        A0b.A0R(0);
        A0b.A0S(typeface);
        A0b.A0F();
        G9w.A1F(A0K, A0b, C51968G9o.A09(A0K, A05), A0D2);
        C51970G9q.A1J(A0b, num);
        A0b.A0G();
        A0b.A0a(false);
        A0b.A0N(1);
        A0b.A0E();
        C51973G9u.A19(A002, A0b, false);
        C51967G9n.A1G(A0K, A0b);
        2WX A0Y = C51971G9r.A0Y(C51974G9v.A0I((2WX) null, C51970G9q.A0c(A0K, num, R.dimen.abc_edit_text_inset_top_material, 0), A0K, R.dimen.abc_edit_text_inset_top_material), num, C243573Zh.CENTER, 3);
        long A052 = C244013aV.A05(A0K);
        C51974G9v.A0h(A0D, r4, A0K, AnonymousClass9JR.A00(C51972G9s.A0S(A0Y, 0, A052), num2, 0, C244013aV.A0C(A0K, R.dimen.ai_agent_share_profile_sticker_padding)));
        return C243563Zg.A0F(A0K, r9, A0U);
    }

    public GGC(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}

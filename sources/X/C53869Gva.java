package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Gva  reason: case insensitive filesystem */
public final class C53869Gva extends C251343mx {
    public final C55676HlZ A00;
    public final JT5 A01;
    public final List A02;
    public final List A03;
    public final float A04;
    public final C251263mp A05;
    public final C251263mp A06;
    public final C251263mp A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r35) {
        int i;
        JT5 jt5;
        AnonymousClass3Y5 r33 = r35;
        AnonymousClass3Y5 r0 = r33;
        0qQ.A0B(r0, 0);
        2Wa A002 = C58703IwC.A00(r0, this, 28);
        int A0M = AnonymousClass7TE.A0M(A002.A03);
        if (A0M < this.A02.size() && (jt5 = this.A01) != null) {
            jt5.FJY(DbZ.A0T(this.A03, A0M), "", A0M);
        }
        AnonymousClass3XV r02 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        C244413b9 r14 = C244413b9.RELATIVE;
        Integer num3 = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y(A0X2, num3, r14, 3);
        2Wb A0Q = C51972G9s.A0Q(r33);
        C251263mp r03 = this.A05;
        if (r03 != null) {
            A0Q.A00(r03);
        }
        2WX A0Y2 = C51971G9r.A0Y((2WX) null, num3, r14, 3);
        long A0G = C51969G9p.A0G((int) (((float) C51972G9s.A0D(A0Q, R.dimen.audience_selector_pill_layout_height)) + this.A04));
        Integer num4 = AnonymousClass05K.A08;
        2WX A003 = AnonymousClass9JR.A00(A0Y2, num4, 0, A0G);
        long A0C = C244013aV.A0C(A0Q, R.dimen.abc_dropdownitem_icon_width);
        Integer num5 = AnonymousClass05K.A04;
        2WX A0X3 = C51971G9r.A0X(AnonymousClass9JR.A00(A003, num5, 0, A0C), num2, 1.0f, 1);
        Integer num6 = AnonymousClass05K.A0C;
        2WX A0X4 = C51971G9r.A0X(A0X3, num6, 0.0f, 1);
        long A0C2 = C244013aV.A0C(A0Q, R.dimen.ai_agent_share_profile_sticker_padding);
        String str = this.A09;
        2V1 r04 = A0Q.A00;
        2V1 r32 = r04;
        Context context = r04.A0C;
        Context context2 = context;
        Typeface typeface = Typeface.DEFAULT;
        Typeface A032 = 0oh.A03(context, typeface, num6);
        int A052 = C51968G9o.A05(context, A0Q);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r32, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A052, A0C2);
        A0b.A0R(0);
        G9w.A12(A032, A0Q, A0b, A0D);
        A0b.A0W(num6);
        C51973G9u.A1A(A0b, num, 1.0f, false);
        A0b.A0M(2);
        C51974G9v.A0z(A0X4, A0b, false);
        C51967G9n.A1G(A0Q, A0b);
        String str2 = this.A08;
        String str3 = str2;
        if (str2 != null) {
            2WX A0Y3 = C51971G9r.A0Y((2WX) null, num3, r14, 3);
            boolean z = this.A0B;
            int i2 = R.dimen.account_discovery_bottom_gap;
            if (z) {
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            long A0C3 = C244013aV.A0C(A0Q, i2);
            long A033 = C244013aV.A03(A0Q);
            2WX A0X5 = C51971G9r.A0X(C51973G9u.A0S(C51974G9v.A0F(A0Y3, C51965G9l.A0c(num4, 0, A0C3), 0, A033), C51970G9q.A0c(A0Q, num5, R.dimen.abc_dropdownitem_icon_width, 0), num2, 1.0f, 1), num6, 0.0f, 1);
            long A0B2 = C244013aV.A0B(A0Q);
            Typeface A034 = 0oh.A03(context2, typeface, num);
            int A022 = A0Q.Bnf().A02(R.color.grey_4);
            C244103ae A0b2 = C51971G9r.A0b(r32, (2V5) null, str3, 0);
            C51973G9u.A17(A0Q, A0b2, A022, A0B2);
            A0b2.A0R(0);
            G9w.A12(A034, A0Q, A0b2, A0D);
            A0b2.A0W(num6);
            C51974G9v.A14(A0b2, num, 1.0f, false, true);
            A0b2.A0D();
            G9t.A1M(A0Q, A0X5, A0b2);
        } else {
            2WX A0S = C51973G9u.A0S(C51971G9r.A0Y((2WX) null, num3, r14, 3), C51968G9o.A0c(num, 0), num2, 1.0f, 1);
            boolean z2 = this.A0A;
            int i3 = R.dimen.abc_select_dialog_padding_start_material;
            if (z2) {
                i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            A0Q.A00(C243563Zg.A09(A0Q, C51973G9u.A0W(A0S, A0Q, num2, i3, 0)));
        }
        2WX A0O = C51974G9v.A0O((2WX) null, num2, num, 100.0f, 0);
        C251263mp r6 = this.A07;
        if (r6 != null) {
            i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        } else {
            boolean z3 = this.A0B;
            i = R.dimen.abc_dialog_padding_material;
            if (z3) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
        }
        2WX A0T = C51973G9u.A0T(A0O, C51965G9l.A0c(AnonymousClass05K.A1I, 0, C244013aV.A0C(A0Q, i)), num3, r14, 3);
        2Wb A0S2 = AnonymousClass7TG.A0S(r32);
        long A0C4 = C244013aV.A0C(A0S2, R.dimen.clips_multiads_mega_card_height);
        long A0C5 = C244013aV.A0C(A0S2, R.dimen.album_preview_view_width);
        long A062 = C244013aV.A06(A0S2);
        C51971G9r.A1C(new C53976GxK(C51974G9v.A0O((2WX) null, num, num2, 100.0f, 0), C51965G9l.A0e(A062), J6P.A00(this, 43), J6Q.A00(A002, this, 25), A0C5, A0C4), A0S2, A0Q, A0T);
        if (r6 != null) {
            A0Q.A00(r6);
        }
        C251263mp r05 = this.A06;
        if (r05 != null) {
            A0Q.A00(r05);
        }
        return C243563Zg.A01(A0Q, r33, A0Y);
    }

    public C53869Gva(C251263mp r1, C251263mp r2, C251263mp r3, C55676HlZ hlZ, JT5 jt5, String str, String str2, List list, List list2, float f, boolean z, boolean z2) {
        this.A05 = r1;
        this.A09 = str;
        this.A08 = str2;
        this.A03 = list;
        this.A02 = list2;
        this.A04 = f;
        this.A07 = r2;
        this.A0B = z;
        this.A06 = r3;
        this.A0A = z2;
        this.A01 = jt5;
        this.A00 = hlZ;
    }
}

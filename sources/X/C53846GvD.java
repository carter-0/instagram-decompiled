package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.GvD  reason: case insensitive filesystem */
public final class C53846GvD extends C251343mx {
    public final float A00;
    public final C251263mp A01;
    public final C251263mp A02;
    public final C251263mp A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C53846GvD(C251263mp r2, C251263mp r3, C251263mp r4, String str, String str2, List list, float f, boolean z, boolean z2) {
        0qQ.A0B(str, 2);
        this.A01 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = list;
        this.A00 = f;
        this.A03 = r3;
        this.A08 = z;
        this.A02 = r4;
        this.A07 = z2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r34) {
        int i;
        AnonymousClass3Y5 r32 = r34;
        boolean A1Z = C51966G9m.A1Z(r32);
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, A1Z ? 1 : 0));
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, A1Z);
        C244413b9 r10 = C244413b9.RELATIVE;
        Integer num3 = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y(A0X2, num3, r10, 3);
        2Wb A0Q = C51972G9s.A0Q(r32);
        C251263mp r0 = this.A01;
        if (r0 != null) {
            A0Q.A00(r0);
        }
        2WX A0Y2 = C51971G9r.A0Y((2WX) null, num3, r10, 3);
        long A0G = C51969G9p.A0G((int) (((float) C51972G9s.A0D(A0Q, R.dimen.audience_selector_pill_layout_height)) + this.A00));
        Integer num4 = AnonymousClass05K.A08;
        2WX A002 = AnonymousClass9JR.A00(A0Y2, num4, A1Z, A0G);
        long A0C = C244013aV.A0C(A0Q, R.dimen.abc_dropdownitem_icon_width);
        Integer num5 = AnonymousClass05K.A04;
        2WX A0X3 = C51971G9r.A0X(AnonymousClass9JR.A00(A002, num5, A1Z, A0C), num2, 1.0f, 1);
        Integer num6 = AnonymousClass05K.A0C;
        2WX A0X4 = C51971G9r.A0X(A0X3, num6, 0.0f, 1);
        long A0C2 = C244013aV.A0C(A0Q, R.dimen.ai_agent_share_profile_sticker_padding);
        String str = this.A05;
        2V1 r02 = A0Q.A00;
        2V1 r31 = r02;
        Context context = r02.A0C;
        Context context2 = context;
        Typeface typeface = Typeface.DEFAULT;
        Typeface A032 = 0oh.A03(context, typeface, num6);
        int A052 = C51968G9o.A05(context, A0Q);
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r31, (2V5) null, str, A1Z);
        C51973G9u.A17(A0Q, A0b, A052, A0C2);
        A0b.A0R(A1Z);
        G9w.A12(A032, A0Q, A0b, A0D);
        A0b.A0W(num6);
        C51973G9u.A1A(A0b, num, 1.0f, A1Z);
        A0b.A0M(2);
        C51974G9v.A0z(A0X4, A0b, A1Z);
        C51967G9n.A1G(A0Q, A0b);
        String str2 = this.A04;
        String str3 = str2;
        if (str2 != null) {
            2WX A0Y3 = C51971G9r.A0Y((2WX) null, num3, r10, 3);
            boolean z = this.A08;
            int i2 = R.dimen.account_discovery_bottom_gap;
            if (z) {
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            long A0C3 = C244013aV.A0C(A0Q, i2);
            long A033 = C244013aV.A03(A0Q);
            2WX A0X5 = C51971G9r.A0X(C51973G9u.A0S(C51974G9v.A0F(A0Y3, C51965G9l.A0c(num4, A1Z, A0C3), A1Z, A033), C51970G9q.A0c(A0Q, num5, R.dimen.abc_dropdownitem_icon_width, A1Z), num2, 1.0f, 1), num6, 0.0f, 1);
            long A0B = C244013aV.A0B(A0Q);
            Typeface A034 = 0oh.A03(context2, typeface, num);
            int A022 = A0Q.Bnf().A02(R.color.grey_4);
            C244103ae A0b2 = C51971G9r.A0b(r31, (2V5) null, str3, A1Z);
            C51973G9u.A17(A0Q, A0b2, A022, A0B);
            A0b2.A0R(A1Z);
            G9w.A12(A034, A0Q, A0b2, A0D);
            A0b2.A0W(num6);
            C51974G9v.A14(A0b2, num, 1.0f, A1Z, true);
            A0b2.A0D();
            G9t.A1M(A0Q, A0X5, A0b2);
        } else {
            2WX A0S = C51973G9u.A0S(C51971G9r.A0Y((2WX) null, num3, r10, 3), C51968G9o.A0c(num, A1Z), num2, 1.0f, 1);
            boolean z2 = this.A07;
            int i3 = R.dimen.abc_select_dialog_padding_start_material;
            if (z2) {
                i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            A0Q.A00(C243563Zg.A09(A0Q, C51973G9u.A0W(A0S, A0Q, num2, i3, A1Z)));
        }
        2WX A0O = C51974G9v.A0O((2WX) null, num2, num, 100.0f, A1Z);
        boolean z3 = this.A08;
        int i4 = R.dimen.abc_dialog_padding_material;
        if (z3) {
            i4 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        long A0C4 = C244013aV.A0C(A0Q, i4);
        int i5 = R.dimen.abc_dialog_padding_material;
        if (z3) {
            i5 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        long A0C5 = C244013aV.A0C(A0Q, i5);
        C251263mp r13 = this.A03;
        C251263mp r22 = r13;
        if (r13 != null) {
            i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        } else {
            i = R.dimen.abc_dialog_padding_material;
            if (z3) {
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
        }
        long A0C6 = C244013aV.A0C(A0Q, i);
        Integer num7 = AnonymousClass05K.A0u;
        2WX A003 = AnonymousClass9JR.A00(A0O, num7, A1Z, A0C4);
        Integer num8 = AnonymousClass05K.A1F;
        2WX A0Y4 = C51971G9r.A0Y(C51974G9v.A0E(A003, C51965G9l.A0c(num8, A1Z, A0C5), A1Z, A0C6), num3, r10, 3);
        2Wb A0S2 = AnonymousClass7TG.A0S(r31);
        2WX A0T = C51973G9u.A0T(C51974G9v.A0O((2WX) null, num2, num, 100.0f, A1Z), C51965G9l.A0c(num8, A1Z, C244013aV.A09(A0S2)), num3, r10, 3);
        2V1 r24 = A0S2.A00;
        2Wb A0S3 = AnonymousClass7TG.A0S(r24);
        List list = this.A06;
        A0S3.A00((C251263mp) list.get(A1Z));
        A0S3.A00(C243563Zg.A09(A0S3, C51973G9u.A0W(C51971G9r.A0X(C51973G9u.A0S((2WX) null, C51965G9l.A0d(num3, r10, 3), num, 100.0f, A1Z), num2, 1.0f, 1), A0S3, num2, R.dimen.abc_dialog_padding_material, A1Z)));
        C51971G9r.A1D((C251263mp) list.get(2), A0S3, A0S2, A0T);
        2WX A0T2 = C51973G9u.A0T(C51974G9v.A0O((2WX) null, num2, num, 100.0f, A1Z), C51965G9l.A0c(num7, A1Z, C244013aV.A09(A0S2)), num3, r10, 3);
        2Wb A0S4 = AnonymousClass7TG.A0S(r24);
        A0S4.A00((C251263mp) list.get(1));
        A0S4.A00(C243563Zg.A09(A0S4, C51973G9u.A0W(C51971G9r.A0X(C51973G9u.A0S((2WX) null, C51965G9l.A0d(num3, r10, 3), num, 100.0f, A1Z), num2, 1.0f, 1), A0S4, num2, R.dimen.abc_dialog_padding_material, A1Z)));
        2Wb r03 = A0S2;
        C51971G9r.A1C(C51967G9n.A0N((C251263mp) list.get(3), A0S4, r03, A0T2), r03, A0Q, A0Y4);
        if (r22 != null) {
            A0Q.A00(r22);
        }
        C251263mp r04 = this.A02;
        if (r04 != null) {
            A0Q.A00(r04);
        }
        return C243563Zg.A01(A0Q, r32, A0Y);
    }
}

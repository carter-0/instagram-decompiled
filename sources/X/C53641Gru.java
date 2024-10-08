package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Gru  reason: case insensitive filesystem */
public final class C53641Gru extends C251343mx {
    public final String A00;

    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        AnonymousClass3Y5 r9 = r25;
        0qQ.A0B(r9, 0);
        long A0C = C244013aV.A0C(r9, R.dimen.action_button_settings_height);
        long A03 = C244013aV.A03(r9);
        long A0C2 = C244013aV.A0C(r9, R.dimen.achievements_only_you_top_margin);
        long A0C3 = C244013aV.A0C(r9, R.dimen.ad4ad_button_bottom_margin);
        Drawable A0D = C244013aV.A0D(r9, R.drawable.instagram_arrow_left_pano_outline_24);
        2V1 r11 = r9.A05;
        Context context = r11.A0C;
        A0D.setTint(C51969G9p.A08(r9, 2Yu.A0B(context)));
        AnonymousClass3XV r0 = 2WX.A02;
        int A08 = C51969G9p.A08(r9, 2Yu.A0C(context));
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, C51965G9l.A0Y(A08), 4)), AnonymousClass05K.A0D, "clips_cta_right_panel_component", 4);
        C243573Zh r18 = C243573Zh.FLEX_START;
        2Wb A0S = AnonymousClass7TG.A0S(r11);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Integer num2 = AnonymousClass05K.A0u;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, num2, 0, A03);
        Integer num3 = AnonymousClass05K.A15;
        2WX A003 = AnonymousClass9JR.A00(A002, num3, 0, A03);
        Integer num4 = AnonymousClass05K.A1F;
        2WX A004 = AnonymousClass9JR.A00(A003, num4, 0, A03);
        Integer num5 = AnonymousClass05K.A1I;
        2WX A005 = AnonymousClass9JR.A00(C51972G9s.A0T(AnonymousClass9JR.A00(A004, num5, 0, A0C3), 0, A0C), num, 0, A0C);
        2V1 r02 = A0S.A00;
        2V1 r15 = r02;
        C247393gG A006 = C247373gE.A00(r02);
        A006.A0D(A0D);
        A006.A0E(scaleType);
        boolean A1W = C51973G9u.A1W(A0S, A005, A006);
        String str = this.A00;
        2WX A007 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A03), num3, 0, A0C2), num4, 0, A03), num5, 0, A03);
        Typeface A02 = AnonymousClass0qo.A00(C243803a8.A00(A0S)).A02(0qm.A11);
        int A06 = C51968G9o.A06(C243803a8.A00(A0S), A0S);
        long A0C4 = C244013aV.A0C(A0S, R.dimen.backup_codes_text_size);
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, str, 0);
        C51973G9u.A17(A0S, A0b, A06, A0C4);
        A0b.A0R(A1W ? 1 : 0);
        G9w.A12(A02, A0S, A0b, A0D2);
        A0b.A0W(num);
        C51974G9v.A1A(A0b, num, false, A1W);
        C244123ag.A00(A0b, A007);
        C51967G9n.A1G(A0S, A0b);
        return C243563Zg.A0I(A0S, r9, A0Y, r18, (C243583Zi) null);
    }

    public C53641Gru(String str) {
        this.A00 = str;
    }
}

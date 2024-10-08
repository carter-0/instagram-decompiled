package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Grb  reason: case insensitive filesystem */
public final class C53622Grb extends C251343mx {
    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        AnonymousClass3Y5 r13 = r27;
        0qQ.A0B(r13, 0);
        long A0C = C244013aV.A0C(r13, R.dimen.abc_alert_dialog_button_dimen);
        long A06 = C244013aV.A06(r13);
        Drawable A0D = C244013aV.A0D(r13, R.drawable.browser_close_button);
        A0D.setTint(C51969G9p.A08(r13, R.color.black));
        AnonymousClass3XV r0 = 2WX.A02;
        int A08 = C51969G9p.A08(r13, R.color.design_dark_default_color_on_background);
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, C51965G9l.A0Y(A08), 4)), AnonymousClass05K.A0D, "clips_cta_right_panel_component", 4);
        C243573Zh r24 = C243573Zh.FLEX_START;
        2Wb A0Q = C51972G9s.A0Q(r13);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        2WX A00 = AnonymousClass9JR.A00((2WX) null, num, 0, A0C);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A00, num2, 0, A0C);
        2V1 r7 = A0Q.A00;
        C247393gG A003 = C247373gE.A00(r7);
        A003.A0D(A0D);
        A003.A0E(scaleType);
        boolean A1W = C51973G9u.A1W(A0Q, A002, A003);
        long A03 = C244013aV.A03(A0Q);
        2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, num2, 0, A0C), num2, 1.0f, A1W ? 1 : 0);
        Typeface A0N = AnonymousClass7TG.A0N(C243803a8.A00(A0Q));
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r7, (2V5) null, "Loading...", 0);
        C51973G9u.A17(A0Q, A0b, -16777216, A03);
        A0b.A0R(0);
        G9w.A12(A0N, A0Q, A0b, A0D2);
        A0b.A0W(num);
        C51974G9v.A14(A0b, num2, 1.0f, false, A1W);
        G9t.A1M(A0Q, A0X, A0b);
        Drawable A0D3 = C244013aV.A0D(A0Q, R.drawable.instagram_clock_dotted_pano_outline_24);
        2WX A004 = AnonymousClass9JR.A00((2WX) null, num2, 0, A0C);
        Integer num3 = AnonymousClass05K.A0u;
        2WX A005 = AnonymousClass9JR.A00(A004, num3, 0, A06);
        Integer num4 = AnonymousClass05K.A1F;
        C51974G9v.A0g(A0D3, scaleType, r7, A0Q, AnonymousClass9JR.A00(A005, num4, 0, A06));
        C51974G9v.A0g(C244013aV.A0D(A0Q, R.drawable.instagram_more_vertical_pano_filled_24), scaleType, r7, A0Q, AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, A0C), num3, 0, A06), num4, 0, A06));
        return C243563Zg.A0I(A0Q, r13, A0Y, r24, (C243583Zi) null);
    }
}

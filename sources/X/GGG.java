package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.instagram.android.R;

public final class GGG extends C251343mx {
    public final C59602JPw A00;
    public final C52093GEn A01;
    public final C62320sa A02;

    public GGG(C59602JPw jPw, C52093GEn gEn, C62320sa r4) {
        0qQ.A0B(jPw, 2);
        this.A01 = gEn;
        this.A00 = jPw;
        this.A02 = r4;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        0qQ.A0B(r14, 0);
        C52093GEn gEn = this.A01;
        AnonymousClass3W1 r3 = gEn.A03;
        if (r3 != null) {
            2Wa A012 = C243753a2.A01(r14, r3, C52147GGp.A00, 75, false);
            2Wa A013 = C243753a2.A01(r14, r3, C52148GGq.A00, 55, false);
            if (C51969G9p.A1V(A012)) {
                boolean A1V = C51969G9p.A1V(A013);
                AnonymousClass3XV r0 = 2WX.A02;
                Integer num = AnonymousClass05K.A01;
                2WX A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
                Integer num2 = AnonymousClass05K.A00;
                2WX A0Z = C51971G9r.A0Z(C51974G9v.A0B(C51971G9r.A0X(A0X, num2, 100.0f, 0)), num2, new C58736Iwj(45, this, A1V), (String) null);
                boolean z = r3.A1q;
                int i = R.color.fds_transparent;
                if (z) {
                    i = R.color.black_60_transparent;
                }
                2WX A0Y = C51971G9r.A0Y(A0Z, AnonymousClass05K.A15, C51965G9l.A0Y(C51969G9p.A08(r14, i)), 4);
                2V1 r10 = r14.A05;
                2Wb A0S = AnonymousClass7TG.A0S(r10);
                Integer num3 = gEn.A05;
                if (num3 == num2) {
                    A0S.A00(A00(r14, A1V));
                    A0S.A00(C243563Zg.A0L(r14, C51973G9u.A0X((2WX) null, num, 12.0d, 0)));
                }
                if (gEn.A07) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(C51969G9p.A08(r14, R.color.black_50_transparent));
                    gradientDrawable.setShape(1);
                    2WX A002 = AnonymousClass9JR.A00(C51971G9r.A0Y(C51973G9u.A0U(C51972G9s.A0U(C51971G9r.A0Y((2WX) null, num2, gradientDrawable, 4), num, 0), r14, 2131963753), AnonymousClass05K.A0D, "clips_pause_state_paused_icon_component", 4), AnonymousClass05K.A06, 0, C51970G9q.A0K());
                    2Wb A0S2 = AnonymousClass7TG.A0S(r10);
                    long A0G = C51970G9q.A0G();
                    2WX A003 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, A0G), num2, 0, A0G);
                    Drawable A0K = C51968G9o.A0K(A0S2, R.drawable.instagram_play_pano_filled_24);
                    C51973G9u.A0x(A0K, A0S2, R.color.canvas_bottom_sheet_description_text_color);
                    C51969G9p.A13(A0K, (ImageView.ScaleType) null, A0S2, A003);
                    A0S.A00(C243563Zg.A0G(A0S2, r14, A002));
                }
                if (num3 == num) {
                    A0S.A00(C243563Zg.A0L(r14, C51973G9u.A0X((2WX) null, num, 12.0d, 0)));
                    A0S.A00(A00(r14, A1V));
                }
                return C243563Zg.A05(A0S, r14, A0Y);
            }
        }
        return null;
    }

    private final 2Tp A00(AnonymousClass3Y5 r17, boolean z) {
        Integer num;
        int i;
        int i2;
        int i3;
        C52093GEn gEn = this.A01;
        boolean z2 = z;
        if (!gEn.A06) {
            num = AnonymousClass05K.A00;
        } else if (z) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        AnonymousClass3Y5 r10 = r17;
        gradientDrawable.setColor(C51969G9p.A08(r10, R.color.black_50_transparent));
        boolean z3 = gEn.A08;
        if (z3) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(38.0f);
        } else {
            gradientDrawable.setShape(1);
        }
        GN2 gn2 = new GN2(30, this, r10, z2);
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num2, gradientDrawable, 4));
        Integer num3 = AnonymousClass05K.A01;
        2WX A0U = C51972G9s.A0U(A0X, num3, 0);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = 2131963760;
                break;
            case 1:
                i = 2131963762;
                break;
            default:
                i = 2131963761;
                break;
        }
        2WX A0Y = C51971G9r.A0Y(C51973G9u.A0U(A0U, r10, i), AnonymousClass05K.A0D, "clips_pause_state_audio_control_button_component", 4);
        long A0I = C51970G9q.A0I();
        2WX A0V = C51972G9s.A0V(AnonymousClass9JR.A00(A0Y, AnonymousClass05K.A06, 0, A0I), gn2);
        2Wb A0Q = C51972G9s.A0Q(r10);
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num3, 0, A0I), num2, 0, A0I);
        switch (intValue) {
            case 0:
                i2 = R.drawable.instagram_volume_none_pano_filled_24;
                break;
            case 1:
                i2 = R.drawable.instagram_volume_pano_filled_24;
                break;
            default:
                i2 = R.drawable.instagram_volume_off_pano_filled_24;
                break;
        }
        Drawable A0K = C51968G9o.A0K(A0Q, i2);
        C51973G9u.A0x(A0K, A0Q, R.color.canvas_bottom_sheet_description_text_color);
        C51969G9p.A13(A0K, (ImageView.ScaleType) null, A0Q, A002);
        if (z3) {
            2WX A0Z = C51971G9r.A0Z(C51972G9s.A0S((2WX) null, 0, C51970G9q.A0H()), num2, J6P.A00(this, 14), (String) null);
            int A05 = C51968G9o.A05(C243803a8.A00(A0Q), A0Q);
            long A04 = C244013aV.A04(A0Q);
            switch (intValue) {
                case 0:
                    i3 = 2131955284;
                    break;
                case 1:
                    i3 = 2131955247;
                    break;
                default:
                    i3 = 2131955246;
                    break;
            }
            String A0E = C244013aV.A0E(A0Q, i3);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, A0E, 0);
            C51973G9u.A17(A0Q, A0b, A05, A04);
            A0b.A0R(1);
            G9w.A12(typeface, A0Q, A0b, A0D);
            C51974G9v.A19(A0b, num2, false);
            A0b.A0M(1);
            C51973G9u.A19(A0Z, A0b, false);
            C51967G9n.A1G(A0Q, A0b);
        }
        return C243563Zg.A0G(A0Q, r10, A0V);
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.GtF  reason: case insensitive filesystem */
public final class C53724GtF extends C251343mx {
    public final C53577Gqs A00;
    public final C59597JPr A01;
    public final 2WX A02;

    public final C251263mp A0X(AnonymousClass3Y5 r14) {
        Integer num;
        int i;
        int i2;
        0qQ.A0B(r14, 0);
        C53577Gqs gqs = this.A00;
        2Wa A012 = C243753a2.A01(r14, (AnonymousClass3W1) gqs.A02, J6J.A00(this, 49), 55, false);
        boolean z = gqs.A03;
        boolean A1V = C51969G9p.A1V(A012);
        if (!z) {
            num = AnonymousClass05K.A00;
        } else if (A1V) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        long A06 = C244013aV.A06(r14);
        2WX r10 = 2WX.A02;
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, A06);
        Integer num2 = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00(A002, num2, 0, A06);
        Integer num3 = AnonymousClass05K.A0C;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X(A003, num3, 0.0f, 1), num2, "android.widget.Button", 0);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = R.drawable.instagram_volume_none_pano_filled_24;
                break;
            case 1:
                i = R.drawable.instagram_volume_pano_filled_24;
                break;
            default:
                i = R.drawable.instagram_volume_off_pano_filled_24;
                break;
        }
        Drawable A0K = C51968G9o.A0K(r14, i);
        C51973G9u.A0x(A0K, r14, R.color.canvas_bottom_sheet_description_text_color);
        GH5 gh5 = new GH5(A0K, (ImageView.ScaleType) null, A0Y, false);
        2WX r1 = this.A02;
        AnonymousClass9JS A0d = C51965G9l.A0d(num2, true, 4);
        if (r1 == r10) {
            r1 = null;
        }
        2WX A0V = C51972G9s.A0V(C51973G9u.A0S(r1, A0d, num3, 0.0f, 1), J6Q.A00(r14, this, 18));
        2Wb A0Q = C51972G9s.A0Q(r14);
        2WX A004 = C52199GIq.A00(A0Q);
        AnonymousClass9JS A0d2 = C51965G9l.A0d(AnonymousClass05K.A0D, "clips_attribution_audio_control_component", 4);
        if (A004 == r10) {
            A004 = null;
        }
        2WX A0X = C51965G9l.A0X(A004, A0d2);
        switch (intValue) {
            case 0:
                i2 = 2131963760;
                break;
            case 1:
                i2 = 2131963762;
                break;
            default:
                i2 = 2131963761;
                break;
        }
        return C51967G9n.A0Q(C243563Zg.A0G(G9t.A0v(gh5, A0Q.A00), A0Q, C51971G9r.A0Z(C51973G9u.A0T(A0X, C51972G9s.A0W(A0Q, i2, 0), num2, "android.widget.Button", 0), AnonymousClass05K.A0Y, J6Q.A00(A0Q, this, 19), (String) null)), A0Q, r14, A0V);
    }

    public C53724GtF(C53577Gqs gqs, 2WX r2, C59597JPr jPr) {
        AnonymousClass7TG.A1O(gqs, jPr);
        this.A00 = gqs;
        this.A01 = jPr;
        this.A02 = r2;
    }
}

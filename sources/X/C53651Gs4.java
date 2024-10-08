package X;

import com.instagram.android.R;

/* renamed from: X.Gs4  reason: case insensitive filesystem */
public final class C53651Gs4 extends C251343mx {
    public final 2WX A00;
    public final Integer A01;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        int i;
        0qQ.A0B(r13, 0);
        2WX r4 = this.A00;
        int intValue = this.A01.intValue();
        int i2 = 2131963761;
        if (intValue == 0) {
            i2 = 2131963762;
        }
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A0N, C244013aV.A0E(r13, i2), 0);
        if (r4 == 2WX.A02) {
            r4 = null;
        }
        2WX A0X = C51965G9l.A0X(r4, A0d);
        J6K j6k = new J6K(r13, 40);
        J6K j6k2 = new J6K(r13, 39);
        if (intValue == 0) {
            i = R.drawable.instagram_volume_pano_filled_24;
        } else if (intValue == 1) {
            i = R.drawable.instagram_volume_off_pano_filled_24;
        } else if (intValue == 2) {
            i = R.drawable.instagram_volume_none_pano_filled_24;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C53981GxP(A0X, (String) null, j6k, j6k2, C51969G9p.A02(r13, C244013aV.A08(r13)), 0.5f, i, C51969G9p.A08(r13, R.color.design_dark_default_color_on_background));
    }

    public C53651Gs4(2WX r1, Integer num) {
        this.A01 = num;
        this.A00 = r1;
    }
}

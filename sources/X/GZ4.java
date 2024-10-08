package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

public final class GZ4 extends C251343mx {
    public final float A00 = 100.0f;
    public final float A01 = 100.0f;
    public final 2WX A02;
    public final AnonymousClass0iw A03;
    public final ImageUrl A04;

    public GZ4(2WX r2, AnonymousClass0iw r3, ImageUrl imageUrl) {
        AnonymousClass7TG.A1O(r3, imageUrl);
        this.A03 = r3;
        this.A04 = imageUrl;
        this.A02 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        boolean A1Z = C51966G9m.A1Z(r13);
        return new GYW(ImageView.ScaleType.CENTER_CROP, C51971G9r.A0X(C51971G9r.A0X(G9t.A12(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), AnonymousClass05K.A00, this.A01, A1Z ? 1 : 0), AnonymousClass05K.A01, this.A00, A1Z).A00(this.A02), this.A03, this.A04, (ImageUrl) null, (C240963Ni) null, C55402Hh8.A01, (String) null, 3, A1Z, A1Z);
    }
}

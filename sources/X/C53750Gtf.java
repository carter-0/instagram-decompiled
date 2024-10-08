package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gtf  reason: case insensitive filesystem */
public final class C53750Gtf extends C251343mx {
    public final float A00 = 100.0f;
    public final float A01 = 100.0f;
    public final AnonymousClass0iw A02;
    public final ImageUrl A03;

    public C53750Gtf(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A03 = imageUrl;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        boolean A1Z = C51966G9m.A1Z(r13);
        return new GYW(ImageView.ScaleType.CENTER_CROP, C51971G9r.A0X(C51971G9r.A0X(G9t.A12(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), AnonymousClass05K.A00, this.A01, A1Z ? 1 : 0), AnonymousClass05K.A01, this.A00, A1Z), this.A02, this.A03, (ImageUrl) null, (C240963Ni) null, C55402Hh8.A01, (String) null, 3, A1Z, A1Z);
    }
}

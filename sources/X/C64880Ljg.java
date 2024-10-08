package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Ljg  reason: case insensitive filesystem */
public final class C64880Ljg implements C66556MWk {
    public final float A00;
    public final RectF A01 = AnonymousClass7TE.A0Y();

    public C64880Ljg(float f) {
        this.A00 = f;
    }

    public final RectF AhY(TouchImageView touchImageView) {
        float A02 = AnonymousClass7TE.A02(touchImageView);
        float A03 = AnonymousClass7TE.A03(touchImageView);
        RectF rectF = this.A01;
        float f = A03 / 2.0f;
        float f2 = (A02 / this.A00) / 2.0f;
        rectF.set(0.0f, f - f2, A02, f + f2);
        return rectF;
    }
}

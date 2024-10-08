package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Ljh  reason: case insensitive filesystem */
public final class C64881Ljh implements C66556MWk {
    public final RectF A00 = AnonymousClass7TE.A0Y();
    public final boolean A01;

    public C64881Ljh(boolean z) {
        this.A01 = z;
    }

    public final RectF AhY(TouchImageView touchImageView) {
        float f;
        float A02 = AnonymousClass7TE.A02(touchImageView);
        float A03 = AnonymousClass7TE.A03(touchImageView);
        float f2 = A02 / 3.0f;
        if (this.A01) {
            f = 1.3333334f * f2;
        } else {
            f = f2;
        }
        RectF rectF = this.A00;
        float f3 = A03 / 2.0f;
        float f4 = f / 2.0f;
        rectF.set(f2, f3 - f4, A02 - f2, f3 + f4);
        return rectF;
    }
}

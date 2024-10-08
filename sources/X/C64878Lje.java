package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Lje  reason: case insensitive filesystem */
public final class C64878Lje implements C66556MWk {
    public final RectF A00 = AnonymousClass7TE.A0Y();

    public final RectF AhY(TouchImageView touchImageView) {
        int width = touchImageView.getWidth();
        int height = touchImageView.getHeight();
        RectF rectF = this.A00;
        int i = height / 2;
        int i2 = width / 2;
        rectF.set(0.0f, (float) (i - i2), (float) width, (float) (i + i2));
        return rectF;
    }
}

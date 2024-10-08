package X;

import android.graphics.RectF;
import android.util.Size;

/* renamed from: X.KuO  reason: case insensitive filesystem */
public abstract class C63279KuO {
    public static final RectF A00(Size size, Size size2, boolean z) {
        float width = ((float) (size2.getWidth() - size.getWidth())) / 2.0f;
        float width2 = ((float) size.getWidth()) + width;
        float height = (float) (size2.getHeight() - size.getHeight());
        if (!z) {
            height /= 2.0f;
        }
        return new RectF(width, height, width2, ((float) size.getHeight()) + height);
    }
}

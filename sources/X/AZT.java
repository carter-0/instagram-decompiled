package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final class AZT implements C226632hb {
    public static final AZT A00 = new AZT();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 9);
    }
}

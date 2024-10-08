package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final class AZS implements C226632hb {
    public static final AZS A00 = new AZS();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.25f, 24);
    }
}

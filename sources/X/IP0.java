package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final class IP0 implements C226632hb {
    public static final IP0 A00 = new IP0();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blurWithAlpha(bitmap, 0.1f, 6, 128);
    }
}

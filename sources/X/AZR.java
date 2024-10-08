package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final class AZR implements C226632hb {
    public static final AZR A00 = new AZR();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 10);
    }
}

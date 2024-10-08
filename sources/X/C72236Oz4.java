package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Oz4  reason: case insensitive filesystem */
public final class C72236Oz4 implements C226632hb {
    public static final C72236Oz4 A00 = new C72236Oz4();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        Bitmap.Config config = bitmap.getConfig();
        0qQ.A0A(config);
        Bitmap copy = bitmap.copy(config, bitmap.isMutable());
        0qQ.A0A(copy);
        return BlurUtil.blur(copy, 1.0f, 3);
    }
}

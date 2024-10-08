package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Oz2  reason: case insensitive filesystem */
public final class C72234Oz2 implements C226632hb {
    public static final C72234Oz2 A00 = new C72234Oz2();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.85f, 25);
    }
}

package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.LjW  reason: case insensitive filesystem */
public final class C64870LjW implements C226632hb {
    public static final C64870LjW A00 = new C64870LjW();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 1);
    }
}

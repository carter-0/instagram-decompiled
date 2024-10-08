package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.IOz  reason: case insensitive filesystem */
public final class C57110IOz implements C226632hb {
    public static final C57110IOz A00 = new C57110IOz();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 6);
    }
}

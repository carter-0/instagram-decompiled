package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.Oz3  reason: case insensitive filesystem */
public final class C72235Oz3 implements C226632hb {
    public static final C72235Oz3 A00 = new C72235Oz3();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.1f, 3);
    }
}

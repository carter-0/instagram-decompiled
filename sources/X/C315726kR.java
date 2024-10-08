package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.6kR  reason: invalid class name and case insensitive filesystem */
public final class C315726kR implements C226632hb {
    public static final C315726kR A00 = new C315726kR();

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        return BlurUtil.blur(bitmap, 0.25f, 10);
    }
}

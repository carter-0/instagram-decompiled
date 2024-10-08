package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

public final /* synthetic */ class AZO implements C226632hb {
    public final Bitmap renderImage(Bitmap bitmap) {
        return BlurUtil.blur(bitmap, 0.85f, 15);
    }
}

package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class WTV implements C231672s5 {
    public static final WTV A00 = new WTV();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        AnonymousClass7TG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.5f, 14));
    }
}

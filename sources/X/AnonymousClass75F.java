package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.75F  reason: invalid class name */
public final class AnonymousClass75F implements C231672s5 {
    public static final AnonymousClass75F A00 = new AnonymousClass75F();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        0qQ.A0B(bitmap, 1);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.3f, 20));
    }
}

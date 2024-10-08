package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.75G  reason: invalid class name */
public final class AnonymousClass75G implements C231672s5 {
    public static final AnonymousClass75G A00 = new AnonymousClass75G();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        0qQ.A0B(bitmap, 1);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.15f, 25));
    }
}

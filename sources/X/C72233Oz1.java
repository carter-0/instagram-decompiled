package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Oz1  reason: case insensitive filesystem */
public final class C72233Oz1 implements C231672s5 {
    public static final C72233Oz1 A00 = new C72233Oz1();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        AnonymousClass7TG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
    }
}

package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Oyz  reason: case insensitive filesystem */
public final class C72231Oyz implements C231672s5 {
    public static final C72231Oyz A00 = new C72231Oyz();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        AnonymousClass7TG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.85f, 40));
    }
}

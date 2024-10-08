package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import com.instagram.android.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Oyy  reason: case insensitive filesystem */
public final class C72230Oyy implements C231672s5 {
    public static final C72230Oyy A00 = new C72230Oyy();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        AnonymousClass7TG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
        igImageView.setColorFilter(igImageView.getContext().getColor(R.color.black_25_transparent), PorterDuff.Mode.SRC_OVER);
        igImageView.setImageAlpha(128);
    }
}

package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import com.instagram.android.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class WTT implements C231672s5 {
    public static final WTT A00 = new WTT();

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        AnonymousClass7TG.A1N(igImageView, bitmap);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.5f, 25));
        igImageView.setColorFilter(AnonymousClass7TF.A03(igImageView.getContext(), R.attr.igds_color_legibility_gradient), PorterDuff.Mode.SRC_OVER);
    }
}

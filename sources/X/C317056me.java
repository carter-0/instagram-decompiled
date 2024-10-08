package X;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import com.instagram.android.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6me  reason: invalid class name and case insensitive filesystem */
public final class C317056me implements C231672s5 {
    public final /* synthetic */ IgImageView A00;

    public C317056me(IgImageView igImageView) {
        this.A00 = igImageView;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        0qQ.A0B(bitmap, 1);
        igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.4f, 10));
        igImageView.setColorFilter(igImageView.getContext().getColor(2Yu.A0H(this.A00.getContext(), R.attr.igds_color_legibility_gradient)), PorterDuff.Mode.SRC_OVER);
    }
}

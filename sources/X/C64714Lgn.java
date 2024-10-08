package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Lgn  reason: case insensitive filesystem */
public final class C64714Lgn implements C41814B1u {
    public Draft A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final TextView A03;
    public final ColorFilterAlphaImageView A04;
    public final ConstrainedImageView A05;

    public final boolean CWO(Draft draft) {
        Draft draft2 = this.A00;
        if (draft2 == null || !draft2.equals(draft)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DrR(Bitmap bitmap, Draft draft) {
        ? r0 = this.A05;
        r0.setImageBitmap(bitmap);
        r0.invalidate();
    }

    public C64714Lgn(View view) {
        this.A05 = (ConstrainedImageView) view.requireViewById(R.id.draft_imageview);
        this.A01 = (CheckBox) view.requireViewById(R.id.media_toggle);
        this.A03 = DbU.A0G(view, R.id.video_duration);
        this.A02 = DbU.A0F(view, R.id.shopping_indicator);
        this.A04 = (ColorFilterAlphaImageView) view.requireViewById(R.id.album_indicator);
    }
}

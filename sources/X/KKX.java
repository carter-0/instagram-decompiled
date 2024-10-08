package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.photo.crop.CropImageView;

public final class KKX extends C60686JpX {
    public final CropImageView A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void A00(boolean z) {
        this.A00.setVisibility(DbW.A01(z ^ true ? 1 : 0));
        super.A00(z);
    }

    public KKX(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.crop_image_view_item);
        CropImageView cropImageView = (CropImageView) requireViewById;
        cropImageView.A05 = false;
        cropImageView.A04 = false;
        cropImageView.A02 = cropImageView.A01;
        0qQ.A07(requireViewById);
        this.A00 = cropImageView;
    }
}

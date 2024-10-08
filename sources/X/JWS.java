package X;

import android.view.animation.Transformation;
import com.instagram.creation.photo.crop.CropImageView;

public final class JWS extends Transformation {
    public final /* synthetic */ CropImageView A00;

    public JWS(CropImageView cropImageView) {
        this.A00 = cropImageView;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void setAlpha(float f) {
        C301485zM r0;
        ? r2 = this.A00;
        AnonymousClass81H r02 = r2.A04;
        if (r02 != null && (r0 = r02.A01) != null && r0.A04(f)) {
            r2.invalidate();
        }
    }
}

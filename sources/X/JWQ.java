package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.instagram.creation.photo.crop.CropImageView;

public final class JWQ extends AlphaAnimation {
    public final Transformation A00;
    public final /* synthetic */ CropImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JWQ(CropImageView cropImageView) {
        super(1.0f, 0.0f);
        this.A01 = cropImageView;
        this.A00 = new JWS(cropImageView);
        setInterpolator(new LinearInterpolator());
    }

    public final void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, this.A00);
    }
}

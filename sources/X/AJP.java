package X;

import android.animation.ValueAnimator;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

public final class AJP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass8Q2 A00;

    public AJP(AnonymousClass8Q2 r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            AnonymousClass8Q2 r2 = this.A00;
            CameraToolMenuItem cameraToolMenuItem = r2.A0C;
            if (cameraToolMenuItem.getVisibility() == 0) {
                cameraToolMenuItem.setLabelDisplayPercentage(number.floatValue());
            }
            CameraToolMenuItem cameraToolMenuItem2 = r2.A0A;
            if (cameraToolMenuItem2.getVisibility() == 0) {
                cameraToolMenuItem2.setLabelDisplayPercentage(number.floatValue());
            }
            CameraToolMenuItem cameraToolMenuItem3 = r2.A0B;
            if (cameraToolMenuItem3.getVisibility() == 0) {
                cameraToolMenuItem3.setLabelDisplayPercentage(number.floatValue());
            }
        }
    }
}

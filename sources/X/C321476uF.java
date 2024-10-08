package X;

import android.animation.ValueAnimator;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* renamed from: X.6uF  reason: invalid class name and case insensitive filesystem */
public final class C321476uF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ IgMultiImageButton A00;

    public C321476uF(IgMultiImageButton igMultiImageButton) {
        this.A00 = igMultiImageButton;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}

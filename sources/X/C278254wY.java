package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.emitter.PulseEmitter;

/* renamed from: X.4wY  reason: invalid class name and case insensitive filesystem */
public final class C278254wY implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulseEmitter A00;

    public C278254wY(PulseEmitter pulseEmitter) {
        this.A00 = pulseEmitter;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}

package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.instagram.ui.widget.emitter.PulseEmitter;
import java.util.List;

/* renamed from: X.4wX  reason: invalid class name and case insensitive filesystem */
public final class C278244wX extends AnimatorListenerAdapter {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ PulseEmitter A01;

    public C278244wX(ValueAnimator valueAnimator, PulseEmitter pulseEmitter) {
        this.A01 = pulseEmitter;
        this.A00 = valueAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        PulseEmitter pulseEmitter = this.A01;
        int[] iArr = PulseEmitter.A09;
        if (pulseEmitter.A00) {
            List list = pulseEmitter.A03;
            ValueAnimator valueAnimator = this.A00;
            list.remove(valueAnimator);
            pulseEmitter.A02.add(valueAnimator);
        }
    }
}

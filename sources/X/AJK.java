package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

public final class AJK implements Animator.AnimatorListener {
    public final /* synthetic */ AnonymousClass9J1 A00;
    public final /* synthetic */ EphemeralMediaToggleView A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AJK(AnonymousClass9J1 r1, EphemeralMediaToggleView ephemeralMediaToggleView) {
        this.A01 = ephemeralMediaToggleView;
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.A00.setImageDrawable((Drawable) this.A00.A03);
    }
}

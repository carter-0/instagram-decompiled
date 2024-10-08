package X;

import android.animation.Animator;
import com.facebook.proxygen.LigerSamplePolicy;

public final class FHH implements Animator.AnimatorListener {
    public final /* synthetic */ C226432go A00;

    public final void onAnimationRepeat(Animator animator) {
    }

    public FHH(C226432go r1) {
        this.A00 = r1;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.A01();
    }

    public final void onAnimationEnd(Animator animator) {
        11Z.A04(this.A00.A08, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    public final void onAnimationStart(Animator animator) {
        1Av r3 = this.A00.A07;
        DbZ.A1b(r3, r3.A6p, 1Av.A8a, 522);
    }
}

package X;

import android.animation.ValueAnimator;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;

/* renamed from: X.LTm  reason: case insensitive filesystem */
public final class C64200LTm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnimatedThumbnailView A00;
    public final /* synthetic */ 0rk A01;

    public C64200LTm(AnimatedThumbnailView animatedThumbnailView, 0rk r2) {
        this.A01 = r2;
        this.A00 = animatedThumbnailView;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A04 = DbW.A04(C51971G9r.A0o(valueAnimator), "null cannot be cast to non-null type kotlin.Int");
        0rk r1 = this.A01;
        if (A04 != r1.A00) {
            r1.A00 = A04;
            ? r0 = this.A00;
            r0.A00 = A04;
            r0.invalidate();
        }
    }
}

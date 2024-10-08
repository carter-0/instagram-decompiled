package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.VuI  reason: case insensitive filesystem */
public final class C18566VuI {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final View A04;

    public final ValueAnimator A01() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.A00, this.A01});
        ofFloat.setStartDelay(this.A03);
        ofFloat.setDuration(this.A02);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        W4Q.A00(ofFloat, this, 17);
        return ofFloat;
    }

    public /* synthetic */ C18566VuI(View view, float f, float f2, int i, long j, long j2) {
        f = (i & 8) != 0 ? 1.0f : f;
        f2 = (i & 16) != 0 ? 1.1f : f2;
        this.A04 = view;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A01 = f2;
    }

    public static ValueAnimator A00(View view, 0Tu r10, UserSession userSession) {
        return new C18566VuI(view, 1.1f, 1.0f, 96, 182.A01(0Tu.A05, userSession, 36610022058432471L) + 182.A01(r10, userSession, 36610022058629082L) + 182.A01(r10, userSession, 36610022058498008L), 182.A01(r10, userSession, 36610022058760156L)).A01();
    }
}

package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.I7t  reason: case insensitive filesystem */
public final class C56688I7t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C254073rt A02;

    public C56688I7t(C254073rt r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        C254073rt r2 = this.A02;
        float f = 1.0f - A002;
        r2.A01.setAlpha(f);
        r2.A06.setAlpha(f);
        r2.A02.setAlpha(A002);
        r2.A07.setAlpha(0.7f * A002);
        ViewGroup viewGroup = r2.A0J;
        int i = this.A00;
        0nA.A0V(viewGroup, i + ((int) (A002 * ((float) (this.A01 - i)))));
    }
}

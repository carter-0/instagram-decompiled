package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* renamed from: X.RvJ  reason: case insensitive filesystem */
public final class C10625RvJ {
    public boolean A00;
    public final ValueAnimator A01;
    public final 2V5 A02;

    public C10625RvJ(2V5 r6, int i, int i2) {
        0qQ.A0B(r6, 4);
        this.A02 = r6;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), C51968G9o.A1Z(Integer.valueOf(i), i2));
        ofObject.setDuration(300);
        ofObject.setStartDelay(2000);
        ofObject.addUpdateListener(new C11435SUp((Object) this, 8));
        this.A01 = ofObject;
    }
}

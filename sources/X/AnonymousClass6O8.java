package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* renamed from: X.6O8  reason: invalid class name */
public final class AnonymousClass6O8 {
    public final float A00;
    public final int A01;
    public final C300635xX A02;
    public final Integer A03;
    public final Integer A04;
    public final long A05;
    public final long A06;

    public final ValueAnimator A00() {
        int i;
        int i2;
        Integer num = this.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 1;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setStartDelay(this.A06);
        ofInt.setDuration(this.A05);
        ofInt.addUpdateListener(new W47(this));
        return ofInt;
    }

    public AnonymousClass6O8(C300635xX r1, Integer num, Integer num2, float f, int i, long j, long j2) {
        this.A02 = r1;
        this.A06 = j;
        this.A05 = j2;
        this.A03 = num;
        this.A04 = num2;
        this.A01 = i;
        this.A00 = f;
    }
}

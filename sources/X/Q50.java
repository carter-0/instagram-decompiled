package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class Q50 extends ValueAnimator implements Choreographer.FrameCallback {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 2.14748365E9f;
    public float A03 = -2.14748365E9f;
    public float A04 = 1.0f;
    public int A05 = 0;
    public long A06 = 0;
    public S7N A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public final Set A0B = new CopyOnWriteArraySet();
    public final Set A0C = new CopyOnWriteArraySet();
    public final Set A0D = new CopyOnWriteArraySet();

    public final float A00() {
        S7N s7n = this.A07;
        if (s7n == null) {
            return 0.0f;
        }
        float f = this.A00;
        float f2 = s7n.A03;
        return (f - f2) / (s7n.A00 - f2);
    }

    public final float A01() {
        S7N s7n = this.A07;
        if (s7n == null) {
            return 0.0f;
        }
        float f = this.A02;
        if (f == 2.14748365E9f) {
            return s7n.A00;
        }
        return f;
    }

    public final float A02() {
        S7N s7n = this.A07;
        if (s7n == null) {
            return 0.0f;
        }
        float f = this.A03;
        if (f == -2.14748365E9f) {
            return s7n.A03;
        }
        return f;
    }

    public final void A04() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.A0D) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public final void A05() {
        if (this.A08) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void A06(float f) {
        if (this.A01 != f) {
            float A022 = A02();
            float A012 = A01();
            PointF pointF = SQL.A00;
            float A013 = Pxi.A01(A012, f, A022);
            this.A01 = A013;
            if (this.A09) {
                A013 = (float) Math.floor((double) A013);
            }
            this.A00 = A013;
            this.A06 = 0;
            A04();
        }
    }

    public final void A07(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            S7N s7n = this.A07;
            if (s7n == null) {
                f3 = -3.4028235E38f;
                f4 = Float.MAX_VALUE;
            } else {
                f3 = s7n.A03;
                f4 = s7n.A00;
            }
            PointF pointF = SQL.A00;
            float A012 = Pxi.A01(f4, f, f3);
            float A013 = Pxi.A01(f4, f2, f3);
            if (A012 != this.A03 || A013 != this.A02) {
                this.A03 = A012;
                this.A02 = A013;
                A06((float) ((int) Pxi.A01(A013, this.A00, A012)));
                return;
            }
            return;
        }
        throw Pxf.A0X("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
    }

    public final void A08(boolean z) {
        for (Animator.AnimatorListener onAnimationEnd : this.A0B) {
            onAnimationEnd.onAnimationEnd(this, z);
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.A0B.add(animatorListener);
    }

    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.add(animatorPauseListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.add(animatorUpdateListener);
    }

    public final void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.A0B) {
            onAnimationCancel.onAnimationCancel(this);
        }
        A08(C51970G9q.A1T((this.A04 > 0.0f ? 1 : (this.A04 == 0.0f ? 0 : -1))));
        Choreographer.getInstance().removeFrameCallback(this);
        this.A08 = false;
    }

    public final float getAnimatedFraction() {
        float f;
        float A022;
        if (this.A07 == null) {
            return 0.0f;
        }
        if (this.A04 < 0.0f) {
            f = A01();
            A022 = this.A00;
        } else {
            f = this.A00;
            A022 = A02();
        }
        return (f - A022) / (A01() - A02());
    }

    public final long getDuration() {
        S7N s7n = this.A07;
        if (s7n == null) {
            return 0;
        }
        return (long) s7n.A00();
    }

    public final long getStartDelay() {
        throw AnonymousClass7TE.A1B("LottieAnimator does not support getStartDelay.");
    }

    public final boolean isRunning() {
        return this.A08;
    }

    public final void removeAllListeners() {
        this.A0B.clear();
    }

    public final void removeAllUpdateListeners() {
        this.A0D.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0B.remove(animatorListener);
    }

    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.remove(animatorPauseListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw AnonymousClass7TE.A1B("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j) {
        throw AnonymousClass7TE.A1B("LottieAnimator does not support setStartDelay.");
    }

    public final void A03() {
        Choreographer.getInstance().removeFrameCallback(this);
        boolean z = false;
        this.A08 = false;
        if (this.A04 < 0.0f) {
            z = true;
        }
        A08(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r4 > r2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r9) {
        /*
            r8 = this;
            r8.A05()
            X.S7N r6 = r8.A07
            if (r6 == 0) goto L_0x00a7
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x00a7
            long r1 = r8.A06
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r3 = r9 - r1
        L_0x0015:
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r6.A01
            float r5 = r5 / r0
            float r2 = r8.A04
            float r0 = java.lang.Math.abs(r2)
            float r5 = r5 / r0
            float r1 = (float) r3
            float r1 = r1 / r5
            float r6 = r8.A01
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            float r1 = -r1
        L_0x002c:
            float r4 = r6 + r1
            float r3 = r8.A02()
            float r2 = r8.A01()
            android.graphics.PointF r0 = X.SQL.A00
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r5 = r0 ^ 1
            float r4 = X.Pxi.A01(r2, r4, r3)
            r3 = r4
            r8.A01 = r4
            boolean r2 = r8.A09
            if (r2 == 0) goto L_0x0055
            double r0 = (double) r4
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
        L_0x0055:
            r8.A00 = r3
            r8.A06 = r9
            if (r2 == 0) goto L_0x005f
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
        L_0x005f:
            r8.A04()
        L_0x0062:
            if (r5 == 0) goto L_0x0095
            int r1 = r8.getRepeatCount()
            r0 = -1
            if (r1 == r0) goto L_0x00ad
            int r1 = r8.A05
            int r0 = r8.getRepeatCount()
            if (r1 < r0) goto L_0x00ad
            float r0 = r8.A04
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            float r0 = r8.A02()
        L_0x007d:
            r8.A01 = r0
            r8.A00 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.removeFrameCallback(r8)
            r1 = 0
            r8.A08 = r1
            float r0 = r8.A04
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            r1 = 1
        L_0x0092:
            r8.A08(r1)
        L_0x0095:
            X.S7N r0 = r8.A07
            if (r0 == 0) goto L_0x00a7
            float r3 = r8.A00
            float r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            float r0 = r8.A02
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00f2
        L_0x00a7:
            return
        L_0x00a8:
            float r0 = r8.A01()
            goto L_0x007d
        L_0x00ad:
            java.util.Set r0 = r8.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x00b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r0.onAnimationRepeat(r8)
            goto L_0x00b3
        L_0x00c3:
            int r0 = r8.A05
            int r0 = r0 + 1
            r8.A05 = r0
            int r1 = r8.getRepeatMode()
            r0 = 2
            if (r1 != r0) goto L_0x00de
            boolean r0 = r8.A0A
            r0 = r0 ^ 1
            r8.A0A = r0
            float r0 = r8.A04
            float r0 = -r0
            r8.A04 = r0
        L_0x00db:
            r8.A06 = r9
            goto L_0x0095
        L_0x00de:
            float r0 = r8.A04
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ed
            float r0 = r8.A01()
        L_0x00e8:
            r8.A01 = r0
            r8.A00 = r0
            goto L_0x00db
        L_0x00ed:
            float r0 = r8.A02()
            goto L_0x00e8
        L_0x00f2:
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            float r0 = r8.A02
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Frame must be [%f,%f]. It is %f"
            java.lang.IllegalStateException r0 = X.Pxf.A0Y(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q50.doFrame(long):void");
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(A00());
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.A0A) {
            this.A0A = false;
            this.A04 = -this.A04;
        }
    }

    public final ValueAnimator setDuration(long j) {
        throw AnonymousClass7TE.A1B("LottieAnimator does not support setDuration.");
    }
}

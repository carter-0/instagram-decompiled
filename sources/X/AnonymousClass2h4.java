package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Set;

/* renamed from: X.2h4  reason: invalid class name */
public final class AnonymousClass2h4 implements C226492gu {
    public float A00 = Float.MIN_VALUE;
    public float A01 = Float.MIN_VALUE;
    public float A02 = 0.0f;
    public float A03 = Float.MIN_VALUE;
    public int A04 = 0;
    public int A05 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public TimeInterpolator A06 = null;
    public String A07 = null;
    public Set A08 = null;
    public Set A09 = null;
    public boolean A0A = false;
    public boolean A0B = false;

    public final void APO() {
        this.A0B = true;
    }

    public final float AzF() {
        return 0.0f;
    }

    public final C49443Evk CLv(String[] strArr, float f, float f2) {
        return null;
    }

    public final void E2p() {
        this.A04 = 3;
    }

    public final boolean isFinished() {
        return false;
    }

    public final void pause() {
        this.A04 = 2;
    }

    public final void stop() {
        this.A04 = 1;
    }

    public final C226492gu A8s(Animator.AnimatorListener animatorListener) {
        04u r1 = this.A08;
        if (r1 == null) {
            r1 = new 04u(0);
            this.A08 = r1;
        }
        r1.add(animatorListener);
        return this;
    }

    public final C226492gu AAc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        04u r1 = this.A09;
        if (r1 == null) {
            r1 = new 04u(0);
            this.A09 = r1;
        }
        r1.add(animatorUpdateListener);
        return this;
    }

    public final float BhR() {
        return this.A02;
    }

    public final int Bm3() {
        return this.A05;
    }

    public final void EDF() {
        04u r1 = this.A08;
        if (r1 == null) {
            r1 = new 04u(0);
            this.A08 = r1;
        }
        r1.clear();
    }

    public final void EDp(Animator.AnimatorListener animatorListener) {
        04u r1 = this.A08;
        if (r1 == null) {
            r1 = new 04u(0);
            this.A08 = r1;
        }
        r1.remove(animatorListener);
    }

    public final C226492gu FNX(float f, float f2) {
        this.A03 = f;
        this.A00 = f2;
        return this;
    }

    public final boolean isPlaying() {
        if (this.A04 == 3) {
            return true;
        }
        return false;
    }

    public final C226492gu EFK() {
        this.A05 = Integer.MAX_VALUE;
        return this;
    }

    public final C226492gu AB9(boolean z) {
        this.A0A = z;
        return this;
    }

    public final void ABF(float f) {
        this.A01 = f;
    }

    public final C226492gu AWD(String str) {
        this.A07 = str;
        return this;
    }

    public final C226492gu EFJ(int i) {
        this.A05 = i;
        return this;
    }

    public final C226492gu EL2(float f) {
        this.A02 = f;
        return this;
    }

    public final C226492gu Ea6(TimeInterpolator timeInterpolator) {
        this.A06 = timeInterpolator;
        return this;
    }
}

package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

public class Q3Q extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02 = -1;
    public long A03;
    public long A04 = -1;
    public long A05;
    public long A06 = -1;
    public final U0N A07;

    public static final void A01(Q3Q q3q) {
        q3q.A06 = -1;
        q3q.A04 = -1;
        q3q.A05 = 0;
        q3q.A02 = -1;
        q3q.A00 = 0;
        super.setStartDelay(q3q.A03);
        q3q.A01 = 0;
    }

    public final long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A05;
            if (j2 != -1) {
                return j2;
            }
            return 0;
        } else if (isPaused() && this.A04 > this.A02) {
            return this.A05;
        } else {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = this.A01;
            if (j3 == 0) {
                long j4 = (this.A05 + currentAnimationTimeMillis) - this.A06;
                boolean isPaused = isPaused();
                long j5 = this.A00;
                if (isPaused) {
                    j5 = (j5 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
                }
                j = j4 - j5;
            } else {
                j = this.A03 + j3;
            }
            long duration = this.A03 + getDuration();
            if (j > duration) {
                return duration;
            }
            return j;
        }
    }

    public final long getStartDelay() {
        return this.A03;
    }

    public final long getTotalDuration() {
        return this.A03 + getDuration();
    }

    public final void setCurrentPlayTime(long j) {
        long A062 = C229632nm.A06(j, 0, this.A03 + getDuration());
        this.A04 = AnimationUtils.currentAnimationTimeMillis();
        this.A05 = A062;
        long j2 = this.A03;
        if (A062 < j2) {
            super.setStartDelay(j2 - A062);
            if (isPaused()) {
                super.setCurrentPlayTime(0);
            } else if (this.A01 > 0) {
                start();
            }
        } else {
            super.setStartDelay(0);
            super.setCurrentPlayTime(A062 - j2);
        }
    }

    public Q3Q() {
        U0N u0n = new U0N(this, 5);
        this.A07 = u0n;
        super.addListener(u0n);
        super.addUpdateListener(new C11435SUp((Object) this, 1));
    }

    public final void pause() {
        boolean isPaused = isPaused();
        super.pause();
        if (!isPaused && isPaused()) {
            this.A02 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void resume() {
        boolean isPaused = isPaused();
        super.resume();
        if (isPaused && !isPaused()) {
            this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
            this.A02 = -1;
        }
    }

    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A03 = j;
    }

    public final void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
    }
}

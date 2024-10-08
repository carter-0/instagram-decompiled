package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

public final class Q4v extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public Q4v(Animator animator, C307786Rm r4, int i) {
        0qQ.A0B(animator, 2);
        C307476Qg.A08(animator, r4);
        this.A05 = animator;
        this.A04 = animator.getTotalDuration();
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new Q4z(this, i));
        }
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        0qQ.A0B(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    public final void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            Q3U.A02(this.A05, j);
        }
        this.A05.start();
    }

    public final void cancel() {
        this.A05.cancel();
    }

    public final void end() {
        this.A05.end();
    }

    public final long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return j * ((long) i);
        }
        return -1;
    }

    public final long getStartDelay() {
        return this.A02;
    }

    public final long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * ((long) i)) + this.A02;
        }
        return -1;
    }

    public final boolean isPaused() {
        return this.A05.isPaused();
    }

    public final boolean isRunning() {
        return this.A05.isRunning();
    }

    public final void pause() {
        this.A05.pause();
    }

    public final void resume() {
        this.A05.resume();
    }

    public final Animator setDuration(long j) {
        return this;
    }

    public final void setStartDelay(long j) {
        this.A02 = j;
    }

    public static final void A00(Q4v q4v, 0sP r2) {
        ArrayList<Animator.AnimatorListener> listeners = q4v.getListeners();
        if (listeners != null) {
            for (Object next : 00k.A0a(listeners)) {
                0qQ.A0A(next);
                r2.invoke(next);
            }
        }
    }
}

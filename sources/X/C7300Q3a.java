package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Q3a  reason: case insensitive filesystem */
public final class C7300Q3a extends Animator {
    public long A00;
    public long A01;
    public final List A02;
    public final Integer A03;

    public final void cancel() {
        for (Animator cancel : this.A02) {
            cancel.cancel();
        }
        A00(this, new C66310MMt(this, 42));
    }

    public final void end() {
        for (Animator end : this.A02) {
            end.end();
        }
    }

    public final long getDuration() {
        return this.A00;
    }

    public final long getStartDelay() {
        return this.A01;
    }

    public final long getTotalDuration() {
        long j = this.A00;
        if (j != -1) {
            return j + this.A01;
        }
        return j;
    }

    public final boolean isRunning() {
        for (Animator isRunning : this.A02) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isStarted() {
        for (Animator isStarted : this.A02) {
            if (isStarted.isStarted()) {
                return true;
            }
        }
        return false;
    }

    public final Animator setDuration(long j) {
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        for (Animator interpolator : this.A02) {
            interpolator.setInterpolator(timeInterpolator);
        }
    }

    public final void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A02) {
            if (animator instanceof C7300Q3a) {
                animator.setStartDelay(j);
            } else {
                Q3U.A02(animator, j);
            }
        }
    }

    public final void start() {
        List<Animator> list = this.A02;
        for (Animator start : list) {
            start.start();
        }
        A00(this, new C66310MMt(this, 43));
        if (list.isEmpty()) {
            A00(this, new C66310MMt(this, 44));
        }
    }

    public C7300Q3a(Integer num, List list) {
        Object next;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Animator animator = (Animator) it.next();
            0qQ.A0B(animator, 0);
            long totalDuration = animator.getTotalDuration();
            if (totalDuration == -1) {
                this.A00 = -1;
                break;
            }
            this.A00 = Math.max(this.A00, totalDuration);
        }
        if (this.A00 != -1 && (!this.A02.isEmpty())) {
            int intValue = this.A03.intValue();
            if (intValue == 0 || intValue == 2) {
                Iterator it2 = this.A02.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Animator animator2 = (Animator) next;
                        0qQ.A0B(animator2, 0);
                        long totalDuration2 = animator2.getTotalDuration();
                        do {
                            Object next2 = it2.next();
                            Animator animator3 = (Animator) next2;
                            0qQ.A0B(animator3, 0);
                            long totalDuration3 = animator3.getTotalDuration();
                            if (totalDuration2 < totalDuration3) {
                                next = next2;
                                totalDuration2 = totalDuration3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw Pxe.A1C();
                }
            } else if (intValue == 1) {
                next = 00k.A0K(this.A02);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            ((Animator) next).addListener(new C7345Q4x(this, 0));
        }
    }

    public static final void A00(C7300Q3a q3a, 0sP r2) {
        ArrayList<Animator.AnimatorListener> listeners = q3a.getListeners();
        if (listeners != null) {
            for (Object next : 00k.A0a(listeners)) {
                0qQ.A0A(next);
                r2.invoke(next);
            }
        }
    }

    public final void pause() {
        super.pause();
        if (isPaused()) {
            for (Animator pause : this.A02) {
                pause.pause();
            }
        }
    }

    public final void resume() {
        super.resume();
        if (!isPaused()) {
            for (Animator resume : this.A02) {
                resume.resume();
            }
        }
    }
}

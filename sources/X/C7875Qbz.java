package X;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qbz  reason: case insensitive filesystem */
public abstract class C7875Qbz extends C9142RQt implements Future {
    public final C13269TSk A00() {
        if (this instanceof C7871Qbv) {
            return ((C7871Qbv) this).A00;
        }
        return ((C7870Qbu) this).A00;
    }

    public final boolean cancel(boolean z) {
        if (!(this instanceof C7871Qbv)) {
            return A00().cancel(z);
        }
        C7871Qbv qbv = (C7871Qbv) this;
        C13262TSd tSd = qbv.A01;
        String str = C13262TSd.A0A;
        synchronized (tSd) {
            PriorityQueue priorityQueue = tSd.A02;
            Iterator it = priorityQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TA7 ta7 = (TA7) it.next();
                if (ta7.A01 == qbv) {
                    priorityQueue.remove(ta7);
                    C13262TSd.A02(tSd);
                    break;
                }
            }
        }
        return qbv.A00.cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return A00().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return A00().isCancelled();
    }

    public final boolean isDone() {
        return A00().isDone();
    }

    public Object get() {
        return A00().get();
    }
}

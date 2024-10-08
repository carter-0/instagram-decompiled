package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class Q2Z extends AnonymousClass28y implements Future {
    public final Future A01() {
        if (this instanceof C7266Q1q) {
            return ((C7266Q1q) this).A00;
        }
        return ((QLQ) this).A00;
    }

    public boolean cancel(boolean z) {
        return A01().cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return A01().get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return A01().isCancelled();
    }

    public final boolean isDone() {
        return A01().isDone();
    }

    public Object get() {
        return A01().get();
    }
}

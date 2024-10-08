package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class Y4B implements Future {
    public final C65051aA A00;

    public final Object get() {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final boolean cancel(boolean z) {
        this.A00.dispose();
        return false;
    }

    public Y4B(C65051aA r1) {
        this.A00 = r1;
    }
}

package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class TOA implements Future {
    public static final TOA A01 = new TOA((Object) null);
    public final Object A00;

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public TOA(Object obj) {
        this.A00 = obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return get();
    }

    public final Object get() {
        return this.A00;
    }
}

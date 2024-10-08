package X;

import com.facebook.common.dextricks.stats.ClassLoadingStats;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0NY  reason: invalid class name */
public final class AnonymousClass0NY extends ClassLoadingStats {
    public final AtomicInteger A00 = new AtomicInteger();
    public final AtomicInteger A01 = new AtomicInteger();
    public final AtomicInteger A02 = new AtomicInteger();
    public final AtomicInteger A03 = new AtomicInteger();

    public final int getLocatorAssistedClassLoads() {
        return 0;
    }

    public final void decrementDexFileQueries() {
        this.A02.decrementAndGet();
    }

    public final int getClassLoadsAttempted() {
        return this.A00.get();
    }

    public final int getClassLoadsFailed() {
        return this.A01.get();
    }

    public final int getDexFileQueries() {
        return this.A02.get();
    }

    public final int getIncorrectDfaGuesses() {
        return this.A03.get();
    }

    public final void incrementClassLoadsAttempted() {
        this.A00.incrementAndGet();
    }

    public final void incrementClassLoadsFailed() {
        this.A01.incrementAndGet();
    }

    public final void incrementDexFileQueries(int i) {
        this.A02.addAndGet(i);
    }

    public final void incrementIncorrectDfaGuesses() {
        this.A03.incrementAndGet();
    }
}

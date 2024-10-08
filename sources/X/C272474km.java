package X;

import com.facebook.memory.javamemtracker.JavaMemoryTrackerForMetrics;

/* renamed from: X.4km  reason: invalid class name and case insensitive filesystem */
public final class C272474km implements 0T6 {
    public final /* synthetic */ JavaMemoryTrackerForMetrics A00;

    public C272474km(JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics) {
        this.A00 = javaMemoryTrackerForMetrics;
    }

    public final void onDeallocation(long[] jArr, String[] strArr, int i) {
        this.A00.nativeRegisterDeallocation(jArr, strArr, i);
    }
}

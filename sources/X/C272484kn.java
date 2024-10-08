package X;

import com.facebook.memory.javamemtracker.JavaMemoryTrackerForMetrics;

/* renamed from: X.4kn  reason: invalid class name and case insensitive filesystem */
public final class C272484kn implements AnonymousClass0T8 {
    public final /* synthetic */ JavaMemoryTrackerForMetrics A00;

    public C272484kn(JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics) {
        this.A00 = javaMemoryTrackerForMetrics;
    }

    public final void finishProcessor() {
        JavaMemoryTrackerForMetrics.nativeStopPhantomReferenceLoop();
    }

    public final void startProcessor() {
        JavaMemoryTrackerForMetrics.nativeStartPhantomReferenceLoop();
    }
}

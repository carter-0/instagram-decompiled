package X;

import java.util.Queue;

/* renamed from: X.3jV  reason: invalid class name and case insensitive filesystem */
public final class C249313jV extends 1KD {
    public final /* synthetic */ AnonymousClass1HL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249313jV(AnonymousClass1HL r2) {
        super("CriticalPathMainThreadIdleQueue");
        this.A00 = r2;
    }

    public final boolean onQueueIdle() {
        AnonymousClass1HL r2 = this.A00;
        Queue queue = r2.A01;
        Runnable runnable = (Runnable) queue.poll();
        if (runnable != null) {
            runnable.run();
        }
        if (queue.isEmpty() || (!r2.A00.A03.isEmpty())) {
            return false;
        }
        return true;
    }
}

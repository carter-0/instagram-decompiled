package X;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3jX  reason: invalid class name and case insensitive filesystem */
public final class C249333jX extends 0ng {
    public final /* synthetic */ AnonymousClass1HN A00;

    public final void run() {
        try {
            AnonymousClass1HN r3 = this.A00;
            AtomicBoolean atomicBoolean = r3.A02;
            atomicBoolean.set(true);
            while (!(!r3.A00.A03.isEmpty())) {
                Queue queue = r3.A01;
                if (queue.isEmpty()) {
                    break;
                }
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
            atomicBoolean.set(false);
        } catch (Throwable th) {
            this.A00.A02.set(false);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249333jX(AnonymousClass1HN r2) {
        super(311);
        this.A00 = r2;
    }
}

package X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6ex  reason: invalid class name and case insensitive filesystem */
public final class C312686ex {
    public final C312716f1 A00;
    public C312726f4 flmEffectsDeletionManager;

    public C312686ex(C312696ey r7, C312706ez r8, 0Gb r9, 1vn r10, ScheduledExecutorService scheduledExecutorService) {
        0qQ.A0B(scheduledExecutorService, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r9, 4);
        0qQ.A0B(r10, 5);
        C312716f1 r1 = new C312716f1(new AnonymousClass6f0(r10), scheduledExecutorService);
        this.A00 = r1;
        this.flmEffectsDeletionManager = new C312726f4(r1, r8.A01(), r7, r9, r10);
    }
}

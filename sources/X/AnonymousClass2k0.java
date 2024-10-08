package X;

import android.os.MessageQueue;

/* renamed from: X.2k0  reason: invalid class name */
public final class AnonymousClass2k0 implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass4DH A00;

    public AnonymousClass2k0(AnonymousClass4DH r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        AnonymousClass2kL access$getLifecycleLogger = this.A00.getLifecycleLogger();
        if (!access$getLifecycleLogger.A01) {
            return false;
        }
        02m r2 = access$getLifecycleLogger.A02;
        if (r2 != null) {
            r2.markerEnd(694561158, 4);
        }
        access$getLifecycleLogger.A01 = false;
        return false;
    }
}

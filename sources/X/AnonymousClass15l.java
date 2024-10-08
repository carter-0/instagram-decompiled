package X;

import android.os.MessageQueue;

/* renamed from: X.15l  reason: invalid class name */
public final class AnonymousClass15l implements MessageQueue.IdleHandler {
    public final /* synthetic */ C638515i A00;

    public AnonymousClass15l(C638515i r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        C638515i r2 = this.A00;
        r2.A01.A03 = true;
        C638515i.A01(r2);
        return false;
    }
}

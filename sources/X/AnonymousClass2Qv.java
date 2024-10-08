package X;

import android.os.MessageQueue;

/* renamed from: X.2Qv  reason: invalid class name */
public final class AnonymousClass2Qv implements MessageQueue.IdleHandler {
    public final /* synthetic */ 2Qu A00;

    public AnonymousClass2Qv(2Qu r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        2Qu r2 = this.A00;
        if (r2.A01 == AnonymousClass05K.A01) {
            return true;
        }
        r2.A01 = AnonymousClass05K.A0C;
        return true;
    }
}

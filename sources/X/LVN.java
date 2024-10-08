package X;

import android.os.MessageQueue;

public final class LVN implements MessageQueue.IdleHandler {
    public final /* synthetic */ boolean A00;

    public LVN(boolean z) {
        this.A00 = z;
    }

    public final boolean queueIdle() {
        1xC.A01.A00(new AnonymousClass3GS(C63104KrX.A00(this.A00)));
        return false;
    }
}

package X;

import android.os.MessageQueue;

/* renamed from: X.MZa  reason: case insensitive filesystem */
public final /* synthetic */ class C66614MZa implements MessageQueue.IdleHandler {
    public final /* synthetic */ MYU A00;

    public /* synthetic */ C66614MZa(MYU myu) {
        this.A00 = myu;
    }

    public final boolean queueIdle() {
        this.A00.A06();
        return false;
    }
}

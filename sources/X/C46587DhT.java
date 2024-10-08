package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.DhT  reason: case insensitive filesystem */
public final class C46587DhT extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46587DhT(Looper looper, Handler.Callback callback) {
        super(looper, new C46590DhW(callback));
        0qQ.A0B(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        0qQ.A0B(message, 0);
        if (0qQ.A0K(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}

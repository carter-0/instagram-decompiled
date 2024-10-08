package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.U1n  reason: case insensitive filesystem */
public final class C14688U1n extends Handler {
    public final WeakReference A00;

    public final void handleMessage(Message message) {
        U1L u1l;
        0qQ.A0B(message, 0);
        if (message.what == 1 && (u1l = (U1L) this.A00.get()) != null) {
            U1L.A00(u1l);
        }
    }

    public C14688U1n(U1L u1l) {
        this.A00 = new WeakReference(u1l);
    }
}

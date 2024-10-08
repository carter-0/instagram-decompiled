package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.U1m  reason: case insensitive filesystem */
public final class C14687U1m extends Handler {
    public final WeakReference A00;

    public final void handleMessage(Message message) {
        C14669U0p u0p;
        0qQ.A0B(message, 0);
        if (message.what == 1 && (u0p = (C14669U0p) this.A00.get()) != null && u0p.A04) {
            u0p.A04 = false;
            u0p.A0G.clear();
            u0p.invalidateSelf();
        }
    }

    public C14687U1m(C14669U0p u0p) {
        this.A00 = new WeakReference(u0p);
    }
}

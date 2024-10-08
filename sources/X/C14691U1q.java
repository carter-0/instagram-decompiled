package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.U1q  reason: case insensitive filesystem */
public final class C14691U1q extends Handler {
    public C17259VOm A00;

    public final void handleMessage(Message message) {
        C17259VOm vOm;
        0qQ.A0B(message, 0);
        if (message.what == 1 && (vOm = this.A00) != null) {
            C14980UHy uHy = vOm.A00;
            uHy.A02.DP2(0.0f, 0.0f);
            uHy.A00 = true;
        }
    }

    public C14691U1q() {
        super(Looper.getMainLooper());
    }
}

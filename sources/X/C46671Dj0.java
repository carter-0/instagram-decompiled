package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Dj0  reason: case insensitive filesystem */
public final class C46671Dj0 extends Handler {
    public final G6D A00;

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        if (message.what == 1) {
            this.A00.E2e();
        }
    }

    public C46671Dj0(G6D g6d) {
        this.A00 = g6d;
    }
}

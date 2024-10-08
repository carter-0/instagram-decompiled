package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.QuV  reason: case insensitive filesystem */
public final class C8433QuV extends C3024063e {
    public final /* synthetic */ QpU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8433QuV(Looper looper, QpU qpU) {
        super(looper);
        this.A00 = qpU;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            QpU qpU = this.A00;
            Lock lock = qpU.A0G;
            lock.lock();
            try {
                if (qpU.A0H()) {
                    QpU.A01(qpU);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", 002.A0O("Unknown message id: ", i));
        } else {
            QpU.A02(this.A00);
        }
    }
}

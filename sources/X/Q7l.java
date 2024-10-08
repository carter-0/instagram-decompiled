package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class Q7l extends Handler {
    public final /* synthetic */ QJR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7l(Looper looper, QJR qjr) {
        super(looper);
        this.A00 = qjr;
    }

    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            this.A00.A00((C274844pB) obj);
        }
    }
}

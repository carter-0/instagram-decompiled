package X;

import android.os.Handler;
import android.os.Message;

public final class FK4 implements Handler.Callback {
    public final /* synthetic */ Handler.Callback A00;
    public final /* synthetic */ 1NW A01;

    public FK4(Handler.Callback callback, 1NW r2) {
        this.A01 = r2;
        this.A00 = callback;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0r1, java.lang.Object] */
    public final boolean handleMessage(Message message) {
        0qQ.A0B(message, 0);
        ? obj = new Object();
        1NW.A00(this.A01, new C51438Fu8(this.A00, message, obj), 1729269119);
        return obj.A00;
    }
}

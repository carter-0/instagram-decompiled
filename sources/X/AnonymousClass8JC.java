package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.8JC  reason: invalid class name */
public final class AnonymousClass8JC extends Handler {
    public final /* synthetic */ AnonymousClass8JB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JC(Looper looper, AnonymousClass8JB r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        AnonymousClass8JB r3 = this.A00;
        int i = r3.A01;
        if (i == 0) {
            r3.A03.onFinish();
        } else {
            r3.A04.DrY(i);
        }
        int i2 = r3.A01 - 1;
        r3.A01 = i2;
        if (i2 >= 0) {
            sendMessageDelayed(Message.obtain(), (long) r3.A00);
        }
    }
}

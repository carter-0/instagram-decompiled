package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.6Na  reason: invalid class name and case insensitive filesystem */
public final class C306666Na extends Handler {
    public final /* synthetic */ AnonymousClass6NZ A00;

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i == 99) {
            AnonymousClass6NZ.A01(this.A00);
            return;
        }
        throw new RuntimeException(002.A0O("Unknown message: ", i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C306666Na(Looper looper, AnonymousClass6NZ r2) {
        super(looper);
        this.A00 = r2;
    }
}

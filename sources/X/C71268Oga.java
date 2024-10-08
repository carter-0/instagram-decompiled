package X;

import android.content.Context;
import android.os.MessageQueue;

/* renamed from: X.Oga  reason: case insensitive filesystem */
public final class C71268Oga implements MessageQueue.IdleHandler {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C71268Oga(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final boolean queueIdle() {
        0nY.A00().ATE(new C68667NRz(this.A00, this.A01));
        return false;
    }
}

package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Fu8  reason: case insensitive filesystem */
public final class C51438Fu8 implements Runnable {
    public final /* synthetic */ Handler.Callback A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ 0r1 A02;

    public C51438Fu8(Handler.Callback callback, Message message, 0r1 r3) {
        this.A02 = r3;
        this.A00 = callback;
        this.A01 = message;
    }

    public final void run() {
        this.A02.A00 = this.A00.handleMessage(this.A01);
    }
}

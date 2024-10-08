package X;

import android.content.IntentFilter;
import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: X.5DO  reason: invalid class name */
public final class AnonymousClass5DO implements Runnable {
    public final /* synthetic */ 1Ou A00;

    public AnonymousClass5DO(1Ou r1) {
        this.A00 = r1;
    }

    public final void run() {
        MessageQueue myQueue = Looper.myQueue();
        1Ou r1 = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        myQueue.addIdleHandler(r1.A06);
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.19b  reason: invalid class name */
public final class AnonymousClass19b extends Handler {
    public final /* synthetic */ AnonymousClass19Z A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass19b(Looper looper, AnonymousClass19Z r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        LinkedList linkedList;
        if (message.what == 1) {
            AnonymousClass19Z r3 = this.A00;
            if (r3.A00 != null) {
                synchronized (r3.A02) {
                    r3.A00.removeMessages(1);
                    linkedList = r3.A01;
                    r3.A01 = new LinkedList();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }
}

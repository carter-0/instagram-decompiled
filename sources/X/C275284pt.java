package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4pt  reason: invalid class name and case insensitive filesystem */
public final class C275284pt extends C275274ps {
    public boolean A00 = false;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final void A03() {
        this.A00 = true;
        A00();
    }

    public final void dispatchMessage(Message message) {
        if (!this.A00) {
            super.dispatchMessage(message);
            return;
        }
        Message message2 = (Message) this.A02.remove(message);
        if (message2 == null) {
            Handler handler = (Handler) this.A01.remove(message);
            if (handler != null) {
                message.setTarget(handler);
            }
            message2 = message;
        }
        if (message2.getTarget() != this) {
            A02(message2);
        }
        A00();
    }

    public C275284pt(Looper looper, C274834pA r3, C274974pO r4) {
        super(looper, r3, r4);
    }

    private void A00() {
        MessageQueue myQueue = Looper.myQueue();
        synchronized (myQueue) {
            C274974pO r1 = this.A04;
            try {
                Message message = (Message) r1.A00.get(myQueue);
                if (message != null) {
                    if (message.getTarget() != null && message.getWhen() <= SystemClock.uptimeMillis()) {
                        this.A01.put(message, message.getTarget());
                    } else if (message.getTarget() == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (true) {
                            message = (Message) r1.A01.get(message);
                            if (message == null) {
                                break;
                            } else if (message.isAsynchronous()) {
                                if (uptimeMillis >= message.getWhen()) {
                                    this.A01.put(message, message.getTarget());
                                }
                            }
                        }
                    }
                    message.setTarget(this);
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        Message A012 = A01(Looper.myQueue());
        if (A012 != null) {
            Message obtain = Message.obtain(A012);
            this.A02.put(obtain, A012);
            sendMessageAtFrontOfQueue(obtain);
        }
    }
}

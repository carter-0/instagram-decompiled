package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;

/* renamed from: X.4ps  reason: invalid class name and case insensitive filesystem */
public abstract class C275274ps extends Handler implements Runnable {
    public Message A00;
    public Message A01;
    public boolean A02 = false;
    public final C274834pA A03;
    public final C274974pO A04;

    public abstract void A03();

    public final Message A01(MessageQueue messageQueue) {
        Message message;
        try {
            this.A03.ExE();
            message = (Message) this.A04.A02.invoke(messageQueue, new Object[0]);
        } catch (Throwable unused) {
            message = null;
        }
        this.A03.AVY();
        return message;
    }

    public final void run() {
        Message message = this.A01;
        if (message != null) {
            this.A03.AVV(message);
            this.A01 = null;
        }
        A03();
        this.A00 = null;
    }

    public C275274ps(Looper looper, C274834pA r3, C274974pO r4) {
        super(looper);
        this.A04 = r4;
        this.A03 = r3;
        Looper.getMainLooper();
    }

    public final void A02(Message message) {
        Handler target = message.getTarget();
        if (target != null) {
            try {
                C274834pA r0 = this.A03;
                r0.Ewt(message);
                target.dispatchMessage(message);
                r0.AVV(message);
            } catch (Throwable th) {
                this.A03.AVV(message);
                throw th;
            }
        }
    }
}

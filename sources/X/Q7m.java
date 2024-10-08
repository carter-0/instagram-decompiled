package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

public final class Q7m extends Handler {
    public final /* synthetic */ C10667Rw1 A00;

    public final void handleMessage(Message message) {
        ArrayList arrayList;
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i == 1) {
            C10667Rw1 rw1 = this.A00;
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type T of com.facebook.crudolib.eventbus.EventDispatcher");
            0qQ.A0B(obj, 0);
            Looper looper = rw1.A02;
            if (looper != null) {
                Looper myLooper = Looper.myLooper();
                if (!0qQ.A0K(myLooper, looper)) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("Cannot dispatch event from looper thread ");
                    A1A.append(myLooper);
                    throw C66582MXn.A0k(looper, "; expected ", A1A);
                }
            }
            synchronized (rw1) {
                if (!rw1.A01) {
                    rw1.A01 = true;
                    arrayList = rw1.A00;
                } else {
                    throw AnonymousClass7TE.A1B("Nested synchronous dispatching is not supported");
                }
            }
            try {
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    synchronized (rw1) {
                    }
                    throw AnonymousClass7TE.A11("handleEvent");
                }
                synchronized (rw1) {
                    rw1.A01 = false;
                }
            } catch (Throwable th) {
                synchronized (rw1) {
                    rw1.A01 = false;
                    throw th;
                }
            }
        } else if (i == 2) {
            C10667Rw1 rw12 = this.A00;
            0qQ.A0C(message.obj, "null cannot be cast to non-null type com.facebook.crudolib.eventbus.EventSubscriber<T of com.facebook.crudolib.eventbus.EventDispatcher>");
            Looper looper2 = rw12.A02;
            if (looper2 != null) {
                Looper myLooper2 = Looper.myLooper();
                if (!0qQ.A0K(myLooper2, looper2)) {
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append("Cannot dispatch event from looper thread ");
                    A1A2.append(myLooper2);
                    throw C66582MXn.A0k(looper2, "; expected ", A1A2);
                }
            }
        } else {
            throw DbW.A0a(AnonymousClass000.A00(2529), i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7m(Looper looper, C10667Rw1 rw1) {
        super(looper);
        this.A00 = rw1;
    }
}

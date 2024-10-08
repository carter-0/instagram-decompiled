package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.435  reason: invalid class name */
public abstract class AnonymousClass435 implements AnonymousClass0lh {
    public Handler A00;
    public HandlerThread A01;
    public boolean A02;
    public final String A03;

    private final synchronized HandlerThread A00() {
        HandlerThread handlerThread;
        if (this.A01 == null) {
            HandlerThread handlerThread2 = new HandlerThread(this.A03);
            AnonymousClass0fe.A00(handlerThread2);
            this.A01 = handlerThread2;
            handlerThread2.start();
            if (this.A02) {
                0wb.A03("direct_handler_thread_recreated", "DirectHandlerThread is recreated after the user session has ended.");
            }
        }
        handlerThread = this.A01;
        0qQ.A0A(handlerThread);
        return handlerThread;
    }

    public final synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            handler = new Handler(A00().getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public final void onSessionWillEnd() {
        synchronized (this) {
            HandlerThread handlerThread = this.A01;
            if (handlerThread != null) {
                handlerThread.quit();
                this.A01 = null;
                this.A00 = null;
            }
            this.A02 = true;
        }
    }

    public AnonymousClass435(String str) {
        this.A03 = str;
    }

    public final Looper A02() {
        Looper looper = A00().getLooper();
        0qQ.A07(looper);
        return looper;
    }
}

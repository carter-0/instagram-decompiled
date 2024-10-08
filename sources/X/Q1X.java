package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Thread;

public final class Q1X extends Handler {
    public final Thread.UncaughtExceptionHandler A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q1X(Handler.Callback callback, Looper looper, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(looper, callback);
        0qQ.A0B(looper, 1);
        this.A00 = uncaughtExceptionHandler;
    }

    public final void dispatchMessage(Message message) {
        0qQ.A0B(message, 0);
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
            }
        }
    }
}

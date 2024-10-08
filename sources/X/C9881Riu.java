package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Riu  reason: case insensitive filesystem */
public abstract class C9881Riu {
    public static final void A00(C262094Cc r4, Throwable th) {
        Throwable A0u;
        for (CoroutineExceptionHandler handleException : C10045Rli.A00) {
            try {
                handleException.handleException(r4, th);
            } catch (C8990RKi unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    A0u = th;
                } else {
                    A0u = Pxe.A0u("Exception while trying to handle coroutine exception", th2);
                    2Og.A01(A0u, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, A0u);
            }
        }
        try {
            2Og.A01(th, new C13220TQl(r4));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}

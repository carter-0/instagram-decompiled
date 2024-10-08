package X;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Rir  reason: case insensitive filesystem */
public abstract class C9878Rir {
    public static final void A00(C262094Cc r2, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) r2.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(r2, th);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException A0u = Pxe.A0u("Exception while trying to handle coroutine exception", th2);
                2Og.A01(A0u, th);
                th = A0u;
            }
        }
        C9881Riu.A00(r2, th);
    }
}

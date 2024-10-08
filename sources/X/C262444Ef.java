package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.4Ef  reason: invalid class name and case insensitive filesystem */
public final class C262444Ef {
    public static C262444Ef A02;
    public final Handler A00;
    public final HandlerThread A01;

    public static C262444Ef A00() {
        C262444Ef r0 = A02;
        if (r0 != null) {
            return r0;
        }
        C262444Ef r02 = new C262444Ef();
        A02 = r02;
        return r02;
    }

    public C262444Ef() {
        HandlerThread handlerThread = new HandlerThread("MQD_Bg_Executor", 10);
        AnonymousClass0fe.A00(handlerThread);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}

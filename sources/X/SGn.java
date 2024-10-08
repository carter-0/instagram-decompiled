package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;

public final class SGn {
    public static SGn A01;
    public static final Object A02 = Pxe.A0p();
    public Handler A00;

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.SGn] */
    public static SGn A00() {
        SGn sGn;
        synchronized (A02) {
            SGn sGn2 = A01;
            sGn = sGn2;
            if (sGn2 == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                ? obj = new Object();
                obj.A00 = new Handler(looper);
                A01 = obj;
                sGn = obj;
            }
        }
        return sGn;
    }

    public final AnonymousClass9GD A01(Callable callable) {
        C365498nD r2 = new C365498nD();
        RJJ.A01.execute(new THL(r2, callable));
        return r2.A00;
    }
}

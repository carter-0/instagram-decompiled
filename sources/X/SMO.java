package X;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicReference;

public final class SMO {
    public static final AtomicReference A00 = new AtomicReference();

    public static void A00(boolean z) {
        AtomicReference atomicReference = A00;
        if (atomicReference.get() == null || z) {
            synchronized (SMO.class) {
                if (atomicReference.get() == null || z) {
                    HandlerThread A0J = Pxf.A0J("HeroPlayerSharedThread", -2);
                    A0J.start();
                    A0J.getLooper();
                    atomicReference.set(A0J);
                }
            }
        }
    }
}

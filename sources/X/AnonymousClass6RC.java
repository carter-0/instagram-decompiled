package X;

import android.os.HandlerThread;

/* renamed from: X.6RC  reason: invalid class name */
public abstract class AnonymousClass6RC {
    public static final HandlerThread A00;

    static {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ResponseThread", -4);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        A00 = handlerThread;
    }
}

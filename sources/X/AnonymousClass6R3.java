package X;

import android.os.HandlerThread;

/* renamed from: X.6R3  reason: invalid class name */
public final class AnonymousClass6R3 implements C64351Ki {
    public static final AnonymousClass6R3 A00 = new AnonymousClass6R3();

    public final /* bridge */ /* synthetic */ Object get() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ReadWriteThread", 10);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}

package X;

import android.os.HandlerThread;

/* renamed from: X.4NR  reason: invalid class name */
public final class AnonymousClass4NR extends 0Yg implements C62320sa {
    public static final AnonymousClass4NR A00 = new AnonymousClass4NR();

    public AnonymousClass4NR() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("WorkerThreadManager_VideoPlayerWorkerThread");
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        AnonymousClass4NQ.A00 = true;
        return handlerThread;
    }
}

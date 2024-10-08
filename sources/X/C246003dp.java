package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.3dp  reason: invalid class name and case insensitive filesystem */
public final class C246003dp extends 0Yg implements C62320sa {
    public static final C246003dp A00 = new C246003dp();

    public C246003dp() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("ThreadUtilsBackgroundHandler", 5);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}

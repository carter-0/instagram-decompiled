package X;

import android.os.HandlerThread;

/* renamed from: X.MLz  reason: case insensitive filesystem */
public final class C66290MLz extends 0Yg implements C62320sa {
    public static final C66290MLz A00 = new C66290MLz();

    public C66290MLz() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread(AnonymousClass000.A00(1033));
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}

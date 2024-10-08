package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.MJc  reason: case insensitive filesystem */
public final class C66221MJc extends 0Yg implements C62320sa {
    public static final C66221MJc A00 = new C66221MJc();

    public C66221MJc() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("BloksScriptDispatchLowPriThread", 10);
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}

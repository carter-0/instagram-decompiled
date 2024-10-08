package X;

import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.TFy  reason: case insensitive filesystem */
public final /* synthetic */ class C12965TFy implements Runnable {
    public final /* synthetic */ C10742RxL A00;
    public final /* synthetic */ SettableFuture A01;

    public /* synthetic */ C12965TFy(C10742RxL rxL, SettableFuture settableFuture) {
        this.A00 = rxL;
        this.A01 = settableFuture;
    }

    public final void run() {
        C10742RxL rxL = this.A00;
        SettableFuture settableFuture = this.A01;
        rxL.A00.A00();
        PapayaJNI.nativeUninitialize();
        settableFuture.set((Object) null);
    }
}

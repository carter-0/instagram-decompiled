package X;

import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.TId  reason: case insensitive filesystem */
public final /* synthetic */ class C13021TId implements Runnable {
    public final /* synthetic */ C10742RxL A00;
    public final /* synthetic */ PapayaRestrictions A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ C13021TId(C10742RxL rxL, PapayaRestrictions papayaRestrictions, SettableFuture settableFuture) {
        this.A00 = rxL;
        this.A01 = papayaRestrictions;
        this.A02 = settableFuture;
    }

    public final void run() {
        C10742RxL rxL = this.A00;
        PapayaRestrictions papayaRestrictions = this.A01;
        SettableFuture settableFuture = this.A02;
        rxL.A00.A00();
        PapayaJNI.run(papayaRestrictions);
        settableFuture.set((Object) null);
    }
}

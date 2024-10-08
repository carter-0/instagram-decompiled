package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.NRd  reason: case insensitive filesystem */
public final class C68647NRd extends 0ng {
    public final /* synthetic */ C68358NBv A00;
    public final /* synthetic */ SettableFuture A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68647NRd(C68358NBv nBv, SettableFuture settableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = nBv;
        this.A01 = settableFuture;
    }

    public final void run() {
        this.A01.set(this.A00.A00.A01());
    }
}

package X;

import com.google.common.util.concurrent.SettableFuture;

public final class NS4 extends 0ng {
    public final /* synthetic */ SJ9 A00;
    public final /* synthetic */ SettableFuture A01;

    public final void run() {
        this.A01.set(this.A00.A01());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS4(SJ9 sj9, SettableFuture settableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = sj9;
        this.A01 = settableFuture;
    }
}

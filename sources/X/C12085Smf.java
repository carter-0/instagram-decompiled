package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Smf  reason: case insensitive filesystem */
public final class C12085Smf implements 2Kw {
    public final /* synthetic */ SettableFuture A00;

    public C12085Smf(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void invoke(Throwable th) {
        this.A00.setException(new Exception("Banyan Graph QL failure"));
    }
}

package X;

import com.facebook.models.Manifest;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.9RB  reason: invalid class name */
public final class AnonymousClass9RB implements 2Kw {
    public final /* synthetic */ SettableFuture A00;

    public AnonymousClass9RB(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void invoke(Throwable th) {
        Manifest manifest = new Manifest();
        manifest.setQueryStatus(C378739Ra.FAILURE.toString(), th.getMessage());
        this.A00.set(manifest);
    }
}

package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.AeB  reason: case insensitive filesystem */
public final class C40564AeB implements C358108aN {
    public final /* synthetic */ SettableFuture A00;

    public C40564AeB(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void onFailure(String str, boolean z) {
        this.A00.set(AnonymousClass7TE.A0u());
    }

    public final void onSuccess() {
        this.A00.set(AnonymousClass7TE.A0v());
    }
}

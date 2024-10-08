package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.RAn  reason: case insensitive filesystem */
public final class C8811RAn extends C229022mi {
    public final /* synthetic */ SettableFuture A00;

    public C8811RAn(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void A00(AnonymousClass3JD r5) {
        C254583si r52 = (C254583si) r5;
        this.A00.set(new AnonymousClass3JC(r52.A00, r52.A01));
    }

    public final void A02(Throwable th) {
        this.A00.setException(th);
    }
}

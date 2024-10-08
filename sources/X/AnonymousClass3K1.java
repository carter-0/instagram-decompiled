package X;

import java.util.concurrent.Future;

/* renamed from: X.3K1  reason: invalid class name */
public final class AnonymousClass3K1 extends 0vM {
    public final /* synthetic */ AnonymousClass3G8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3K1(AnonymousClass3G8 r3) {
        super("prefetchLocation", 534);
        this.A00 = r3;
    }

    public final void loggedRun() {
        AnonymousClass3G8 r2 = this.A00;
        Future future = r2.A00;
        if (future == null || future.isDone()) {
            r2.A00 = 1Wr.prefetchLocationLazy(r2.A01, C227802jw.__redex_internal_original_name);
        }
    }
}

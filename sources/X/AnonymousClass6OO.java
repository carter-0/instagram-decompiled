package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6OO  reason: invalid class name */
public final class AnonymousClass6OO extends 1LO {
    public final AnonymousClass6ON A00;
    public final /* synthetic */ C258523zD A01;

    public AnonymousClass6OO(AnonymousClass6ON r1, C258523zD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A01() {
        AnonymousClass6ON r2 = this.A00;
        ListenableFuture AFB = r2.AFB();
        17k.A08(AFB, r2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return AFB;
    }

    public final String A02() {
        return this.A00.toString();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        this.A01.A0A((ListenableFuture) obj);
    }

    public final void A05(Throwable th) {
        this.A01.setException(th);
    }

    public final boolean A06() {
        return this.A01.isDone();
    }
}

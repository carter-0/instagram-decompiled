package X;

import java.util.concurrent.Callable;

/* renamed from: X.3zH  reason: invalid class name and case insensitive filesystem */
public final class C258563zH extends 1LO {
    public final Callable A00;
    public final /* synthetic */ C258523zD A01;

    public C258563zH(C258523zD r1, Callable callable) {
        this.A01 = r1;
        callable.getClass();
        this.A00 = callable;
    }

    public final Object A01() {
        return this.A00.call();
    }

    public final String A02() {
        return this.A00.toString();
    }

    public final void A04(Object obj) {
        this.A01.set(obj);
    }

    public final void A05(Throwable th) {
        this.A01.setException(th);
    }

    public final boolean A06() {
        return this.A01.isDone();
    }
}

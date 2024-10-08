package X;

/* renamed from: X.XDp  reason: case insensitive filesystem */
public final class C21076XDp implements 1aL {
    public final C21074XDn A00;
    public final /* synthetic */ C21103XEs A01;

    public final void onComplete() {
    }

    public C21076XDp(C21074XDn xDn, C21103XEs xEs) {
        this.A01 = xEs;
        this.A00 = xDn;
    }

    public final void DUK(Object obj) {
        this.A00.lazySet(obj);
    }

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A00.A02);
    }

    public final void onError(Throwable th) {
        C21074XDn xDn = this.A00;
        1af.A01(xDn.A03);
        xDn.A01.onError(th);
    }
}

package X;

/* renamed from: X.FqO  reason: case insensitive filesystem */
public final class C51207FqO implements Runnable {
    public final /* synthetic */ E0O A00;

    public C51207FqO(E0O e0o) {
        this.A00 = e0o;
    }

    public final void run() {
        E0O e0o = this.A00;
        e0o.A03.set(true);
        e0o.A02.invoke();
        e0o.A07();
        E0O.A01(e0o);
    }
}

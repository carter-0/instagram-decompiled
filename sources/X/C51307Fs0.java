package X;

/* renamed from: X.Fs0  reason: case insensitive filesystem */
public final class C51307Fs0 implements Runnable {
    public final /* synthetic */ C47522E6i A00;

    public C51307Fs0(C47522E6i e6i) {
        this.A00 = e6i;
    }

    public final void run() {
        E9N e9n = this.A00.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            e9n.A03();
        }
    }
}

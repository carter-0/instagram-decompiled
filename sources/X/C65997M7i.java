package X;

/* renamed from: X.M7i  reason: case insensitive filesystem */
public final class C65997M7i implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ E4S A01;

    public C65997M7i(E4S e4s, int i) {
        this.A01 = e4s;
        this.A00 = i;
    }

    public final void run() {
        E4S e4s = this.A01;
        DbZ.A0w(e4s.getContext(), e4s, this.A00);
    }
}

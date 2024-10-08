package X;

/* renamed from: X.AmD  reason: case insensitive filesystem */
public final class C40967AmD implements Runnable {
    public final /* synthetic */ 2Kw A00;
    public final /* synthetic */ IllegalStateException A01;

    public C40967AmD(2Kw r1, IllegalStateException illegalStateException) {
        this.A00 = r1;
        this.A01 = illegalStateException;
    }

    public final void run() {
        2Kw r1 = this.A00;
        if (r1 != null) {
            r1.invoke(this.A01);
        }
    }
}

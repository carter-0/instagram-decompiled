package X;

/* renamed from: X.THj  reason: case insensitive filesystem */
public final /* synthetic */ class C13001THj implements Runnable {
    public final /* synthetic */ C8782R9j A00;
    public final /* synthetic */ IllegalStateException A01;

    public /* synthetic */ C13001THj(C8782R9j r9j, IllegalStateException illegalStateException) {
        this.A00 = r9j;
        this.A01 = illegalStateException;
    }

    public final void run() {
        this.A00.onFail(this.A01);
    }
}

package X;

/* renamed from: X.TDm  reason: case insensitive filesystem */
public final class C12923TDm implements Runnable {
    public final /* synthetic */ C13919TlL A00;

    public C12923TDm(C13919TlL tlL) {
        this.A00 = tlL;
    }

    public final void run() {
        this.A00.onError(new Throwable("Failed live location update to server"));
    }
}

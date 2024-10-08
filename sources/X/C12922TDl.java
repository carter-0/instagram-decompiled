package X;

/* renamed from: X.TDl  reason: case insensitive filesystem */
public final class C12922TDl implements Runnable {
    public final /* synthetic */ C13920TlM A00;

    public C12922TDl(C13920TlM tlM) {
        this.A00 = tlM;
    }

    public final void run() {
        this.A00.onError(new Throwable("Location sharing session ID missing from server response"));
    }
}

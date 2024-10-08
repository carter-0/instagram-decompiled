package X;

/* renamed from: X.TFk  reason: case insensitive filesystem */
public final class C12951TFk implements Runnable {
    public final /* synthetic */ 1Uo A00;
    public final /* synthetic */ Throwable A01;

    public C12951TFk(1Uo r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        this.A00.A00 = this.A01;
        throw AnonymousClass7TE.A11("onSharedPreferenceChanged");
    }
}

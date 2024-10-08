package X;

/* renamed from: X.AnR  reason: case insensitive filesystem */
public final class C41043AnR implements Runnable {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ boolean A01;

    public C41043AnR(AnonymousClass8ME r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        AnonymousClass8ME r3 = this.A00;
        r3.A1m.post(new C41042AnQ(r3, this.A01));
    }
}

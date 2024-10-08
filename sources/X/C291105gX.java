package X;

/* renamed from: X.5gX  reason: invalid class name and case insensitive filesystem */
public final class C291105gX implements Runnable {
    public final /* synthetic */ AnonymousClass1wD A00;
    public final /* synthetic */ boolean A01;

    public C291105gX(AnonymousClass1wD r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        for (C313416gP r3 : this.A00.A0A) {
            if (this.A01) {
                r3.A15.set(true);
                C313416gP.A0C(r3, 1w8.A00().A0C, 100, -6);
            }
        }
    }
}

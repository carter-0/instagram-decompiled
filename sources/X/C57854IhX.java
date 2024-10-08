package X;

/* renamed from: X.IhX  reason: case insensitive filesystem */
public final class C57854IhX implements Runnable {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C309426Yf A01;

    public C57854IhX(C255773uh r1, C309426Yf r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        if (!C307976Sf.A03) {
            C307976Sf.A02 = AnonymousClass05K.A01;
            C309426Yf r3 = this.A01;
            r3.A02(r3.A0B + (0.1f / 30.0f));
            C255773uh r2 = this.A00;
            C307976Sf.A04(r2, r3);
            if (r2 != null && r3.A0B >= 1.0f && !C307976Sf.A03) {
                C245983dn.A01(new C57742Ifj(r2));
            }
        }
    }
}

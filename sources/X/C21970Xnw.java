package X;

/* renamed from: X.Xnw  reason: case insensitive filesystem */
public final class C21970Xnw {
    public static C21970Xnw A05;
    public static final Object A06 = Pxe.A0p();
    public int A00;
    public int A01;
    public C21970Xnw A02;
    public boolean A03;
    public final 0Df[] A04;

    public final void A00() {
        for (int i = 0; i < this.A01; i++) {
            AnonymousClass0Jz r0 = this.A04[i];
            if (r0 != null) {
                r0.A02();
            }
        }
        this.A01 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A03 = false;
        synchronized (A06) {
            C21970Xnw xnw = A05;
            if (xnw == null || 15 > xnw.A00) {
                this.A02 = xnw;
                int i2 = 1;
                if (xnw != null) {
                    i2 = 1 + xnw.A00;
                }
                this.A00 = i2;
                A05 = this;
            }
        }
    }

    public C21970Xnw(int i) {
        if (i > 0) {
            this.A04 = new 0Df[i];
            this.A01 = 0;
            this.A03 = false;
            this.A00 = 0;
            this.A02 = null;
            return;
        }
        throw AnonymousClass7TE.A0w(002.A0c("Invalid batch Size of ", " was given.", i));
    }
}

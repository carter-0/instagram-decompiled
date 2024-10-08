package X;

/* renamed from: X.TuQ  reason: case insensitive filesystem */
public final class C14343TuQ implements Runnable {
    public final /* synthetic */ C14044Tol A00;
    public final /* synthetic */ C263754Nf A01;

    public C14343TuQ(C14044Tol tol, C263754Nf r2) {
        this.A00 = tol;
        this.A01 = r2;
    }

    public final void run() {
        C14044Tol tol = this.A00;
        AnonymousClass4M3 r2 = tol.A06;
        AnonymousClass3OB r1 = ((AnonymousClass4M1) r2).A0M;
        0qQ.A07(r1);
        if (r1 != AnonymousClass3OB.PLAYING) {
            r2.E2q("start", false);
        }
        C263754Nf r22 = this.A01;
        boolean z = r22.A00;
        C14344TuR tuR = tol.A07;
        if (z) {
            tuR.A02(0);
        } else {
            tuR.A00(0.0f, 0);
        }
        tol.A00.Dxy(r22);
    }
}

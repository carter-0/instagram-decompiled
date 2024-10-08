package X;

import java.io.IOException;

public final /* synthetic */ class XD1 implements Runnable {
    public final /* synthetic */ AnonymousClass4Y0 A00;
    public final /* synthetic */ AnonymousClass4Y4 A01;
    public final /* synthetic */ C265174Sv A02;
    public final /* synthetic */ AnonymousClass4P9 A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ XD1(AnonymousClass4Y0 r1, AnonymousClass4Y4 r2, C265174Sv r3, AnonymousClass4P9 r4, IOException iOException, boolean z) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = iOException;
        this.A05 = z;
    }

    public final void run() {
        C265174Sv r0 = this.A02;
        AnonymousClass4P9 r1 = this.A03;
        AnonymousClass4Y0 r2 = this.A00;
        AnonymousClass4Y4 r3 = this.A01;
        IOException iOException = this.A04;
        boolean z = this.A05;
        r1.DOD(r2, r3, r0.A01, iOException, r0.A00, z);
    }
}

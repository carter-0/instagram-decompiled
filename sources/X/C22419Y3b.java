package X;

import android.util.Pair;
import java.io.IOException;

/* renamed from: X.Y3b  reason: case insensitive filesystem */
public final /* synthetic */ class C22419Y3b implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C284595Ne A01;
    public final /* synthetic */ AnonymousClass4Y0 A02;
    public final /* synthetic */ AnonymousClass4Y4 A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C22419Y3b(Pair pair, C284595Ne r2, AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, IOException iOException, boolean z) {
        this.A01 = r2;
        this.A00 = pair;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = iOException;
        this.A05 = z;
    }

    public final void run() {
        C284595Ne r0 = this.A01;
        Pair pair = this.A00;
        AnonymousClass4Y0 r3 = this.A02;
        AnonymousClass4Y4 r4 = this.A03;
        IOException iOException = this.A04;
        boolean z = this.A05;
        r0.A01.A04.DOD(r3, r4, (C264874Rq) pair.second, iOException, Pxf.A05(pair), z);
    }
}

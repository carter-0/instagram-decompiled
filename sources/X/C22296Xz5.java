package X;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* renamed from: X.Xz5  reason: case insensitive filesystem */
public final class C22296Xz5 implements AnonymousClass4TQ {
    public final Y9V A00;

    public final void DO6(C266204Xy r1, long j, long j2, boolean z) {
    }

    public final /* synthetic */ void DOS(C266204Xy r1, int i, long j, long j2) {
    }

    public final void DOA(C266204Xy r4, long j, long j2) {
        boolean z;
        Y9V y9v = this.A00;
        synchronized (SN0.A03) {
            z = SN0.A01;
        }
        if (!z) {
            C265144Ss.A03(((C22307XzH) y9v).A00, new IOException(new ConcurrentModificationException()));
            return;
        }
        y9v.onInitialized();
    }

    public final AnonymousClass4XZ DOC(C266204Xy r2, IOException iOException, int i, long j, long j2) {
        C265144Ss.A03(((C22307XzH) this.A00).A00, iOException);
        return AnonymousClass4XY.A04;
    }

    public C22296Xz5(Y9V y9v) {
        this.A00 = y9v;
    }
}

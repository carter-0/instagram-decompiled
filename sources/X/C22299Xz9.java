package X;

import android.os.SystemClock;

/* renamed from: X.Xz9  reason: case insensitive filesystem */
public final class C22299Xz9 implements C250823m7 {
    public long A00;
    public final C257173wy A01;

    public final void A00(C257263x7 r3) {
        this.A01.Dtd(C257183wz.NOT_CACHED, r3);
    }

    public final void Czk(C257113ws r2, C257263x7 r3, int i, boolean z) {
        this.A01.Czk(r2, r3, i, z);
    }

    public final void Dtf(C257113ws r2, C257263x7 r3, boolean z, boolean z2) {
        this.A01.Dtf(r2, r3, z, z2);
    }

    public C22299Xz9(C257173wy r1) {
        this.A01 = r1;
    }

    public final void DtX(C257113ws r3, C257263x7 r4, boolean z) {
        this.A00 = SystemClock.elapsedRealtime();
    }
}

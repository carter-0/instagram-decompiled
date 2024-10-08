package X;

import android.graphics.Path;

/* renamed from: X.Go3  reason: case insensitive filesystem */
public final class C53411Go3 extends AnonymousClass0T0 implements C59539JNl {
    public final float A00;
    public final long A01;

    public final void AC7(Path path, I13 i13) {
        0qQ.A0B(path, 0);
        long j = this.A01;
        long j2 = C55305HfY.A00;
        path.addCircle(C51971G9r.A01(j), C51972G9s.A00(j), this.A00, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53411Go3) {
                C53411Go3 go3 = (C53411Go3) obj;
                long j = this.A01;
                long j2 = go3.A01;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && Float.compare(this.A00, go3.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return C51966G9m.A02(C51975G9x.A03(j), this.A00);
    }

    public C53411Go3(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}

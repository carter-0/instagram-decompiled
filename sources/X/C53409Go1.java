package X;

import android.graphics.Path;

/* renamed from: X.Go1  reason: case insensitive filesystem */
public final class C53409Go1 extends AnonymousClass0T0 implements C59539JNl {
    public final int A00;
    public final long A01;

    public C53409Go1(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final void AC7(Path path, I13 i13) {
        int i = this.A00;
        0qQ.A0B(path, 0);
        long j = this.A01;
        long j2 = C55305HfY.A00;
        float A012 = C51971G9r.A01(j);
        float A002 = C51972G9s.A00(j);
        if (i != 0) {
            path.moveTo(A012, A002);
        } else {
            path.lineTo(A012, A002);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53409Go1)) {
            return false;
        }
        C53409Go1 go1 = (C53409Go1) obj;
        if (go1.A00 != i) {
            return false;
        }
        long j = this.A01;
        long j2 = go1.A01;
        long j3 = C55305HfY.A00;
        if (j == j2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C55305HfY.A00;
        return C51968G9o.A03(j);
    }
}

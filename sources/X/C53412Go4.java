package X;

import android.graphics.Path;

/* renamed from: X.Go4  reason: case insensitive filesystem */
public final class C53412Go4 extends AnonymousClass0T0 implements C59539JNl {
    public final int A00;
    public final long A01;
    public final long A02;

    public C53412Go4(long j, long j2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
            return;
        }
        this.A02 = j;
        this.A01 = j2;
    }

    public final void AC7(Path path, I13 i13) {
        if (this.A00 != 0) {
            0qQ.A0B(path, 0);
            long j = this.A01;
            long j2 = C55305HfY.A00;
            float A002 = C51968G9o.A00(j);
            float A003 = C51972G9s.A00(j);
            long j3 = this.A02;
            path.quadTo(A002, A003, C51968G9o.A00(j3), C51972G9s.A00(j3));
            return;
        }
        0qQ.A0B(path, 0);
        long j4 = this.A02;
        long j5 = C55305HfY.A00;
        path.addOval(I4V.A01(C51968G9o.A00(j4), C51972G9s.A00(j4), this.A01), Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53412Go4)) {
                return false;
            }
            C53412Go4 go4 = (C53412Go4) obj;
            if (go4.A00 != 1) {
                return false;
            }
            long j3 = this.A01;
            long j4 = go4.A01;
            long j5 = C55305HfY.A00;
            if (j3 != j4) {
                return false;
            }
            j = this.A02;
            j2 = go4.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53412Go4)) {
                return false;
            }
            C53412Go4 go42 = (C53412Go4) obj;
            if (go42.A00 != 0) {
                return false;
            }
            long j6 = this.A02;
            long j7 = go42.A02;
            long j8 = C55305HfY.A00;
            if (j6 != j7) {
                return false;
            }
            j = this.A01;
            j2 = go42.A01;
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c;
        int A022;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A01;
            long j3 = C55305HfY.A00;
            c = ' ';
            A022 = C51967G9n.A02(j2);
            j = this.A02;
        } else {
            long j4 = this.A02;
            long j5 = C55305HfY.A00;
            c = ' ';
            A022 = C51967G9n.A02(j4);
            j = this.A01;
        }
        return A022 + ((int) (j ^ (j >>> c)));
    }
}

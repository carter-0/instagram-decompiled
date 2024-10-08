package X;

import android.graphics.Path;

/* renamed from: X.Go5  reason: case insensitive filesystem */
public final class C53413Go5 extends AnonymousClass0T0 implements C59539JNl {
    public final long A00;
    public final long A01;
    public final long A02;

    public final void AC7(Path path, I13 i13) {
        0qQ.A0B(path, 0);
        long j = this.A00;
        long j2 = C55305HfY.A00;
        float A002 = C51968G9o.A00(j);
        float A003 = C51972G9s.A00(j);
        long j3 = this.A01;
        float A004 = C51968G9o.A00(j3);
        float A005 = C51972G9s.A00(j3);
        long j4 = this.A02;
        path.cubicTo(A002, A003, A004, A005, C51968G9o.A00(j4), C51972G9s.A00(j4));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53413Go5) {
                C53413Go5 go5 = (C53413Go5) obj;
                long j = this.A00;
                long j2 = go5.A00;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && this.A01 == go5.A01 && this.A02 == go5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C55305HfY.A00;
        int A012 = AnonymousClass7TF.A01(this.A01, C51967G9n.A02(j));
        long j3 = this.A02;
        return A012 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C53413Go5(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}

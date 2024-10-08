package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Go6  reason: case insensitive filesystem */
public final class C53414Go6 extends AnonymousClass0T0 implements C59539JNl {
    public final float A00;
    public final long A01;
    public final long A02;

    public final void AC7(Path path, I13 i13) {
        0qQ.A0B(path, 0);
        long j = this.A02;
        long j2 = C55305HfY.A00;
        RectF A012 = I4V.A01(C51968G9o.A00(j), C51972G9s.A00(j), this.A01);
        float f = this.A00;
        path.addRoundRect(A012, f, f, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53414Go6) {
                C53414Go6 go6 = (C53414Go6) obj;
                long j = this.A02;
                long j2 = go6.A02;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && this.A01 == go6.A01 && Float.compare(this.A00, go6.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = C55305HfY.A00;
        return C51966G9m.A02(AnonymousClass7TF.A01(this.A01, C51967G9n.A02(j)), this.A00);
    }

    public C53414Go6(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}

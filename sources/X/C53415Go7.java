package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Go7  reason: case insensitive filesystem */
public final class C53415Go7 extends AnonymousClass0T0 implements C59539JNl {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    public final void AC7(Path path, I13 i13) {
        0qQ.A0B(path, 0);
        long j = this.A03;
        float f = this.A01;
        0eP A002 = HSU.A00(this.A02, this.A00, this.A04);
        float A042 = AnonymousClass7TE.A04(A002.A00);
        float A043 = AnonymousClass7TE.A04(A002.A01);
        long j2 = C55305HfY.A00;
        float A012 = C51971G9r.A01(j);
        float A003 = C51972G9s.A00(j);
        path.arcTo(new RectF(A012 - f, A003 - f, A012 + f, A003 + f), A042, A043);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53415Go7) {
                C53415Go7 go7 = (C53415Go7) obj;
                long j = this.A03;
                long j2 = go7.A03;
                long j3 = C55305HfY.A00;
                if (!(j == j2 && Float.compare(this.A01, go7.A01) == 0 && Float.compare(this.A02, go7.A02) == 0 && Float.compare(this.A00, go7.A00) == 0 && this.A04 == go7.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = C55305HfY.A00;
        return DbS.A06(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51975G9x.A03(j), this.A01), this.A02), this.A00));
    }

    public C53415Go7(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}

package X;

import java.util.Random;

/* renamed from: X.SqL  reason: case insensitive filesystem */
public final class C12266SqL implements C13776Tgr {
    public int A00;
    public int A01 = 0;
    public final int A02;
    public final int A03;
    public final Random A04 = new Random();

    public final C8866RDh C1W() {
        return C8866RDh.BACK_OFF;
    }

    public final boolean CKH(boolean z) {
        return AnonymousClass7TF.A1T(this.A01, Integer.MAX_VALUE);
    }

    public final int CrX(boolean z) {
        int i;
        this.A01++;
        int i2 = this.A00;
        if (!z && i2 < (i = this.A02)) {
            i2 = i;
        }
        int nextFloat = (int) ((((double) this.A04.nextFloat()) + 0.5d) * ((double) Math.min(i2 * 2, this.A03)));
        this.A00 = nextFloat;
        return nextFloat;
    }

    public final String toString() {
        return Pxf.A0m("BackoffRetryStrategy: attempt:%d/Infinite, delay:%d seconds", C51968G9o.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public C12266SqL(int i, int i2, int i3) {
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i;
    }
}

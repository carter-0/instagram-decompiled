package X;

/* renamed from: X.SqK  reason: case insensitive filesystem */
public final class C12265SqK implements C13776Tgr {
    public int A00 = 0;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean CKH(boolean z) {
        int i;
        int i2 = this.A00;
        if (z) {
            i = this.A01;
        } else {
            i = this.A02;
        }
        return i2 < i;
    }

    public final C8866RDh C1W() {
        return C8866RDh.BACK_TO_BACK;
    }

    public final String toString() {
        return Pxf.A0m("BackToBackRetryStrategy: attempt:%d/%d/%d, delay:%d seconds", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03)});
    }

    public C12265SqK(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final int CrX(boolean z) {
        if (!CKH(z)) {
            return -1;
        }
        this.A00++;
        return this.A03;
    }
}

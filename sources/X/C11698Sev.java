package X;

/* renamed from: X.Sev  reason: case insensitive filesystem */
public final class C11698Sev implements C13910TlA {
    public final C13910TlA A00;
    public final long A01;

    public final boolean E2G(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.E2G(bArr, 0, i2, z);
    }

    public final boolean E6T(byte[] bArr, int i, int i2, boolean z) {
        return this.A00.E6T(bArr, 0, i2, z);
    }

    public final int Evh(int i) {
        return this.A00.Evh(1);
    }

    public final void AAu(int i) {
        this.A00.AAu(i);
    }

    public final long BbM() {
        return this.A00.BbM() - this.A01;
    }

    public final long Bdl() {
        return this.A00.Bdl() - this.A01;
    }

    public final int E2C(byte[] bArr, int i, int i2) {
        return this.A00.E2C(bArr, i, i2);
    }

    public final void E2F(byte[] bArr, int i, int i2) {
        this.A00.E2F(bArr, i, i2);
    }

    public final void EI7() {
        this.A00.EI7();
    }

    public final void Evk(int i) {
        this.A00.Evk(i);
    }

    public final long getLength() {
        return this.A00.getLength() - this.A01;
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.A00.readFully(bArr, i, i2);
    }

    public C11698Sev(C13910TlA tlA, long j) {
        this.A00 = tlA;
        C11366SPh.A01(Pxf.A1R((tlA.Bdl() > j ? 1 : (tlA.Bdl() == j ? 0 : -1))));
        this.A01 = j;
    }
}

package X;

/* renamed from: X.TlA  reason: case insensitive filesystem */
public interface C13910TlA extends C13506TbX {
    static void A00(C11389SRd sRd, C13910TlA tlA, int i) {
        sRd.A0M(i);
        tlA.E2F(sRd.A02, 0, i);
    }

    void AAu(int i);

    long BbM();

    long Bdl();

    int E2C(byte[] bArr, int i, int i2);

    void E2F(byte[] bArr, int i, int i2);

    boolean E2G(byte[] bArr, int i, int i2, boolean z);

    boolean E6T(byte[] bArr, int i, int i2, boolean z);

    void EI7();

    int Evh(int i);

    void Evk(int i);

    long getLength();

    int read(byte[] bArr, int i, int i2);

    void readFully(byte[] bArr, int i, int i2);
}

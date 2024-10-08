package X;

/* renamed from: X.AWl  reason: case insensitive filesystem */
public final class C40221AWl implements B1C {
    public final B1C A00;
    public final byte[] A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A01;
        int length = bArr3.length;
        byte[] ASD = this.A00.ASD(bArr, bArr2);
        if (length != 0) {
            return C375459Dq.A01(ASD, bArr3);
        }
        return ASD;
    }

    public C40221AWl(B1C b1c, byte[] bArr) {
        this.A00 = b1c;
        this.A01 = bArr;
    }
}

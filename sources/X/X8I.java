package X;

public interface X8I {
    int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    int getCurveBytes();

    int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);
}

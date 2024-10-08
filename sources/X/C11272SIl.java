package X;

/* renamed from: X.SIl  reason: case insensitive filesystem */
public abstract class C11272SIl {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final int hashCode() {
        byte[] bArr = ((C8462Qv7) this).A00;
        int length = bArr.length;
        if (length * 8 < 32) {
            byte b = bArr[0] & 255;
            for (int i = 1; i < length; i++) {
                b |= (bArr[i] & 255) << (i * 8);
            }
            return b;
        } else if (length >= 4) {
            byte b2 = bArr[0] & 255;
            byte b3 = bArr[1] & 255;
            byte b4 = bArr[2] & 255;
            return ((bArr[3] & 255) << 24) | b2 | (b3 << 8) | (b4 << 16);
        } else {
            throw AnonymousClass7TE.A0z(C9705RfO.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", AnonymousClass7TF.A1b(length)));
        }
    }

    public final String toString() {
        StringBuilder A14 = Pxe.A14(r5 + r5);
        for (byte b : ((C8462Qv7) this).A00) {
            char[] cArr = A00;
            A14.append(cArr[(b >> 4) & 15]);
            A14.append(cArr[b & 15]);
        }
        return A14.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11272SIl)) {
            return false;
        }
        byte[] bArr = ((C8462Qv7) this).A00;
        int length = bArr.length;
        int i = length * 8;
        byte[] bArr2 = ((C8462Qv7) ((C11272SIl) obj)).A00;
        int length2 = bArr2.length;
        if (i != length2 * 8 || length != length2) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < length; i2++) {
            z &= AnonymousClass7TF.A1S(bArr[i2], bArr2[i2]);
        }
        if (z) {
            return true;
        }
        return false;
    }
}

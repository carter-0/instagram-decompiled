package X;

import java.nio.ByteBuffer;

/* renamed from: X.RfA  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9692RfA {
    public static long A00(C13465Tas tas) {
        byte[] bArr = (byte[]) ((C12540Swq) tas).A01.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}

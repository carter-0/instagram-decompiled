package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.NrP  reason: case insensitive filesystem */
public abstract class C69740NrP {
    public static AnonymousClass46C A00(C74587Pxa pxa, ByteBuffer byteBuffer) {
        byte[] bArr;
        ByteBuffer byteBuffer2 = O54.A00;
        if (byteBuffer == null) {
            bArr = O54.A01;
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.position() == 0 && byteBuffer.limit() == byteBuffer.capacity()) {
            bArr = byteBuffer.array();
        } else {
            ByteBuffer duplicate = byteBuffer.duplicate();
            bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
        }
        C2605245z r0 = C2605145y.A02;
        return pxa.Bi1(new C2605145y((InputStream) new ByteArrayInputStream(bArr)));
    }
}

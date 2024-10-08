package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Shn  reason: case insensitive filesystem */
public final class C11861Shn implements C13530Tc2 {
    public final ByteBuffer A00 = ByteBuffer.allocate(8);

    public final /* bridge */ /* synthetic */ void FJU(Object obj, MessageDigest messageDigest, byte[] bArr) {
        Number number = (Number) obj;
        messageDigest.update(bArr);
        ByteBuffer byteBuffer = this.A00;
        synchronized (byteBuffer) {
            byteBuffer.position(0);
            byteBuffer.putLong(number.longValue());
            messageDigest.update(byteBuffer.array());
        }
    }
}

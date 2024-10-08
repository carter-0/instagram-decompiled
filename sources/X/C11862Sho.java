package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Sho  reason: case insensitive filesystem */
public final class C11862Sho implements C13530Tc2 {
    public final ByteBuffer A00 = ByteBuffer.allocate(4);

    public final /* bridge */ /* synthetic */ void FJU(Object obj, MessageDigest messageDigest, byte[] bArr) {
        Number number = (Number) obj;
        if (number != null) {
            messageDigest.update(bArr);
            ByteBuffer byteBuffer = this.A00;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                byteBuffer.putInt(number.intValue());
                messageDigest.update(byteBuffer.array());
            }
        }
    }
}

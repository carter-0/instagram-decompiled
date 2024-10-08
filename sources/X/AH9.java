package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

public abstract class AH9 {
    public static final C3739197l A02 = C3739197l.A00;
    public final C18551Vu3 A00;
    public final C18551Vu3 A01;

    public static byte[] A00(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length;
        int i = length % 16;
        int i2 = length;
        if (i != 0) {
            i2 = (length + 16) - i;
        }
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        int i4 = remaining;
        if (i3 != 0) {
            i4 = (remaining + 16) - i3;
        }
        int i5 = i4 + i2;
        ByteBuffer order = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i5);
        order.putLong((long) length);
        order.putLong((long) remaining);
        return order.array();
    }

    public abstract C18551Vu3 A01(byte[] bArr, int i);

    public AH9(byte[] bArr) {
        if (A02.A00()) {
            this.A01 = A01(bArr, 1);
            this.A00 = A01(bArr, 0);
            return;
        }
        throw AnonymousClass7TG.A0q("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final void A02(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int remaining = byteBuffer.remaining();
        int length = bArr2.length;
        if (remaining >= length + 16) {
            int position = byteBuffer.position();
            C18551Vu3 vu3 = this.A01;
            if (byteBuffer.remaining() >= length) {
                C18551Vu3.A00(vu3, byteBuffer, ByteBuffer.wrap(bArr2), bArr);
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.A00.A01(bArr, 0).get(bArr4);
                byte[] A022 = C11308SKw.A02(bArr4, A00(byteBuffer, bArr3));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(A022);
                return;
            }
            throw AnonymousClass7TE.A0w("Given ByteBuffer output is too small");
        }
        throw AnonymousClass7TE.A0w("Given ByteBuffer output is too small");
    }

    public final byte[] A03(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.A00.A01(bArr, 0).get(bArr4);
                if (MessageDigest.isEqual(C11308SKw.A02(bArr4, A00(byteBuffer, bArr2)), bArr3)) {
                    byteBuffer.position(position);
                    C18551Vu3 vu3 = this.A01;
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    C18551Vu3.A00(vu3, allocate, byteBuffer, bArr);
                    return allocate.array();
                }
                throw AnonymousClass7TG.A0q("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw AnonymousClass7TG.A0q("ciphertext too short");
        }
    }
}

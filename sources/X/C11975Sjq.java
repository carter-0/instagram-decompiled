package X;

import java.nio.ByteBuffer;

/* renamed from: X.Sjq  reason: case insensitive filesystem */
public final class C11975Sjq implements C13538TcA {
    public final C13796ThF FHZ(C11856Shi shi, C13796ThF thF) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((Q6Z) thF.get()).A09.A00.A0E.A09.asReadOnlyBuffer();
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            byte[] array = asReadOnlyBuffer.array();
            int arrayOffset = asReadOnlyBuffer.arrayOffset();
            int limit = asReadOnlyBuffer.limit();
            if (arrayOffset == 0 && limit == array.length) {
                bArr = asReadOnlyBuffer.array();
                return new C11906Sif(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        bArr = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr);
        return new C11906Sif(bArr);
    }
}

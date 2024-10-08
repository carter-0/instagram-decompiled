package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.Rn9  reason: case insensitive filesystem */
public abstract class C10132Rn9 {
    public static final C10604Ruy A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Pxe.A17();
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C10604Ruy ruy = new C10604Ruy(bArr);
        try {
            int i = ruy.A00 + ruy.A01;
            ruy.A00 = i;
            if (i > 0) {
                ruy.A01 = i;
                ruy.A00 = i - i;
            } else {
                ruy.A01 = 0;
            }
            A00 = ruy;
        } catch (RCZ e) {
            throw new IllegalArgumentException(e);
        }
    }
}

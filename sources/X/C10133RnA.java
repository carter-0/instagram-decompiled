package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.RnA  reason: case insensitive filesystem */
public abstract class C10133RnA {
    public static final C10607Rv1 A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Pxe.A17();
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C10607Rv1 rv1 = new C10607Rv1(bArr);
        try {
            int i = rv1.A00 + rv1.A01;
            rv1.A00 = i;
            if (i > 0) {
                rv1.A01 = i;
                rv1.A00 = i - i;
            } else {
                rv1.A01 = 0;
            }
            A00 = rv1;
        } catch (RCL e) {
            throw new IllegalArgumentException(e);
        }
    }
}

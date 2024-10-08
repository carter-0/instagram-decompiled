package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class SD9 {
    public static final C11363SPb A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Pxe.A17();
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        A00 = C11363SPb.A07(bArr, 0, 0);
    }

    public static R5b A00(Object obj, Object obj2) {
        R4O A0J = ((R5b) ((T5J) obj)).A0J();
        T5J t5j = (T5J) obj2;
        if (A0J.A02.getClass().isInstance(t5j)) {
            A0J.A05((R5b) t5j);
            return A0J.A03();
        }
        throw AnonymousClass7TE.A0w("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class SDA {
    public static final C11189SEp A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Pxe.A17();
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C11189SEp sEp = new C11189SEp(bArr);
        try {
            int i = sEp.A01 + sEp.A00;
            sEp.A01 = i;
            if (i > 0) {
                sEp.A00 = i;
                sEp.A01 = i - i;
            } else {
                sEp.A00 = 0;
            }
            A00 = sEp;
        } catch (RCP e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static R5n A00(Object obj, Object obj2) {
        R5n r5n = (R5n) ((T5R) obj);
        R5m r5m = (R5m) r5n.A03(AnonymousClass05K.A0Y);
        r5m.A00(r5n);
        T5R t5r = (T5R) obj2;
        if (r5m.A02.getClass().isInstance(t5r)) {
            r5m.A00((R5n) t5r);
            if (!r5m.A01) {
                R5n r5n2 = r5m.A00;
                SH6.A02.A00(r5n2).ClW(r5n2);
                r5m.A01 = true;
            }
            return r5m.A00;
        }
        throw AnonymousClass7TE.A0w("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

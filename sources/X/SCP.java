package X;

import java.nio.charset.Charset;

public abstract class SCP {
    public static final Charset A00 = Pxe.A17();

    public static void A00(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw Pxf.A0V("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
        }
    }
}

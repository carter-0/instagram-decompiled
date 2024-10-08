package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.Rdl  reason: case insensitive filesystem */
public abstract class C9607Rdl {
    public static boolean A00(MediaFormat mediaFormat, C13779Tgu tgu) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer == null) {
            return false;
        }
        tgu.EQ8(0, byteBuffer.limit(), 0, 2);
        ByteBuffer AjB = tgu.AjB();
        AjB.position(0);
        byteBuffer.position(0);
        AjB.limit(byteBuffer.limit());
        AjB.put(byteBuffer);
        return true;
    }
}

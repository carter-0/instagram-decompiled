package X;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Rdd  reason: case insensitive filesystem */
public abstract class C9599Rdd {
    public static ByteBuffer A00(ByteBuffer byteBuffer, List list) {
        float A00 = S9U.A00(list);
        if (RV5.A00(A00, 1.0f)) {
            return byteBuffer;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        while (byteBuffer.hasRemaining()) {
            duplicate.putShort((short) ((int) (((float) byteBuffer.getShort()) * A00)));
        }
        duplicate.flip();
        return duplicate;
    }
}

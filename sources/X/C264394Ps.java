package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.4Ps  reason: invalid class name and case insensitive filesystem */
public interface C264394Ps {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    C264444Px AIv(C264444Px r1);

    ByteBuffer BZT();

    boolean CSi();

    void E5u();

    void E5v(ByteBuffer byteBuffer);

    void flush();

    boolean isActive();

    void reset();
}

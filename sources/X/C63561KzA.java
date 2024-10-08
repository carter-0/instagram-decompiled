package X;

import java.nio.ByteBuffer;

/* renamed from: X.KzA  reason: case insensitive filesystem */
public abstract class C63561KzA {
    public static final ByteBuffer A00;
    public static final ByteBuffer A01;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2);
        A00 = allocateDirect;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(2);
        A01 = allocateDirect2;
        allocateDirect.clear();
        allocateDirect.put((byte) -1);
        allocateDirect.put((byte) -40);
        allocateDirect2.clear();
        allocateDirect2.put((byte) -1);
        allocateDirect2.put((byte) -39);
    }
}

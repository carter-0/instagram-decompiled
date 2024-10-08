package X;

import java.nio.ByteBuffer;

/* renamed from: X.9Ch  reason: invalid class name and case insensitive filesystem */
public abstract class C375109Ch {
    public static final C3740497y A00 = new C3740497y(new byte[0], 0);

    public static final C3740497y A00(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((byte) 0);
        allocate.putInt(i);
        return C3740497y.A00(allocate.array());
    }

    public static final C3740497y A01(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((byte) 1);
        allocate.putInt(i);
        return C3740497y.A00(allocate.array());
    }
}

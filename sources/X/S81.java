package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class S81 {
    public static ByteBuffer A01(String str, List list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((Buffer) list.get(i2)).remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.put(str.getBytes(AnonymousClass2RN.A05), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            allocate.put((ByteBuffer) list.get(i3));
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer A00(String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes(AnonymousClass2RN.A05);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 4 + 4);
        allocate.putInt(byteBuffer.remaining() + 4 + 4);
        allocate.put(bytes, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }
}

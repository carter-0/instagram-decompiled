package X;

import com.google.common.collect.ImmutableList;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract /* synthetic */ class RS6 {
    public static /* synthetic */ ByteBuffer A00(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        C11366SPh.A03(AnonymousClass7TF.A1Q(byteBuffer.position()), "The input buffer should have position set to 0.");
        ImmutableList A00 = S80.A00(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < A00.size(); i2++) {
            i += ((Buffer) A00.get(i2)).remaining() + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (int i3 = 0; i3 < A00.size(); i3++) {
            ByteBuffer byteBuffer2 = (ByteBuffer) A00.get(i3);
            allocate.putInt(byteBuffer2.remaining());
            allocate.put(byteBuffer2);
        }
        allocate.rewind();
        return allocate;
    }
}

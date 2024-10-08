package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public abstract class RS3 {
    public static ArrayList A00(byte[] bArr) {
        int i = (bArr[11] & 255) << 8;
        ArrayList A0v = DbS.A0v(3);
        A0v.add(bArr);
        Pxi.A1N(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()), A0v, (((long) ((bArr[10] & 255) | i)) * 1000000000) / 48000);
        Pxi.A1N(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()), A0v, 80000000);
        return A0v;
    }
}

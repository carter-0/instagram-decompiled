package X;

import java.nio.ByteBuffer;

/* renamed from: X.ACv  reason: case insensitive filesystem */
public final class C39874ACv {
    public int A00;
    public ByteBuffer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.ACv, java.lang.Object] */
    public static C39874ACv A00(byte[] bArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = allocateDirect;
        return obj;
    }

    public C39874ACv(Class cls, ByteBuffer byteBuffer) {
        this.A00 = cls.hashCode();
        this.A01 = byteBuffer;
    }
}

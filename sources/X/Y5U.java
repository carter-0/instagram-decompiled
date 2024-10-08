package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;

public final class Y5U extends PhantomReference {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;

    public Y5U(String str, ReferenceQueue referenceQueue, ByteBuffer byteBuffer, int i, int i2, long j) {
        super(byteBuffer, referenceQueue);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
    }
}

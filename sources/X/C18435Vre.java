package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vre  reason: case insensitive filesystem */
public final class C18435Vre {
    public ByteBuffer A00;
    public final int A01;

    public C18435Vre(int i, ByteBuffer byteBuffer) {
        this.A01 = i;
        if (byteBuffer.isDirect()) {
            this.A00 = byteBuffer;
            return;
        }
        throw new IllegalStateException("Bytes buffer must be direct");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18435Vre(int r2, byte... r3) {
        /*
            r1 = this;
            r0 = 2
            X.0qQ.A0B(r3, r0)
            int r0 = r3.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r3)
            r0.flip()
            r1.<init>((int) r2, (java.nio.ByteBuffer) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18435Vre.<init>(int, byte[]):void");
    }
}

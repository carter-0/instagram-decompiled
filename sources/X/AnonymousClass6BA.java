package X;

import java.nio.ByteBuffer;

/* renamed from: X.6BA  reason: invalid class name */
public final class AnonymousClass6BA extends 2dn implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A00 = C303816Aw.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A03 = b & 255;
        byte b2 = 0;
        int A002 = C303816Aw.A00(byteBuffer, i, 1);
        if (A002 != 0) {
            b2 = byteBuffer.get(A002);
        }
        this.A02 = b2 & 255;
        byte b3 = 0;
        int A003 = C303816Aw.A00(byteBuffer, i, 2);
        if (A003 != 0) {
            b3 = byteBuffer.get(A003);
        }
        this.A01 = b3 & 255;
        byte b4 = -1;
        int A004 = C303816Aw.A00(byteBuffer, i, 3);
        if (A004 != 0) {
            b4 = byteBuffer.get(A004);
        }
        this.A00 = b4 & 255;
    }
}

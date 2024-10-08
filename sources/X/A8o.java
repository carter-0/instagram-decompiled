package X;

import java.nio.ByteBuffer;

public final class A8o {
    public C39874ACv A00;
    public C41811B1q A01;
    public C41793B0y A02;

    public final void A00(C39874ACv aCv) {
        this.A00 = aCv;
        C41811B1q b1q = this.A01;
        if (b1q != null) {
            int i = aCv.A00;
            ByteBuffer byteBuffer = aCv.A01;
            b1q.setConfiguration(i, byteBuffer, byteBuffer.position());
        }
    }
}

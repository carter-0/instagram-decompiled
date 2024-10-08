package X;

import java.nio.ByteBuffer;

/* renamed from: X.6BF  reason: invalid class name */
public final class AnonymousClass6BF extends AnonymousClass6BG implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A00 = C303816Aw.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A00 = b;
        Class<AnonymousClass6B2> cls = AnonymousClass6B2.class;
        this.A01 = (AnonymousClass3JV) C303816Aw.A01(cls, byteBuffer, i, 1);
        this.A02 = (AnonymousClass3JV) C303816Aw.A01(cls, byteBuffer, i, 2);
    }
}

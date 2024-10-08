package X;

import java.nio.ByteBuffer;

/* renamed from: X.6BE  reason: invalid class name */
public final class AnonymousClass6BE implements C303796Au {
    public byte A00;
    public AnonymousClass6B2 A01;
    public AnonymousClass6B2 A02;
    public AnonymousClass6B2 A03;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A002 = C303816Aw.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            b = byteBuffer.get(A002);
        }
        this.A00 = b;
        Class<AnonymousClass6B2> cls = AnonymousClass6B2.class;
        AnonymousClass6B2 r0 = (AnonymousClass6B2) C303816Aw.A01(cls, byteBuffer, i, 1);
        if (r0 != null) {
            this.A03 = r0;
            AnonymousClass6B2 r02 = (AnonymousClass6B2) C303816Aw.A01(cls, byteBuffer, i, 2);
            if (r02 != null) {
                this.A01 = r02;
                AnonymousClass6B2 r03 = (AnonymousClass6B2) C303816Aw.A01(cls, byteBuffer, i, 3);
                if (r03 != null) {
                    this.A02 = r03;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("point cannot be null");
    }
}

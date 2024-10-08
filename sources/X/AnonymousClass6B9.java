package X;

import java.nio.ByteBuffer;

/* renamed from: X.6B9  reason: invalid class name */
public final class AnonymousClass6B9 implements C303796Au {
    public byte A00;
    public byte A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass6B6 A04;
    public AnonymousClass6B5 A05;
    public AnonymousClass6B3 A06;
    public AnonymousClass6B3 A07;
    public AnonymousClass6B3 A08;
    public AnonymousClass6B3 A09;
    public AnonymousClass6B3 A0A;
    public byte[] A0B;
    public byte[] A0C;
    public AnonymousClass6B3[] A0D;
    public String[] A0E;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        int A002 = C303816Aw.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            i2 = byteBuffer.getInt(A002);
        }
        this.A02 = i2;
        this.A0B = C303816Aw.A04(byteBuffer, i, 1);
    }
}

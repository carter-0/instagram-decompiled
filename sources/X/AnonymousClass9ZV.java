package X;

import java.nio.ByteBuffer;

/* renamed from: X.9ZV  reason: invalid class name */
public final class AnonymousClass9ZV extends C39635A2z {
    public static int A00(AHF ahf, int i, int i2, int i3) {
        ahf.A08(5);
        ahf.A09(4, i3);
        ahf.A09(3, 45000);
        ahf.A0A(1, i2);
        ahf.A0A(0, i);
        ahf.A0B(1, 0);
        ByteBuffer byteBuffer = ahf.A07;
        int i4 = ahf.A03 - 1;
        ahf.A03 = i4;
        byteBuffer.put(i4, (byte) 1);
        ahf.A07(2);
        return ahf.A01();
    }
}

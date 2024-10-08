package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vl3  reason: case insensitive filesystem */
public final class C18075Vl3 {
    public byte A00;
    public int A01;
    public final ByteBuffer A02;

    public final void A03(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= 15) {
                break;
            }
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        A04(i2, 0);
        A01(1);
        A04(i2, (long) (i - i4));
    }

    public final void A04(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            A01((int) ((j >> ((i - i2) - 1)) & 1));
        }
    }

    public final void A00() {
        if (this.A01 != 0) {
            this.A02.put(this.A00);
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public final void A01(int i) {
        byte b = this.A00;
        int i2 = this.A01;
        this.A00 = (byte) (((i & 1) << (7 - i2)) | b);
        int i3 = i2 + 1;
        this.A01 = i3;
        if (i3 == 8) {
            A00();
        }
    }

    public final void A02(int i) {
        if (this.A01 > 0) {
            A00();
        }
        ByteBuffer byteBuffer = this.A02;
        long j = (long) i;
        17k.A05(j, "out of range: %s", AnonymousClass7TF.A1Q(((j >> 8) > 0 ? 1 : ((j >> 8) == 0 ? 0 : -1))));
        byteBuffer.put((byte) ((int) j));
    }

    public C18075Vl3(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        0qQ.A07(allocateDirect);
        this.A02 = allocateDirect;
    }

    public final void A05(ByteBuffer byteBuffer) {
        A00();
        ByteBuffer duplicate = byteBuffer.duplicate();
        0qQ.A07(duplicate);
        while (duplicate.position() < duplicate.limit()) {
            A02(duplicate.get() & 255);
        }
    }
}

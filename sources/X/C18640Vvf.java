package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vvf  reason: case insensitive filesystem */
public final class C18640Vvf {
    public int A00;
    public int A01;
    public final ByteBuffer A02;

    public final int A02() {
        int i = 0;
        while (A01() == 0) {
            i++;
        }
        if (i > 0) {
            return A03(i) + ((1 << i) - 1);
        }
        return 0;
    }

    public final int A03(int i) {
        if (i >= 32) {
            throw DbT.A0m();
        } else if (this.A01 == -1) {
            return -1;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 = (i2 << 1) | A01();
            }
            return i2;
        }
    }

    public static final int A00(C18640Vvf vvf) {
        byte b;
        int i = vvf.A01;
        ByteBuffer byteBuffer = vvf.A02;
        if (byteBuffer.position() < byteBuffer.limit()) {
            b = byteBuffer.get() & 255;
        } else {
            b = -1;
        }
        vvf.A01 = b;
        vvf.A00 = 0;
        return i;
    }

    public final int A01() {
        int i = this.A01;
        int i2 = -1;
        if (i != -1) {
            int i3 = this.A00;
            i2 = (i >> (7 - i3)) & 1;
            int i4 = i3 + 1;
            this.A00 = i4;
            if (i4 == 8) {
                A00(this);
            }
        }
        return i2;
    }

    public C18640Vvf(ByteBuffer byteBuffer) {
        this.A02 = byteBuffer;
        byteBuffer.mark();
        A00(this);
    }
}

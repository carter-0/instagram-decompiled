package X;

import java.nio.ByteBuffer;

/* renamed from: X.5Ny  reason: invalid class name and case insensitive filesystem */
public final class C284795Ny extends AnonymousClass4PQ {
    public int A00 = 32;
    public int A01;
    public long A02;

    public C284795Ny() {
        super(2);
    }

    public final boolean A02(AnonymousClass4PQ r6) {
        ByteBuffer byteBuffer;
        boolean z = false;
        if ((r6.A00 & SN3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            z = true;
        }
        C256703wD.A03(!z);
        boolean z2 = false;
        if ((r6.A00 & 268435456) == 268435456) {
            z2 = true;
        }
        C256703wD.A03(!z2);
        boolean z3 = false;
        if ((r6.A00 & 4) == 4) {
            z3 = true;
        }
        C256703wD.A03(!z3);
        int i = this.A01;
        if (i > 0) {
            if (i >= this.A00) {
                return false;
            }
            boolean z4 = false;
            if ((r6.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
                z4 = true;
            }
            boolean z5 = false;
            if ((this.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
                z5 = true;
            }
            if (z4 != z5) {
                return false;
            }
            ByteBuffer byteBuffer2 = r6.A02;
            if (!(byteBuffer2 == null || (byteBuffer = this.A02) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 == 0) {
            this.A01 = r6.A01;
            if ((r6.A00 & 1) == 1) {
                this.A00 = 1;
            }
        }
        if ((r6.A00 & AnonymousClass972.MUTABLE_FLAG_MASK) == Integer.MIN_VALUE) {
            this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        ByteBuffer byteBuffer3 = r6.A02;
        if (byteBuffer3 != null) {
            A01(byteBuffer3.remaining());
            this.A02.put(byteBuffer3);
        }
        this.A02 = r6.A01;
        return true;
    }

    public final void clear() {
        super.clear();
        this.A01 = 0;
    }
}

package X;

import java.nio.ByteBuffer;

/* renamed from: X.QDu  reason: case insensitive filesystem */
public class C7455QDu extends RQB {
    public long A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public final int A03;
    public final C10764Rxi A04 = new C10764Rxi();

    public void A00() {
        this.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void A01(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i2 = this.A03;
            if (i2 == 1) {
                allocateDirect = ByteBuffer.allocate(i);
            } else if (i2 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i);
            } else {
                throw new IllegalStateException(002.A0n("Buffer too small (", " < ", ")", 0, i));
            }
        } else {
            int capacity2 = byteBuffer.capacity();
            int position = byteBuffer.position();
            int i3 = i + position;
            if (capacity2 >= i3) {
                this.A01 = byteBuffer;
                return;
            }
            int i4 = this.A03;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A01;
                if (byteBuffer2 == null) {
                    capacity = 0;
                } else {
                    capacity = byteBuffer2.capacity();
                }
                throw new IllegalStateException(002.A0n("Buffer too small (", " < ", ")", capacity, i3));
            }
            allocateDirect.order(byteBuffer.order());
            if (position > 0) {
                byteBuffer.flip();
                allocateDirect.put(byteBuffer);
            }
        }
        this.A01 = allocateDirect;
    }

    static {
        C11312SMg.A00("media3.decoder");
    }

    public C7455QDu(int i) {
        this.A03 = i;
    }
}

package X;

import java.nio.ByteBuffer;

/* renamed from: X.4PQ  reason: invalid class name */
public class AnonymousClass4PQ extends AnonymousClass4PR {
    public static final AnonymousClass4PQ $redex_init_class = null;
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final int A05;
    public final AnonymousClass4PT A06 = new AnonymousClass4PT();

    public void clear() {
        this.A00 = 0;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A03;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A04 = false;
    }

    static {
        27e.A00("goog.exo.decoder");
    }

    public final void A00() {
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.A03;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void A01(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer == null) {
            int i2 = this.A05;
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
                this.A02 = byteBuffer;
                return;
            }
            int i4 = this.A05;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A02;
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
        this.A02 = allocateDirect;
    }

    public AnonymousClass4PQ(int i) {
        this.A05 = i;
    }
}

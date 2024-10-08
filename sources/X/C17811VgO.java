package X;

import java.nio.ByteBuffer;

/* renamed from: X.VgO  reason: case insensitive filesystem */
public abstract class C17811VgO {
    public static final ThreadLocal A02 = new C20566Wuj();
    public static final ThreadLocal A03 = new ThreadLocal();
    public static final ThreadLocal A04 = new TRB();
    public int A00;
    public ByteBuffer A01;

    public final int A00(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }
}

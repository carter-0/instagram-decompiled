package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.MYu  reason: case insensitive filesystem */
public final class C66608MYu {
    public static final C74541Pwa A01;
    public final boolean A00;

    public final C74541Pwa A00(C254923tH r2) {
        0qQ.A0B(r2, 0);
        if (!this.A00) {
            return null;
        }
        if (r2 == C254923tH.ACT) {
            return A01;
        }
        return C74541Pwa.A00;
    }

    public C66608MYu(boolean z) {
        this.A00 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Onb, java.lang.Object, X.Pwa] */
    static {
        ? obj = new Object();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(3735928559L);
        obj.A00 = allocate.array();
        A01 = obj;
    }
}

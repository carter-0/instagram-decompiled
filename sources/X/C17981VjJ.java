package X;

import android.util.LongSparseArray;

/* renamed from: X.VjJ  reason: case insensitive filesystem */
public final class C17981VjJ {
    public final 0vq A00;
    public final Object A01 = new Object();
    public final LongSparseArray A02 = new LongSparseArray();

    public final VVU A00(long j) {
        VVU vvu;
        synchronized (this.A01) {
            Object obj = this.A02.get(j);
            if (obj instanceof VVU) {
                vvu = (VVU) obj;
            } else {
                vvu = null;
            }
        }
        return vvu;
    }

    public final void A01(VVU vvu, long j, boolean z) {
        synchronized (this.A01) {
            this.A02.put(j, vvu);
            if (z) {
                this.A00.A09(Long.valueOf(j));
            }
        }
    }

    public C17981VjJ() {
        0vq r0 = AnonymousClass01q.A00;
        this.A00 = new 0vq(6);
    }
}

package X;

import android.widget.Adapter;

/* renamed from: X.2wj  reason: invalid class name and case insensitive filesystem */
public abstract class C233942wj extends C233952wk {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = Integer.MAX_VALUE;
    public final int A02;

    public final boolean A04(Adapter adapter, int i) {
        if (this instanceof C233962wl) {
            Object item = adapter.getItem(i);
            if (!(item instanceof 1Xj) || ((1Xj) item).A0r() <= 0) {
                return false;
            }
            return true;
        }
        Object item2 = adapter.getItem(i);
        if (item2 instanceof 1Xj) {
            return ((1Xj) item2).A4w();
        }
        return false;
    }

    public C233942wj(int i) {
        super(i);
        this.A02 = i;
    }
}

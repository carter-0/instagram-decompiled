package X;

import android.util.SparseBooleanArray;

/* renamed from: X.Xct  reason: case insensitive filesystem */
public final class C21495Xct {
    public final SparseBooleanArray A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21495Xct) {
            return this.A00.equals(((C21495Xct) obj).A00);
        }
        return false;
    }

    public final int A00(int i) {
        SparseBooleanArray sparseBooleanArray = this.A00;
        int size = sparseBooleanArray.size();
        if (i >= 0 && i < size) {
            return sparseBooleanArray.keyAt(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C21495Xct(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }
}

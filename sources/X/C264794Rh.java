package X;

import android.util.SparseBooleanArray;

/* renamed from: X.4Rh  reason: invalid class name and case insensitive filesystem */
public final class C264794Rh {
    public final SparseBooleanArray A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C264794Rh) {
            return this.A00.equals(((C264794Rh) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C264794Rh(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }
}

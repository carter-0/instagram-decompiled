package X;

import android.util.SparseArray;

/* renamed from: X.Re1  reason: case insensitive filesystem */
public abstract class C9623Re1 {
    public static final String A00(SparseArray sparseArray, int i) {
        String str;
        Object obj = sparseArray.get(i);
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }
}

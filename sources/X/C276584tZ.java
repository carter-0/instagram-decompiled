package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.4tZ  reason: invalid class name and case insensitive filesystem */
public final class C276584tZ implements C64351Ki {
    public final /* synthetic */ C276544tV A00;

    public C276584tZ(C276544tV r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Object obj = this.A00.A05.get(135);
        if (!(obj instanceof List)) {
            return new SparseArray();
        }
        List list = (List) obj;
        SparseArray sparseArray = new SparseArray(list.size() / 2);
        for (int i = 0; i < list.size(); i += 2) {
            sparseArray.put(((Number) list.get(i)).intValue(), list.get(i + 1));
        }
        return sparseArray;
    }
}

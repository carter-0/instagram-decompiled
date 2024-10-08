package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.TqI  reason: case insensitive filesystem */
public final class C14123TqI {
    public static final X04 A05 = new WEM();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C14122TqH A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new 01r(0);

    public final int A00(int i) {
        C14122TqH tqH = (C14122TqH) this.A04.get(C18469VsL.A08);
        if (tqH != null) {
            return tqH.A05;
        }
        return i;
    }

    public C14123TqI(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        C14122TqH tqH = null;
        for (int i2 = 0; i2 < size; i2++) {
            C14122TqH tqH2 = (C14122TqH) list3.get(i2);
            if (tqH2.A04 > i) {
                i = tqH2.A04;
                tqH = tqH2;
            }
        }
        this.A01 = tqH;
    }
}

package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: X.3Lv  reason: invalid class name and case insensitive filesystem */
public final class C240683Lv implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C292385ir r6 = (C292385ir) obj;
        C292385ir r7 = (C292385ir) obj2;
        RecyclerView recyclerView = r6.A03;
        int i = 1;
        boolean z = false;
        if (recyclerView == null) {
            z = true;
        }
        boolean z2 = false;
        if (r7.A03 == null) {
            z2 = true;
        }
        if (z == z2) {
            boolean z3 = r6.A04;
            if (z3 == r7.A04) {
                i = r7.A02 - r6.A02;
                if (i == 0) {
                    int i2 = r6.A00 - r7.A00;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
            } else if (z3) {
                return -1;
            }
        } else if (recyclerView == null) {
            return i;
        } else {
            return -1;
        }
        return i;
    }
}

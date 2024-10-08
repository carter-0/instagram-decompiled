package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2je  reason: invalid class name and case insensitive filesystem */
public final class C227632je implements AnonymousClass4DL {
    public final List A00 = new ArrayList();

    public final void addFragmentVisibilityListener(C238693Db r3) {
        0qQ.A0B(r3, 0);
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void removeFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A00.remove(r2);
    }

    public final void A00(Fragment fragment, boolean z) {
        List list = this.A00;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C238693Db r0 = (C238693Db) list.get(size);
                if (z) {
                    r0.DGl(fragment);
                } else {
                    r0.DGh(fragment);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }
}

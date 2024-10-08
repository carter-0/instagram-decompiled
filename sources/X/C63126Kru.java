package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kru  reason: case insensitive filesystem */
public abstract class C63126Kru {
    public static final int A00(List list, int i) {
        if (list != null && i >= 0) {
            int i2 = 0;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C66568MWw mWw = (C66568MWw) it.next();
                0qQ.A0C(mWw, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.FilterEffectInfo");
                C63805L7l l7l = ((C64943Lki) mWw).A00;
                boolean z = l7l.A02;
                if (l7l.A00 == i) {
                    if (!z) {
                        return i2;
                    }
                } else if (!z) {
                    i2++;
                }
            }
        }
        return -1;
    }
}

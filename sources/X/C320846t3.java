package X;

import java.util.List;

/* renamed from: X.6t3  reason: invalid class name and case insensitive filesystem */
public abstract class C320846t3 {
    public static final int A00(List list, int i) {
        Object A0O = 00k.A0O(list, i);
        if (A0O == null) {
            0wb.A03("clips_grid_item_access_out_of_bounds", 002.A0n("Trying to access item at index ", ", but only ", " items were available.", i, list.size()));
        } else if (!(A0O instanceof C320706so) && !(A0O instanceof C320716sp) && !(A0O instanceof C320676sl) && !(A0O instanceof C320696sn)) {
            if ((A0O instanceof C320666sk) || (A0O instanceof C320686sm) || (A0O instanceof EGV)) {
                return 3;
            }
            throw new IllegalStateException("Unsupported item type");
        }
        return 1;
    }
}

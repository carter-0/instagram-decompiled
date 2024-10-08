package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.VFm  reason: case insensitive filesystem */
public abstract class C17038VFm {
    public static final int A00(List list, int i) {
        0qQ.A0B(list, 0);
        int binarySearch = Collections.binarySearch(list, Integer.valueOf(i));
        if (binarySearch < 0) {
            return Math.min(Math.max(0, ((-binarySearch) - 1) - 1), C51966G9m.A06(list));
        }
        return binarySearch;
    }
}

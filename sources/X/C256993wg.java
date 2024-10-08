package X;

import java.util.List;

/* renamed from: X.3wg  reason: invalid class name and case insensitive filesystem */
public abstract class C256993wg {
    public static C256683wB[] A00(List list) {
        if (list == null || list.isEmpty()) {
            return new C256683wB[0];
        }
        C256683wB[] r1 = new C256683wB[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r1[i] = ((C256733wG) list.get(i)).A02;
        }
        return r1;
    }
}

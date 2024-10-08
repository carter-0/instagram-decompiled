package X;

import java.util.List;

/* renamed from: X.Mbf  reason: case insensitive filesystem */
public final class C66734Mbf {
    public static final C66734Mbf A00 = new Object();

    public static final boolean A00(List list, List list2) {
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                Object obj2 = list2.get(i);
                0qQ.A0B(obj2, 0);
                if (obj.equals(obj2)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}

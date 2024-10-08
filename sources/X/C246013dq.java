package X;

import java.util.List;

/* renamed from: X.3dq  reason: invalid class name and case insensitive filesystem */
public abstract class C246013dq {
    public static boolean A00(C244773bj r2) {
        List list = r2.A02;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List list2 = r2.A01;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        List list3 = r2.A00;
        if (list3 == null || list3.isEmpty()) {
            return true;
        }
        return false;
    }
}

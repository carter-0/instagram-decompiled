package X;

import java.util.List;

/* renamed from: X.6GB  reason: invalid class name */
public abstract class AnonymousClass6GB {
    public static final boolean A00(C286025Tq r9) {
        int length = r9.length();
        List list = r9.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3022062b r2 = (C3022062b) list.get(i);
            if ((r2.A02 instanceof C305016Gc) && C3021962a.A02(0, length, r2.A01, r2.A00)) {
                return true;
            }
        }
        return false;
    }
}

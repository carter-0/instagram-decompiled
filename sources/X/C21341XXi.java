package X;

import java.util.HashMap;

/* renamed from: X.XXi  reason: case insensitive filesystem */
public abstract class C21341XXi {
    public static final void A00(Object obj, HashMap hashMap, 2HY r4, int i) {
        Number number;
        if ((obj instanceof Integer) && (number = (Number) obj) != null) {
            int intValue = number.intValue();
            if (r4.A01(intValue)) {
                Pxe.A1X(Integer.valueOf(i), hashMap, (long) intValue);
            }
        }
    }
}

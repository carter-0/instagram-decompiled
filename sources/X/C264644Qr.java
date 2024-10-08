package X;

import java.util.Comparator;

/* renamed from: X.4Qr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C264644Qr implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Number number = (Number) obj2;
        int intValue = ((Number) obj).intValue();
        if (intValue != -1) {
            int intValue2 = number.intValue();
            int i = intValue - intValue2;
            if (intValue2 == -1) {
                return 1;
            }
            return i;
        } else if (number.intValue() == -1) {
            return 0;
        } else {
            return -1;
        }
    }
}

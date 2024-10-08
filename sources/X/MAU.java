package X;

import java.util.Comparator;

public final class MAU implements Comparator {
    public static final MAU A00 = new MAU();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        L8J l8j = (L8J) obj;
        L8J l8j2 = (L8J) obj2;
        float f = l8j.A00;
        float f2 = l8j2.A00;
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        int i = l8j2.A02;
        int i2 = l8j.A02;
        int i3 = i - i2;
        Integer valueOf = Integer.valueOf(i3);
        if (i2 == i || valueOf == null) {
            return l8j.A01 - l8j2.A01;
        }
        return i3;
    }
}

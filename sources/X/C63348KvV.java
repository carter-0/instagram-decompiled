package X;

import java.util.List;

/* renamed from: X.KvV  reason: case insensitive filesystem */
public abstract class C63348KvV {
    public static final int A00(int i, int i2, List list) {
        int i3 = 0;
        if (!AnonymousClass3S1.A04(list)) {
            if (list != null) {
                i3 = C51971G9r.A0I(list, 0);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (i3 + i2 < i) {
            return i3;
        }
        int i4 = i - i2;
        return C51970G9q.A07(i4, i4);
    }
}

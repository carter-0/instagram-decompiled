package X;

import java.util.List;

/* renamed from: X.H3q  reason: case insensitive filesystem */
public final class C54221H3q extends C331047Ph {
    public C54221H3q(JO8 jo8, List list) {
        int size = list.size();
        C231642s0[] r3 = new C231642s0[size];
        for (int i = 0; i < size; i++) {
            r3[i] = new H40(jo8);
        }
        A0B(r3);
        for (int i2 = 0; i2 < size; i2++) {
            A08(r3[i2], list.get(i2));
        }
    }
}

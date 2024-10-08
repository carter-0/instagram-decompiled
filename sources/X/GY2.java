package X;

import java.util.List;

public abstract class GY2 {
    public final C55466HiA A00;
    public final GY7 A01;

    public void A00(C307996Sh r4) {
        List list;
        0qQ.A0B(r4, 0);
        this.A00.A00 = r4;
        boolean z = this instanceof GY1;
        Object obj = r4.A02;
        if (z) {
            AnonymousClass6S6 r0 = (AnonymousClass6S6) obj;
            if (r0 != null) {
                list = r0.A00.A02;
            } else {
                return;
            }
        } else {
            C55608HkT hkT = (C55608HkT) obj;
            if (hkT != null) {
                list = hkT.A01;
            } else {
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            GY7 gy7 = this.A01;
            synchronized (gy7) {
                gy7.A00.removeAll(list);
            }
        }
    }

    public GY2(C55466HiA hiA, GY7 gy7) {
        this.A01 = gy7;
        this.A00 = hiA;
    }
}

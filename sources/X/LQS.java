package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class LQS {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    public static final C63970LFx A00(C63970LFx lFx, LP3 lp3, LP3 lp32) {
        C63569KzI kzI;
        C63569KzI kzI2;
        C63569KzI kzI3;
        C63569KzI kzI4;
        C63569KzI kzI5;
        C63569KzI kzI6;
        if (lFx != null) {
            kzI = lFx.A02;
        } else {
            kzI = C60332Jjb.A01;
        }
        C63569KzI kzI7 = lp3.A02;
        if (lp32 == null || (kzI6 = lp32.A02) == null) {
            kzI = kzI7;
        } else if (!(kzI instanceof C60334Jjd) || (((kzI7 instanceof C60332Jjb) && (kzI6 instanceof C60332Jjb)) || (kzI6 instanceof C60333Jjc))) {
            kzI = kzI6;
        }
        if (lFx != null) {
            kzI2 = lFx.A01;
        } else {
            kzI2 = C60332Jjb.A01;
        }
        C63569KzI kzI8 = lp3.A01;
        if (!(lp32 == null || (kzI5 = lp32.A01) == null)) {
            if (!(kzI2 instanceof C60334Jjd) || (((kzI7 instanceof C60332Jjb) && (kzI5 instanceof C60332Jjb)) || (kzI5 instanceof C60333Jjc))) {
                kzI2 = kzI5;
            }
            kzI8 = kzI2;
        }
        if (lFx != null) {
            kzI3 = lFx.A00;
        } else {
            kzI3 = C60332Jjb.A01;
        }
        C63569KzI kzI9 = lp3.A00;
        if (!(lp32 == null || (kzI4 = lp32.A00) == null)) {
            if (!(kzI3 instanceof C60334Jjd) || (((kzI7 instanceof C60332Jjb) && (kzI4 instanceof C60332Jjb)) || (kzI4 instanceof C60333Jjc))) {
                kzI3 = kzI4;
            }
            kzI9 = kzI3;
        }
        return new C63970LFx(kzI, kzI8, kzI9, lp3, lp32);
    }

    public static final void A01(LQS lqs, 0sP r5) {
        Object value;
        Object invoke;
        05G r3 = lqs.A01;
        do {
            value = r3.getValue();
            invoke = r5.invoke(value);
            if (0qQ.A0K(value, invoke)) {
                return;
            }
        } while (!r3.AIY(value, invoke));
        if (invoke != null) {
            Iterator it = lqs.A00.iterator();
            while (it.hasNext()) {
                C51965G9l.A1W(it.next(), invoke);
            }
        }
    }

    public LQS() {
        02z A0u = C51967G9n.A0u();
        this.A01 = A0u;
        this.A02 = 10b.A03(A0u);
    }
}

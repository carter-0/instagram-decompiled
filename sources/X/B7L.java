package X;

import java.util.Iterator;
import java.util.List;

public abstract class B7L {
    public static final Integer A00(C250463lU r3) {
        0qQ.A0B(r3, 0);
        C250443lS BI2 = r3.BI2();
        if (BI2 != null) {
            C46552Dgu dgu = (C46552Dgu) C46552Dgu.A01.get(BI2.BwJ());
            if (dgu == null) {
                dgu = C46552Dgu.UNKNOWN;
            }
            int ordinal = dgu.ordinal();
            if (ordinal == 6) {
                return AnonymousClass05K.A00;
            }
            if (ordinal == 0) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A01;
    }

    public static final Integer A01(AnonymousClass3I2 r3) {
        List BNf;
        List BSa = r3.BSa();
        if (BSa == null || BSa.isEmpty() || (BNf = r3.BNf()) == null || BNf.isEmpty()) {
            return AnonymousClass05K.A00;
        }
        List BNf2 = r3.BNf();
        if (BNf2 != null) {
            Iterator it = BNf2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer A00 = A00((C250463lU) next);
                Integer num = AnonymousClass05K.A0C;
                if (A00 == num) {
                    if (next != null) {
                        return num;
                    }
                }
            }
        }
        return AnonymousClass05K.A01;
    }
}

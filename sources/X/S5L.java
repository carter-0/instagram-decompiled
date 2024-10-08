package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class S5L {
    public final 1Av A00;

    public S5L(1Av r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final List A02() {
        try {
            1Av r3 = this.A00;
            String A13 = DbV.A13(r3, r3.A0Q, 1Av.A8a, 47);
            if (A13 == null) {
                return 0sn.A00;
            }
            List A0R = 00l.A0R(A13, new String[]{","}, 0);
            ArrayList A0r = AnonymousClass7TG.A0r(A0R);
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C66582MXn.A1N(AnonymousClass7TE.A18(it), A0r);
            }
            return A0r;
        } catch (Exception unused) {
            return 0sn.A00;
        }
    }

    public final Boolean A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long A0P = AnonymousClass7TE.A0P(currentTimeMillis - (currentTimeMillis % 3600000));
        if (A02().isEmpty()) {
            return null;
        }
        List A02 = A02();
        boolean z = true;
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it = A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                long A0H = Pxg.A0H(it);
                if (A0H - (A0H % 3600) == A0P) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public final Long A01() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A0U = 00k.A0U(A02());
        01V.A1C(A0U);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            long A0H = Pxg.A0H(it);
            if (A0H > AnonymousClass7TE.A0P(currentTimeMillis)) {
                return Long.valueOf(A0H);
            }
        }
        return null;
    }
}

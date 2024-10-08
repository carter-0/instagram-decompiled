package X;

import android.graphics.RectF;
import java.util.List;

public abstract class JUT {
    public static final RectF A00(String str) {
        Float f;
        Float f2;
        Float f3;
        Float f4 = null;
        if (str == null) {
            return null;
        }
        List A0Q = 00l.A0Q(str, new char[]{','}, 0);
        if (A0Q.size() >= 4) {
            String A1G = C51966G9m.A1G(A0Q, 0);
            if (A1G != null) {
                f = 012.A0q(A1G);
            } else {
                f = null;
            }
            String A1G2 = C51966G9m.A1G(A0Q, 1);
            if (A1G2 != null) {
                f2 = 012.A0q(A1G2);
            } else {
                f2 = null;
            }
            String A1G3 = C51966G9m.A1G(A0Q, 2);
            if (A1G3 != null) {
                f3 = 012.A0q(A1G3);
            } else {
                f3 = null;
            }
            String A1G4 = C51966G9m.A1G(A0Q, 3);
            if (A1G4 != null) {
                f4 = 012.A0q(A1G4);
            }
            if (!(f == null || f2 == null || f3 == null || f4 == null)) {
                return new RectF(f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue());
            }
        }
        return AnonymousClass7TE.A0Y();
    }

    public static final List A01(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sn.A00;
        }
        return DbV.A18(str, "␞");
    }
}

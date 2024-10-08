package X;

import android.content.Context;
import java.util.Iterator;

/* renamed from: X.Edv  reason: case insensitive filesystem */
public abstract class C48400Edv {
    public static final String A00(AnonymousClass6Tm r9) {
        int i = 0;
        Object A0g = DbW.A0g(r9, 0);
        Integer num = AnonymousClass05K.A0N;
        Integer[] A00 = AnonymousClass05K.A00(4);
        int length = A00.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num2 = A00[i];
            if (0qQ.A0K(Eo7.A00(num2), A0g)) {
                num = num2;
                break;
            }
            i++;
        }
        Context A04 = DbT.A04();
        0qQ.A0B(num, 0);
        Iterator A1G = AnonymousClass7TE.A1G(FH2.A05(num));
        String str = null;
        while (A1G.hasNext()) {
            EW4 ew4 = (EW4) A1G.next();
            if (ew4 != null) {
                int ordinal = ew4.ordinal();
                if (ordinal == 0) {
                    str = FH2.A02(A04);
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        str = C49315Esy.A01;
                    } else if (ordinal == 3) {
                        str = FH2.A03(A04);
                        if (str == null || str.length() == 0) {
                            str = null;
                        }
                    } else if (ordinal != 4) {
                    }
                }
                if (str != null && str.length() != 0) {
                    return str;
                }
            }
            throw AnonymousClass7TE.A1K();
        }
        return null;
    }
}

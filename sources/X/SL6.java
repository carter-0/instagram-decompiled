package X;

import java.util.ArrayList;
import java.util.List;

public abstract class SL6 {
    public static SNH A00 = SNH.A01("k");

    public static ArrayList A00(S7N s7n, C13520Tbp tbp, C12828T8z t8z, float f, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C12828T8z t8z2 = t8z;
        S7N s7n2 = s7n;
        if (t8z.A0E() == AnonymousClass05K.A0j) {
            s7n.A03("Lottie doesn't support expressions.");
            return A1C;
        }
        t8z.A0J();
        while (t8z.A0Q()) {
            if (t8z.A0D(A00) != 0) {
                t8z.A0N();
            } else {
                C13520Tbp tbp2 = tbp;
                float f2 = f;
                if (t8z.A0E() == AnonymousClass05K.A00) {
                    t8z.A0I();
                    if (t8z.A0E() == AnonymousClass05K.A0u) {
                        SNH snh = C11320SMu.A00;
                        A1C.add(new ST4(tbp.E1k(t8z, f)));
                    } else {
                        while (t8z.A0Q()) {
                            A1C.add(C11320SMu.A01(s7n2, tbp2, t8z2, f2, true, z));
                        }
                    }
                    t8z.A0K();
                } else {
                    SNH snh2 = C11320SMu.A00;
                    A1C.add(new ST4(tbp.E1k(t8z, f)));
                }
            }
        }
        t8z.A0L();
        A01(A1C);
        return A1C;
    }

    public static void A01(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            ST4 st4 = (ST4) list.get(i2);
            i2++;
            ST4 st42 = (ST4) list.get(i2);
            st4.A07 = Float.valueOf(st42.A0A);
            if (st4.A08 == null && st42.A0E != null) {
                st4.A08 = st42.A0E;
                if (st4 instanceof C7495QGm) {
                    ((C7495QGm) st4).A04();
                }
            }
        }
        ST4 st43 = (ST4) list.get(i);
        if ((st43.A0E == null || st43.A08 == null) && list.size() > 1) {
            list.remove(st43);
        }
    }
}

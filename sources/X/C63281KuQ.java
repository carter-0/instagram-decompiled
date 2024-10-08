package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KuQ  reason: case insensitive filesystem */
public abstract class C63281KuQ {
    public static final Pair A00(List list) {
        C63879LAi lAi;
        String str;
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39746A7m a7m = (C39746A7m) it.next();
            C39747A7n a7n = a7m.A00;
            if (!(a7n == null || (lAi = a7n.A02) == null || C253833rU.A02(lAi.A05))) {
                C63879LAi lAi2 = a7n.A00;
                0qQ.A07(lAi2);
                C63879LAi lAi3 = a7n.A01;
                0qQ.A07(lAi3);
                C63879LAi lAi4 = a7n.A02;
                0qQ.A07(lAi4);
                String A0R = 002.A0R("gif_", a7m.A05);
                String str2 = a7m.A06;
                A5V a5v = a7m.A02;
                if (lAi2.A01 > 0.0f && lAi2.A00 > 0.0f) {
                    float f = lAi3.A01;
                    if (f > 0.0f) {
                        float f2 = lAi3.A00;
                        if (f2 > 0.0f && lAi4.A01 > 0.0f && lAi4.A00 > 0.0f) {
                            String str3 = A0R;
                            C317966o8 A00 = C317966o8.A00(lAi3.A05, A0R, str3, f, f2, 0.4f);
                            A00.A0g = str2;
                            C317966o8 A002 = C317966o8.A00(lAi2.A05, A0R, str3, lAi2.A01, lAi2.A00, 0.4f);
                            A002.A0g = str2;
                            C317966o8 A003 = C317966o8.A00(lAi4.A05, A0R, str3, lAi4.A01, lAi4.A00, 0.4f);
                            A003.A0g = str2;
                            A002.A0I = A003;
                            C317876nz r3 = C317876nz.A1e;
                            C317876nz A05 = C317886o0.A05(A002, A0R);
                            C317876nz A052 = C317886o0.A05(A00, A0R);
                            if (a5v != null) {
                                str = a5v.A00;
                            } else {
                                str = null;
                            }
                            A0q.add(new KK9(A05, str));
                            A1C.add(A052);
                        }
                    }
                }
            }
        }
        return new Pair(A0q, A1C);
    }
}

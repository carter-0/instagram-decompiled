package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KrM  reason: case insensitive filesystem */
public abstract class C63093KrM {
    public static List A00(1Av r3) {
        try {
            String str = (String) r3.A0R.CDM(r3, 1Av.A8a[46]);
            if (str == null) {
                return 0sn.A00;
            }
            List A0R = 00l.A0R(str, new String[]{","}, 0);
            ArrayList A0r = AnonymousClass7TG.A0r(A0R);
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(A0r, Long.parseLong(AnonymousClass7TE.A18(it)));
            }
            return A0r;
        } catch (Exception unused) {
            return 0sn.A00;
        }
    }
}

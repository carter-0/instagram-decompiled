package X;

import java.util.List;

/* renamed from: X.HdH  reason: case insensitive filesystem */
public abstract class C55165HdH {
    public static final boolean A00(AnonymousClass3W1 r4, GZG gzg) {
        0qQ.A0B(r4, 1);
        if (!00l.A0W(gzg.A01)) {
            if (gzg.A0D && r4.A1q && gzg.A0E) {
                String str = gzg.A07;
                if (str == null || !C51966G9m.A1X(str)) {
                    ((GJW) GJW.A03.getValue()).A01(r4);
                    r4.A0j(!AnonymousClass7TE.A1a(r4.A3V.A00));
                } else {
                    gzg.A01 = str;
                }
            }
            List list = gzg.A09;
            return list != null && !list.isEmpty();
        }
    }
}

package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SDf {
    public final C268544da A00 = new C268544da((15p) null);

    public static final void A00(C252503pD r11, C252503pD r12, SDf sDf, String str, Map map) {
        String A0T;
        String A0T2;
        String str2 = "new";
        if (r11 != null) {
            if (r12 == null) {
                map.put(str, "skipped");
                return;
            } else if ((r11 instanceof C268194cw) && (r12 instanceof C268194cw)) {
                Iterator A09 = r11.A09();
                0qQ.A07(A09);
                List A07 = C242173Sx.A07(2YX.A00(A09));
                Iterator A092 = r12.A09();
                0qQ.A07(A092);
                List A072 = C242173Sx.A07(2YX.A00(A092));
                List A0a = 00k.A0a(00k.A0l(A07, A072));
                List A0W = 00k.A0W(00k.A0S(A072, A07));
                Iterator it = A0a.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (str.length() == 0) {
                        A0T2 = A18;
                    } else {
                        A0T2 = 002.A0T(str, A18, '.');
                    }
                    C252503pD A04 = r11.A04(A18);
                    C252503pD A042 = r12.A04(A18);
                    0qQ.A0A(A0T2);
                    A00(A04, A042, sDf, A0T2, map);
                }
                Iterator it2 = A0W.iterator();
                while (it2.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it2);
                    if (str.length() == 0) {
                        A0T = A182;
                    } else {
                        A0T = 002.A0T(str, A182, '.');
                    }
                    if (!A0a.contains(A182)) {
                        if (A07.contains(A182)) {
                            0qQ.A0A(A0T);
                            map.put(A0T, "skipped");
                        } else if (A072.contains(A182)) {
                            0qQ.A0A(A0T);
                            map.put(A0T, str2);
                        }
                    }
                }
                return;
            } else if (r11.equals(r12)) {
                str2 = "same";
            } else {
                str2 = "different";
            }
        } else if (r12 == null) {
            return;
        }
        map.put(str, str2);
    }
}

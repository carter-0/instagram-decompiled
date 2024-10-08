package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Q3q  reason: case insensitive filesystem */
public abstract class C7314Q3q {
    public static final C7318Q3u A00(C7308Q3k q3k, List list) {
        C361028fY r0;
        C276464tN r02;
        C246643ew r03;
        HashMap A1E = AnonymousClass7TE.A1E();
        String str = null;
        String str2 = null;
        for (AnonymousClass9G2 r04 : q3k.A00) {
            String str3 = r04.A01;
            if (!(str3 == null || (r0 = r04.A00) == null || (r02 = r0.A00) == null || (r03 = r02.A00) == null)) {
                if (str2 == null) {
                    str2 = r03.A05;
                }
                if (str == null) {
                    str = r03.A04;
                }
                A1E.put(str3, C3034368u.A03((C361078fd) null, r03, list));
            }
        }
        return new C7318Q3u(A1E, str, str2);
    }
}

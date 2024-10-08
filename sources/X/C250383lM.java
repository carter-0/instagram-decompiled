package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.3lM  reason: invalid class name and case insensitive filesystem */
public abstract class C250383lM {
    public static C250453lT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C250433lR r1 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("instruction".equals(A0q)) {
                    r1 = C250393lN.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C250453lT(r1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C250453lT r6) {
        r5.A0c();
        C250433lR r4 = r6.A00;
        if (r4 != null) {
            r5.A0q("instruction");
            r5.A0c();
            List<C250423lQ> list = r4.A01;
            if (list != null) {
                16P.A03(r5, "conditions");
                for (C250423lQ r0 : list) {
                    if (r0 != null) {
                        C250413lP FG0 = r0.FG0();
                        r5.A0c();
                        String str = FG0.A01;
                        if (str != null) {
                            r5.A0R("comparator", str);
                        }
                        String str2 = FG0.A02;
                        if (str2 != null) {
                            r5.A0R("lhs", str2);
                        }
                        Long l = FG0.A00;
                        if (l != null) {
                            r5.A0Q("rhs", l.longValue());
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            String str3 = r4.A00;
            if (str3 != null) {
                r5.A0R("signal", str3);
            }
            r5.A0Z();
        }
        r5.A0Z();
    }
}

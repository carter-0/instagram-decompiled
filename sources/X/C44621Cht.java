package X;

import java.io.IOException;

/* renamed from: X.Cht  reason: case insensitive filesystem */
public abstract class C44621Cht {
    public static C45337Cuf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45337Cuf cuf = new C45337Cuf();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("body".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    cuf.A01 = A0l;
                } else if ("call_to_action".equals(A17)) {
                    cuf.A00 = C44620Chs.parseFromJson(r4);
                } else if (C41845B3m.A1E(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    cuf.A02 = A0l2;
                }
                r4.A0z();
            }
            return cuf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

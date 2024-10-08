package X;

import java.io.IOException;

public abstract class Ca6 {
    public static C59721JVf parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            BFO bfo = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r1 = 16L.A09;
                A00 = C66579MXk.A00(351);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if ("category_id_for_old_clients".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (A00.equals(A17)) {
                    bfo = Ca7.parseFromJson(r6);
                }
                r6.A0z();
            }
            if (bfo != null || !(r6 instanceof 0c9)) {
                return new C59721JVf((MWI) bfo, num);
            }
            AnonymousClass7TF.A1L(A00, r6, "MapQueryAttributes");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

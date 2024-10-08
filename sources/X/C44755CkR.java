package X;

import java.io.IOException;

/* renamed from: X.CkR  reason: case insensitive filesystem */
public abstract class C44755CkR {
    public static C45286Ctp parseFromJson(16F r4) {
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            C45286Ctp ctp = new C45286Ctp();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1C(A17)) {
                    String A1Q = r4.A1Q();
                    if (0qQ.A0K(A1Q, "simple_action")) {
                        num = AnonymousClass05K.A00;
                    } else if (0qQ.A0K(A1Q, "thank_you")) {
                        num = AnonymousClass05K.A01;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                    0qQ.A0B(num, 0);
                    ctp.A01 = num;
                } else if ("simple_action".equals(A17)) {
                    AnonymousClass3IJ parseFromJson = D20.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    ctp.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return ctp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

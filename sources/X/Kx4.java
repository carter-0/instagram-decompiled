package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Kx4 {
    public static C61076JwE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61076JwE jwE = new C61076JwE(17);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    jwE.A01 = A0l;
                } else if ("feed".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C68169N3k parseFromJson = C70339O2r.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jwE.A00 = arrayList;
                }
                r5.A0z();
            }
            return jwE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

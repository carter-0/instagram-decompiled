package X;

import java.io.IOException;
import java.util.ArrayList;

public final class ORN {
    public static C69148NfX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C69148NfX nfX = new C69148NfX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("users".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    nfX.A01 = arrayList;
                } else {
                    C67450Mo5.A00(r4, nfX, A17);
                }
                r4.A0z();
            }
            nfX.A00 = C67393MnA.A01(nfX.A01);
            return nfX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

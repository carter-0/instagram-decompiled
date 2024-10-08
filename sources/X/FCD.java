package X;

import java.io.IOException;
import java.util.ArrayList;

public final class FCD {
    public static DwX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, r0, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r3, DwX dwX, String str) {
        if ("verified".equals(str)) {
            dwX.A04 = r3.A0d();
        } else if ("errors".equals(str)) {
            dwX.A00 = C48318Ecb.A00(r3);
        } else {
            ArrayList arrayList = null;
            if ("backup_codes".equals(str)) {
                if (r3.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r3.A1J() != 16L.A08) {
                        AnonymousClass7TG.A1F(r3, arrayList);
                    }
                }
                dwX.A03 = arrayList;
            } else if (Dbb.A0T().equals(str)) {
                dwX.A01 = AnonymousClass7TG.A0l(r3);
            } else if ("trusted_device_nonce".equals(str)) {
                dwX.A02 = AnonymousClass7TG.A0l(r3);
            } else {
                1XY.A01(r3, dwX, str);
            }
        }
    }
}

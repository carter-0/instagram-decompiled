package X;

import java.io.IOException;

/* renamed from: X.FBz  reason: case insensitive filesystem */
public final class C49896FBz {
    public static C47336Dv3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C47336Dv3 dv3 = new C47336Dv3();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, dv3, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return dv3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r2, C47336Dv3 dv3, String str) {
        String A1P;
        if ("error_message_header".equals(str)) {
            if (r2.A11() == 16L.A0G) {
                A1P = null;
            } else {
                A1P = r2.A1P();
            }
            dv3.A00 = A1P;
            return;
        }
        1XY.A01(r2, dv3, str);
    }
}

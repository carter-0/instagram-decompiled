package X;

import java.io.IOException;

/* renamed from: X.Enb  reason: case insensitive filesystem */
public abstract class C48999Enb {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.EbC] */
    public static C48231EbC parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C48243EbO ebO = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C48243EbO ebO2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (Dbj.A03().equals(A17)) {
                    ebO = C49000Enc.parseFromJson(r4);
                } else if ("full_name".equals(A17)) {
                    ebO2 = C49000Enc.parseFromJson(r4);
                }
                r4.A0z();
            }
            ? obj = new Object();
            obj.A01 = ebO;
            obj.A00 = ebO2;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

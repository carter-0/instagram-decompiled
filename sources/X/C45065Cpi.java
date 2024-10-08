package X;

import java.io.IOException;

/* renamed from: X.Cpi  reason: case insensitive filesystem */
public abstract class C45065Cpi {
    public static C61074JwC parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61074JwC jwC = new C61074JwC(19);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("content".equals(A17)) {
                    C61069Jw7 parseFromJson = VHD.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    jwC.A00 = parseFromJson;
                } else if ("metadata".equals(A17)) {
                    C61083JwL parseFromJson2 = C45062Cpf.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    jwC.A02 = parseFromJson2;
                } else if (AnonymousClass000.A00(5195).equals(A17)) {
                    C45431CwB parseFromJson3 = C45078Cpv.parseFromJson(r4);
                    0qQ.A0B(parseFromJson3, 0);
                    jwC.A03 = parseFromJson3;
                } else if ("logging_info".equals(A17)) {
                    C61069Jw7 parseFromJson4 = VHC.parseFromJson(r4);
                    0qQ.A0B(parseFromJson4, 0);
                    jwC.A01 = parseFromJson4;
                }
                r4.A0z();
            }
            return jwC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

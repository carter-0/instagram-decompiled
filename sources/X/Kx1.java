package X;

import java.io.IOException;

public abstract class Kx1 {
    public static C61079JwH parseFromJson(16F r8) {
        C62542KhY khY;
        0qQ.A0B(r8, 0);
        try {
            C61079JwH jwH = new C61079JwH(27);
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (C273654mx.A00(286).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r8);
                    C62542KhY[] values = C62542KhY.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            khY = C62542KhY.UNKNOWN;
                            break;
                        }
                        khY = values[i];
                        if (0qQ.A0K(A0l, khY.A00)) {
                            break;
                        }
                        i++;
                    }
                    jwH.A01 = khY;
                } else if (C273654mx.A00(796).equals(A17)) {
                    C61291K1c parseFromJson = C63440Kx0.parseFromJson(r8);
                    0qQ.A0B(parseFromJson, 0);
                    jwH.A00 = parseFromJson;
                } else if ("section_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r8);
                    0qQ.A0B(A0l2, 0);
                    jwH.A02 = A0l2;
                }
                r8.A0z();
            }
            return jwH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

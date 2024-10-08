package X;

import java.io.IOException;

/* renamed from: X.VHa  reason: case insensitive filesystem */
public abstract class C17078VHa {
    public static C61083JwL parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C61083JwL jwL = new C61083JwL(10);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thumbnail_style".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    C16574UxR uxR = (C16574UxR) C16574UxR.A01.get(str);
                    if (uxR == null) {
                        uxR = C16574UxR.UNKNOWN;
                    }
                    jwL.A01 = uxR;
                } else if ("thumbnail".equals(A17)) {
                    C61076JwE parseFromJson = C17086VHi.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    jwL.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return jwL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

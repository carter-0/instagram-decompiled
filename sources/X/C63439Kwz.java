package X;

import java.io.IOException;

/* renamed from: X.Kwz  reason: case insensitive filesystem */
public abstract class C63439Kwz {
    public static C61083JwL parseFromJson(16F r7) {
        String str;
        C62559Khp khp;
        0qQ.A0B(r7, 0);
        try {
            C61083JwL jwL = new C61083JwL(7);
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("broadcast".equals(A17)) {
                    jwL.A00 = C45893D9w.parseFromJson(r7);
                } else if ("broadcast_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    C62559Khp[] values = C62559Khp.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            khp = C62559Khp.UNKNOWN;
                            break;
                        }
                        khp = values[i];
                        if (0qQ.A0K(str, khp.A00)) {
                            break;
                        }
                        i++;
                    }
                    jwL.A01 = khp;
                }
                r7.A0z();
            }
            return jwL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

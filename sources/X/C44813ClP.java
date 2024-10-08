package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.ClP  reason: case insensitive filesystem */
public abstract class C44813ClP {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Cu2, java.lang.Object] */
    public static C45299Cu2 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            ? obj = new Object();
            16L A11 = r9.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r9.A0z();
                return null;
            }
            while (true) {
                16L A1J = r9.A1J();
                16L r8 = 16L.A09;
                if (A1J == r8) {
                    return obj;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("version".equals(A17)) {
                    obj.A00 = r9.A1D();
                } else if ("participantStates".equals(A17)) {
                    HashMap hashMap = null;
                    if (r9.A11() == r6) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r9.A1J() != r8) {
                            String A1P = r9.A1P();
                            if (C41845B3m.A0W(r9) == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                C10309Rq7 parseFromJson = C9834Rhw.parseFromJson(r9);
                                if (parseFromJson != null) {
                                    A1E.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    0qQ.A0B(hashMap, 0);
                    obj.A01 = hashMap;
                }
                r9.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.LinkedHashMap;

/* renamed from: X.Cjo  reason: case insensitive filesystem */
public abstract class C44720Cjo {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CsS, java.lang.Object] */
    public static C45214CsS parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            16L A11 = r6.A11();
            16L r4 = 16L.A0D;
            if (A11 != r4) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    return obj;
                }
                if (C273654mx.A00(813).equals(AnonymousClass7TE.A17(r6))) {
                    LinkedHashMap linkedHashMap = null;
                    if (r6.A11() == r4) {
                        linkedHashMap = AnonymousClass7TE.A1H();
                        while (r6.A1J() != r3) {
                            C41847B3o.A1N(r6, linkedHashMap);
                        }
                    }
                    0qQ.A0B(linkedHashMap, 0);
                    obj.A00 = linkedHashMap;
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

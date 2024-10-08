package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NzL  reason: case insensitive filesystem */
public abstract class C70229NzL {
    public static C65581eX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65581eX r1 = new C65581eX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(3347).equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C254873tC parseFromJson = C254863tB.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A02 = arrayList;
                } else if (AnonymousClass000.A00(4876).equals(A17)) {
                    r1.A01 = VEC.A00(r4.A1Q());
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

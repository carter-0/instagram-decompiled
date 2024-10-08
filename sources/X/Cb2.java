package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Cb2 {
    public static AnonymousClass60L parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r3 = 16L.A09;
                A00 = C273654mx.A00(1319);
                if (A1J == r3) {
                    break;
                }
                if (C41846B3n.A1b(r6, "resharers")) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new AnonymousClass60L(arrayList);
            }
            AnonymousClass7TF.A1L("resharers", r6, A00);
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

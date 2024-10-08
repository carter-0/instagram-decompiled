package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cxv  reason: case insensitive filesystem */
public final class C45521Cxv {
    public static C43822CEo parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (C41845B3m.A1H(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("more_carousel_media_available".equals(A17)) {
                    r4.A01 = AnonymousClass7TF.A0S(r5);
                } else if ("pending_carousel_media".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1D(r5, arrayList);
                        }
                    }
                    r4.A03 = arrayList;
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            r4.A00 = new C53264GlC(r4.A02, r4.A03, C41845B3m.A14(r4.A01));
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

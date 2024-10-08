package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cxs  reason: case insensitive filesystem */
public final class C45518Cxs {
    public static CEM parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("carousel_medias".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1D(r6, arrayList);
                        }
                    }
                    r5.A04 = arrayList;
                } else if ("more_carousel_media_available".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else if ("total_carousel_media_count".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0X(r6);
                } else if ("validated_product_cursor".equals(A17)) {
                    r5.A03 = AnonymousClass7TF.A0X(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            List list = r5.A04;
            boolean A14 = C41845B3m.A14(r5.A01);
            Integer num = r5.A02;
            0qQ.A0A(num);
            r5.A00 = new BBB(r5.A03, list, num.intValue(), A14);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

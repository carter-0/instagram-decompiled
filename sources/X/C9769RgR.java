package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.RgR  reason: case insensitive filesystem */
public abstract class C9769RgR {
    public static QPi parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("paymentMode".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("supportedContainerTypes".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            return new QPi(str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

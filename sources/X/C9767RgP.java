package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.RgP  reason: case insensitive filesystem */
public abstract class C9767RgP {
    public static QPg parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("availabilityConditions".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("isAvailable".equals(A17)) {
                    bool = Boolean.valueOf(r5.A0d());
                }
                r5.A0z();
            }
            return new QPg(bool, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

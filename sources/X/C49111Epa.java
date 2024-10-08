package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Epa  reason: case insensitive filesystem */
public abstract class C49111Epa {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.F2H, java.lang.Object] */
    public static F2H parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("suggestions".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C49512Ewr parseFromJson = C49113Epc.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (arrayList != null) {
                obj.A01 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

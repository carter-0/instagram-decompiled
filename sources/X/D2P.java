package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class D2P {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F2I, java.lang.Object] */
    public static F2I parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, obj, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r3, F2I f2i, String str) {
        ArrayList arrayList = null;
        if (C41845B3m.A19(str)) {
            String A0l = AnonymousClass7TG.A0l(r3);
            0qQ.A0B(A0l, 0);
            f2i.A00 = A0l;
        } else if (C41845B3m.A1E(str)) {
            String A0l2 = AnonymousClass7TG.A0l(r3);
            0qQ.A0B(A0l2, 0);
            f2i.A01 = A0l2;
        } else if ("suggestion_cards".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r3.A1J() != 16L.A08) {
                    AnonymousClass3UI parseFromJson = C44752CkO.parseFromJson(r3);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            0qQ.A0B(arrayList, 0);
            f2i.A02 = arrayList;
        }
    }
}

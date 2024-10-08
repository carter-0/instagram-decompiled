package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O3O {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.OAV, java.lang.Object] */
    public static OAV parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("screen".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("tags".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (arrayList != null) {
                obj.A00 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O3S {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OGY, java.lang.Object] */
    public static OGY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("tag_type".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A01 = O3N.parseFromJson(r4);
                } else if ("subtitle".equals(A17)) {
                    obj.A00 = O3N.parseFromJson(r4);
                } else if ("subtags".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            OGY parseFromJson = parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("show_auto_report".equals(A17)) {
                    r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

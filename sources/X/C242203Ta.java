package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Ta  reason: invalid class name and case insensitive filesystem */
public abstract class C242203Ta {
    public static AnonymousClass9IV parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9IV r0 = new AnonymousClass9IV(16);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("persistent_icebreakers".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C274694ou parseFromJson = C274684ot.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A01 = arrayList;
                } else if ("are_default_icebreakers".equals(A0q)) {
                    r0.A00 = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

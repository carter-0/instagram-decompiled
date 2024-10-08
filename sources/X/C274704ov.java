package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4ov  reason: invalid class name and case insensitive filesystem */
public abstract class C274704ov {
    public static AnonymousClass9IV parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9IV r0 = new AnonymousClass9IV(18);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                ArrayList arrayList = null;
                if ("postback_items".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C274694ou parseFromJson = C274684ot.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                } else if ("url_items".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass9JG parseFromJson2 = C395309zY.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A01 = arrayList;
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

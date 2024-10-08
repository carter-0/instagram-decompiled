package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Mpl  reason: case insensitive filesystem */
public abstract class C67551Mpl {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.OBV, java.lang.Object] */
    public static OBV parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("modification_token".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("quick_replies".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C67569Mq3 parseFromJson = C67568Mq2.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
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

package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.46r  reason: invalid class name and case insensitive filesystem */
public abstract class C2606946r {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.46s, java.lang.Object] */
    public static C2607046s parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                ArrayList arrayList = null;
                if ("likes".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C2607246u parseFromJson = C2607146t.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("emojis".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C2607246u parseFromJson2 = C2607146t.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A00 = arrayList;
                }
                r4.A0z();
            }
            if (obj.A01 == null) {
                obj.A01 = Collections.emptyList();
            }
            if (obj.A00 != null) {
                return obj;
            }
            obj.A00 = Collections.emptyList();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

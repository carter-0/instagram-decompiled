package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.B6i  reason: case insensitive filesystem */
public abstract class C41910B6i {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cto, java.lang.Object] */
    public static C45285Cto parseFromJson(16F r4) {
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
                if ("preview_comments".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            1bK parseFromJson = AnonymousClass1Zw.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("comment_count".equals(A0q)) {
                    obj.A00 = Integer.valueOf(r4.A1D());
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

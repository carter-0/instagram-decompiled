package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjm  reason: case insensitive filesystem */
public abstract class C44718Cjm {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.CvK] */
    public static C45378CvK parseFromJson(16F r4) {
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
                if ("mustache_ctas".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass9JN parseFromJson = C263354Lf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("xma_link".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41848B3p.A1P(r4, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if (C41845B3m.A1D(A17)) {
                    obj.A00 = 1Xj.A00(r4);
                } else if ("item_type".equals(A17) || TraceFieldType.ContentType.equals(A17)) {
                    obj.A01 = 2FW.A0A.A00(r4.A1P());
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

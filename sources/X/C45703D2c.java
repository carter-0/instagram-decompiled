package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2c  reason: case insensitive filesystem */
public final class C45703D2c {
    public static CGR parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGR cgr = new CGR();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("product_item".equals(A17)) {
                    cgr.A01 = C275404q6.parseFromJson(r5);
                } else if ("merchant".equals(A17)) {
                    cgr.A02 = C41845B3m.A0a(r5, false);
                } else {
                    ArrayList arrayList = null;
                    if ("sectional_items".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C45406Cvm parseFromJson = C45053CpW.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        cgr.A04 = arrayList;
                    } else if ("metadata".equals(A17)) {
                        cgr.A00 = C45021Coy.parseFromJson(r5);
                    } else if (C41845B3m.A1V(A17)) {
                        r5.A0d();
                    } else if ("next_max_id".equals(A17)) {
                        cgr.A03 = AnonymousClass7TG.A0l(r5);
                    } else {
                        1XY.A01(r5, cgr, A17);
                    }
                }
                r5.A0z();
            }
            return cgr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.58l  reason: invalid class name and case insensitive filesystem */
public abstract class C2815558l {
    public static C2816658x parseFromJson(16F r21) {
        16F r2 = r21;
        0qQ.A0B(r2, 0);
        try {
            Long l = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Long l2 = null;
            Long l3 = null;
            C2816458v r13 = null;
            C2816158s r14 = null;
            ArrayList arrayList = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("consumption_sheet_config".equals(A0q)) {
                    r13 = C2816358u.parseFromJson(r2);
                } else if ("digital_non_consumable_product_id".equals(A0q)) {
                    l = Long.valueOf(r2.A0y());
                } else if ("digital_product_id".equals(A0q)) {
                    l2 = Long.valueOf(r2.A0y());
                } else if ("payee_id".equals(A0q)) {
                    l3 = Long.valueOf(r2.A0y());
                } else if ("pinned_row_config".equals(A0q)) {
                    r14 = C2816058r.parseFromJson(r2);
                } else if ("tier_infos".equals(A0q)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r2.A1J() != 16L.A08) {
                            C2815858p parseFromJson = C2815658m.parseFromJson(r2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r2.A0z();
            }
            if (r13 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("consumption_sheet_config", "LiveUserPayViewerPayConfig");
            } else if (l == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("digital_non_consumable_product_id", "LiveUserPayViewerPayConfig");
            } else if (l2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("digital_product_id", "LiveUserPayViewerPayConfig");
            } else if (l3 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("payee_id", "LiveUserPayViewerPayConfig");
            } else if (r14 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("pinned_row_config", "LiveUserPayViewerPayConfig");
            } else if (arrayList != null || !(r2 instanceof 0c9)) {
                return new C2816658x(r13, r14, arrayList, l.longValue(), l2.longValue(), l3.longValue());
            } else {
                ((0c9) r2).A03.A00("tier_infos", "LiveUserPayViewerPayConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

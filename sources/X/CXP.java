package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CXP {
    public static N4Q parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("amount_with_offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("tax_line_items".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C15060UNd parseFromJson = C44508Cg4.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("total_formatted_amount_with_taxes".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("amount_with_offset", r9, "EstimatedTaxes");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new N4Q((List) arrayList, num.intValue(), str);
            } else {
                AnonymousClass7TF.A1L("total_formatted_amount_with_taxes", r9, "EstimatedTaxes");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

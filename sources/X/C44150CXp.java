package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CXp  reason: case insensitive filesystem */
public abstract class C44150CXp {
    public static QP6 parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            Boolean bool = null;
            C250533lb r6 = null;
            String str2 = null;
            Integer num2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("follow_requests_items".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            UMz parseFromJson = C44149CXo.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (C41845B3m.A17(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("is_horizontal_scroll_unit".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("item_client_gap_rules".equals(A17)) {
                    r6 = C250523la.parseFromJson(r10);
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r10, num2, A17, "view_state_item_type");
                } else if (r10.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r10.A1P();
                }
                r10.A0z();
            }
            return new QP6(arrayList, num, bool, r6, num2, str, str2, 4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

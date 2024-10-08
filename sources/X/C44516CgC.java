package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CgC  reason: case insensitive filesystem */
public abstract class C44516CgC {
    public static C53360Gmk parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("disclaimer_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (C41845B3m.A17(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (!"trends".equals(A17)) {
                    num2 = C41847B3o.A13(r9, num2, A17, "view_state_item_type");
                } else if (r9.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r9.A1J() != 16L.A08) {
                        QP7 parseFromJson = C44515CgB.parseFromJson(r9);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r9.A0z();
            }
            return new C53360Gmk(num, num2, str, str2, str3, (List) arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EjV  reason: case insensitive filesystem */
public abstract class C48746EjV {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.ExP, java.lang.Object] */
    public static ExP parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("app_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("domain_names".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("label".equals(A17)) {
                    C41846B3n.A1A(r6);
                } else if ("partner_name".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            if (arrayList != null) {
                obj.A02 = arrayList;
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

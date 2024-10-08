package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3tZ  reason: invalid class name and case insensitive filesystem */
public abstract class C255093tZ {
    public static C269974fz parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("footerSubtype".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("isAutofillEnabled".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if ("promoCodes".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            BFB parseFromJson = CZJ.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            return new C269974fz(bool, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

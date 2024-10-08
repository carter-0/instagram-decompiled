package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3qq  reason: invalid class name and case insensitive filesystem */
public abstract class C253473qq {
    public static C253493qs parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("entities".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            C255243to parseFromJson = C255203tk.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("raw_text".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("entities", "TextWithLinkedEntitiesImpl");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C253493qs(arrayList, str);
            } else {
                ((0c9) r8).A03.A00("raw_text", "TextWithLinkedEntitiesImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

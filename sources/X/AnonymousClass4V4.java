package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4V4  reason: invalid class name */
public abstract class AnonymousClass4V4 {
    public static C376649Iu parseFromJson(16F r8) {
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
                if ("promotions".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass4VQ parseFromJson = AnonymousClass4V5.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("bloksVersionId".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("promotions", "IGSlotFetcherData");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C376649Iu((List) arrayList, 11, str);
            } else {
                ((0c9) r8).A03.A00("bloksVersionId", "IGSlotFetcherData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

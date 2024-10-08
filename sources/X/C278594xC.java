package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4xC  reason: invalid class name and case insensitive filesystem */
public abstract class C278594xC {
    public static C278634xH parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("browse_info_dicts".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            C278614xF parseFromJson = C278604xD.parseFromJson(r6);
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
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new C278634xH(arrayList);
            }
            ((0c9) r6).A03.A00("browse_info_dicts", "IGConsiderAndBrowseOptions");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

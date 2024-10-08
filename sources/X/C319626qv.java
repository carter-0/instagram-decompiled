package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.6qv  reason: invalid class name and case insensitive filesystem */
public abstract class C319626qv {
    public static AnonymousClass9IE parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9IE r0 = new AnonymousClass9IE(31);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("user_info_list".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C319646qx parseFromJson = C319636qw.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VD7 {
    public static VSI parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VSI vsi = new VSI();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("page_info".equals(A17)) {
                    vsi.A00 = VD6.parseFromJson(r4);
                } else if ("edges".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17235VNn parseFromJson = VD5.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vsi.A01 = arrayList;
                }
                r4.A0z();
            }
            return vsi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

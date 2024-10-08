package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VE0 {
    public static C17351VSe parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17351VSe vSe = new C17351VSe();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("control_node".equals(A17)) {
                    vSe.A00 = C18206VnW.parseFromJson(r4);
                } else if ("buckets".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VO5 parseFromJson = C16999VDz.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vSe.A01 = arrayList;
                }
                r4.A0z();
            }
            return vSe;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

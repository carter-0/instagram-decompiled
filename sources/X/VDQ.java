package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VDQ {
    public static VSL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VSL vsl = new VSL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("page_info".equals(A17)) {
                    vsl.A00 = VDP.parseFromJson(r4);
                } else if ("edges".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VO1 parseFromJson = VDO.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vsl.A01 = arrayList;
                }
                r4.A0z();
            }
            return vsl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

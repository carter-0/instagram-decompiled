package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VDG {
    public static C17243VNv parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17243VNv vNv = new C17243VNv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("edges".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17242VNu parseFromJson = VDF.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vNv.A00 = arrayList;
                }
                r4.A0z();
            }
            return vNv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

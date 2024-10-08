package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VIG {
    public static C19327WUj parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C19327WUj wUj = new C19327WUj();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("color".equals(A17)) {
                    wUj.A01 = r5.A1D();
                } else if ("corner_radius".equals(A17)) {
                    wUj.A00 = (float) r5.A0U();
                } else if ("paths".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C306506Mk parseFromJson = VIE.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    wUj.A02 = arrayList;
                }
                r5.A0z();
            }
            return wUj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

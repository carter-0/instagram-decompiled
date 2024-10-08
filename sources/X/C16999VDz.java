package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDz  reason: case insensitive filesystem */
public abstract class C16999VDz {
    public static VO5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VO5 vo5 = new VO5();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("configured_questions".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17673Vc4 parseFromJson = C16998VDy.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vo5.A00 = arrayList;
                }
                r4.A0z();
            }
            return vo5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

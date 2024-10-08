package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3t6  reason: invalid class name and case insensitive filesystem */
public abstract class C254823t6 {
    public static C254723sw parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C254723sw r0 = new C254723sw();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("media_reaction_group_reactions".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            N2T parseFromJson = C70079Nwv.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

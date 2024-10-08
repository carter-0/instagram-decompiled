package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4yj  reason: invalid class name and case insensitive filesystem */
public abstract class C279494yj {
    public static C279504yk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("overall_effect_id".equals(A0q)) {
                    l = Long.valueOf(r5.A0y());
                } else if ("segment_effects_info".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            BEH parseFromJson = C44096CVn.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            return new C279504yk(l, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

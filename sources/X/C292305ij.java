package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ij  reason: invalid class name and case insensitive filesystem */
public abstract class C292305ij {
    public static AnonymousClass9IM parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("total_badge_count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("badge_count_breakdown".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            C376619Ir parseFromJson = C292315ik.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("total_badge_count", "RemoteBadgingLoggingContext");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new AnonymousClass9IM((List) arrayList, num.intValue(), 2);
            } else {
                ((0c9) r8).A03.A00("badge_count_breakdown", "RemoteBadgingLoggingContext");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

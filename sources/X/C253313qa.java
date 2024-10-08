package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3qa  reason: invalid class name and case insensitive filesystem */
public abstract class C253313qa {
    public static C253343qd parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("fundraisers".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            BGW parseFromJson = C44371Cdr.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("total_count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("fundraisers", "ActiveStandaloneFundraisersImpl");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new C253343qd(arrayList, num.intValue());
            } else {
                ((0c9) r8).A03.A00("total_count", "ActiveStandaloneFundraisersImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

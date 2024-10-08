package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3tM  reason: invalid class name and case insensitive filesystem */
public abstract class C254963tM {
    public static C275554qX parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            C275514qT r3 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("questions".equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            C275534qV parseFromJson = C275494qR.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("trigger_condition".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("undo_button".equals(A0q)) {
                    r3 = C275504qS.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new C275554qX(r3, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C275554qX r3) {
        r2.A0c();
        List<C275544qW> list = r3.A02;
        if (list != null) {
            16P.A03(r2, "questions");
            for (C275544qW r0 : list) {
                if (r0 != null) {
                    C275494qR.A00(r2, r0.F0H());
                }
            }
            r2.A0Y();
        }
        String str = r3.A01;
        if (str != null) {
            r2.A0R("trigger_condition", str);
        }
        C275524qU r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("undo_button");
            C275504qS.A00(r2, r1.F0G());
        }
        r2.A0Z();
    }
}

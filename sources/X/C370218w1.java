package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8w1  reason: invalid class name and case insensitive filesystem */
public abstract class C370218w1 {
    public static C354948Nz parseFromJson(16F r4) {
        String A1P;
        0qQ.A0B(r4, 0);
        try {
            C354948Nz r0 = new C354948Nz();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("captions".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

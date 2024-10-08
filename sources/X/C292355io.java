package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5io  reason: invalid class name and case insensitive filesystem */
public abstract class C292355io {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5ip] */
    public static C292365ip parseFromJson(16F r4) {
        String A1P;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                ArrayList arrayList = null;
                if ("headers".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    obj.A00 = arrayList;
                } else if ("indices".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r4.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.51V  reason: invalid class name */
public abstract class AnonymousClass51V {
    public static AnonymousClass9IV parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass9IV r0 = new AnonymousClass9IV(9);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if ("segment_indices".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r5.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else if ("bleeps".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C61080JwI parseFromJson = C44630Ci8.parseFromJson(r5);
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

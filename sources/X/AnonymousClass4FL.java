package X;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.4FL  reason: invalid class name */
public abstract class AnonymousClass4FL {
    public static AnonymousClass9IE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass9IE r0 = new AnonymousClass9IE(28);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("publish_ids".equals(A0q)) {
                    HashSet hashSet = null;
                    if (r5.A11() == 16L.A0C) {
                        hashSet = new HashSet();
                        while (r5.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r5.A1D());
                            if (valueOf != null) {
                                hashSet.add(valueOf);
                            }
                        }
                    }
                    0qQ.A0B(hashSet, 0);
                    r0.A00 = hashSet;
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

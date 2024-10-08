package X;

import java.io.IOException;
import java.util.HashMap;

public abstract class VHE {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.VPK, java.lang.Object] */
    public static VPK parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            16L A11 = r7.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r7.A0z();
                return null;
            }
            HashMap hashMap = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    break;
                }
                if ("incentives_nux_last_seen_times".equals(AnonymousClass7TE.A17(r7))) {
                    if (r7.A11() == r6) {
                        hashMap = new HashMap();
                        while (r7.A1J() != r4) {
                            String A1P = r7.A1P();
                            r7.A1J();
                            if (r7.A11() == 16L.A0G) {
                                hashMap.put(A1P, (Object) null);
                            } else {
                                Long A0Z = AnonymousClass7TF.A0Z(r7);
                                if (A0Z != null) {
                                    hashMap.put(A1P, A0Z);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                }
                r7.A0z();
            }
            ? obj = new Object();
            if (hashMap != null) {
                obj.A00 = hashMap;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.3Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C241703Qj {
    public static AnonymousClass3QR parseFromJson(16F r7) {
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
                String A0q = r7.A0q();
                r7.A1J();
                if ("counters".equals(A0q)) {
                    if (r7.A11() == r6) {
                        hashMap = new HashMap();
                        while (r7.A1J() != r4) {
                            String A1P = r7.A1P();
                            r7.A1J();
                            if (r7.A11() == 16L.A0G) {
                                hashMap.put(A1P, (Object) null);
                            } else {
                                Integer valueOf = Integer.valueOf(r7.A1D());
                                if (valueOf != null) {
                                    hashMap.put(A1P, valueOf);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                }
                r7.A0z();
            }
            AnonymousClass3QR r0 = new AnonymousClass3QR();
            if (hashMap != null) {
                r0.A00 = hashMap;
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

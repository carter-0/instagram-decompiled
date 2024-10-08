package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5JF  reason: invalid class name */
public abstract class AnonymousClass5JF {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.47H, java.lang.Object] */
    public static AnonymousClass47H parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            16L A11 = r8.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r6 = 16L.A09;
                if (A1J == r6) {
                    return obj;
                }
                String A0q = r8.A0q();
                r8.A1J();
                if ("pending_clips_seen_states".equals(A0q)) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap hashMap2 = new HashMap();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                AnonymousClass2fN parseFromJson = AnonymousClass5JG.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    hashMap2.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    obj.A00 = hashMap;
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

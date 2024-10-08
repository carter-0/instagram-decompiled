package X;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.3Qg  reason: invalid class name and case insensitive filesystem */
public abstract class C241683Qg {
    public static AnonymousClass9IQ parseFromJson(16F r5) {
        String A1P;
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass9IQ r0 = new AnonymousClass9IQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("segment_paths".equals(A0q)) {
                    HashSet hashSet = null;
                    if (r5.A11() == 16L.A0C) {
                        hashSet = new HashSet();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                hashSet.add(A1P);
                            }
                        }
                    }
                    0qQ.A0B(hashSet, 0);
                    r0.A00 = hashSet;
                } else if ("are_segments_complete".equals(A0q)) {
                    r0.A01 = r5.A0d();
                } else if ("is_rendering".equals(A0q)) {
                    r0.A02 = r5.A0d();
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

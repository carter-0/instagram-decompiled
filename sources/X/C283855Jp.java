package X;

import java.io.IOException;

/* renamed from: X.5Jp  reason: invalid class name and case insensitive filesystem */
public abstract class C283855Jp {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5Jq, X.4V9] */
    public static C283865Jq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                AnonymousClass4VE.A00(r3, obj, A0q);
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

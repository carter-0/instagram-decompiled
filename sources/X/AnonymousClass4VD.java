package X;

import java.io.IOException;

/* renamed from: X.4VD  reason: invalid class name */
public abstract class AnonymousClass4VD {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.4V9, X.4V8] */
    public static AnonymousClass4V8 parseFromJson(16F r3) {
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

package X;

import java.io.IOException;

/* renamed from: X.Cis  reason: case insensitive filesystem */
public abstract class C44674Cis {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.CHS, X.3Sa, java.lang.Object] */
    public static CHS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                C241993Se.A01(r3, obj, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

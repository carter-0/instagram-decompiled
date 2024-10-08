package X;

import java.io.IOException;

/* renamed from: X.CqU  reason: case insensitive filesystem */
public abstract class C45112CqU {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CtF, java.lang.Object] */
    public static C45252CtF parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (AnonymousClass000.A00(1929).equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = r3.A1D();
                }
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

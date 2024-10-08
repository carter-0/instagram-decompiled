package X;

import java.io.IOException;

/* renamed from: X.V9y  reason: case insensitive filesystem */
public abstract class C16895V9y {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.V36] */
    public static V36 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17481VXi vXi = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("ig.components.screens.Navbar".equals(AnonymousClass7TE.A17(r3))) {
                    vXi = VA0.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            obj.A00 = vXi;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

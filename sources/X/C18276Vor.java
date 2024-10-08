package X;

import java.io.IOException;

/* renamed from: X.Vor  reason: case insensitive filesystem */
public abstract class C18276Vor {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VYq, java.lang.Object] */
    public static C17512VYq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("rect_left".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("rect_top".equals(A17)) {
                    obj.A03 = r3.A1D();
                } else if ("rect_right".equals(A17)) {
                    obj.A02 = r3.A1D();
                } else if ("rect_bottom".equals(A17)) {
                    obj.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C17512VYq vYq) {
        r2.A0c();
        r2.A0P("rect_left", vYq.A01);
        r2.A0P("rect_top", vYq.A03);
        r2.A0P("rect_right", vYq.A02);
        r2.A0P("rect_bottom", vYq.A00);
        r2.A0Z();
    }
}

package X;

import java.io.IOException;

public abstract class LJZ {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L27, java.lang.Object] */
    public static L27 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("media_location".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = C63369Kvq.parseFromJson(r3);
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

    public static void A00(17Z r4, L27 l27) {
        r4.A0c();
        if (l27.A00 != null) {
            r4.A0q("media_location");
            C63738L4w l4w = l27.A00;
            r4.A0c();
            r4.A0N("lat", l4w.A00);
            r4.A0N("lng", l4w.A01);
            r4.A0Z();
        }
        r4.A0Z();
    }
}

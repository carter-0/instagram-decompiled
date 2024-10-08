package X;

import java.io.IOException;

/* renamed from: X.Voq  reason: case insensitive filesystem */
public abstract class C18275Voq {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Vsw] */
    public static C18501Vsw parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("background_left".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("background_top".equals(A17)) {
                    obj.A04 = (float) r4.A0U();
                } else if ("background_right".equals(A17)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("background_bottom".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("text_size".equals(A17)) {
                    obj.A03 = (float) r4.A0U();
                } else if ("leaning_angle".equals(A17)) {
                    obj.A05 = Double.valueOf(r4.A0U());
                } else if ("is_RTL".equals(A17)) {
                    obj.A06 = r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C18501Vsw vsw) {
        r3.A0c();
        r3.A0O("background_left", vsw.A01);
        r3.A0O("background_top", vsw.A04);
        r3.A0O("background_right", vsw.A02);
        r3.A0O("background_bottom", vsw.A00);
        r3.A0O("text_size", vsw.A03);
        Double d = vsw.A05;
        if (d != null) {
            r3.A0N("leaning_angle", d.doubleValue());
        }
        r3.A0S("is_RTL", vsw.A06);
        r3.A0Z();
    }
}

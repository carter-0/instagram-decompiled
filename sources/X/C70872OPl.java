package X;

import java.io.IOException;

/* renamed from: X.OPl  reason: case insensitive filesystem */
public abstract class C70872OPl {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OKl, java.lang.Object] */
    public static C70765OKl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("pack_name".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("template_name".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("url".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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

    public static void A00(17Z r2, C70765OKl oKl) {
        r2.A0c();
        String str = oKl.A00;
        if (str != null) {
            r2.A0R("pack_name", str);
        }
        String str2 = oKl.A01;
        if (str2 != null) {
            r2.A0R("template_name", str2);
        }
        String str3 = oKl.A02;
        if (str3 != null) {
            r2.A0R("url", str3);
        }
        r2.A0Z();
    }
}

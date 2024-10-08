package X;

import java.io.IOException;

/* renamed from: X.OPm  reason: case insensitive filesystem */
public abstract class C70873OPm {
    public static OG7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            OG7 og7 = new OG7();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("comment_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    og7.A00 = A0l;
                } else if (C41845B3m.A1A(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    og7.A03 = A0l2;
                } else if (AnonymousClass000.A00(699).equals(A17)) {
                    og7.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("url".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    og7.A04 = A0l3;
                } else if ("media_code".equals(A17)) {
                    og7.A01 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return og7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, OG7 og7) {
        r2.A0c();
        String str = og7.A00;
        if (str != null) {
            r2.A0R("comment_id", str);
        }
        C41846B3n.A0z(r2, og7.A03);
        String str2 = og7.A02;
        if (str2 != null) {
            r2.A0R(AnonymousClass000.A00(699), str2);
        }
        String str3 = og7.A04;
        if (str3 != null) {
            r2.A0R("url", str3);
        }
        String str4 = og7.A01;
        if (str4 != null) {
            r2.A0R("media_code", str4);
        }
        r2.A0Z();
    }
}

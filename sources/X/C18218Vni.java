package X;

import java.io.IOException;

/* renamed from: X.Vni  reason: case insensitive filesystem */
public final class C18218Vni {
    public static C15260UXv parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A19(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("phone".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("website".equals(A17)) {
                    r1.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("category".equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("price_range".equals(A17)) {
                    r1.A03 = AnonymousClass7TF.A0X(r3);
                } else if ("location_address".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("location_city".equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("location_region".equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0X(r3);
                } else if ("location_zip".equals(A17)) {
                    r1.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("ig_business".equals(A17)) {
                    r1.A00 = VEW.parseFromJson(r3);
                } else if ("hours".equals(A17)) {
                    r1.A01 = VEX.parseFromJson(r3);
                } else if ("has_menu".equals(A17)) {
                    r1.A0C = r3.A0d();
                } else if (AnonymousClass000.A00(1338).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("num_guides".equals(A17)) {
                    r1.A02 = AnonymousClass7TF.A0X(r3);
                } else {
                    1XY.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

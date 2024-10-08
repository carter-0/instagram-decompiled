package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cpa  reason: case insensitive filesystem */
public abstract class C45057Cpa {
    public static C53400GnX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C53400GnX gnX = new C53400GnX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("broadcast_wrapper".equals(A17)) {
                    gnX.A00 = C63439Kwz.parseFromJson(r4);
                } else if ("image".equals(A17)) {
                    gnX.A01 = C275414q7.parseFromJson(r4);
                } else if ("media_dict".equals(A17)) {
                    gnX.A02 = 1Xj.A00(r4);
                } else if ("media_slideshow".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1D(r4, arrayList);
                        }
                    }
                    gnX.A03 = arrayList;
                } else if ("showreel_native_animation".equals(A17)) {
                    gnX.A04 = AnonymousClass5HA.parseFromJson(r4);
                }
                r4.A0z();
            }
            return gnX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

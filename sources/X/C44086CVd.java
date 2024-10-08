package X;

import java.io.IOException;

/* renamed from: X.CVd  reason: case insensitive filesystem */
public abstract class C44086CVd {
    public static BE8 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            XET xet = null;
            BGB bgb = null;
            1Xj r6 = null;
            C42053BFg bFg = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("ad_media".equals(A17)) {
                    xet = C41915B6n.parseFromJson(r8);
                } else if ("blending_unit".equals(A17)) {
                    bgb = C44309Ccr.parseFromJson(r8);
                } else if (C41845B3m.A1D(A17)) {
                    r6 = 1Xj.A00(r8);
                } else if ("netego_media".equals(A17)) {
                    bFg = C44231Cas.parseFromJson(r8);
                } else if (C41845B3m.A1C(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                }
                r8.A0z();
            }
            return new BE8(xet, bFg, bgb, r6, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

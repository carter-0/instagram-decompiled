package X;

import java.io.IOException;

/* renamed from: X.3tL  reason: invalid class name and case insensitive filesystem */
public abstract class C254953tL {
    public static C239613Hd parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("ad_pod_id".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("index_in_ad_pod".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("num_ads_in_ad_pod".equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("ad_pod_id", "AdPodRules");
            } else if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("index_in_ad_pod", "AdPodRules");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new C239613Hd(str, num.intValue(), num2.intValue());
            } else {
                ((0c9) r10).A03.A00("num_ads_in_ad_pod", "AdPodRules");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C239613Hd r3) {
        r2.A0c();
        String str = r3.A02;
        if (str != null) {
            r2.A0R("ad_pod_id", str);
        }
        r2.A0P("index_in_ad_pod", r3.A00);
        r2.A0P("num_ads_in_ad_pod", r3.A01);
        r2.A0Z();
    }
}

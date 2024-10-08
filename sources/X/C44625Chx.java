package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.Chx  reason: case insensitive filesystem */
public abstract class C44625Chx {
    public static BBU parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            C62565Khv khv = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("product_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("merchant_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("product_name".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("product_data".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r14);
                } else if ("affiliate_campaign_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("waterfall_id".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if (C66579MXk.A00(26).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                } else if ("tag_mode".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    khv = (C62565Khv) C62565Khv.A01.get(str);
                    if (khv == null) {
                        khv = C62565Khv.A06;
                    }
                }
                r14.A0z();
            }
            if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("product_id", r14, "ClipsShoppingProductMetadata");
            } else if (str3 != null || !(r14 instanceof 0c9)) {
                return new BBU(khv, productDetailsProductItemDict, str2, str3, str4, str5, str6, str7);
            } else {
                AnonymousClass7TF.A1L("merchant_id", r14, "ClipsShoppingProductMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

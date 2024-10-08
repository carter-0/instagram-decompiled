package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cmn  reason: case insensitive filesystem */
public abstract class C44897Cmn {
    public static C42126BIe parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            C61222JzF jzF = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("ad_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r12);
                } else if ("card_modifier_label".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("cta".equals(A17)) {
                    jzF = LJK.parseFromJson(r12);
                } else if ("micro_product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r12);
                } else if ("product_context".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("shoppable_media".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C42068BFv parseFromJson = C44260Cbv.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r12.A0z();
            }
            if (jzF == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cta", r12, "DeepLinkProduct");
            } else if (productDetailsProductItemDict != null || !(r12 instanceof 0c9)) {
                return new C42126BIe(jzF, productDetailsProductItemDict, l, str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("micro_product", r12, "DeepLinkProduct");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

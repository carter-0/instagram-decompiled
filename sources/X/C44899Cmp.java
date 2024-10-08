package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cmp  reason: case insensitive filesystem */
public abstract class C44899Cmp {
    public static C42127BIf parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            C61222JzF jzF = null;
            User user = null;
            String str = null;
            ArrayList arrayList = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("ad_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else if ("cta".equals(A17)) {
                    jzF = LJK.parseFromJson(r14);
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r14, false);
                } else if ("merchant_details".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("product_image_urls".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r14.A0z();
            }
            if (jzF == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cta", r14, "DeepLinkShop");
            } else if (user == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant", r14, "DeepLinkShop");
            } else if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant_details", r14, "DeepLinkShop");
            } else if (arrayList != null || !(r14 instanceof 0c9)) {
                return new C42127BIf(jzF, user, l, str, arrayList);
            } else {
                AnonymousClass7TF.A1L("product_image_urls", r14, "DeepLinkShop");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

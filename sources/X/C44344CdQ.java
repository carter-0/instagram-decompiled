package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContentImpl;
import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CdQ  reason: case insensitive filesystem */
public abstract class C44344CdQ {
    public static ShoppingBrandWithProductsImpl parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ProductDetailsSellerBadgeContentImpl productDetailsSellerBadgeContentImpl = null;
            ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = null;
            User user = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("context_info".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("product_thumbnails".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            ProductWithMediaImageImpl parseFromJson = C44277CcL.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("products".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1G(r13, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("seller_badge".equals(A17)) {
                    productDetailsSellerBadgeContentImpl = C44261Cbw.parseFromJson(r13);
                } else if (C41845B3m.A1L(A17)) {
                    shoppingBrandWithProductsSubtitle = C44345CdR.parseFromJson(r13);
                } else {
                    user = C41846B3n.A0a(r13, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context_info", r13, "ShoppingBrandWithProductsImpl");
            } else if (arrayList == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("product_thumbnails", r13, "ShoppingBrandWithProductsImpl");
            } else if (user != null || !(r13 instanceof 0c9)) {
                return new ShoppingBrandWithProductsImpl(productDetailsSellerBadgeContentImpl, shoppingBrandWithProductsSubtitle, user, str, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r13, "ShoppingBrandWithProductsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

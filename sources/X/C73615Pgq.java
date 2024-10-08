package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.Pgq  reason: case insensitive filesystem */
public final /* synthetic */ class C73615Pgq extends 03J implements 0sL {
    public static final C73615Pgq A00 = new C73615Pgq();

    public C73615Pgq() {
        super(2, C71043OaL.class, "generateShoppingProductUrl", "generateShoppingProductUrl(Lcom/instagram/user/model/ProductDetailsProductItemDict;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) obj;
        AnonymousClass7TG.A1N(productDetailsProductItemDict, obj2);
        User user = productDetailsProductItemDict.A0G;
        if (user != null && user.A03.getUsername() != null) {
            return 002.A15("https://www.instagram.com/_n/product_display_page?product_id=", productDetailsProductItemDict.A0h, "&business_user_id=", AnonymousClass3ZA.A00(user), "&merchant_name=", user.getUsername(), "&checkout_style=native_checkout&entry_point=deeplink");
        }
        throw AnonymousClass7TE.A0z("Merchant id and merchant name must not be null");
    }
}

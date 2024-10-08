package X;

import android.os.Bundle;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import org.json.JSONObject;

/* renamed from: X.Vog  reason: case insensitive filesystem */
public abstract class C18266Vog {
    public static void A01(Product product, String str, String str2, String str3) {
        boolean z = true;
        boolean A1V = AnonymousClass7TF.A1V(product);
        if (str3 == null) {
            z = false;
        }
        02V.A05(A1V ^ z);
        if (product == null && str3 == null) {
            str.getClass();
            str2.getClass();
        }
    }

    public static Bundle A00(Bundle bundle, RankingInfo rankingInfo, ProductTileMedia productTileMedia, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, 2EG r50, Product product, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, JSONObject jSONObject, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle bundle2 = new Bundle();
        String str26 = str18;
        String str27 = str17;
        String str28 = str16;
        String str29 = str15;
        String str30 = str14;
        String str31 = str12;
        String str32 = str11;
        String str33 = str10;
        String str34 = str9;
        String str35 = str22;
        ProductTileMedia productTileMedia2 = productTileMedia;
        ShoppingSearchLoggingInfo shoppingSearchLoggingInfo2 = shoppingSearchLoggingInfo;
        String str36 = str24;
        String str37 = str25;
        Product product2 = product;
        Integer num4 = num;
        Integer num5 = num2;
        String str38 = str2;
        Integer num6 = num3;
        String str39 = str3;
        boolean z6 = z3;
        String str40 = str;
        String str41 = str5;
        RankingInfo rankingInfo2 = rankingInfo;
        String str42 = str21;
        String str43 = str4;
        Bundle bundle3 = bundle;
        String str44 = str20;
        String str45 = str6;
        String str46 = str7;
        String str47 = str8;
        bundle2.putParcelable("pdp_arguments", new ProductDetailsPageArguments(bundle3, rankingInfo2, productTileMedia2, (ShoppingGuideLoggingInfo) null, shoppingSearchLoggingInfo2, product2, num5, num4, num6, str28, str27, str26, str31, str41, str45, str35, str30, str42, str34, str47, str33, str36, str29, (String) null, str46, str43, str40, str39, str38, str19, str44, str32, str37, str13, jSONObject, l.longValue(), z5, z6, z4, z2, z));
        bundle2.putString("prior_module_name", str27);
        bundle2.putString("shopping_session_id", str23);
        if (r50 != null) {
            bundle2.putString("cta_action_source", r50.toString());
        }
        bundle2.putInt("carousel_ad_index", i);
        return bundle2;
    }
}

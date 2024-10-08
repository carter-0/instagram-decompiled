package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class LSG {
    public static final LSG A00 = new Object();

    public static final BBU A01(Product product) {
        String A002;
        String str;
        String str2;
        0qQ.A0B(product, 0);
        User user = product.A0B;
        String str3 = null;
        if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
            return null;
        }
        String str4 = product.A0H;
        String str5 = product.A0J;
        ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
        ProductAffiliateInformationDict productAffiliateInformationDict = product.A04;
        if (productAffiliateInformationDict != null) {
            str = productAffiliateInformationDict.AaC();
        } else {
            str = null;
        }
        TaggingFeedSessionInformation taggingFeedSessionInformation = product.A00;
        if (taggingFeedSessionInformation != null) {
            str2 = taggingFeedSessionInformation.A01;
            str3 = taggingFeedSessionInformation.A00;
        } else {
            str2 = null;
        }
        return new BBU((C62565Khv) null, productDetailsProductItemDict, str4, A002, str5, str, str2, str3, 128);
    }

    public static final C61062Jw0 A00(ProductCollection productCollection, String str, String str2, 0sn<Product> r6) {
        if (r6 == null) {
            r6 = 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Product A01 : r6) {
            BBU A012 = A01(A01);
            if (A012 != null) {
                A1C.add(A012);
            }
        }
        ProductCollectionImpl productCollectionImpl = null;
        if (productCollection != null) {
            productCollectionImpl = productCollection.FGp((1E6) null);
        }
        return new C61062Jw0(productCollectionImpl, str, str2, (List) A1C);
    }

    public final C61062Jw0 A02(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        List list;
        String str;
        ProductCollection Aoo = clipsShoppingInfoIntf.Aoo();
        if (clipsShoppingInfoIntf.Aoo() == null) {
            list = C17023VEx.A00(clipsShoppingInfoIntf);
        } else {
            list = 0sn.A00;
        }
        if (Aoo != null) {
            str = Aoo.Aoi();
        } else {
            str = null;
        }
        return A00(Aoo, str, (String) null, list);
    }
}

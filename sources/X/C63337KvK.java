package X;

import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;

/* renamed from: X.KvK  reason: case insensitive filesystem */
public abstract class C63337KvK {
    public static void A00(17Z r2, ProductCollectionTagInfo productCollectionTagInfo) {
        r2.A0c();
        String str = productCollectionTagInfo.A01;
        if (str != null) {
            r2.A0R("collection_id", str);
        }
        String str2 = productCollectionTagInfo.A02;
        if (str2 != null) {
            r2.A0R(AnonymousClass000.A00(72), str2);
        }
        String str3 = productCollectionTagInfo.A03;
        if (str3 != null) {
            r2.A0R("untagged_collection_id", str3);
        }
        String str4 = productCollectionTagInfo.A04;
        if (str4 != null) {
            r2.A0R("untagged_collection_type", str4);
        }
        Boolean bool = productCollectionTagInfo.A00;
        if (bool != null) {
            r2.A0S(AnonymousClass000.A00(3414), bool.booleanValue());
        }
        r2.A0Z();
    }
}

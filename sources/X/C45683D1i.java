package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;

/* renamed from: X.D1i  reason: case insensitive filesystem */
public abstract class C45683D1i {
    public static final String A00(FBProductItemDetailsDict fBProductItemDetailsDict) {
        0qQ.A0B(fBProductItemDetailsDict, 0);
        String productId = fBProductItemDetailsDict.getProductId();
        if (productId == null) {
            return "";
        }
        return productId;
    }

    public static final String A01(FBProductItemDetailsDict fBProductItemDetailsDict) {
        if (!0qQ.A0K(fBProductItemDetailsDict.BND(), fBProductItemDetailsDict.C1f())) {
            return fBProductItemDetailsDict.C1g();
        }
        return fBProductItemDetailsDict.BNE();
    }
}

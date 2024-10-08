package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4dG  reason: invalid class name and case insensitive filesystem */
public final class C268364dG implements AnonymousClass1Xn, C268374dH {
    public ProductPivotsButtonImpl A00;
    public C250533lb A01;
    public C16576UxV A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;

    public final C16675UzB B5W() {
        return null;
    }

    public final String C9L() {
        return null;
    }

    public final String A00() {
        C16576UxV uxV = this.A02;
        int ordinal = uxV.ordinal();
        if (ordinal == 0) {
            return "singlebrand_product";
        }
        if (ordinal == 1) {
            return "multibrand_product";
        }
        if (ordinal == 3) {
            return "reconsideration_products";
        }
        if (ordinal == 4) {
            return AnonymousClass000.A00(801);
        }
        if (ordinal == 5) {
            return AnonymousClass000.A00(1349);
        }
        throw new IllegalArgumentException(String.format("Unrecognized Pivot Type %s", new Object[]{uxV.A00}));
    }

    public final String A01() {
        C16576UxV uxV = this.A02;
        int ordinal = uxV.ordinal();
        if (ordinal == 0) {
            return "singlebrand_product";
        }
        if (ordinal == 1) {
            return "multibrand_product";
        }
        if (ordinal == 3) {
            return "reconsideration_products";
        }
        if (ordinal == 4) {
            return AnonymousClass000.A00(801);
        }
        if (ordinal == 2) {
            return "brands_with_products";
        }
        throw new IllegalArgumentException(String.format("Unrecognized Pivot Type %s", new Object[]{uxV.A00}));
    }

    public final X9B Aif() {
        ProductPivotsButtonImpl productPivotsButtonImpl = this.A00;
        if (productPivotsButtonImpl == null) {
            return null;
        }
        return new WZD(productPivotsButtonImpl);
    }

    public final 1UQ B5J() {
        return 1UQ.A0d;
    }

    public final Integer B9V() {
        return this.A03;
    }

    public final C67241sS BJP() {
        return this.A01;
    }

    public final ProductCardSubtitleType Bfz() {
        if (this.A02.ordinal() != 1) {
            return ProductCardSubtitleType.PRICE_WITH_SOLD_OUT;
        }
        return ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    public final ProductFeedResponse Bg7() {
        ArrayList arrayList = new ArrayList();
        List<C45284Ctn> list = this.A0B;
        if (list != null) {
            for (C45284Ctn ctn : list) {
                ProductTile productTile = ctn.A00;
                if (productTile != null) {
                    ? obj = new Object();
                    Integer num = AnonymousClass05K.A0C;
                    obj.A06 = num;
                    obj.A02 = productTile;
                    obj.A06 = num;
                    arrayList.add(obj);
                }
            }
        } else {
            List<ProductDetailsProductItemDict> list2 = this.A0A;
            if (list2 != null) {
                for (ProductDetailsProductItemDict A002 : list2) {
                    arrayList.add(new ProductFeedItem(C14502TxO.A00(A002)));
                }
            } else {
                throw new IllegalStateException("Product Pivots should contain a non null Products or Pivot Items");
            }
        }
        1XQ r0 = new 1XQ();
        r0.A03 = arrayList;
        return r0;
    }

    public final String Bxn() {
        return this.A07;
    }

    public final String Bxr() {
        return this.A08;
    }

    public final String C2K() {
        return this.A02.A00;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A01;
    }

    public final Integer CEl() {
        return this.A04;
    }

    public final boolean Esx(UserSession userSession) {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A09;
    }
}

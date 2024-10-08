package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.VWb  reason: case insensitive filesystem */
public final class C17448VWb {
    public final 1Ln A00;
    public final 1Ln A01;
    public final /* synthetic */ C231112qt A02;

    public /* synthetic */ C17448VWb(ProductFeedItem productFeedItem, C231112qt r7, int i, int i2) {
        String str;
        User user;
        String A002;
        C263944Ny A003;
        boolean A04;
        String str2;
        FBProductItemDetailsDict A012;
        ProductTile productTile = productFeedItem.A02;
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(r7.A01, "instagram_shopping_product_card_impression"), 316);
        if (productTile == null || (A012 = C18768W0o.A01(productTile)) == null) {
            Product A022 = productFeedItem.A02();
            if (A022 != null) {
                str = A022.A0H;
            } else {
                throw new IllegalStateException("product expected");
            }
        } else {
            str = C45683D1i.A00(A012);
        }
        r2.A0Q("product_id", DbV.A0q(str));
        String str3 = null;
        if (productTile == null || C18768W0o.A01(productTile) == null) {
            Product A023 = productFeedItem.A02();
            if (A023 == null || (user = A023.A0B) == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                throw new IllegalStateException("product expected");
            }
            A003 = C263944Ny.A00(A002);
        } else {
            A003 = null;
        }
        r2.A0e(A003);
        if (productTile == null || C18768W0o.A01(productTile) == null) {
            Product A024 = productFeedItem.A02();
            if (A024 != null) {
                A04 = A024.A04();
            } else {
                throw new IllegalStateException("product expected");
            }
        } else {
            A04 = false;
        }
        r2.A0O("is_checkout_enabled", Boolean.valueOf(A04));
        r2.A0R("page_id", C13992Tns.A0H(r2, productTile, C13992Tns.A0I(r2, r7, i, i2)));
        if (productTile == null || C18768W0o.A01(productTile) == null) {
            str2 = null;
        } else {
            str2 = "fb";
        }
        r2.A0R("redirect_app", str2);
        ProductTileBannerMetadataDecoration A013 = W3C.A01(r7.A02, productFeedItem);
        r2.A0R("label", A013 != null ? A013.AfG() : str3);
        String str4 = r7.A05;
        if (str4 != null) {
            r2.A0m(str4);
            r2.A0R("tracking_token", r7.A0E);
        }
        String str5 = r7.A0A;
        if (str5 != null) {
            r2.A0R("product_collection_type", str5);
        }
        C13991Tnr.A19(r2, productTile);
        int i3 = r7.A00;
        if (i3 != -1) {
            r2.A0Q("m_t", Long.valueOf((long) i3));
        }
        if (productTile != null) {
            C13991Tnr.A1A(r2, productTile);
            ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = productTile.A03;
            if (productTileUCILoggingInfoImpl != null) {
                r2.A0N(C18768W0o.A00(productTileUCILoggingInfoImpl), "ranking_data_blob");
            }
            C13992Tns.A0m(r2, productTile);
        }
        C13992Tns.A0o(r2, r7.A03);
        r2.A0O("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
        this.A02 = r7;
        this.A00 = r2;
        this.A01 = r2;
    }
}

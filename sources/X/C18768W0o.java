package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.W0o  reason: case insensitive filesystem */
public abstract class C18768W0o {
    public static final FBProductItemDetailsDict A01(ProductTile productTile) {
        0qQ.A0B(productTile, 0);
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl != null) {
            return productTileProductImpl.A00;
        }
        return null;
    }

    public static final ImageInfo A02(ProductTile productTile) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        ProductImageContainer C6z;
        0qQ.A0B(productTile, 0);
        Product product = productTile.A07;
        if (product != null) {
            return product.A08;
        }
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl == null || (fBProductItemDetailsDict = productTileProductImpl.A00) == null || (C6z = fBProductItemDetailsDict.C6z()) == null) {
            return null;
        }
        return C6z.BGO();
    }

    public static final UGX A00(ProductTileUCILoggingInfo productTileUCILoggingInfo) {
        0bb r3 = new 0bb();
        String CB2 = productTileUCILoggingInfo.CB2();
        String str = "";
        if (CB2 == null) {
            CB2 = str;
        }
        r3.A06("uci_request_id", CB2);
        r3.A05("ranking_unit_id", Long.valueOf(productTileUCILoggingInfo.BjQ()));
        r3.A05("user_id_for_use_in_shops", Long.valueOf(productTileUCILoggingInfo.CCn()));
        String BjL = productTileUCILoggingInfo.BjL();
        if (BjL == null) {
            BjL = str;
        }
        r3.A06("ranking_extra_data", BjL);
        String BjN = productTileUCILoggingInfo.BjN();
        if (BjN == null) {
            BjN = str;
        }
        r3.A06("ranking_request_id", BjN);
        String Bg9 = productTileUCILoggingInfo.Bg9();
        if (Bg9 != null) {
            str = Bg9;
        }
        r3.A06("product_finder_logging_blob", str);
        return r3;
    }

    public static final boolean A03(UserSession userSession, ProductTile productTile) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        C323506xb A00;
        AnonymousClass3ZL dhs;
        AnonymousClass7TG.A1N(productTile, userSession);
        ProductDetailsProductItemDict productDetailsProductItemDict = productTile.A08;
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl != null) {
            fBProductItemDetailsDict = productTileProductImpl.A00;
        } else {
            fBProductItemDetailsDict = null;
        }
        if (productTile.A07 != null && productDetailsProductItemDict != null) {
            A00 = C323496xa.A00(userSession);
            dhs = C14502TxO.A00(productDetailsProductItemDict);
        } else if (fBProductItemDetailsDict == null) {
            return false;
        } else {
            A00 = C323496xa.A00(userSession);
            dhs = new DHS(fBProductItemDetailsDict);
        }
        return A00.A03(dhs);
    }
}

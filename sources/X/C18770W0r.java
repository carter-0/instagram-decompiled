package X;

import android.view.View;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileLabel;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.W0r  reason: case insensitive filesystem */
public abstract class C18770W0r {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (java.lang.Integer.valueOf(r5) == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C18049VkX A01(com.instagram.api.schemas.ProductTileProductNameLabelOptions r5, java.lang.String r6) {
        /*
            r1 = 0
            r0 = 8
            X.Iwc r2 = new X.Iwc
            r2.<init>(r6, r0)
            r0 = 34
            X.Wyw r3 = new X.Wyw
            r3.<init>(r5, r0)
            r0 = 23
            X.GL4 r4 = new X.GL4
            r4.<init>(r1, r0)
            if (r5 == 0) goto L_0x0022
            int r5 = r5.BWx()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r1 = 0
            X.VkX r0 = new X.VkX
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18770W0r.A01(com.instagram.api.schemas.ProductTileProductNameLabelOptions, java.lang.String):X.VkX");
    }

    public static final String A02(ProductTile productTile) {
        ProductTileMetadataImpl productTileMetadataImpl;
        List list;
        ProductTileLabel productTileLabel;
        ProductTileLabelType BKO;
        if (productTile == null || (productTileMetadataImpl = productTile.A01) == null || (list = productTileMetadataImpl.A01) == null || (productTileLabel = (ProductTileLabel) 00k.A0L(list)) == null || (BKO = productTileLabel.BKO()) == null) {
            return null;
        }
        int ordinal = BKO.ordinal();
        if (ordinal == 1) {
            return "add_to_bag";
        }
        if (ordinal == 16) {
            return "webclick";
        }
        return null;
    }

    public static final C18049VkX A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, UserSession userSession, Product product) {
        0sP r2;
        C20785Wyw wyw;
        int i;
        String str;
        C323426xT A00 = C323426xT.A00(userSession);
        if (!(product == null || (str = product.A0H) == null)) {
            UserSession userSession2 = A00.A06;
            0qQ.A0B(userSession2, 0);
            ProductGroup productGroup = (ProductGroup) ((C19290WSy) userSession2.A01(C19290WSy.class, C20670Wx2.A00)).A00.get(str);
            if (productGroup != null) {
                Iterator it = productGroup.A00().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (A00.A08((Product) it.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                r2 = C20763Wya.A00;
                wyw = new C20785Wyw(onClickListener2, 30);
                i = 2131976631;
                return new C18049VkX(String.valueOf(i), r2, C20776Wyn.A00, wyw, 1);
            }
            if (A00.A08(product)) {
                r2 = C20763Wya.A00;
                wyw = new C20785Wyw(onClickListener2, 30);
                i = 2131976631;
                return new C18049VkX(String.valueOf(i), r2, C20776Wyn.A00, wyw, 1);
            }
        }
        r2 = C20764Wyb.A00;
        wyw = new C20785Wyw(onClickListener, 31);
        i = 2131952356;
        return new C18049VkX(String.valueOf(i), r2, C20776Wyn.A00, wyw, 1);
    }

    public static final String A03(ProductTile productTile) {
        User user;
        FBProductItemDetailsDict A01 = C18768W0o.A01(productTile);
        if (A01 != null) {
            String BaI = A01.BaI();
            if (BaI == null) {
                return "";
            }
            return BaI;
        }
        Product product = productTile.A07;
        if (product != null && (user = product.A0B) != null) {
            return user.getUsername();
        }
        throw new IllegalStateException("This ProductFeedItem does not contain a product.");
    }
}

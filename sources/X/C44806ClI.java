package X;

import com.instagram.api.schemas.GuideMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.guides.model.GuideItemAttachment;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ClI  reason: case insensitive filesystem */
public abstract class C44806ClI {
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Cwo] */
    public static C45457Cwo parseFromJson(16F r19) {
        ProductContainer productContainer;
        ProductDetailsProductItemDict productDetailsProductItemDict;
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            ? obj = new Object();
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r2, A0q)) {
                    obj.A02 = AnonymousClass7TG.A0l(r2);
                } else if (C41845B3m.A1E(A0q)) {
                    obj.A03 = AnonymousClass7TG.A0l(r2);
                } else if (C41845B3m.A1Q(A0q)) {
                    obj.A01 = AnonymousClass7TG.A0l(r2);
                } else if ("mixed_media_items".equals(A0q)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            BIR parseFromJson = D1H.parseFromJson(r2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("attachment".equals(A0q)) {
                    obj.A00 = VE7.parseFromJson(r2);
                }
                r2.A0z();
            }
            List list = obj.A04;
            GuideItemAttachment guideItemAttachment = obj.A00;
            if (guideItemAttachment == null || (productContainer = guideItemAttachment.A01) == null || (productDetailsProductItemDict = productContainer.A00) == null || list == null) {
                return obj;
            }
            Product A00 = C14502TxO.A00(productDetailsProductItemDict);
            for (int i = 0; i < list.size(); i++) {
                BIR bir = (BIR) list.get(i);
                if (bir.A00 == GuideMediaType.PRODUCT_IMAGE) {
                    C42046BEz bEz = bir.A01.A00;
                    bEz.getClass();
                    String str = bEz.A02;
                    ProductImageContainer productImageContainer = bEz.A00;
                    String str2 = bEz.A03;
                    String str3 = bEz.A04;
                    ProductDetailsProductItemDict productDetailsProductItemDict2 = A00.A01;
                    ProductDetailsProductItemDict productDetailsProductItemDict3 = null;
                    new 1E9(new 1hu((UserSession) null), 6, false);
                    ProductImageContainerImpl FFc = productImageContainer.FFc();
                    if (productDetailsProductItemDict2 != null) {
                        productDetailsProductItemDict3 = productDetailsProductItemDict2;
                    }
                    C42046BEz bEz2 = new C42046BEz(FFc, productDetailsProductItemDict3, str, str2, str3);
                    BIQ biq = bir.A01;
                    0qQ.A0B(biq, 1);
                    1Xj r22 = biq.A01;
                    new 1E9(new 1hu((UserSession) null), 6, false);
                    BIQ biq2 = new BIQ(bEz2, r22);
                    GuideMediaType guideMediaType = bir.A00;
                    new 1E9(new 1hu((UserSession) null), 6, false);
                    list.add(i, new BIR(guideMediaType, biq2));
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}

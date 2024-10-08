package X;

import android.content.Context;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.Wcz  reason: case insensitive filesystem */
public final class C19636Wcz implements X55 {
    public final /* synthetic */ C15661UgR A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ X54 A03;

    public C19636Wcz(C15661UgR ugR, C307786Rm r2, C276544tV r3, X54 x54) {
        this.A00 = ugR;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = x54;
    }

    public final void D1b(V4S v4s) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        ProductImageContainer C6z;
        ProductImageContainer productImageContainer;
        FBProductItemDetailsDict fBProductItemDetailsDict2;
        C15661UgR ugR = this.A00;
        Context context = this.A01.A00;
        ArrayList arrayList = new ArrayList();
        for (ProductFeedItem productFeedItem : v4s.A00) {
            Product A022 = productFeedItem.A02();
            if (A022 == null || (productImageContainer = A022.A0A) == null) {
                ProductTile productTile = productFeedItem.A02;
                if (productTile != null) {
                    Product product = productTile.A07;
                    if (product != null) {
                        C6z = product.A0A;
                    } else {
                        ProductTileProductImpl productTileProductImpl = productTile.A02;
                        if (!(productTileProductImpl == null || (fBProductItemDetailsDict = productTileProductImpl.A00) == null)) {
                            C6z = fBProductItemDetailsDict.C6z();
                        }
                    }
                    if (C6z != null) {
                        ProductTile productTile2 = productFeedItem.A02;
                        0qQ.A0B(productTile2, 0);
                        Product product2 = productTile2.A07;
                        productImageContainer = null;
                        if (product2 != null) {
                            productImageContainer = product2.A0A;
                        } else {
                            ProductTileProductImpl productTileProductImpl2 = productTile2.A02;
                            if (!(productTileProductImpl2 == null || (fBProductItemDetailsDict2 = productTileProductImpl2.A00) == null)) {
                                productImageContainer = fBProductItemDetailsDict2.C6z();
                            }
                        }
                    }
                }
            }
            arrayList.add(productImageContainer);
        }
        C276544tV r0 = this.A02;
        String A0E = r0.A0E();
        String A0H = r0.A0H();
        String A0E2 = r0.A0E();
        C16671Uz7 uz7 = C16671Uz7.GRID;
        String str = "";
        String A0I = r0.A0I();
        if (A0I != null) {
            str = A0I;
        }
        ugR.A00 = C17094VHq.A00(context, new C19369WWk(str), uz7, this.A03, A0E, A0H, "bloks", "bloks", A0E2, arrayList, 0, 0);
    }
}

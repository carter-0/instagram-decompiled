package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ProductTileLabel;
import com.instagram.api.schemas.ProductTileMetadata;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProduct;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ctn  reason: case insensitive filesystem */
public final class C45284Ctn {
    public ProductTile A00;
    public final DRT A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    public C45284Ctn(DRT drt) {
        FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl;
        0qQ.A0B(drt, 1);
        this.A01 = drt;
        BGO bgo = (BGO) drt;
        DRO dro = bgo.A00;
        if (dro != null) {
            ? obj = new Object();
            BG2 bg2 = (BG2) dro;
            ProductDetailsProductItemDict productDetailsProductItemDict = bg2.A06;
            if (productDetailsProductItemDict != null) {
                obj.A08 = new C17947Vic(productDetailsProductItemDict).A00();
            }
            ProductTileProduct productTileProduct = bg2.A02;
            if (productTileProduct != null) {
                FBProductItemDetailsDict fBProductItemDetailsDict = productTileProduct.AKL().A00;
                if (fBProductItemDetailsDict != null) {
                    fBProductItemDetailsDictImpl = fBProductItemDetailsDict.F2u();
                } else {
                    fBProductItemDetailsDictImpl = null;
                }
                obj.A02 = new ProductTileProductImpl(fBProductItemDetailsDictImpl);
            }
            obj.A00 = bg2.A00;
            ProductTileMetadata productTileMetadata = bg2.A01;
            if (productTileMetadata != null) {
                C45371CvD AKK = productTileMetadata.AKK();
                ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = null;
                1E9 A0p = C41847B3o.A0p();
                ProductTileMetadataDecorations productTileMetadataDecorations = AKK.A00;
                productTileMetadataDecorationsImpl = productTileMetadataDecorations != null ? productTileMetadataDecorations.F83(A0p) : productTileMetadataDecorationsImpl;
                ProductTileMetadataDestination productTileMetadataDestination = AKK.A01;
                List<ProductTileLabel> list = AKK.A02;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (ProductTileLabel F81 : list) {
                    A0r.add(F81.F81());
                }
                obj.A01 = new ProductTileMetadataImpl(productTileMetadataDecorationsImpl, productTileMetadataDestination, A0r);
            }
            obj.A05 = bg2.A05;
            RankingInfo rankingInfo = bg2.A04;
            if (rankingInfo != null) {
                obj.A04 = new RankingInfo(rankingInfo.BkH(), rankingInfo.BnM(), rankingInfo.CGl());
            }
            ProductTileUCILoggingInfo productTileUCILoggingInfo = bg2.A03;
            if (productTileUCILoggingInfo != null) {
                C45415Cvv AKM = productTileUCILoggingInfo.AKM();
                obj.A03 = new ProductTileUCILoggingInfoImpl(AKM.A00, AKM.A02, AKM.A03, AKM.A04, AKM.A05, AKM.A01);
            }
            obj.A01();
            this.A00 = obj;
        }
        ProductDetailsProductItemDict productDetailsProductItemDict2 = bgo.A02;
        if (productDetailsProductItemDict2 != null) {
            this.A00 = new ProductTile(C14502TxO.A00(productDetailsProductItemDict2));
        }
    }
}

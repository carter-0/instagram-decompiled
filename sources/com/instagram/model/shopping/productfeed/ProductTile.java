package com.instagram.model.shopping.productfeed;

import X.0qQ;
import X.1Xj;
import X.1aC;
import X.2PP;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Arrays;

public final class ProductTile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(19);
    public ProductCardSubtitleType A00;
    public ProductTileMetadataImpl A01;
    public ProductTileProductImpl A02;
    public ProductTileUCILoggingInfoImpl A03;
    public RankingInfo A04;
    public 1Xj A05;
    public ProductTileMedia A06;
    public Product A07;
    public ProductDetailsProductItemDict A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductTile productTile = (ProductTile) obj;
        return 2PP.A00(this.A07, productTile.A07) && this.A00 == productTile.A00 && 2PP.A00(this.A05, productTile.A05) && 2PP.A00(this.A02, productTile.A02) && 2PP.A00(this.A04, productTile.A04) && 2PP.A00(this.A03, productTile.A03);
    }

    public final ProductTileMedia A00(UserSession userSession) {
        1Xj r1 = this.A05;
        if (r1 != null && this.A06 == null) {
            User A2A = r1.A2A(userSession);
            String id = this.A05.getId();
            ImageInfo A1p = this.A05.A1p();
            String BTL = this.A05.BTL();
            Boolean valueOf = Boolean.valueOf(A2A.isVerified());
            MerchantCheckoutStyle BRp = A2A.A03.BRp();
            String id2 = A2A.getId();
            this.A06 = new ProductTileMedia(A1p, 1aC.A02(BRp, A2A.A03.BsB(), A2A.Bh3(), (Boolean) null, valueOf, AnonymousClass7TE.A0u(), id2, (String) null, A2A.getUsername()), id, BTL);
        }
        return this.A06;
    }

    public final void A01() {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A08;
        Product product = null;
        if (productDetailsProductItemDict != null) {
            product = new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict);
        }
        this.A07 = product;
        if (this.A00 == ProductCardSubtitleType.UNRECOGNIZED) {
            this.A00 = ProductCardSubtitleType.MERCHANT_NAME;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A00, this.A05, this.A02, this.A04, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeSerializable(this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
    }

    public ProductTile(Product product) {
        0qQ.A0B(product, 0);
        this.A08 = product.A01;
        this.A07 = product;
    }

    public ProductTile() {
    }
}

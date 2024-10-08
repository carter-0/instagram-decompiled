package com.instagram.model.shopping.productfeed;

import X.1Nv;
import X.1Xj;
import X.1aC;
import X.1iI;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C14502TxO;
import X.C18768W0o;
import X.C323496xa;
import X.C45683D1i;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;

public class ProductFeedItem implements 1Nv, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(17);
    public 1Xj A00;
    public MultiProductComponent A01;
    public ProductTile A02;
    public ProductTileMedia A03;
    public ProductDetailsProductItemDict A04;
    public UnavailableProductImpl A05;
    public Integer A06;

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final boolean CcK() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFeedItem)) {
            return false;
        }
        ProductFeedItem productFeedItem = (ProductFeedItem) obj;
        return 2PP.A00(this.A05, productFeedItem.A05) && 2PP.A00(this.A01, productFeedItem.A01) && 2PP.A00(this.A02, productFeedItem.A02) && 2PP.A00(this.A00, productFeedItem.A00) && 2PP.A00(this.A03, productFeedItem.A03);
    }

    public final ImageInfo A00() {
        ProductTile productTile = this.A02;
        if (productTile == null) {
            return null;
        }
        1Xj r0 = productTile.A05;
        if (r0 != null) {
            return r0.A1p();
        }
        return C18768W0o.A02(productTile);
    }

    public final ProductTileMedia A01(UserSession userSession) {
        1Xj r1 = this.A00;
        if (!(r1 == null || this.A03 != null || r1.A1p() == null)) {
            User A2A = this.A00.A2A(userSession);
            A2A.getClass();
            String id = this.A00.getId();
            ImageInfo A1p = this.A00.A1p();
            String BTL = this.A00.BTL();
            Boolean valueOf = Boolean.valueOf(A2A.isVerified());
            MerchantCheckoutStyle BRp = A2A.A03.BRp();
            String id2 = A2A.getId();
            this.A03 = new ProductTileMedia(A1p, 1aC.A02(BRp, A2A.A03.BsB(), A2A.Bh3(), (Boolean) null, valueOf, AnonymousClass7TE.A0u(), id2, (String) null, A2A.getUsername()), id, BTL);
        }
        return this.A03;
    }

    public final Product A02() {
        ProductTile productTile = this.A02;
        if (productTile != null) {
            return productTile.A07;
        }
        return null;
    }

    public final String A03() {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        ProductTile productTile = this.A02;
        if (productTile == null) {
            return null;
        }
        Product product = productTile.A07;
        if (product != null) {
            return product.A0J;
        }
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl == null || (fBProductItemDetailsDict = productTileProductImpl.A00) == null) {
            return null;
        }
        return fBProductItemDetailsDict.BgN();
    }

    public final void A04() {
        Integer num;
        boolean z;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A04;
        if (productDetailsProductItemDict != null) {
            this.A02 = new ProductTile(C14502TxO.A00(productDetailsProductItemDict));
            this.A06 = AnonymousClass05K.A0C;
            this.A04 = null;
        } else {
            if (this.A05 != null) {
                num = AnonymousClass05K.A01;
            } else if (this.A01 != null) {
                num = AnonymousClass05K.A00;
            } else if (this.A02 != null) {
                num = AnonymousClass05K.A0C;
            } else if (this.A00 == null && this.A03 == null) {
                throw new IllegalStateException("There must be a non null feed item field");
            } else {
                num = AnonymousClass05K.A0N;
            }
            this.A06 = num;
        }
        ProductTile productTile = this.A02;
        if (productTile != null && C18768W0o.A02(productTile) != null) {
            ImageInfo A022 = C18768W0o.A02(this.A02);
            String id = getId();
            Integer num2 = AnonymousClass05K.A0C;
            Integer num3 = AnonymousClass05K.A00;
            1Xj r0 = this.A00;
            if (r0 != null) {
                z = r0.CeS();
            } else {
                z = false;
            }
            1iI.A07(new PPRLoggingData(num2, num3, id, false, false, z), A022, false);
        }
    }

    public final boolean A05(UserSession userSession) {
        ProductTile productTile = this.A02;
        if (productTile != null) {
            return C18768W0o.A03(userSession, productTile);
        }
        if (this.A04 != null) {
            return C323496xa.A00(userSession).A03(C14502TxO.A00(this.A04));
        }
        1Xj r0 = this.A00;
        if (r0 != null) {
            return r0.CbC();
        }
        return false;
    }

    public final String getId() {
        String str;
        UnavailableProductImpl unavailableProductImpl = this.A05;
        if (unavailableProductImpl != null) {
            return unavailableProductImpl.A01;
        }
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent != null) {
            return multiProductComponent.A06;
        }
        ProductTile productTile = this.A02;
        if (productTile != null) {
            Product product = productTile.A07;
            FBProductItemDetailsDict fBProductItemDetailsDict = null;
            if (product != null) {
                str = product.A0H;
            } else {
                str = null;
            }
            ProductTileProductImpl productTileProductImpl = productTile.A02;
            if (productTileProductImpl != null) {
                fBProductItemDetailsDict = productTileProductImpl.A00;
            }
            if (str != null) {
                return str;
            }
            if (fBProductItemDetailsDict != null) {
                return C45683D1i.A00(fBProductItemDetailsDict);
            }
            throw new IllegalStateException("There must be a non null feed item field");
        }
        1Xj r0 = this.A00;
        if (r0 != null) {
            return r0.getId();
        }
        ProductTileMedia productTileMedia = this.A03;
        if (productTileMedia != null) {
            return productTileMedia.A02;
        }
        throw new IllegalStateException("There must be a non null feed item field");
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
    }

    public ProductFeedItem(Product product) {
        Integer num = AnonymousClass05K.A0C;
        this.A06 = num;
        this.A02 = new ProductTile(product);
        this.A06 = num;
    }

    public ProductFeedItem() {
        this.A06 = AnonymousClass05K.A0C;
    }
}

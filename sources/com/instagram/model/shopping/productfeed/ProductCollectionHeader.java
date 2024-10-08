package com.instagram.model.shopping.productfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import java.util.ArrayList;
import java.util.Iterator;

public final class ProductCollectionHeader extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(15);
    public ProductCollectionCoverImpl A00;
    public ProductCollectionDropsMetadataImpl A01;
    public String A02;
    public String A03;
    public String A04;
    public ArrayList A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionHeader) {
                ProductCollectionHeader productCollectionHeader = (ProductCollectionHeader) obj;
                if (!0qQ.A0K(this.A00, productCollectionHeader.A00) || !0qQ.A0K(this.A04, productCollectionHeader.A04) || !0qQ.A0K(this.A05, productCollectionHeader.A05) || !0qQ.A0K(this.A03, productCollectionHeader.A03) || !0qQ.A0K(this.A02, productCollectionHeader.A02) || !0qQ.A0K(this.A01, productCollectionHeader.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        ArrayList arrayList = this.A05;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C41847B3o.A1I(parcel, it, i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public ProductCollectionHeader(ProductCollectionCoverImpl productCollectionCoverImpl, ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl, String str, String str2, String str3, ArrayList arrayList) {
        AnonymousClass7TG.A1U(productCollectionCoverImpl, str, arrayList);
        this.A00 = productCollectionCoverImpl;
        this.A04 = str;
        this.A05 = arrayList;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = productCollectionDropsMetadataImpl;
    }

    public ProductCollectionHeader() {
        this(new ProductCollectionCoverImpl((ProductImageContainer) null, (IgShowreelNativeAnimation) null), (ProductCollectionDropsMetadataImpl) null, "", (String) null, (String) null, AnonymousClass7TE.A1C());
    }
}

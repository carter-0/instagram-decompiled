package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.CnQ;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;

public final class ProductCollectionLink extends AnonymousClass0T0 implements ProductCollectionLinkIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(27);
    public final MultiProductComponentDestinationType A00;
    public final ShoppingDestinationMetadata A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ProductCollectionLink(MultiProductComponentDestinationType multiProductComponentDestinationType, ShoppingDestinationMetadata shoppingDestinationMetadata, String str, String str2, String str3, String str4) {
        0qQ.A0B(multiProductComponentDestinationType, 6);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = shoppingDestinationMetadata;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = multiProductComponentDestinationType;
    }

    public final ProductCollectionLink FFg() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionLink) {
                ProductCollectionLink productCollectionLink = (ProductCollectionLink) obj;
                if (!0qQ.A0K(this.A02, productCollectionLink.A02) || !0qQ.A0K(this.A03, productCollectionLink.A03) || !0qQ.A0K(this.A01, productCollectionLink.A01) || !0qQ.A0K(this.A04, productCollectionLink.A04) || !0qQ.A0K(this.A05, productCollectionLink.A05) || this.A00 != productCollectionLink.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShoppingDestinationMetadata shoppingDestinationMetadata = this.A01;
        int hashCode3 = (hashCode2 + (shoppingDestinationMetadata == null ? 0 : shoppingDestinationMetadata.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        ShoppingDestinationMetadata shoppingDestinationMetadata = this.A01;
        if (shoppingDestinationMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shoppingDestinationMetadata.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    public final String Air() {
        return this.A02;
    }

    public final String Awd() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ ShoppingDestinationMetadataIntf Awe() {
        return this.A01;
    }

    public final String Awf() {
        return this.A04;
    }

    public final String Awg() {
        return this.A05;
    }

    public final MultiProductComponentDestinationType Awh() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMultiProductComponentDestination", CnQ.A00(this));
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C44338CdK;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class SellerBadgeDict extends AnonymousClass0T0 implements Parcelable, SellerBadgeDictIntf {
    public static final Parcelable.Creator CREATOR = new DE6(72);
    public final SellerBadgeType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final SellerBadgeDict F8u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerBadgeDict) {
                SellerBadgeDict sellerBadgeDict = (SellerBadgeDict) obj;
                if (!0qQ.A0K(this.A01, sellerBadgeDict.A01) || !0qQ.A0K(this.A02, sellerBadgeDict.A02) || !0qQ.A0K(this.A03, sellerBadgeDict.A03) || this.A00 != sellerBadgeDict.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A03;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SellerBadgeType sellerBadgeType = this.A00;
        if (sellerBadgeType != null) {
            i = sellerBadgeType.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List<Parcelable> list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final List C3O() {
        return this.A03;
    }

    public final SellerBadgeType CAT() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSellerBadgeDict", C44338CdK.A00(this));
    }

    public final String getDescription() {
        return this.A01;
    }

    public final String getName() {
        return this.A02;
    }

    public SellerBadgeDict(SellerBadgeType sellerBadgeType, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = sellerBadgeType;
    }
}

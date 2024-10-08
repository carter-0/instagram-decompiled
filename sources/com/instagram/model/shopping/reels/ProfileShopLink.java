package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C44938CnY;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SellerShoppableFeedType;

public final class ProfileShopLink extends AnonymousClass0T0 implements Parcelable, ProfileShopLinkIntf {
    public static final Parcelable.Creator CREATOR = new LVO(31);
    public final SellerShoppableFeedType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final ProfileShopLink FFo() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileShopLink) {
                ProfileShopLink profileShopLink = (ProfileShopLink) obj;
                if (!0qQ.A0K(this.A01, profileShopLink.A01) || !0qQ.A0K(this.A02, profileShopLink.A02) || !0qQ.A0K(this.A03, profileShopLink.A03) || this.A00 != profileShopLink.A00) {
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
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SellerShoppableFeedType sellerShoppableFeedType = this.A00;
        if (sellerShoppableFeedType != null) {
            i = sellerShoppableFeedType.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final String BhD() {
        return this.A01;
    }

    public final String BhF() {
        return this.A02;
    }

    public final String BhG() {
        return this.A03;
    }

    public final SellerShoppableFeedType BsB() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAProfileShopLink", C44938CnY.A00(this));
    }

    public ProfileShopLink(SellerShoppableFeedType sellerShoppableFeedType, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = sellerShoppableFeedType;
    }
}

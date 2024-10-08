package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class SellerIncentiveBannerBottomSheetContent extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(6);
    public final String A00;
    public final String A01;
    public final String A02;

    public SellerIncentiveBannerBottomSheetContent(String str, String str2, String str3) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBannerBottomSheetContent) {
                SellerIncentiveBannerBottomSheetContent sellerIncentiveBannerBottomSheetContent = (SellerIncentiveBannerBottomSheetContent) obj;
                if (!0qQ.A0K(this.A00, sellerIncentiveBannerBottomSheetContent.A00) || !0qQ.A0K(this.A01, sellerIncentiveBannerBottomSheetContent.A01) || !0qQ.A0K(this.A02, sellerIncentiveBannerBottomSheetContent.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A02);
    }
}

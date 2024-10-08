package com.instagram.model.shopping.incentives.igfunded;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C51972G9s;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class SellerIncentiveBanner extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(5);
    public final String A00;
    public final List A01;
    public final long A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBanner) {
                SellerIncentiveBanner sellerIncentiveBanner = (SellerIncentiveBanner) obj;
                if (!0qQ.A0K(this.A05, sellerIncentiveBanner.A05) || !0qQ.A0K(this.A01, sellerIncentiveBanner.A01) || !0qQ.A0K(this.A03, sellerIncentiveBanner.A03) || this.A02 != sellerIncentiveBanner.A02 || !0qQ.A0K(this.A04, sellerIncentiveBanner.A04) || !0qQ.A0K(this.A00, sellerIncentiveBanner.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A1F = C41848B3p.A1F(parcel, list);
            while (A1F.hasNext()) {
                ((SellerIncentiveBannerBottomSheetContent) A1F.next()).writeToParcel(parcel, i);
            }
        }
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        parcel.writeLong(this.A02);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return ((C51972G9s.A07(this.A02, ((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C41845B3m.A00(this.A00);
    }

    public SellerIncentiveBanner(Integer num, Integer num2, String str, String str2, List list, long j) {
        this.A05 = str;
        this.A01 = list;
        this.A03 = num;
        this.A02 = j;
        this.A04 = num2;
        this.A00 = str2;
    }
}

package com.instagram.model.shopping.incentives.igfunded;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IgFundedIncentiveBannerIconType implements Parcelable {
    UNRECOGNIZED("IgFundedIncentiveBannerIconType_unspecified"),
    GIFT_CARD("gift_card");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IgFundedIncentiveBannerIconType[] igFundedIncentiveBannerIconTypeArr;
        A02 = 0oU.A00(igFundedIncentiveBannerIconTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType : values()) {
            A0x.put(igFundedIncentiveBannerIconType.A00, igFundedIncentiveBannerIconType);
        }
        A01 = A0x;
        CREATOR = LVO.A00(1);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgFundedIncentiveBannerIconType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}

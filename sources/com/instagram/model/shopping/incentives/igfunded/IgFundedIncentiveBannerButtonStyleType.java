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

public enum IgFundedIncentiveBannerButtonStyleType implements Parcelable {
    UNRECOGNIZED("IgFundedIncentiveBannerButtonStyleType_unspecified"),
    TAPPABLE_TEXT("label_text"),
    PRIMARY("primary_button");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IgFundedIncentiveBannerButtonStyleType[] igFundedIncentiveBannerButtonStyleTypeArr;
        A02 = 0oU.A00(igFundedIncentiveBannerButtonStyleTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType : values()) {
            A0x.put(igFundedIncentiveBannerButtonStyleType.A00, igFundedIncentiveBannerButtonStyleType);
        }
        A01 = A0x;
        CREATOR = LVO.A00(0);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgFundedIncentiveBannerButtonStyleType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}

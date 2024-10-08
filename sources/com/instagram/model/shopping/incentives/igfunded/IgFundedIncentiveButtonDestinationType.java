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

public enum IgFundedIncentiveButtonDestinationType implements Parcelable {
    UNRECOGNIZED("IgFundedIncentiveButtonDestinationType_unspecified"),
    CHECKOUT_HOME("checkout_home");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IgFundedIncentiveButtonDestinationType[] igFundedIncentiveButtonDestinationTypeArr;
        A02 = 0oU.A00(igFundedIncentiveButtonDestinationTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType : values()) {
            A0x.put(igFundedIncentiveButtonDestinationType.A00, igFundedIncentiveButtonDestinationType);
        }
        A01 = A0x;
        CREATOR = LVO.A00(2);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IgFundedIncentiveButtonDestinationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}

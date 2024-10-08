package com.instagram.business.promote.model;

import X.0oU;
import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum SpecialRequirementCategory implements Parcelable {
    A07(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    A04("CREDIT", "CREDIT"),
    A05("EMPLOYMENT", "EMPLOYMENT"),
    A06("HOUSING", "HOUSING"),
    A08("POLITICAL", "ISSUES_ELECTIONS_POLITICS");
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
    }

    /* access modifiers changed from: public */
    static {
        SpecialRequirementCategory[] specialRequirementCategoryArr;
        A02 = 0oU.A00(specialRequirementCategoryArr);
        CREATOR = new W6D(57);
    }

    public final String toString() {
        return this.A01;
    }

    /* access modifiers changed from: public */
    SpecialRequirementCategory(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}

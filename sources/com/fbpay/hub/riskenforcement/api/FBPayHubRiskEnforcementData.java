package com.fbpay.hub.riskenforcement.api;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class FBPayHubRiskEnforcementData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(33);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayHubRiskEnforcementData) {
                FBPayHubRiskEnforcementData fBPayHubRiskEnforcementData = (FBPayHubRiskEnforcementData) obj;
                if (this.A00 != fBPayHubRiskEnforcementData.A00 || this.A01 != fBPayHubRiskEnforcementData.A01 || !0qQ.A0K(this.A02, fBPayHubRiskEnforcementData.A02) || !0qQ.A0K(this.A03, fBPayHubRiskEnforcementData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int intValue;
        Integer num = this.A00;
        int i = -1;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i2 = intValue + 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.intValue();
        }
        return (((((i2 * 31) + i) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        Pxj.A1B(parcel, this.A02, 0, 1);
        Pxj.A1B(parcel, this.A03, 0, 1);
    }

    public FBPayHubRiskEnforcementData(Parcel parcel) {
        String str = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = Pxi.A0S(parcel, 5);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Pxi.A0S(parcel, 7);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = Pxi.A0e(parcel);
    }
}

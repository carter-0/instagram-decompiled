package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IabAdCreativeOptimizationConfigByType extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(4);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IabAdCreativeOptimizationConfigByType) {
                IabAdCreativeOptimizationConfigByType iabAdCreativeOptimizationConfigByType = (IabAdCreativeOptimizationConfigByType) obj;
                if (!0qQ.A0K(this.A00, iabAdCreativeOptimizationConfigByType.A00) || !0qQ.A0K(this.A01, iabAdCreativeOptimizationConfigByType.A01)) {
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
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public IabAdCreativeOptimizationConfigByType(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}

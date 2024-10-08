package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C51965G9l;
import X.DbS;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class NonDiscInfo extends AnonymousClass0T0 implements Parcelable, NonDiscInfoIntf {
    public static final Parcelable.Creator CREATOR = new FK5(93);
    public final boolean A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NonDiscInfo) {
                NonDiscInfo nonDiscInfo = (NonDiscInfo) obj;
                if (!(this.A00 == nonDiscInfo.A00 && this.A01 == nonDiscInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A01, C51965G9l.A05(this.A00));
    }

    public NonDiscInfo(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}

package com.instagram.leadgen.core.model.disclaimer;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class LeadGenCustomDisclaimerBodyUrlRanges extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(94);
    public final int A00;
    public final int A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerBodyUrlRanges) {
                LeadGenCustomDisclaimerBodyUrlRanges leadGenCustomDisclaimerBodyUrlRanges = (LeadGenCustomDisclaimerBodyUrlRanges) obj;
                if (!(this.A01 == leadGenCustomDisclaimerBodyUrlRanges.A01 && this.A00 == leadGenCustomDisclaimerBodyUrlRanges.A00 && 0qQ.A0K(this.A02, leadGenCustomDisclaimerBodyUrlRanges.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public LeadGenCustomDisclaimerBodyUrlRanges(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}

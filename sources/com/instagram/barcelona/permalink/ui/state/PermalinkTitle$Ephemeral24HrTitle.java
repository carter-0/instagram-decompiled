package com.instagram.barcelona.permalink.ui.state;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DQY;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class PermalinkTitle$Ephemeral24HrTitle extends AnonymousClass0T0 implements Parcelable, DQY {
    public static final Parcelable.Creator CREATOR = FK6.A00(89);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PermalinkTitle$Ephemeral24HrTitle) && this.A00 == ((PermalinkTitle$Ephemeral24HrTitle) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final int getIndex() {
        return this.A00;
    }

    public PermalinkTitle$Ephemeral24HrTitle(int i) {
        this.A00 = i;
    }
}

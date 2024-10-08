package com.instagram.barcelona.permalink.ui.state;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DQY;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class PermalinkTitle$CountdownTitle extends AnonymousClass0T0 implements Parcelable, DQY {
    public static final Parcelable.Creator CREATOR = FK6.A00(88);
    public final int A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermalinkTitle$CountdownTitle) {
                PermalinkTitle$CountdownTitle permalinkTitle$CountdownTitle = (PermalinkTitle$CountdownTitle) obj;
                if (!(this.A00 == permalinkTitle$CountdownTitle.A00 && this.A01 == permalinkTitle$CountdownTitle.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }

    public final int getIndex() {
        return this.A00;
    }

    public final int hashCode() {
        long j = this.A01;
        return (this.A00 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public PermalinkTitle$CountdownTitle(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}

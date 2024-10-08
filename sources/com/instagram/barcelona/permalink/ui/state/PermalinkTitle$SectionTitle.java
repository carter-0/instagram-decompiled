package com.instagram.barcelona.permalink.ui.state;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.DQY;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class PermalinkTitle$SectionTitle extends AnonymousClass0T0 implements Parcelable, DQY {
    public static final Parcelable.Creator CREATOR = FK6.A00(90);
    public final int A00;
    public final String A01;

    public PermalinkTitle$SectionTitle(int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermalinkTitle$SectionTitle) {
                PermalinkTitle$SectionTitle permalinkTitle$SectionTitle = (PermalinkTitle$SectionTitle) obj;
                if (this.A00 != permalinkTitle$SectionTitle.A00 || !0qQ.A0K(this.A01, permalinkTitle$SectionTitle.A01)) {
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
        parcel.writeString(this.A01);
    }

    public final int getIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }
}

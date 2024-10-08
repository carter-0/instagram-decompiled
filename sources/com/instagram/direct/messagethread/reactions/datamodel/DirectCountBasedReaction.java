package com.instagram.direct.messagethread.reactions.datamodel;

import X.0qQ;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class DirectCountBasedReaction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(92);
    public int A00;
    public String A01;
    public boolean A02;

    public DirectCountBasedReaction(String str, int i, boolean z) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectCountBasedReaction)) {
            return false;
        }
        DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) obj;
        return 0qQ.A0K(this.A01, directCountBasedReaction.A01) && this.A00 == directCountBasedReaction.A00 && this.A02 == directCountBasedReaction.A02;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }
}

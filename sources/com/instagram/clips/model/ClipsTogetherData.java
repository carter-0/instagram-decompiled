package com.instagram.clips.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClipsTogetherData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(73);
    public final String A00;
    public final boolean A01;

    public ClipsTogetherData(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTogetherData) {
                ClipsTogetherData clipsTogetherData = (ClipsTogetherData) obj;
                if (!0qQ.A0K(this.A00, clipsTogetherData.A00) || this.A01 != clipsTogetherData.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0m("ClipsTogetherData(threadId=", this.A00, ", isInitiator=", ')', this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}

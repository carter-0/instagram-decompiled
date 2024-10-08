package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class VisualSearchSuggestedProductContainer extends AnonymousClass0T0 implements Parcelable, VisualSearchSuggestedProductContainerIntf {
    public static final Parcelable.Creator CREATOR = new FK6(60);
    public final long A00;
    public final long A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualSearchSuggestedProductContainer) {
                VisualSearchSuggestedProductContainer visualSearchSuggestedProductContainer = (VisualSearchSuggestedProductContainer) obj;
                if (!(this.A00 == visualSearchSuggestedProductContainer.A00 && this.A01 == visualSearchSuggestedProductContainer.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public VisualSearchSuggestedProductContainer(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}

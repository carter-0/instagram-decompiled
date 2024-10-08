package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABWatchAndBrowseWebToWAExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(3);
    public final MessagingExtensionType A00;

    public IABWatchAndBrowseWebToWAExtension(MessagingExtensionType messagingExtensionType) {
        0qQ.A0B(messagingExtensionType, 1);
        this.A00 = messagingExtensionType;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABWatchAndBrowseWebToWAExtension) && this.A00 == ((IABWatchAndBrowseWebToWAExtension) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class OpenInspirationHubCommandImpl extends AnonymousClass0T0 implements Parcelable, OpenInspirationHubCommand {
    public static final Parcelable.Creator CREATOR = DE6.A00(0);
    public final XDTCreatorInspirationHubType A00;

    public final OpenInspirationHubCommandImpl F79() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenInspirationHubCommandImpl) && this.A00 == ((OpenInspirationHubCommandImpl) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final XDTCreatorInspirationHubType C4R() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public OpenInspirationHubCommandImpl(XDTCreatorInspirationHubType xDTCreatorInspirationHubType) {
        this.A00 = xDTCreatorInspirationHubType;
    }
}

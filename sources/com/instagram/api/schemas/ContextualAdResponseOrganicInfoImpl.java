package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContextualAdResponseOrganicInfoImpl extends AnonymousClass0T0 implements Parcelable, ContextualAdResponseOrganicInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(27);
    public final String A00;
    public final String A01;

    public final ContextualAdResponseOrganicInfoImpl F26() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualAdResponseOrganicInfoImpl) {
                ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl = (ContextualAdResponseOrganicInfoImpl) obj;
                if (!0qQ.A0K(this.A00, contextualAdResponseOrganicInfoImpl.A00) || !0qQ.A0K(this.A01, contextualAdResponseOrganicInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public ContextualAdResponseOrganicInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}

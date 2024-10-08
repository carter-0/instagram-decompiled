package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContextualAdResponseExtrasImpl extends AnonymousClass0T0 implements Parcelable, ContextualAdResponseExtras {
    public static final Parcelable.Creator CREATOR = new DE7(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final ContextualAdResponseExtrasImpl F25() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualAdResponseExtrasImpl) {
                ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = (ContextualAdResponseExtrasImpl) obj;
                if (!0qQ.A0K(this.A00, contextualAdResponseExtrasImpl.A00) || !0qQ.A0K(this.A01, contextualAdResponseExtrasImpl.A01) || !0qQ.A0K(this.A02, contextualAdResponseExtrasImpl.A02) || !0qQ.A0K(this.A03, contextualAdResponseExtrasImpl.A03)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public ContextualAdResponseExtrasImpl(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}

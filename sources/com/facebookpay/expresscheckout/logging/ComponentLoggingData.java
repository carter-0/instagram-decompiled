package com.facebookpay.expresscheckout.logging;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

public final class ComponentLoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(26);
    public final String A00;
    public final String A01;
    public final ImmutableMap A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComponentLoggingData) {
                ComponentLoggingData componentLoggingData = (ComponentLoggingData) obj;
                if (!0qQ.A0K(this.A00, componentLoggingData.A00) || !0qQ.A0K(this.A01, componentLoggingData.A01) || !0qQ.A0K(this.A02, componentLoggingData.A02)) {
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
        parcel.writeSerializable(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)) + AnonymousClass7TG.A0C(this.A02);
    }

    public ComponentLoggingData(ImmutableMap immutableMap, String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = immutableMap;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ComponentLoggingData(contextComponentName=");
        A1A.append(this.A00);
        A1A.append(", targetName=");
        A1A.append(this.A01);
        A1A.append(", extraPayload=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}

package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51975G9x;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class DisclaimerText extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(19);
    public final int A00;
    public final int A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerText) {
                DisclaimerText disclaimerText = (DisclaimerText) obj;
                if (!(0qQ.A0K(this.A02, disclaimerText.A02) && this.A00 == disclaimerText.A00 && this.A01 == disclaimerText.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public DisclaimerText(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DisclaimerText(text=");
        A1A.append(this.A02);
        A1A.append(", ctaBegin=");
        A1A.append(this.A00);
        A1A.append(", ctaEnd=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}

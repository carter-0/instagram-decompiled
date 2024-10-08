package com.instagram.aistudio.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class UtmMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(15);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UtmMetadata) {
                UtmMetadata utmMetadata = (UtmMetadata) obj;
                if (!0qQ.A0K(this.A03, utmMetadata.A03) || !0qQ.A0K(this.A02, utmMetadata.A02) || !0qQ.A0K(this.A00, utmMetadata.A00) || !0qQ.A0K(this.A01, utmMetadata.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("UtmMetadata(source=", this.A03, ", medium=", this.A02, ", campaign=", this.A00, ", content=", this.A01, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public UtmMetadata(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }

    public UtmMetadata() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}

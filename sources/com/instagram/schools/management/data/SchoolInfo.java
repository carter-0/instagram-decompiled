package com.instagram.schools.management.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class SchoolInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(24);
    public final SchoolAddress A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SchoolInfo) {
                SchoolInfo schoolInfo = (SchoolInfo) obj;
                if (!0qQ.A0K(this.A02, schoolInfo.A02) || !0qQ.A0K(this.A01, schoolInfo.A01) || !0qQ.A0K(this.A00, schoolInfo.A00)) {
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
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }

    public SchoolInfo(SchoolAddress schoolAddress, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, schoolAddress);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = schoolAddress;
    }
}

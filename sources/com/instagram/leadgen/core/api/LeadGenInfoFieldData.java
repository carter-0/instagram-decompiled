package com.instagram.leadgen.core.api;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class LeadGenInfoFieldData extends AnonymousClass0T0 implements Parcelable, LeadGenInfoFieldDataIntf {
    public static final Parcelable.Creator CREATOR = new W6E(83);
    public final String A00;
    public final List A01;
    public final boolean A02;

    public LeadGenInfoFieldData(String str, List list, boolean z) {
        0qQ.A0B(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    public final LeadGenInfoFieldData FER() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenInfoFieldData) {
                LeadGenInfoFieldData leadGenInfoFieldData = (LeadGenInfoFieldData) obj;
                if (this.A02 != leadGenInfoFieldData.A02 || !0qQ.A0K(this.A00, leadGenInfoFieldData.A00) || !0qQ.A0K(this.A01, leadGenInfoFieldData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A00, C51965G9l.A05(this.A02)) + AnonymousClass7TG.A0C(this.A01);
    }
}

package com.instagram.leadgen.core.model.disclaimer;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class LeadGenCustomDisclaimerCheckbox extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(95);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public LeadGenCustomDisclaimerCheckbox(String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerCheckbox) {
                LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox = (LeadGenCustomDisclaimerCheckbox) obj;
                if (!0qQ.A0K(this.A01, leadGenCustomDisclaimerCheckbox.A01) || !0qQ.A0K(this.A00, leadGenCustomDisclaimerCheckbox.A00) || this.A02 != leadGenCustomDisclaimerCheckbox.A02 || this.A03 != leadGenCustomDisclaimerCheckbox.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A00, AnonymousClass7TG.A0E(this.A01) * 31)));
    }
}

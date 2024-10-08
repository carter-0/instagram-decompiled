package com.instagram.leadgen.core.model.disclaimer;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class LeadGenCustomDisclaimerBody extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(93);
    public final String A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerBody) {
                LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = (LeadGenCustomDisclaimerBody) obj;
                if (!0qQ.A0K(this.A00, leadGenCustomDisclaimerBody.A00) || !0qQ.A0K(this.A01, leadGenCustomDisclaimerBody.A01)) {
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
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            ((LeadGenCustomDisclaimerBodyUrlRanges) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }

    public LeadGenCustomDisclaimerBody(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}

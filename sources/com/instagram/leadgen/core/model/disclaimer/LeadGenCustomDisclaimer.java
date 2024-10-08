package com.instagram.leadgen.core.model.disclaimer;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class LeadGenCustomDisclaimer extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(92);
    public final LeadGenCustomDisclaimerBody A00;
    public final String A01;
    public final List A02;

    public LeadGenCustomDisclaimer(LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody, String str, List list) {
        0qQ.A0B(leadGenCustomDisclaimerBody, 2);
        this.A01 = str;
        this.A00 = leadGenCustomDisclaimerBody;
        this.A02 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimer) {
                LeadGenCustomDisclaimer leadGenCustomDisclaimer = (LeadGenCustomDisclaimer) obj;
                if (!0qQ.A0K(this.A01, leadGenCustomDisclaimer.A01) || !0qQ.A0K(this.A00, leadGenCustomDisclaimer.A00) || !0qQ.A0K(this.A02, leadGenCustomDisclaimer.A02)) {
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
        this.A00.writeToParcel(parcel, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            ((LeadGenCustomDisclaimerCheckbox) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0E(this.A01) * 31));
    }
}

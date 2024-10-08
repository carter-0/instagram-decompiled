package com.facebookpay.confirmation.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ECPConfirmationUpsellSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(25);
    public final String A00;
    public final List A01;

    public ECPConfirmationUpsellSection(String str, List list) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellSection) {
                ECPConfirmationUpsellSection eCPConfirmationUpsellSection = (ECPConfirmationUpsellSection) obj;
                if (!0qQ.A0K(this.A00, eCPConfirmationUpsellSection.A00) || !0qQ.A0K(this.A01, eCPConfirmationUpsellSection.A01)) {
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
            ((ECPConfirmationUpsellAction) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPConfirmationUpsellSection(upsellSectionTitle=");
        A1A.append(this.A00);
        A1A.append(", upsellActions=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}

package com.facebookpay.confirmation.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.C51975G9x;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPConfirmationUpsellAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(24);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellAction) {
                ECPConfirmationUpsellAction eCPConfirmationUpsellAction = (ECPConfirmationUpsellAction) obj;
                if (!0qQ.A0K(this.A04, eCPConfirmationUpsellAction.A04) || !0qQ.A0K(this.A00, eCPConfirmationUpsellAction.A00) || !0qQ.A0K(this.A01, eCPConfirmationUpsellAction.A01) || !0qQ.A0K(this.A03, eCPConfirmationUpsellAction.A03) || !0qQ.A0K(this.A02, eCPConfirmationUpsellAction.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A04)))) + AnonymousClass7TG.A0E(this.A02);
    }

    public ECPConfirmationUpsellAction(String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPConfirmationUpsellAction(type=");
        A1A.append(this.A04);
        A1A.append(", actionType=");
        A1A.append(this.A00);
        A1A.append(", iconName=");
        A1A.append(this.A01);
        A1A.append(", title=");
        A1A.append(this.A03);
        A1A.append(", linkUrl=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}

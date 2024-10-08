package com.facebookpay.confirmation.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPConfirmationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(23);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ECPConfirmationParams(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass7TG.A0w(1, str, str3, str4);
        0qQ.A0B(str6, 7);
        this.A03 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationParams) {
                ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
                if (!0qQ.A0K(this.A03, eCPConfirmationParams.A03) || !0qQ.A0K(this.A02, eCPConfirmationParams.A02) || !0qQ.A0K(this.A05, eCPConfirmationParams.A05) || !0qQ.A0K(this.A04, eCPConfirmationParams.A04) || !0qQ.A0K(this.A06, eCPConfirmationParams.A06) || !0qQ.A0K(this.A00, eCPConfirmationParams.A00) || !0qQ.A0K(this.A01, eCPConfirmationParams.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        ECPConfirmationUpsellSection eCPConfirmationUpsellSection = this.A00;
        if (eCPConfirmationUpsellSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPConfirmationUpsellSection.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0E(this.A02)) * 31);
        return C41845B3m.A01(this.A01, (((AnonymousClass7TF.A08(this.A04, A08) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPConfirmationParams(paymentSectionTitle=");
        A1A.append(this.A03);
        A1A.append(", paymentSectionSubtitle=");
        A1A.append(this.A02);
        A1A.append(", seeReceiptTitle=");
        A1A.append(this.A05);
        A1A.append(", seeReceiptLinkUrl=");
        A1A.append(this.A04);
        A1A.append(", upsellPINTitle=");
        A1A.append(this.A06);
        A1A.append(", upsellSection=");
        A1A.append(this.A00);
        A1A.append(", ctaType=");
        return C51975G9x.A0i(this.A01, A1A);
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C51973G9u;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class AudienceValidationResponse extends AnonymousClass0T0 implements Parcelable, AudienceValidationResponseIntf {
    public static final Parcelable.Creator CREATOR = new SWT(49);
    public final AudienceValidationResponseStatus A00;
    public final BoostedComponentMessageType A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public AudienceValidationResponse(AudienceValidationResponseStatus audienceValidationResponseStatus, BoostedComponentMessageType boostedComponentMessageType, String str, String str2, List list, List list2) {
        C51973G9u.A0r(2, str, boostedComponentMessageType, audienceValidationResponseStatus);
        this.A04 = list;
        this.A02 = str;
        this.A05 = list2;
        this.A01 = boostedComponentMessageType;
        this.A00 = audienceValidationResponseStatus;
        this.A03 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationResponse) {
                AudienceValidationResponse audienceValidationResponse = (AudienceValidationResponse) obj;
                if (!0qQ.A0K(this.A04, audienceValidationResponse.A04) || !0qQ.A0K(this.A02, audienceValidationResponse.A02) || !0qQ.A0K(this.A05, audienceValidationResponse.A05) || this.A01 != audienceValidationResponse.A01 || this.A00 != audienceValidationResponse.A00 || !0qQ.A0K(this.A03, audienceValidationResponse.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A02);
        List list2 = this.A05;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G2 = C41848B3p.A1G(parcel, list2);
            while (A1G2.hasNext()) {
                C41847B3o.A1I(parcel, A1G2, i);
            }
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A04) * 31;
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A08(this.A02, A0C) + AnonymousClass7TG.A0C(this.A05)) * 31)) + C41845B3m.A00(this.A03);
    }
}

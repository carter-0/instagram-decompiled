package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class StatusResponseImpl extends AnonymousClass0T0 implements Parcelable, StatusResponse {
    public static final Parcelable.Creator CREATOR = DE6.A00(84);
    public final StatusStyle A00;
    public final StatusStyleResponseInfo A01;
    public final StatusType A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StatusResponseImpl) {
                StatusResponseImpl statusResponseImpl = (StatusResponseImpl) obj;
                if (!0qQ.A0K(this.A04, statusResponseImpl.A04) || !0qQ.A0K(this.A05, statusResponseImpl.A05) || !0qQ.A0K(this.A06, statusResponseImpl.A06) || !0qQ.A0K(this.A07, statusResponseImpl.A07) || !0qQ.A0K(this.A08, statusResponseImpl.A08) || !0qQ.A0K(this.A03, statusResponseImpl.A03) || this.A00 != statusResponseImpl.A00 || this.A02 != statusResponseImpl.A02 || !0qQ.A0K(this.A01, statusResponseImpl.A01) || !0qQ.A0K(this.A09, statusResponseImpl.A09) || !0qQ.A0K(this.A0A, statusResponseImpl.A0A)) {
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
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(C41847B3o.A00(parcel, this.A03));
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04))));
        return C41845B3m.A01(this.A0A, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TF.A08(this.A08, A082) + AnonymousClass7TG.A0C(this.A03)) * 31)))));
    }

    public StatusResponseImpl(StatusStyle statusStyle, StatusStyleResponseInfo statusStyleResponseInfo, StatusType statusType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass7TG.A1U(str, str2, str3);
        AnonymousClass7TG.A1R(str4, str5);
        AnonymousClass7TF.A1F(statusStyle, 7, statusType);
        0qQ.A0B(statusStyleResponseInfo, 9);
        0qQ.A0B(str6, 10);
        0qQ.A0B(str7, 11);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A03 = num;
        this.A00 = statusStyle;
        this.A02 = statusType;
        this.A01 = statusStyleResponseInfo;
        this.A09 = str6;
        this.A0A = str7;
    }
}

package com.instagram.direct.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectForwardingParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(92);
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectForwardingParams) {
                DirectForwardingParams directForwardingParams = (DirectForwardingParams) obj;
                if (!0qQ.A0K(this.A07, directForwardingParams.A07) || !0qQ.A0K(this.A06, directForwardingParams.A06) || this.A0A != directForwardingParams.A0A || !0qQ.A0K(this.A01, directForwardingParams.A01) || !0qQ.A0K(this.A02, directForwardingParams.A02) || !0qQ.A0K(this.A04, directForwardingParams.A04) || this.A0B != directForwardingParams.A0B || !0qQ.A0K(this.A05, directForwardingParams.A05) || !0qQ.A0K(this.A08, directForwardingParams.A08) || !0qQ.A0K(this.A03, directForwardingParams.A03) || !0qQ.A0K(this.A00, directForwardingParams.A00) || !0qQ.A0K(this.A09, directForwardingParams.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0A ? 1 : 0);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        parcel.writeString(this.A09);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A07));
        return ((((((((AnonymousClass7TF.A09(this.A0B, (((((AnonymousClass7TF.A09(this.A0A, A082) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A09);
    }

    public DirectForwardingParams(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A07 = str;
        this.A06 = str2;
        this.A0A = z;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str3;
        this.A0B = z2;
        this.A05 = str4;
        this.A08 = str5;
        this.A03 = num3;
        this.A00 = num4;
        this.A09 = str6;
    }

    public DirectForwardingParams() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, false, false);
    }
}

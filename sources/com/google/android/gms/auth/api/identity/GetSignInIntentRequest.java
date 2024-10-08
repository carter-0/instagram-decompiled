package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(95);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!SA1.A01(this.A01, getSignInIntentRequest.A01) || !SA1.A01(this.A04, getSignInIntentRequest.A04) || !SA1.A01(this.A02, getSignInIntentRequest.A02) || !SA1.A01(Boolean.valueOf(this.A05), Boolean.valueOf(getSignInIntentRequest.A05)) || this.A00 != getSignInIntentRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(this.A01, this.A02, this.A04, Boolean.valueOf(this.A05), Integer.valueOf(this.A00));
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass3Qk.A02(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A01);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A0C(parcel, this.A03, 3, A1S);
        C301145yd.A0C(parcel, this.A04, 4, A1S);
        C301145yd.A09(parcel, 5, this.A05);
        C301145yd.A07(parcel, 6, this.A00);
        C301145yd.A06(parcel, A032);
    }
}

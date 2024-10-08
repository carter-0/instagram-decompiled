package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(5);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (SA1.A01(this.A00, signInPassword.A00)) {
            return SA1.A00(this.A01, signInPassword.A01);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public SignInPassword(String str, String str2) {
        AnonymousClass3Qk.A03(str, "Account identifier cannot be null");
        String trim = str.trim();
        AnonymousClass3Qk.A06(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        AnonymousClass3Qk.A04(str2);
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        Pxi.A13(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A06(parcel, A03);
    }
}

package com.google.android.gms.auth.api.signin;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(12);
    @Deprecated
    public final String zba;
    @Deprecated
    public final String zbb;
    public final GoogleSignInAccount zbc;

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        AnonymousClass3Qk.A06(str, "8.3 and 8.4 SDKs require non-null email");
        this.zba = str;
        AnonymousClass3Qk.A06(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.zbb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0C(parcel, this.zba, 4, false);
        C301145yd.A0A(parcel, this.zbc, 7, i, false);
        C301145yd.A0C(parcel, this.zbb, 8, false);
        C301145yd.A06(parcel, A03);
    }
}

package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(4);
    public final Uri A00;
    public final PublicKeyCredential A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!SA1.A01(this.A02, signInCredential.A02) || !SA1.A01(this.A03, signInCredential.A03) || !SA1.A01(this.A04, signInCredential.A04) || !SA1.A01(this.A05, signInCredential.A05) || !SA1.A01(this.A00, signInCredential.A00) || !SA1.A01(this.A06, signInCredential.A06) || !SA1.A01(this.A07, signInCredential.A07) || !SA1.A01(this.A08, signInCredential.A08)) {
            return false;
        }
        return SA1.A00(this.A01, signInCredential.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04, this.A05, this.A00, this.A06, this.A07, this.A08, this.A01});
    }

    public SignInCredential(Uri uri, PublicKeyCredential publicKeyCredential, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass3Qk.A04(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = publicKeyCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A02);
        C301145yd.A0B(parcel, this.A03);
        C301145yd.A0C(parcel, this.A04, 3, A1S);
        C301145yd.A0C(parcel, this.A05, 4, A1S);
        C301145yd.A0A(parcel, this.A00, 5, i, A1S);
        C301145yd.A0C(parcel, this.A06, 6, A1S);
        C301145yd.A0C(parcel, this.A07, 7, A1S);
        C301145yd.A0C(parcel, this.A08, 8, A1S);
        C301145yd.A0A(parcel, this.A01, 9, i, A1S);
        C301145yd.A06(parcel, A032);
    }
}

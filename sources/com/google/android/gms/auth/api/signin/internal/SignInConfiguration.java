package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TG;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(9);
    public final GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.A01.equals(signInConfiguration.A01)) {
            return false;
        }
        GoogleSignInOptions googleSignInOptions = this.A00;
        GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
        if (googleSignInOptions == null) {
            if (googleSignInOptions2 == null) {
                return true;
            }
            return false;
        } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0E(this.A01) + 31) * 31) + AnonymousClass7TG.A0C(this.A00);
    }

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        AnonymousClass3Qk.A04(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0A(parcel, this.A00, 5, i, false);
        C301145yd.A06(parcel, A03);
    }
}

package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(2);
    public final int A00;
    public final SignInPassword A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!SA1.A01(this.A01, savePasswordRequest.A01) || !SA1.A01(this.A02, savePasswordRequest.A02) || this.A00 != savePasswordRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, this.A02);
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        AnonymousClass3Qk.A02(signInPassword);
        this.A01 = signInPassword;
        this.A02 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A01, 1, i, false);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A07(parcel, 3, this.A00);
        C301145yd.A06(parcel, A03);
    }
}

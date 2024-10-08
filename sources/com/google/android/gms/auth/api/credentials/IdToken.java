package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(89);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdToken) {
                IdToken idToken = (IdToken) obj;
                if (!SA1.A01(this.A00, idToken.A00) || !SA1.A01(this.A01, idToken.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        AnonymousClass3Qk.A08(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AnonymousClass3Qk.A08(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.A00 = str;
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        Pxi.A13(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A06(parcel, A03);
    }
}

package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C10988S4a;
import X.C301145yd;
import X.C51968G9o;
import X.C8467QvC;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.S01;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = SWX.A00(87);
    public final TAO A00;
    public final TAO A01;
    public final TAO A02;
    public final String[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!SA1.A01(this.A00, authenticatorAttestationResponse.A00) || !SA1.A01(this.A01, authenticatorAttestationResponse.A01)) {
            return false;
        }
        return SA1.A00(this.A02, authenticatorAttestationResponse.A02);
    }

    public final int hashCode() {
        return Pxf.A0B(Integer.valueOf(Pxf.A08(this.A00)), Integer.valueOf(Pxf.A08(this.A01)), Integer.valueOf(Pxf.A08(this.A02)));
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        C8467QvC A0O = Pxi.A0O(bArr);
        C8467QvC A0O2 = Pxi.A0O(bArr2);
        C8467QvC A0O3 = Pxi.A0O(bArr3);
        AnonymousClass3Qk.A02(A0O);
        this.A00 = A0O;
        AnonymousClass3Qk.A02(A0O2);
        this.A01 = A0O2;
        AnonymousClass3Qk.A02(A0O3);
        this.A02 = A0O3;
        AnonymousClass3Qk.A02(strArr);
        this.A03 = strArr;
    }

    public final String toString() {
        C10988S4a s4a = new C10988S4a(C51968G9o.A16(this));
        S01 s01 = S01.A00;
        s4a.A00(Pxi.A0h(s01, this.A00), "keyHandle");
        s4a.A00(Pxi.A0h(s01, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA);
        s4a.A00(Pxi.A0h(s01, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
        s4a.A00(Arrays.toString(this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
        return s4a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1W = Pxg.A1W(parcel, this.A00.A03());
        C301145yd.A0F(parcel, this.A01.A03(), 3, A1W);
        C301145yd.A0F(parcel, this.A02.A03(), 4, A1W);
        C301145yd.A0H(parcel, this.A03, 5);
        C301145yd.A06(parcel, A032);
    }
}

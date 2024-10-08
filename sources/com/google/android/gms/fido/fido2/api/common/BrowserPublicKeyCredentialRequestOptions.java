package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.C3735896d;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = SWX.A00(91);
    public final Uri A00;
    public final PublicKeyCredentialRequestOptions A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (SA1.A01(this.A01, browserPublicKeyCredentialRequestOptions.A01)) {
            return SA1.A00(this.A00, browserPublicKeyCredentialRequestOptions.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A01, this.A00);
    }

    public final String toString() {
        byte[] bArr = this.A02;
        return 002.A15("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", String.valueOf(this.A01), ", \n origin=", String.valueOf(this.A00), ", \n clientDataHash=", C3735896d.A00(bArr), "}");
    }

    public BrowserPublicKeyCredentialRequestOptions(Uri uri, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr) {
        AnonymousClass3Qk.A02(publicKeyCredentialRequestOptions);
        this.A01 = publicKeyCredentialRequestOptions;
        AnonymousClass3Qk.A02(uri);
        boolean z = true;
        AnonymousClass3Qk.A08(AnonymousClass7TF.A1V(uri.getScheme()), "origin scheme must be non-empty");
        AnonymousClass3Qk.A08(uri.getAuthority() == null ? false : z, "origin authority must be non-empty");
        this.A00 = uri;
        boolean z2 = true;
        if (!(bArr == null || bArr.length == 32)) {
            z2 = false;
        }
        AnonymousClass3Qk.A08(z2, "clientDataHash must be 32 bytes long");
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        boolean A1R = Pxi.A1R(parcel, this.A01, i);
        C301145yd.A0A(parcel, this.A00, 3, i, A1R);
        C301145yd.A0F(parcel, this.A02, 4, A1R);
        C301145yd.A06(parcel, A03);
    }
}

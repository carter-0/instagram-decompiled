package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.C301145yd;
import X.C3735896d;
import X.C8467QvC;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.Pxi;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(71);
    public final TAO A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!SA1.A01(this.A00, publicKeyCredentialUserEntity.A00) || !SA1.A01(this.A01, publicKeyCredentialUserEntity.A01) || !SA1.A01(this.A02, publicKeyCredentialUserEntity.A02)) {
            return false;
        }
        return SA1.A00(this.A03, publicKeyCredentialUserEntity.A03);
    }

    public final int hashCode() {
        return Pxh.A0A(this.A00, this.A01, this.A02, this.A03);
    }

    public final String toString() {
        return 002.A18("PublicKeyCredentialUserEntity{\n id=", C3735896d.A00(this.A00.A03()), ", \n name='", this.A01, "', \n icon='", this.A02, "', \n displayName='", this.A03, "'}");
    }

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2, String str3) {
        C8467QvC A0O = Pxi.A0O(bArr);
        AnonymousClass3Qk.A02(A0O);
        this.A00 = A0O;
        AnonymousClass3Qk.A02(str);
        this.A01 = str;
        this.A02 = str2;
        AnonymousClass3Qk.A02(str3);
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1W = Pxg.A1W(parcel, this.A00.A03());
        C301145yd.A0C(parcel, this.A01, 3, A1W);
        C301145yd.A0C(parcel, this.A02, 4, A1W);
        C301145yd.A0C(parcel, this.A03, 5, A1W);
        C301145yd.A06(parcel, A032);
    }
}

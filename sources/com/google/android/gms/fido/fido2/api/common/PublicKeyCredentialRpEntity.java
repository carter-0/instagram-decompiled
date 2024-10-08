package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(69);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!SA1.A01(this.A00, publicKeyCredentialRpEntity.A00) || !SA1.A01(this.A01, publicKeyCredentialRpEntity.A01)) {
            return false;
        }
        return SA1.A00(this.A02, publicKeyCredentialRpEntity.A02);
    }

    public final int hashCode() {
        return Pxf.A0B(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return 002.A15("PublicKeyCredentialRpEntity{\n id='", this.A00, "', \n name='", this.A01, "', \n icon='", this.A02, "'}");
    }

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        AnonymousClass3Qk.A02(str);
        this.A00 = str;
        AnonymousClass3Qk.A02(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00);
        C301145yd.A0C(parcel, this.A01, 3, false);
        Pxi.A14(parcel, this.A02, A03, false);
    }
}

package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass3Qk;
import X.C10086RmO;
import X.C301145yd;
import X.C3735896d;
import X.C8443Quo;
import X.C8467QvC;
import X.C8974RJp;
import X.Pxf;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final C8443Quo A03 = C8443Quo.A01(new Object[]{C10086RmO.A00, C10086RmO.A01}, 2);
    public static final Parcelable.Creator CREATOR = SWX.A00(66);
    public final PublicKeyCredentialType A00;
    public final TAO A01;
    public final List A02;

    public PublicKeyCredentialDescriptor(String str, List list, byte[] bArr) {
        C8467QvC A012 = TAO.A01(bArr, bArr.length);
        AnonymousClass3Qk.A02(str);
        try {
            this.A00 = PublicKeyCredentialType.A00(str);
            AnonymousClass3Qk.A02(A012);
            this.A01 = A012;
            this.A02 = list;
        } catch (C8974RJp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialDescriptor) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
            if (this.A00.equals(publicKeyCredentialDescriptor.A00) && SA1.A01(this.A01, publicKeyCredentialDescriptor.A01)) {
                List list = this.A02;
                List list2 = publicKeyCredentialDescriptor.A02;
                if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0B(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return 002.A15("PublicKeyCredentialDescriptor{\n type=", String.valueOf(this.A00), ", \n id=", C3735896d.A00(this.A01.A03()), ", \n transports=", String.valueOf(this.A02), "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00.toString());
        C301145yd.A0F(parcel, this.A01.A03(), 3, false);
        C301145yd.A0E(parcel, this.A02, 4, false);
        C301145yd.A06(parcel, A032);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C301145yd;
import X.C8978RJu;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(5);
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final ProtocolVersion A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RegisterRequest) {
                RegisterRequest registerRequest = (RegisterRequest) obj;
                if (Arrays.equals(this.A02, registerRequest.A02) && this.A03 == registerRequest.A03) {
                    String str = this.A01;
                    String str2 = registerRequest.A01;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0N = AnonymousClass7TE.A0N(this.A03, (Arrays.hashCode(this.A02) + 31) * 31);
        return (A0N * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public RegisterRequest(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        try {
            this.A03 = ProtocolVersion.A00(str);
            this.A02 = bArr;
            this.A01 = str2;
        } catch (C8978RJu e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0B(parcel, this.A03.toString());
        C301145yd.A0F(parcel, this.A02, 3, false);
        Pxi.A14(parcel, this.A01, A032, false);
    }
}

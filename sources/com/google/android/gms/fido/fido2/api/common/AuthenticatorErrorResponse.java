package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass7TF;
import X.C10988S4a;
import X.C301145yd;
import X.C51968G9o;
import X.C8973RJo;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = SWX.A00(88);
    public final ErrorCode A00;
    public final String A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!SA1.A01(this.A00, authenticatorErrorResponse.A00) || !SA1.A01(this.A01, authenticatorErrorResponse.A01)) {
            return false;
        }
        return SA1.A00(Integer.valueOf(this.A02), Integer.valueOf(authenticatorErrorResponse.A02));
    }

    public final int hashCode() {
        return Pxf.A0B(this.A00, this.A01, Integer.valueOf(this.A02));
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.A00) {
                    this.A00 = errorCode;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new Exception(String.format(Locale.US, "Error code %d is not supported", AnonymousClass7TF.A1b(i)));
        } catch (C8973RJo e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Rv0, java.lang.Object] */
    public final String toString() {
        C10988S4a s4a = new C10988S4a(C51968G9o.A16(this));
        String valueOf = String.valueOf(this.A00.A00);
        ? obj = new Object();
        s4a.A00.A00 = obj;
        s4a.A00 = obj;
        obj.A01 = valueOf;
        obj.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            s4a.A00(str, "errorMessage");
        }
        return s4a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00.A00);
        C301145yd.A0C(parcel, this.A01, 3, false);
        Pxi.A12(parcel, this.A02, A03);
    }
}

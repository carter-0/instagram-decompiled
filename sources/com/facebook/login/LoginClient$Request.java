package com.facebook.login;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66580MXl;
import X.C8894REl;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

public class LoginClient$Request implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(34);
    public C8894REl A00 = null;
    public String A01 = null;
    public boolean A02 = false;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(AnonymousClass7TE.A1D(this.A06));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
    }

    public LoginClient$Request(Parcel parcel) {
        C8894REl rEl;
        ArrayList A1C = AnonymousClass7TE.A1C();
        parcel.readStringList(A1C);
        this.A06 = C66580MXl.A12(A1C);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = AnonymousClass7TF.A1P(parcel.readByte());
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = Pxg.A1V(parcel);
        String readString = parcel.readString();
        if (readString != null) {
            rEl = C8894REl.valueOf(readString);
        } else {
            rEl = C8894REl.UNKNOWN;
        }
        this.A00 = rEl;
    }

    public LoginClient$Request(String str, String str2, String str3, Set set) {
        this.A06 = set;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = false;
        this.A05 = str3;
    }
}

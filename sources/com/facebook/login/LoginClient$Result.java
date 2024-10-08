package com.facebook.login;

import X.002;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;

public class LoginClient$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(35);
    public final AccessToken A00;
    public final LoginClient$Request A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public static LoginClient$Result A00(AccessToken accessToken, LoginClient$Request loginClient$Request) {
        return new LoginClient$Result(accessToken, loginClient$Request, AnonymousClass05K.A00, (String) null, (String) null);
    }

    public static LoginClient$Result A01(LoginClient$Request loginClient$Request, String str) {
        return new LoginClient$Result((AccessToken) null, loginClient$Request, AnonymousClass05K.A01, str, (String) null);
    }

    public static LoginClient$Result A02(LoginClient$Request loginClient$Request, String str, String str2, String str3) {
        return new LoginClient$Result((AccessToken) null, loginClient$Request, AnonymousClass05K.A0C, 002.A0R(str, str2), str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A02.intValue()) {
            case 1:
                str = "CANCEL";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "SUCCESS";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public LoginClient$Result(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString.equals("SUCCESS")) {
            num = AnonymousClass05K.A00;
        } else if (readString.equals("CANCEL")) {
            num = AnonymousClass05K.A01;
        } else if (readString.equals("ERROR")) {
            num = AnonymousClass05K.A0C;
        } else {
            throw AnonymousClass7TE.A0w(readString);
        }
        this.A02 = num;
        this.A00 = (AccessToken) C41847B3o.A03(parcel, AccessToken.class);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (LoginClient$Request) C41847B3o.A03(parcel, LoginClient$Request.class);
    }

    public LoginClient$Result(AccessToken accessToken, LoginClient$Request loginClient$Request, Integer num, String str, String str2) {
        this.A01 = loginClient$Request;
        this.A00 = accessToken;
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
    }
}

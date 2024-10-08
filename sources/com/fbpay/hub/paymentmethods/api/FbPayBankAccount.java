package com.fbpay.hub.paymentmethods.api;

import X.0qQ;
import X.C11367SPk;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class FbPayBankAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(25);
    public final String A00;

    public FbPayBankAccount(String str) {
        C11367SPk.A03(str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FbPayBankAccount) && 0qQ.A0K(this.A00, ((FbPayBankAccount) obj).A00));
    }

    public final int hashCode() {
        return C11367SPk.A01(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public FbPayBankAccount(Parcel parcel) {
        Pxh.A1H(this);
        this.A00 = parcel.readString();
    }
}

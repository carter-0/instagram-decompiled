package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class Place implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(31);
    public final String A00;
    public final String A01;
    public final Location A02;

    public Place(Location location, String str, String str2) {
        C11367SPk.A03(str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = str;
        C11367SPk.A03(location, "location");
        this.A02 = location;
        C11367SPk.A03(str2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A01 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Place) {
                Place place = (Place) obj;
                if (!0qQ.A0K(this.A00, place.A00) || !0qQ.A0K(this.A02, place.A02) || !0qQ.A0K(this.A01, place.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01);
    }

    public Place(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        this.A00 = parcel.readString();
        this.A02 = (Location) parcel.readParcelable(A0W);
        this.A01 = parcel.readString();
    }
}

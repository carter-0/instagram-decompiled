package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.DbY;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

public final class AudienceInterest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(17);
    public String A00;
    public String A01;

    public final String A02() {
        String format = String.format("{\"id\": %s, \"name\": %s}", Arrays.copyOf(new Object[]{A00(), A01()}, 2));
        0qQ.A07(format);
        return format;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && DbY.A1b(this, obj)) {
                AudienceInterest audienceInterest = (AudienceInterest) obj;
                if (!0qQ.A0K(A00(), audienceInterest.A00()) || !0qQ.A0K(A01(), audienceInterest.A01())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(A00());
        parcel.writeString(A01());
    }

    public final String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A01() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int hashCode() {
        return A00().hashCode();
    }
}

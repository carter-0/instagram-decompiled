package com.instagram.discovery.filters.analytics;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FiltersLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(27);
    public String A00;
    public HashMap A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final ImmutableMap A00() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        HashMap hashMap = this.A01;
        if (hashMap != null) {
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (!"sort_by".equals(A1J.getKey())) {
                    builder.put(A1J.getKey(), A1J.getValue());
                }
            }
        }
        builder.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00);
        return builder.build();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeSerializable(this.A01);
    }

    public FiltersLoggingInfo(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = C41847B3o.A03(parcel, User.class);
        this.A04 = parcel.readString();
        this.A01 = (HashMap) parcel.readSerializable();
    }
}

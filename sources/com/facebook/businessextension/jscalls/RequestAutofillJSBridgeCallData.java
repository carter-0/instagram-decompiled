package com.facebook.businessextension.jscalls;

import X.AnonymousClass7TE;
import X.DbS;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RequestAutofillJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(32);
    public final String A00;
    public final LinkedHashSet A01;
    public final LinkedHashSet A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList A1C;
        ArrayList A1C2;
        parcel.writeString(this.A00);
        LinkedHashSet linkedHashSet = this.A02;
        if (linkedHashSet != null) {
            A1C = AnonymousClass7TE.A1D(linkedHashSet);
        } else {
            A1C = AnonymousClass7TE.A1C();
        }
        parcel.writeStringList(A1C);
        LinkedHashSet linkedHashSet2 = this.A01;
        if (linkedHashSet2 != null) {
            A1C2 = AnonymousClass7TE.A1D(linkedHashSet2);
        } else {
            A1C2 = AnonymousClass7TE.A1C();
        }
        parcel.writeStringList(A1C2);
    }

    public RequestAutofillJSBridgeCallData(String str, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.A00 = str;
        this.A02 = linkedHashSet;
        this.A01 = linkedHashSet2;
    }

    public RequestAutofillJSBridgeCallData(Parcel parcel) {
        LinkedHashSet A0y;
        LinkedHashSet A0y2;
        this.A00 = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        if (createStringArrayList != null) {
            A0y = new LinkedHashSet(createStringArrayList);
        } else {
            A0y = DbS.A0y();
        }
        this.A02 = A0y;
        if (createStringArrayList2 != null) {
            A0y2 = new LinkedHashSet(createStringArrayList2);
        } else {
            A0y2 = DbS.A0y();
        }
        this.A01 = A0y2;
    }
}

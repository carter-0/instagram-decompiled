package com.instagram.model.direct.messageid;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public class MessageIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(22);
    public String A00;
    public String A01;

    public MessageIdentifier(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageIdentifier)) {
            return false;
        }
        MessageIdentifier messageIdentifier = (MessageIdentifier) obj;
        return 0qQ.A0K(this.A01, messageIdentifier.A01) && 0qQ.A0K(A00(), messageIdentifier.A00());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        if (this instanceof DirectMessageIdentifier) {
            return ((DirectMessageIdentifier) this).A00;
        }
        return this.A00;
    }

    public int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        String A002 = A00();
        if (A002 != null) {
            i = A002.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}

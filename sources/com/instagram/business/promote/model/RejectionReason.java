package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class RejectionReason implements Parcelable {
    public static final W6D CREATOR = new W6D(53);
    public String A00;
    public List A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        String str2 = this.A00;
        if (str2 != null) {
            parcel.writeString(str2);
            parcel.writeByte(this.A02 ? (byte) 1 : 0);
            List list = this.A01;
            if (list != null) {
                parcel.writeTypedList(list);
                return;
            }
            str = "ranges";
        } else {
            str = "text";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

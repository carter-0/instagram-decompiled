package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class ReceiverInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(10);
    public final List A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReceiverInfo) {
                ReceiverInfo receiverInfo = (ReceiverInfo) obj;
                if (!0qQ.A0K(this.A01, receiverInfo.A01) || !0qQ.A0K(this.A02, receiverInfo.A02) || !0qQ.A0K(this.A00, receiverInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)));
    }

    public ReceiverInfo(String str, String str2, List list) {
        AnonymousClass7TG.A1U(str, str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReceiverInfo(id=");
        A1A.append(this.A01);
        A1A.append(", name=");
        A1A.append(this.A02);
        A1A.append(", validOrigins=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}

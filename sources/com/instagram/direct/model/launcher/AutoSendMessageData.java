package com.instagram.direct.model.launcher;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class AutoSendMessageData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(94);
    public final String A00;
    public final String A01;
    public final String A02;

    public AutoSendMessageData(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AutoSendMessageData) {
                AutoSendMessageData autoSendMessageData = (AutoSendMessageData) obj;
                if (!0qQ.A0K(this.A02, autoSendMessageData.A02) || !0qQ.A0K(this.A01, autoSendMessageData.A01) || !0qQ.A0K(this.A00, autoSendMessageData.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        String str = this.A01;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}

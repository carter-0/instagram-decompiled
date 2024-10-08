package com.instagram.direct.smartsuggestion.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class SmartSuggestionCTA extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(4);
    public Integer A00;
    public String A01 = null;

    public SmartSuggestionCTA() {
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(num, 1);
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmartSuggestionCTA) {
                SmartSuggestionCTA smartSuggestionCTA = (SmartSuggestionCTA) obj;
                if (this.A00 != smartSuggestionCTA.A00 || !0qQ.A0K(this.A01, smartSuggestionCTA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        switch (this.A00.intValue()) {
            case 1:
                str = "SEND";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "SEND";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        int hashCode2 = (str.hashCode() + intValue) * 31;
        String str2 = this.A01;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        return hashCode2 + hashCode;
    }
}

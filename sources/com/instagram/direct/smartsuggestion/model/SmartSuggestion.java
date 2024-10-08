package com.instagram.direct.smartsuggestion.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.C255273tr;
import X.C255293tt;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public final class SmartSuggestion extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(3);
    public SmartSuggestionCTA A00 = null;
    public SmartSuggestionCTA A01 = null;
    public C255273tr A02;
    public Integer A03;
    public String A04 = null;
    public String A05 = null;
    public String A06 = null;
    public HashMap A07;

    public SmartSuggestion() {
        Integer num = AnonymousClass05K.A00;
        C255273tr r2 = C255273tr.A09;
        HashMap hashMap = new HashMap();
        0qQ.A0B(num, 1);
        0qQ.A0B(r2, 2);
        this.A03 = num;
        this.A02 = r2;
        this.A07 = hashMap;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmartSuggestion) {
                SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
                if (this.A03 != smartSuggestion.A03 || this.A02 != smartSuggestion.A02 || !0qQ.A0K(this.A04, smartSuggestion.A04) || !0qQ.A0K(this.A06, smartSuggestion.A06) || !0qQ.A0K(this.A05, smartSuggestion.A05) || !0qQ.A0K(this.A00, smartSuggestion.A00) || !0qQ.A0K(this.A01, smartSuggestion.A01) || !0qQ.A0K(this.A07, smartSuggestion.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(C255293tt.A01(this.A03));
        parcel.writeString(this.A02.name());
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        SmartSuggestionCTA smartSuggestionCTA = this.A00;
        if (smartSuggestionCTA == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartSuggestionCTA.writeToParcel(parcel, i);
        }
        SmartSuggestionCTA smartSuggestionCTA2 = this.A01;
        if (smartSuggestionCTA2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartSuggestionCTA2.writeToParcel(parcel, i);
        }
        HashMap hashMap = this.A07;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Integer num = this.A03;
        int hashCode5 = (((C255293tt.A01(num).hashCode() + num.intValue()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SmartSuggestionCTA smartSuggestionCTA = this.A00;
        if (smartSuggestionCTA == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = smartSuggestionCTA.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        SmartSuggestionCTA smartSuggestionCTA2 = this.A01;
        if (smartSuggestionCTA2 != null) {
            i = smartSuggestionCTA2.hashCode();
        }
        return ((i5 + i) * 31) + this.A07.hashCode();
    }
}

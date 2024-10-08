package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class GraphGuardianContentImpl extends AnonymousClass0T0 implements Parcelable, GraphGuardianContent {
    public static final Parcelable.Creator CREATOR = new DE7(87);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphGuardianContentImpl) {
                GraphGuardianContentImpl graphGuardianContentImpl = (GraphGuardianContentImpl) obj;
                if (!0qQ.A0K(this.A00, graphGuardianContentImpl.A00) || !0qQ.A0K(this.A01, graphGuardianContentImpl.A01) || !0qQ.A0K(this.A02, graphGuardianContentImpl.A02) || !0qQ.A0K(this.A03, graphGuardianContentImpl.A03) || !0qQ.A0K(this.A04, graphGuardianContentImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A03;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A04;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final String Agd() {
        return this.A00;
    }

    public final String Aip() {
        return this.A01;
    }

    public final String Aiu() {
        return this.A02;
    }

    public final String getTitle() {
        return this.A04;
    }

    public GraphGuardianContentImpl(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}

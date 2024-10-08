package com.instagram.search.common.analytics;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public final class SearchContext extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(76);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SearchContext) {
                SearchContext searchContext = (SearchContext) obj;
                if (!0qQ.A0K(this.A05, searchContext.A05) || !0qQ.A0K(this.A03, searchContext.A03) || !0qQ.A0K(this.A02, searchContext.A02) || !0qQ.A0K(this.A01, searchContext.A01) || !0qQ.A0K(this.A06, searchContext.A06) || !0qQ.A0K(this.A00, searchContext.A00) || !0qQ.A0K(this.A04, searchContext.A04) || !0qQ.A0K(this.A07, searchContext.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A01;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A06;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A00;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A04;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A07;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        String str = this.A05;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            hashMap.put("rank_token", str2);
        }
        String str3 = this.A02;
        if (str3 != null) {
            hashMap.put("query_text", str3);
        }
        String str4 = this.A01;
        if (str4 != null) {
            hashMap.put(AnonymousClass000.A00(2803), str4);
        }
        String str5 = this.A06;
        if (str5 != null) {
            hashMap.put("serp_session_id", str5);
        }
        String str6 = this.A00;
        if (str6 != null) {
            hashMap.put("click_id", str6);
        }
        String str7 = this.A04;
        if (str7 != null) {
            hashMap.put(AnonymousClass000.A00(3865), str7);
        }
        return hashMap;
    }

    public SearchContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A00 = str6;
        this.A04 = str7;
        this.A07 = str8;
    }

    public SearchContext() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}

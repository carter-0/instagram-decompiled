package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C63016Kq6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GenAIToolInfoDict extends AnonymousClass0T0 implements GenAIToolInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(5);
    public final CameraTool A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final GenAIToolInfoDict F3O() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIToolInfoDict) {
                GenAIToolInfoDict genAIToolInfoDict = (GenAIToolInfoDict) obj;
                if (!0qQ.A0K(this.A01, genAIToolInfoDict.A01) || !0qQ.A0K(this.A02, genAIToolInfoDict.A02) || !0qQ.A0K(this.A03, genAIToolInfoDict.A03) || !0qQ.A0K(this.A04, genAIToolInfoDict.A04) || !0qQ.A0K(this.A05, genAIToolInfoDict.A05) || !0qQ.A0K(this.A06, genAIToolInfoDict.A06) || !0qQ.A0K(this.A07, genAIToolInfoDict.A07) || this.A00 != genAIToolInfoDict.A00 || !0qQ.A0K(this.A08, genAIToolInfoDict.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.A00.hashCode()) * 31;
        String str8 = this.A08;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
    }

    public GenAIToolInfoDict(CameraTool cameraTool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        0qQ.A0B(cameraTool, 8);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = cameraTool;
        this.A08 = str8;
    }

    public final String Aqe() {
        return this.A02;
    }

    public final String Bhm() {
        return this.A03;
    }

    public final String Bk7() {
        return this.A04;
    }

    public final String BnF() {
        return this.A05;
    }

    public final String Bnp() {
        return this.A06;
    }

    public final String Bzk() {
        return this.A07;
    }

    public final CameraTool C8A() {
        return this.A00;
    }

    public final String C8V() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenAIToolInfoDict", C63016Kq6.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A01;
    }
}

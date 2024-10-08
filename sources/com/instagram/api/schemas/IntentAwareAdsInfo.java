package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C54798HTf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IntentAwareAdsInfo extends AnonymousClass0T0 implements IntentAwareAdsInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(47);
    public final IntentAwareAdsFormatInfo A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final IntentAwareAdsInfo F5F() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntentAwareAdsInfo) {
                IntentAwareAdsInfo intentAwareAdsInfo = (IntentAwareAdsInfo) obj;
                if (!0qQ.A0K(this.A00, intentAwareAdsInfo.A00) || !0qQ.A0K(this.A04, intentAwareAdsInfo.A04) || !0qQ.A0K(this.A01, intentAwareAdsInfo.A01) || !0qQ.A0K(this.A05, intentAwareAdsInfo.A05) || !0qQ.A0K(this.A02, intentAwareAdsInfo.A02) || !0qQ.A0K(this.A06, intentAwareAdsInfo.A06) || !0qQ.A0K(this.A07, intentAwareAdsInfo.A07) || !0qQ.A0K(this.A03, intentAwareAdsInfo.A03) || !0qQ.A0K(this.A08, intentAwareAdsInfo.A08) || !0qQ.A0K(this.A09, intentAwareAdsInfo.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = this.A00;
        int i = 0;
        int hashCode = (intentAwareAdsFormatInfo == null ? 0 : intentAwareAdsFormatInfo.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode9 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A05);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
    }

    public final IntentAwareAdsFormatInfo B7S() {
        return this.A00;
    }

    public final String BHg() {
        return this.A04;
    }

    public final String BUR() {
        return this.A05;
    }

    public final Integer BUY() {
        return this.A02;
    }

    public final String BUa() {
        return this.A06;
    }

    public final String Br2() {
        return this.A07;
    }

    public final Integer Br3() {
        return this.A03;
    }

    public final String Br4() {
        return this.A08;
    }

    public final String C9y() {
        return this.A09;
    }

    public final Boolean CbN() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIntentAwareAdsInfo", C54798HTf.A00(this));
    }

    public IntentAwareAdsInfo(IntentAwareAdsFormatInfo intentAwareAdsFormatInfo, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = intentAwareAdsFormatInfo;
        this.A04 = str;
        this.A01 = bool;
        this.A05 = str2;
        this.A02 = num;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = num2;
        this.A08 = str5;
        this.A09 = str6;
    }
}

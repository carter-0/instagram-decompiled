package com.instagram.model.venue;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C21473Xc6;
import X.C376399Hv;
import X.XD8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class LocationDict extends AnonymousClass0T0 implements LocationDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(58);
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;

    public final LocationDict FG5() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationDict) {
                LocationDict locationDict = (LocationDict) obj;
                if (!0qQ.A0K(this.A0C, locationDict.A0C) || !0qQ.A0K(this.A0D, locationDict.A0D) || !0qQ.A0K(this.A0E, locationDict.A0E) || !0qQ.A0K(this.A04, locationDict.A04) || !0qQ.A0K(this.A05, locationDict.A05) || !0qQ.A0K(this.A06, locationDict.A06) || !0qQ.A0K(this.A0F, locationDict.A0F) || !0qQ.A0K(this.A0G, locationDict.A0G) || !0qQ.A0K(this.A0H, locationDict.A0H) || !0qQ.A0K(this.A0I, locationDict.A0I) || !0qQ.A0K(this.A0A, locationDict.A0A) || !0qQ.A0K(this.A0J, locationDict.A0J) || !0qQ.A0K(this.A00, locationDict.A00) || !0qQ.A0K(this.A01, locationDict.A01) || !0qQ.A0K(this.A02, locationDict.A02) || !0qQ.A0K(this.A03, locationDict.A03) || !0qQ.A0K(this.A07, locationDict.A07) || !0qQ.A0K(this.A0K, locationDict.A0K) || !0qQ.A0K(this.A0B, locationDict.A0B) || !0qQ.A0K(this.A0L, locationDict.A0L) || !0qQ.A0K(this.A0M, locationDict.A0M) || !0qQ.A0K(this.A08, locationDict.A08) || !0qQ.A0K(this.A09, locationDict.A09) || !0qQ.A0K(this.A0N, locationDict.A0N)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0C;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0D;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0E;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A05;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.A0F;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0G;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0H;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0I;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.A0A;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str8 = this.A0J;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.A02;
        int hashCode15 = (hashCode14 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode16 = (hashCode15 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.A07;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.A0K;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.A0B;
        int hashCode19 = (hashCode18 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str10 = this.A0L;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0M;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.A08;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A09;
        int hashCode23 = (hashCode22 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str12 = this.A0N;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode23 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A05;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.A06;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        Long l = this.A0A;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A0J);
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A03;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num4 = this.A07;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.A0K);
        Long l2 = this.A0B;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        Integer num5 = this.A08;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.A09;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.A0N);
    }

    public final /* bridge */ /* synthetic */ C21473Xc6 AKd() {
        return new C21473Xc6(this);
    }

    public final Integer AsB() {
        return this.A04;
    }

    public final Integer B1c() {
        return this.A05;
    }

    public final Integer B2G() {
        return this.A06;
    }

    public final String B39() {
        return this.A0F;
    }

    public final String B3A() {
        return this.A0G;
    }

    public final String B3X() {
        return this.A0I;
    }

    public final Long B3Y() {
        return this.A0A;
    }

    public final String B7n() {
        return this.A0J;
    }

    public final Boolean BCR() {
        return this.A00;
    }

    public final Float BLV() {
        return this.A02;
    }

    public final Float BNV() {
        return this.A03;
    }

    public final Integer BTM() {
        return this.A07;
    }

    public final Long Bcn() {
        return this.A0B;
    }

    public final Integer Bym() {
        return this.A08;
    }

    public final Integer C7L() {
        return this.A09;
    }

    public final String C7d() {
        return this.A0N;
    }

    public final Boolean CRz() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLocationDict", XD8.A00(this));
    }

    public final String getAddress() {
        return this.A0C;
    }

    public final String getCategory() {
        return this.A0D;
    }

    public final String getCity() {
        return this.A0E;
    }

    public final String getExternalSource() {
        return this.A0H;
    }

    public final String getName() {
        return this.A0K;
    }

    public final String getProfilePicUrl() {
        return this.A0L;
    }

    public final String getShortName() {
        return this.A0M;
    }

    public LocationDict(Boolean bool, Boolean bool2, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A0C = str;
        this.A0D = str2;
        this.A0E = str3;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = num3;
        this.A0F = str4;
        this.A0G = str5;
        this.A0H = str6;
        this.A0I = str7;
        this.A0A = l;
        this.A0J = str8;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = f;
        this.A03 = f2;
        this.A07 = num4;
        this.A0K = str9;
        this.A0B = l2;
        this.A0L = str10;
        this.A0M = str11;
        this.A08 = num5;
        this.A09 = num6;
        this.A0N = str12;
    }
}

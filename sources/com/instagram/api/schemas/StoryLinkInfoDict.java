package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C14203Tri;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryLinkInfoDict extends AnonymousClass0T0 implements Parcelable, StoryLinkInfoDictIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(29);
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final StoryLinkInfoDict FAL() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryLinkInfoDict) {
                StoryLinkInfoDict storyLinkInfoDict = (StoryLinkInfoDict) obj;
                if (!0qQ.A0K(this.A05, storyLinkInfoDict.A05) || !0qQ.A0K(this.A06, storyLinkInfoDict.A06) || !0qQ.A0K(this.A07, storyLinkInfoDict.A07) || !0qQ.A0K(this.A00, storyLinkInfoDict.A00) || !0qQ.A0K(this.A01, storyLinkInfoDict.A01) || !0qQ.A0K(this.A08, storyLinkInfoDict.A08) || !0qQ.A0K(this.A09, storyLinkInfoDict.A09) || !0qQ.A0K(this.A02, storyLinkInfoDict.A02) || !0qQ.A0K(this.A03, storyLinkInfoDict.A03) || !0qQ.A0K(this.A04, storyLinkInfoDict.A04) || !0qQ.A0K(this.A0A, storyLinkInfoDict.A0A)) {
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
        String str2 = this.A06;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.A08;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A09;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.A0A;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode10 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
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
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        Boolean bool3 = this.A02;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A03;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A0A);
    }

    public final String AnT() {
        return this.A05;
    }

    public final String Auq() {
        return this.A06;
    }

    public final String AyG() {
        return this.A07;
    }

    public final String BMs() {
        return this.A08;
    }

    public final String BMv() {
        return this.A09;
    }

    public final Boolean BYN() {
        return this.A02;
    }

    public final Boolean BuQ() {
        return this.A03;
    }

    public final Integer C4C() {
        return this.A04;
    }

    public final Boolean CRc() {
        return this.A00;
    }

    public final Boolean Cdp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryLinkInfoDict", C14203Tri.A00(this));
    }

    public final String getUrl() {
        return this.A0A;
    }

    public StoryLinkInfoDict(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = bool;
        this.A01 = bool2;
        this.A08 = str4;
        this.A09 = str5;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = num;
        this.A0A = str6;
    }
}

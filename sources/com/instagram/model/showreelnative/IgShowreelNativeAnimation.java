package com.instagram.model.showreelnative;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C44949Cnj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class IgShowreelNativeAnimation extends AnonymousClass0T0 implements IgShowreelNativeAnimationIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(55);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final IgShowreelNativeAnimation FFy() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelNativeAnimation) {
                IgShowreelNativeAnimation igShowreelNativeAnimation = (IgShowreelNativeAnimation) obj;
                if (!0qQ.A0K(this.A02, igShowreelNativeAnimation.A02) || !0qQ.A0K(this.A06, igShowreelNativeAnimation.A06) || !0qQ.A0K(this.A07, igShowreelNativeAnimation.A07) || !0qQ.A0K(this.A03, igShowreelNativeAnimation.A03) || !0qQ.A0K(this.A04, igShowreelNativeAnimation.A04) || !0qQ.A0K(this.A00, igShowreelNativeAnimation.A00) || !0qQ.A0K(this.A05, igShowreelNativeAnimation.A05) || !0qQ.A0K(this.A01, igShowreelNativeAnimation.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A06;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode7 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A06);
        List<Parcelable> list = this.A07;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A05);
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    public final String Abk() {
        return this.A02;
    }

    public final List Acl() {
        return this.A06;
    }

    public final List Acn() {
        return this.A07;
    }

    public final String Anf() {
        return this.A03;
    }

    public final String AqT() {
        return this.A04;
    }

    public final Integer BCu() {
        return this.A00;
    }

    public final String C4b() {
        return this.A05;
    }

    public final Integer CGY() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowReel", C44949Cnj.A00(this));
    }

    public IgShowreelNativeAnimation(Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = num;
        this.A05 = str4;
        this.A01 = num2;
    }
}

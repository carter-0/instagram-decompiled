package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.CYS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class HallpassDetailsDictImpl extends AnonymousClass0T0 implements Parcelable, HallpassDetailsDict {
    public static final Parcelable.Creator CREATOR = new C376389Hu(8);
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final HallpassDetailsDictImpl F3e(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallpassDetailsDictImpl) {
                HallpassDetailsDictImpl hallpassDetailsDictImpl = (HallpassDetailsDictImpl) obj;
                if (!0qQ.A0K(this.A00, hallpassDetailsDictImpl.A00) || !0qQ.A0K(this.A01, hallpassDetailsDictImpl.A01) || !0qQ.A0K(this.A02, hallpassDetailsDictImpl.A02) || !0qQ.A0K(this.A03, hallpassDetailsDictImpl.A03)) {
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
        List list = this.A03;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List<Parcelable> list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public final String BAL() {
        return this.A01;
    }

    public final List BxT() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHallpassDetailsDict", CYS.A00(this));
    }

    public final String getColor() {
        return this.A00;
    }

    public final String getName() {
        return this.A02;
    }

    public HallpassDetailsDictImpl(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }

    public final HallpassDetailsDict E7U(1E9 r1) {
        return this;
    }
}

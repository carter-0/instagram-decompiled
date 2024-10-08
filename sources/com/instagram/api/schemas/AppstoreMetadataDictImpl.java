package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.CUZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class AppstoreMetadataDictImpl extends AnonymousClass0T0 implements AppstoreMetadataDict, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(51);
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final AppstoreMetadataDictImpl F0X() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppstoreMetadataDictImpl) {
                AppstoreMetadataDictImpl appstoreMetadataDictImpl = (AppstoreMetadataDictImpl) obj;
                if (!0qQ.A0K(this.A00, appstoreMetadataDictImpl.A00) || !0qQ.A0K(this.A02, appstoreMetadataDictImpl.A02) || !0qQ.A0K(this.A01, appstoreMetadataDictImpl.A01) || !0qQ.A0K(this.A03, appstoreMetadataDictImpl.A03) || !0qQ.A0K(this.A04, appstoreMetadataDictImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A04;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.A02);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A03);
        List<Parcelable> list = this.A04;
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

    public final Float Aeb() {
        return this.A00;
    }

    public final String BHr() {
        return this.A02;
    }

    public final Integer BXE() {
        return this.A01;
    }

    public final String BXF() {
        return this.A03;
    }

    public final List Bq2() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppstoreMetadataDict", CUZ.A00(this));
    }

    public AppstoreMetadataDictImpl(Float f, Integer num, String str, String str2, List list) {
        this.A00 = f;
        this.A02 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A04 = list;
    }
}

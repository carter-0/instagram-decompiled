package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.CV7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class BrandedContentGatingInfo extends AnonymousClass0T0 implements Parcelable, BrandedContentGatingInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(63);
    public final Integer A00;
    public final String A01;
    public final HashMap A02;
    public final List A03;
    public final List A04;

    public final BrandedContentGatingInfo F0x() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentGatingInfo) {
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) obj;
                if (!0qQ.A0K(this.A02, brandedContentGatingInfo.A02) || !0qQ.A0K(this.A03, brandedContentGatingInfo.A03) || !0qQ.A0K(this.A04, brandedContentGatingInfo.A04) || !0qQ.A0K(this.A00, brandedContentGatingInfo.A00) || !0qQ.A0K(this.A01, brandedContentGatingInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashMap hashMap = this.A02;
        int i = 0;
        int hashCode = (hashMap == null ? 0 : hashMap.hashCode()) * 31;
        List list = this.A03;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A04;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        HashMap hashMap = this.A02;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeInt(((Number) entry.getValue()).intValue());
            }
        }
        List<Parcelable> list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeStringList(this.A04);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A01);
    }

    public final /* bridge */ /* synthetic */ Map Ari() {
        return this.A02;
    }

    public final List Arj() {
        return this.A03;
    }

    public final List Ark() {
        return this.A04;
    }

    public final Integer Avl() {
        return this.A00;
    }

    public final String Bra() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBrandedContentGatingInfo", CV7.A00(this));
    }

    public BrandedContentGatingInfo(Integer num, String str, HashMap hashMap, List list, List list2) {
        this.A02 = hashMap;
        this.A03 = list;
        this.A04 = list2;
        this.A00 = num;
        this.A01 = str;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C44164CYd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGAdCreativeOptimizationConfigByTypeDictImpl extends AnonymousClass0T0 implements Parcelable, IGAdCreativeOptimizationConfigByTypeDict {
    public static final Parcelable.Creator CREATOR = new C376389Hu(15);
    public final String A00;
    public final String A01;

    public final IGAdCreativeOptimizationConfigByTypeDictImpl F3n() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdCreativeOptimizationConfigByTypeDictImpl) {
                IGAdCreativeOptimizationConfigByTypeDictImpl iGAdCreativeOptimizationConfigByTypeDictImpl = (IGAdCreativeOptimizationConfigByTypeDictImpl) obj;
                if (!0qQ.A0K(this.A00, iGAdCreativeOptimizationConfigByTypeDictImpl.A00) || !0qQ.A0K(this.A01, iGAdCreativeOptimizationConfigByTypeDictImpl.A01)) {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String BYY() {
        return this.A00;
    }

    public final String BYb() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdCreativeOptimizationConfigByTypeDict", C44164CYd.A00(this));
    }

    public IGAdCreativeOptimizationConfigByTypeDictImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}

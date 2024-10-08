package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.CVJ;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class CallAdsInfoDict extends AnonymousClass0T0 implements Parcelable, CallAdsInfoDictIntf {
    public static final Parcelable.Creator CREATOR = new SWT(81);
    public final String A00;
    public final boolean A01;

    public final CallAdsInfoDict F19() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallAdsInfoDict) {
                CallAdsInfoDict callAdsInfoDict = (CallAdsInfoDict) obj;
                if (!0qQ.A0K(this.A00, callAdsInfoDict.A00) || this.A01 != callAdsInfoDict.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final String Bai() {
        return this.A00;
    }

    public final boolean BuT() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCallAdsInfoDict", CVJ.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public CallAdsInfoDict(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}

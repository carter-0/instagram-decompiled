package com.instagram.model.showreelnative;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C55058HbT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IgShowreelNativeAssetImpl extends AnonymousClass0T0 implements Parcelable, IgShowreelNativeAsset {
    public static final Parcelable.Creator CREATOR = new C376399Hv(56);
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final IgShowreelNativeAssetImpl FFz() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelNativeAssetImpl) {
                IgShowreelNativeAssetImpl igShowreelNativeAssetImpl = (IgShowreelNativeAssetImpl) obj;
                if (!0qQ.A0K(this.A00, igShowreelNativeAssetImpl.A00) || !0qQ.A0K(this.A02, igShowreelNativeAssetImpl.A02) || !0qQ.A0K(this.A01, igShowreelNativeAssetImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A02);
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    public final Integer BCu() {
        return this.A00;
    }

    public final Integer CGY() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAssetsInfo", C55058HbT.A00(this));
    }

    public final String getUrl() {
        return this.A02;
    }

    public IgShowreelNativeAssetImpl(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}

package com.instagram.model.showreel;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import X.C44948Cni;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IgShowreelCompositionAssetInfo extends AnonymousClass0T0 implements Parcelable, IgShowreelCompositionAssetInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376399Hv(52);
    public final IgShowreelCompositionAssetType A00;
    public final String A01;

    public final IgShowreelCompositionAssetInfo FFw() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelCompositionAssetInfo) {
                IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo = (IgShowreelCompositionAssetInfo) obj;
                if (this.A00 != igShowreelCompositionAssetInfo.A00 || !0qQ.A0K(this.A01, igShowreelCompositionAssetInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = this.A00;
        int i = 0;
        int hashCode = (igShowreelCompositionAssetType == null ? 0 : igShowreelCompositionAssetType.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = this.A00;
        if (igShowreelCompositionAssetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igShowreelCompositionAssetType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public final IgShowreelCompositionAssetType CAb() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowReelBloksAssetInfo", C44948Cni.A00(this));
    }

    public final String getUrl() {
        return this.A01;
    }

    public IgShowreelCompositionAssetInfo(IgShowreelCompositionAssetType igShowreelCompositionAssetType, String str) {
        this.A00 = igShowreelCompositionAssetType;
        this.A01 = str;
    }
}

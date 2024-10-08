package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C41869B4n;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class FanClubStatusSyncInfoImpl extends AnonymousClass0T0 implements Parcelable, FanClubStatusSyncInfo {
    public static final Parcelable.Creator CREATOR = new C376389Hu(1);
    public final Long A00;
    public final boolean A01;
    public final boolean A02;

    public final FanClubStatusSyncInfoImpl F2z() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubStatusSyncInfoImpl) {
                FanClubStatusSyncInfoImpl fanClubStatusSyncInfoImpl = (FanClubStatusSyncInfoImpl) obj;
                if (!(this.A01 == fanClubStatusSyncInfoImpl.A01 && this.A02 == fanClubStatusSyncInfoImpl.A02 && 0qQ.A0K(this.A00, fanClubStatusSyncInfoImpl.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Long l = this.A00;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }

    public final boolean B0l() {
        return this.A01;
    }

    public final boolean C2O() {
        return this.A02;
    }

    public final Long C2P() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFanClubStatusSyncInfo", C41869B4n.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Long l = this.A00;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i4 + hashCode;
    }

    public FanClubStatusSyncInfoImpl(Long l, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = l;
    }
}

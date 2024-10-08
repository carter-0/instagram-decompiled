package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.C41874B4s;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ClipsMashupFollowButtonInfoImpl extends AnonymousClass0T0 implements Parcelable, ClipsMashupFollowButtonInfo {
    public static final Parcelable.Creator CREATOR = new C376409Hw(72);
    public final Boolean A00;
    public final Boolean A01;

    public final ClipsMashupFollowButtonInfoImpl F1Y() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsMashupFollowButtonInfoImpl) {
                ClipsMashupFollowButtonInfoImpl clipsMashupFollowButtonInfoImpl = (ClipsMashupFollowButtonInfoImpl) obj;
                if (!0qQ.A0K(this.A00, clipsMashupFollowButtonInfoImpl.A00) || !0qQ.A0K(this.A01, clipsMashupFollowButtonInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
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
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public final Boolean BvP() {
        return this.A01;
    }

    public final Boolean CYi() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsMashupFollowButtonInfo", C41874B4s.A00(this));
    }

    public ClipsMashupFollowButtonInfoImpl(Boolean bool, Boolean bool2) {
        this.A00 = bool;
        this.A01 = bool2;
    }
}

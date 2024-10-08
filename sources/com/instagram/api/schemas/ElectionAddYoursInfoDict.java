package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import X.V7B;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ElectionAddYoursInfoDict extends AnonymousClass0T0 implements Parcelable, ElectionAddYoursInfoDictIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(97);
    public final Boolean A00;
    public final String A01;
    public final List A02;

    public final ElectionAddYoursInfoDict F2j() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ElectionAddYoursInfoDict) {
                ElectionAddYoursInfoDict electionAddYoursInfoDict = (ElectionAddYoursInfoDict) obj;
                if (!0qQ.A0K(this.A00, electionAddYoursInfoDict.A00) || !0qQ.A0K(this.A02, electionAddYoursInfoDict.A02) || !0qQ.A0K(this.A01, electionAddYoursInfoDict.A01)) {
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
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = false;
        0qQ.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeStringList(this.A02);
        parcel.writeString(this.A01);
    }

    public final Boolean AxP() {
        return this.A00;
    }

    public final List C7v() {
        return this.A02;
    }

    public final String C9m() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTElectionAddYoursInfoDict", V7B.A00(this));
    }

    public ElectionAddYoursInfoDict(Boolean bool, String str, List list) {
        this.A00 = bool;
        this.A02 = list;
        this.A01 = str;
    }
}

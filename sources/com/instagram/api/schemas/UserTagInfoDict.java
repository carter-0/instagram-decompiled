package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.B4T;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

public final class UserTagInfoDict extends AnonymousClass0T0 implements UserTagInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(53);
    public final User A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final List A04;
    public final List A05;

    public final UserTagInfoDict FDC(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserTagInfoDict) {
                UserTagInfoDict userTagInfoDict = (UserTagInfoDict) obj;
                if (!0qQ.A0K(this.A04, userTagInfoDict.A04) || !0qQ.A0K(this.A02, userTagInfoDict.A02) || !0qQ.A0K(this.A05, userTagInfoDict.A05) || !0qQ.A0K(this.A01, userTagInfoDict.A01) || !0qQ.A0K(this.A03, userTagInfoDict.A03) || !0qQ.A0K(this.A00, userTagInfoDict.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Float f = this.A02;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        List list2 = this.A05;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        User user = this.A00;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A04);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List<Number> list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number floatValue : list) {
                parcel.writeFloat(floatValue.floatValue());
            }
        }
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f2 = this.A03;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final List AmF() {
        return this.A04;
    }

    public final Float AzK() {
        return this.A02;
    }

    public final List Bdo() {
        return this.A05;
    }

    public final Boolean Bv9() {
        return this.A01;
    }

    public final Float Byq() {
        return this.A03;
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserTagInfoDict", B4T.A00(this));
    }

    public UserTagInfoDict(User user, Boolean bool, Float f, Float f2, List list, List list2) {
        this.A04 = list;
        this.A02 = f;
        this.A05 = list2;
        this.A01 = bool;
        this.A03 = f2;
        this.A00 = user;
    }

    public final UserTagInfoDictIntf E9V(1E9 r1) {
        return this;
    }
}

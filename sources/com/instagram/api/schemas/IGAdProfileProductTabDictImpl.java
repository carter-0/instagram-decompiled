package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44167CYg;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class IGAdProfileProductTabDictImpl extends AnonymousClass0T0 implements Parcelable, IGAdProfileProductTabDict {
    public static final Parcelable.Creator CREATOR = new FK5(2);
    public final IGAdProfileProductTabFeatureModeEnum A00;
    public final Boolean A01;
    public final Boolean A02;
    public final List A03;

    public final IGAdProfileProductTabDictImpl F3r(1E9 r1) {
        return this;
    }

    public final IGAdProfileProductTabDictImpl F3s(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdProfileProductTabDictImpl) {
                IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl = (IGAdProfileProductTabDictImpl) obj;
                if (this.A00 != iGAdProfileProductTabDictImpl.A00 || !0qQ.A0K(this.A01, iGAdProfileProductTabDictImpl.A01) || !0qQ.A0K(this.A02, iGAdProfileProductTabDictImpl.A02) || !0qQ.A0K(this.A03, iGAdProfileProductTabDictImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        C41848B3p.A1I(parcel, this.A01);
        C41848B3p.A1I(parcel, this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final IGAdProfileProductTabFeatureModeEnum B4r() {
        return this.A00;
    }

    public final Boolean BUE() {
        return this.A02;
    }

    public final List Bga() {
        return this.A03;
    }

    public final Boolean CZn() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGAdProfileProductTabDict", C44167CYg.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public IGAdProfileProductTabDictImpl(IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum, Boolean bool, Boolean bool2, List list) {
        this.A00 = iGAdProfileProductTabFeatureModeEnum;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = list;
    }

    public final IGAdProfileProductTabDict E7V(1E9 r1) {
        return this;
    }
}

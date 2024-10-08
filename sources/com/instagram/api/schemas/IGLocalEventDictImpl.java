package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CZ9;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGLocalEventDictImpl extends AnonymousClass0T0 implements Parcelable, IGLocalEventDict {
    public static final Parcelable.Creator CREATOR = new FK5(22);
    public final EventVisibilityType A00;
    public final String A01;

    public final IGLocalEventDictImpl F4d() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGLocalEventDictImpl) {
                IGLocalEventDictImpl iGLocalEventDictImpl = (IGLocalEventDictImpl) obj;
                if (!0qQ.A0K(this.A01, iGLocalEventDictImpl.A01) || this.A00 != iGLocalEventDictImpl.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final String BF1() {
        return this.A01;
    }

    public final EventVisibilityType BF2() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGLocalEventDict", CZ9.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public IGLocalEventDictImpl(EventVisibilityType eventVisibilityType, String str) {
        this.A01 = str;
        this.A00 = eventVisibilityType;
    }
}

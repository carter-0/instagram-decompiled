package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44299Cch;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class Range extends AnonymousClass0T0 implements Parcelable, RangeIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(62);
    public final Entity A00;
    public final Integer A01;
    public final Integer A02;

    public final Range F8U() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                if (!0qQ.A0K(this.A00, range.A00) || !0qQ.A0K(this.A01, range.A01) || !0qQ.A0K(this.A02, range.A02)) {
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
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final Entity B1q() {
        return this.A00;
    }

    public final Integer BMP() {
        return this.A01;
    }

    public final Integer BXp() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTRange", C44299Cch.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public Range(Entity entity, Integer num, Integer num2) {
        this.A00 = entity;
        this.A01 = num;
        this.A02 = num2;
    }
}

package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44192CZf;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class InlineStyleAtRangeDict extends AnonymousClass0T0 implements Parcelable, InlineStyleAtRangeDictIntf {
    public static final Parcelable.Creator CREATOR = new FK5(37);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public final InlineStyleAtRangeDict F5D() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineStyleAtRangeDict) {
                InlineStyleAtRangeDict inlineStyleAtRangeDict = (InlineStyleAtRangeDict) obj;
                if (!0qQ.A0K(this.A00, inlineStyleAtRangeDict.A00) || !0qQ.A0K(this.A01, inlineStyleAtRangeDict.A01) || !0qQ.A0K(this.A02, inlineStyleAtRangeDict.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final Integer BHI() {
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
        return C41845B3m.A0T("XDTInlineStyleAtRangeDict", C44192CZf.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public InlineStyleAtRangeDict(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = num3;
    }
}

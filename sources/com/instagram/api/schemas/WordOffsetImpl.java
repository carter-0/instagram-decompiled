package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.C44584ChI;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class WordOffsetImpl extends AnonymousClass0T0 implements Parcelable, WordOffset {
    public static final Parcelable.Creator CREATOR = new FK6(61);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public final WordOffsetImpl FDS() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WordOffsetImpl) {
                WordOffsetImpl wordOffsetImpl = (WordOffsetImpl) obj;
                if (!(this.A00 == wordOffsetImpl.A00 && this.A01 == wordOffsetImpl.A01 && this.A02 == wordOffsetImpl.A02 && this.A03 == wordOffsetImpl.A03 && this.A04 == wordOffsetImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int B1W() {
        return this.A01;
    }

    public final int Byf() {
        return this.A02;
    }

    public final int Byi() {
        return this.A03;
    }

    public final boolean C9N() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTWordOffset", C44584ChI.A00(this));
    }

    public final int getEndIndex() {
        return this.A00;
    }

    public final int hashCode() {
        int i = ((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return i + i2;
    }

    public WordOffsetImpl(int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = z;
    }
}

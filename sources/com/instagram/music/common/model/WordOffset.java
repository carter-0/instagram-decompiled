package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DbS;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class WordOffset extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(57);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WordOffset) {
                WordOffset wordOffset = (WordOffset) obj;
                if (!(this.A02 == wordOffset.A02 && this.A00 == wordOffset.A00 && this.A03 == wordOffset.A03 && this.A01 == wordOffset.A01 && this.A04 == wordOffset.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A04, ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31);
    }

    public WordOffset(int i, int i2, int i3, int i4, boolean z) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A04 = z;
    }

    public WordOffset() {
        this(0, 0, 0, 0, false);
    }
}

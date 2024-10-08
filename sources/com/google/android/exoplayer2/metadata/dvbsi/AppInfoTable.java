package com.google.android.exoplayer2.metadata.dvbsi;

import X.002;
import X.AnonymousClass4RQ;
import X.C256683wB;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(45);
    public final int A00;
    public final String A01;

    public final /* synthetic */ void E37(AnonymousClass4RQ r1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final String toString() {
        return 002.A08(this.A00, "Ait(controlCode=", ",url=", this.A01, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AppInfoTable(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}

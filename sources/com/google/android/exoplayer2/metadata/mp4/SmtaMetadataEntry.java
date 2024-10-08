package com.google.android.exoplayer2.metadata.mp4;

import X.AnonymousClass4RQ;
import X.AnonymousClass7TE;
import X.C256683wB;
import X.C66583MXo;
import X.Pxe;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(66);
    public final float A00;
    public final int A01;

    public final /* synthetic */ void E37(AnonymousClass4RQ r1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (!(this.A00 == smtaMetadataEntry.A00 && this.A01 == smtaMetadataEntry.A01)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final int hashCode() {
        return C66583MXo.A01(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("smta: captureFrameRate=");
        A1A.append(this.A00);
        A1A.append(", svcTemporalLayerCount=");
        return Pxe.A0z(A1A, this.A01);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}

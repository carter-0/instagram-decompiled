package com.google.android.exoplayer2.metadata.vr;

import X.AnonymousClass4RQ;
import X.C256683wB;
import X.C51972G9s;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

public class CameraMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(73);
    public int A00;
    public final long A01;
    public final float[] A02;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((CameraMotionData) obj).A02);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A07 = C51972G9s.A07(this.A01, 527) + Arrays.hashCode(this.A02);
        this.A00 = A07;
        return A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A02);
    }

    public CameraMotionData(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A02 = parcel.createFloatArray();
    }
}

package com.facebook.avatar.autogen.flow;

import X.0qQ;
import X.C11367SPk;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;

public class AESelfieCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(12);
    public final FaceTrackerModelsProvider A00;
    public final Boolean A01;
    public final String A02;
    public final ResourcesProvider A03;

    public AESelfieCaptureConfig(FaceTrackerModelsProvider faceTrackerModelsProvider, Boolean bool, String str) {
        this.A00 = faceTrackerModelsProvider;
        this.A03 = null;
        this.A01 = bool;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AESelfieCaptureConfig) {
                AESelfieCaptureConfig aESelfieCaptureConfig = (AESelfieCaptureConfig) obj;
                if (!0qQ.A0K(this.A00, aESelfieCaptureConfig.A00) || !0qQ.A0K(this.A03, aESelfieCaptureConfig.A03) || !0qQ.A0K(this.A01, aESelfieCaptureConfig.A01) || !0qQ.A0K(this.A02, aESelfieCaptureConfig.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A18(parcel, this.A00, i);
        Pxj.A18(parcel, this.A03, i);
        C41848B3p.A1I(parcel, this.A01);
        Pxj.A1B(parcel, this.A02, 0, 1);
    }

    public AESelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FaceTrackerModelsProvider) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (ResourcesProvider) parcel.readParcelable(A0W);
        }
        this.A01 = parcel.readInt() != 0 ? Boolean.valueOf(Pxg.A1U(parcel)) : bool;
        this.A02 = Pxi.A0e(parcel);
    }
}

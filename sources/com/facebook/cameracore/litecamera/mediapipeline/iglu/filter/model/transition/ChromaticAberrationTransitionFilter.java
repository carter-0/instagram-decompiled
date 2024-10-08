package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C366498p3;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

public final class ChromaticAberrationTransitionFilter implements TransitionFilter {
    public static final Parcelable.Creator CREATOR = new SWS(48);
    public float A00;
    public boolean A01;
    public final TransformMatrixParams A02;
    public final float[] A03;
    public final float[] A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloatArray(this.A04);
        parcel.writeFloatArray(this.A03);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
    }

    public final float C9V() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ FilterModel deepCopy() {
        ChromaticAberrationTransitionFilter chromaticAberrationTransitionFilter = new ChromaticAberrationTransitionFilter(new TransformMatrixParams(this.A02), AnonymousClass7TF.A1a(this.A04), AnonymousClass7TF.A1a(this.A03), 0.0f, true);
        chromaticAberrationTransitionFilter.A00 = chromaticAberrationTransitionFilter.A00;
        chromaticAberrationTransitionFilter.A01 = chromaticAberrationTransitionFilter.A01;
        return chromaticAberrationTransitionFilter;
    }

    public final float[] getContentTransform() {
        return this.A03;
    }

    public final String getFilterName() {
        return "chromatic_aberration";
    }

    public final float[] getTextureTransform() {
        return this.A04;
    }

    public final TransformMatrixParams getTransformMatrixParams() {
        return this.A02;
    }

    public final boolean isEnabled() {
        return this.A01;
    }

    public ChromaticAberrationTransitionFilter(TransformMatrixParams transformMatrixParams, float[] fArr, float[] fArr2, float f, boolean z) {
        AnonymousClass7TG.A1Q(fArr, fArr2);
        0qQ.A0B(transformMatrixParams, 5);
        this.A00 = f;
        this.A04 = fArr;
        this.A03 = fArr2;
        this.A01 = z;
        this.A02 = transformMatrixParams;
    }

    public final void EpD(float f) {
        this.A00 = f;
    }

    public final void setEnabled(boolean z) {
        this.A01 = z;
    }

    public ChromaticAberrationTransitionFilter() {
        this(AnonymousClass7TH.A08(), C366498p3.A00(), C366498p3.A00(), 0.0f, true);
    }
}

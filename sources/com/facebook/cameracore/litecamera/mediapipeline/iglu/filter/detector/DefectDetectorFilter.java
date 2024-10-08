package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TF;
import X.C392499uu;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.jni.HybridData;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DefectDetectorFilter extends DetectionFilterModel {
    public static final Parcelable.Creator CREATOR = new SWS(36);
    public static final C392499uu Companion = new Object();
    public final String filterName;
    public final HybridData mHybridData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefectDetectorFilter(String str) {
        super((float[]) null, (float[]) null, false, (TransformMatrixParams) null, 15, (DefaultConstructorMarker) null);
        0qQ.A0B(str, 1);
        this.filterName = str;
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native boolean allSamplesSameColor();

    public final int describeContents() {
        return 0;
    }

    public final native int numBlack();

    public final native int numFramesSameColor();

    public final native int numSamples();

    public final native int rgba();

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.filterName);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9uu] */
    static {
        0dV.A0C("mediapipeline-iglufilter-detector");
    }

    public DefectDetectorFilter deepCopy() {
        return new DefectDetectorFilter("defect_detection");
    }

    public String getFilterName() {
        return this.filterName;
    }

    public Map getDetectionStatistics() {
        return AnonymousClass7TF.A0w("percent_black", Float.valueOf(percentBlack()));
    }

    public final float percentBlack() {
        int numSamples = numSamples();
        if (numSamples == 0) {
            numSamples = 1;
        }
        return (((float) numBlack()) * 100.0f) / ((float) numSamples);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefectDetectorFilter(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "defect_detection" : str);
    }

    public DefectDetectorFilter() {
        this("defect_detection");
    }
}

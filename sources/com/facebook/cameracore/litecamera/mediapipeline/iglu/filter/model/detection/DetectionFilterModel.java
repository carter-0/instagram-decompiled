package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C366728pZ;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.nio.FloatBuffer;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class DetectionFilterModel implements FilterModel, Parcelable {
    public final float[] contentTransform;
    public boolean isEnabled;
    public final float[] textureTransform;
    public final TransformMatrixParams transformMatrixParams;

    public DetectionFilterModel() {
        this((float[]) null, (float[]) null, false, (TransformMatrixParams) null, 15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void copyContentTransform(float[] fArr) {
        C366728pZ.A00(this, fArr);
    }

    public /* synthetic */ void copyTextureTransform(float[] fArr) {
        C366728pZ.A01(this, fArr);
    }

    public /* synthetic */ void copyTransformMatrixParams(TransformMatrixParams transformMatrixParams2) {
        0qQ.A0B(transformMatrixParams2, 1);
        this.transformMatrixParams.A00(transformMatrixParams2);
    }

    public abstract Map getDetectionStatistics();

    public float[] getContentTransform() {
        return this.contentTransform;
    }

    public float[] getTextureTransform() {
        return this.textureTransform;
    }

    public /* synthetic */ FloatBuffer getTextureTransformBuffer() {
        FloatBuffer wrap = FloatBuffer.wrap(this.textureTransform);
        0qQ.A07(wrap);
        return wrap;
    }

    public TransformMatrixParams getTransformMatrixParams() {
        return this.transformMatrixParams;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public DetectionFilterModel(float[] fArr, float[] fArr2, boolean z, TransformMatrixParams transformMatrixParams2) {
        AnonymousClass7TG.A1O(fArr, fArr2);
        0qQ.A0B(transformMatrixParams2, 4);
        this.textureTransform = fArr;
        this.contentTransform = fArr2;
        this.isEnabled = z;
        this.transformMatrixParams = transformMatrixParams2;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DetectionFilterModel(float[] r10, float[] r11, boolean r12, com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r9 = this;
            r1 = r13
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0009
            float[] r10 = X.C366498p3.A00()
        L_0x0009:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0011
            float[] r11 = X.C366498p3.A00()
        L_0x0011:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0016
            r12 = 1
        L_0x0016:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0028:
            r9.<init>(r10, r11, r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel.<init>(float[], float[], boolean, com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

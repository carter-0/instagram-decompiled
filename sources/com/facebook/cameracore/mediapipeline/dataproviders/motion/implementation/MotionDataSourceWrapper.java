package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass8z2;
import X.C391119sN;
import X.C41810B1p;
import com.facebook.jni.HybridData;

public class MotionDataSourceWrapper implements C41810B1p {
    public final AnonymousClass8z2 mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        if (1 - this.mDataSource.B2T().intValue() != 0) {
            return 0;
        }
        return 1;
    }

    public boolean hasRawData() {
        return this.mDataSource.CKS();
    }

    public boolean isSensorAvailable(int i) {
        return this.mDataSource.Cbe(i);
    }

    public void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, j);
        }
    }

    public void onRawSensorMeasurementChanged(C391119sN r2, float[] fArr, long j) {
        if (this.mIsAlive) {
            setRawSensorResult(r2.A00, fArr, j);
        }
    }

    public void start() {
        this.mDataSource.start();
    }

    public void stop() {
        this.mDataSource.stop();
    }

    public MotionDataSourceWrapper(AnonymousClass8z2 r2) {
        this.mDataSource = r2;
        r2.A8u(this);
    }
}

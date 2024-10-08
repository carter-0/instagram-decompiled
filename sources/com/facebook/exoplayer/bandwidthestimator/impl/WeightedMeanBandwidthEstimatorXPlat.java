package com.facebook.exoplayer.bandwidthestimator.impl;

import X.1xk;
import X.288;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.jni.VideoJni;

public class WeightedMeanBandwidthEstimatorXPlat implements 288 {
    public long mJniContext = 0;
    public VideoJni mVideoJni;

    public synchronized void addSample(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.mVideoJni.weightedMeanBandwidthEstimatorEnqueueSample(this.mJniContext, j3, j, j2);
    }

    public synchronized VideoBandwidthEstimate getBandwidthEstimate(AbrContextAwareConfiguration abrContextAwareConfiguration) {
        return this.mVideoJni.weightedMeanBandwidthEstimatorGetBandwidthEstimate(this.mJniContext);
    }

    public void reset(1xk r1) {
    }

    public void setParams(boolean z, double d, long j, long j2, long j3, double d2, double d3, long j4) {
        this.mVideoJni.weightedMeanBandwidthEstimatorSetParams(this.mJniContext, z, d, j, j2, j3, d2, d3, j4);
    }

    public WeightedMeanBandwidthEstimatorXPlat() {
        VideoJni videoJni = new VideoJni();
        this.mVideoJni = videoJni;
        this.mJniContext = videoJni.weightedMeanBandwidthEstimatorInit();
    }

    public synchronized void addSample(long j, long j2, long j3) {
        synchronized (this) {
            addSample(j, j2, j3, -1, -1, true, true);
        }
    }
}

package com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen;

import X.0qQ;
import X.C51974G9v;

public final class PregenerateSdpData {
    public final String audioTrack;
    public final String sdpString;
    public final String signalingId;
    public final String transactionId;
    public final String videoTrack;

    public final String getAudioTrack() {
        return this.audioTrack;
    }

    public final String getSdpString() {
        return this.sdpString;
    }

    public final String getSignalingId() {
        return this.signalingId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getVideoTrack() {
        return this.videoTrack;
    }

    public PregenerateSdpData(String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1P(str, str2, str3, str4);
        0qQ.A0B(str5, 5);
        this.signalingId = str;
        this.transactionId = str2;
        this.sdpString = str3;
        this.audioTrack = str4;
        this.videoTrack = str5;
    }
}

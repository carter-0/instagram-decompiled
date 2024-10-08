package com.facebook.rsys.mediastats.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66580MXl;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class MediaStats {
    public static 2LV CONVERTER = C71546Omh.A00(43);
    public static long sMcfTypeId;
    public final Float audioBitrateKbps;
    public final Long audioBytesReceived;
    public final Long audioBytesSent;
    public final String audioCodec;
    public final Long audioCtpLatencyMs;
    public final Long audioCtpRoundtripLatencyMs;
    public final Long audioE2eDelayMS;
    public final Long audioEstimatedPlayoutTimestampMS;
    public final Long audioFecPacketsReceived;
    public final Long audioJitterMS;
    public final Long audioLevel;
    public final Long audioNackCount;
    public final Long audioPacketsLost;
    public final Long audioPacketsReceived;
    public final Long audioRetransmittedPacketsSent;
    public final Float audioSamplingRateKhz;
    public final String audioSsrc;
    public final Float audioTargetBitrateKbps;
    public final Long availableOutgoingBitrate;
    public final Long avgRttMs;
    public final int channelType;
    public final Long concealedSamples;
    public final String connectionType;
    public final Long curRttMs;
    public final String currentIpVersion;
    public final Integer localNetworkCost;
    public final String localType;
    public final Long maxBitrateKbps;
    public final int mediaPath;
    public final String mimeType;
    public final Long minBitrateKbps;
    public final Integer noiseSuppressionMode;
    public final Boolean nsCpuFallbackStatus;
    public final Long nsInferenceTime;
    public final Integer remoteNetworkCost;
    public final String remoteType;
    public final ScreenShareStats screenShareStats;
    public final Long startBitrateKbps;
    public final int streamDirection;
    public final String streamId;
    public final int streamType;
    public final Long totalSamplesReceived;
    public final String userId;
    public final ArrayList videoStreams;

    public static native MediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0119, code lost:
        if (r1.equals(r0) != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0128, code lost:
        if (r1.equals(r0) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0137, code lost:
        if (r1.equals(r0) != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0146, code lost:
        if (r1.equals(r0) != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0155, code lost:
        if (r1.equals(r0) != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0164, code lost:
        if (r1.equals(r0) != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0173, code lost:
        if (r1.equals(r0) != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0182, code lost:
        if (r1.equals(r0) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0191, code lost:
        if (r1.equals(r0) != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01a0, code lost:
        if (r1.equals(r0) != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x01af, code lost:
        if (r1.equals(r0) != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01ce, code lost:
        if (r1.equals(r0) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x01dd, code lost:
        if (r1.equals(r0) != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x01ec, code lost:
        if (r1.equals(r0) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0201, code lost:
        if (r1.equals(r0) != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0210, code lost:
        if (r1.equals(r0) != false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x021f, code lost:
        if (r1.equals(r0) != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x023e, code lost:
        if (r1.equals(r0) != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x024d, code lost:
        if (r1.equals(r0) != false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x025c, code lost:
        if (r1.equals(r0) != false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r1.equals(r0) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r1.equals(r0) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        if (r1.equals(r0) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        if (r1.equals(r0) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0092, code lost:
        if (r1.equals(r0) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a1, code lost:
        if (r1.equals(r0) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b0, code lost:
        if (r1.equals(r0) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bf, code lost:
        if (r1.equals(r0) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ce, code lost:
        if (r1.equals(r0) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00dd, code lost:
        if (r1.equals(r0) != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ec, code lost:
        if (r1.equals(r0) != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00fb, code lost:
        if (r1.equals(r0) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x010a, code lost:
        if (r1.equals(r0) != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x026e
            boolean r0 = r5 instanceof com.facebook.rsys.mediastats.gen.MediaStats
            r2 = 0
            if (r0 == 0) goto L_0x0038
            com.facebook.rsys.mediastats.gen.MediaStats r5 = (com.facebook.rsys.mediastats.gen.MediaStats) r5
            java.lang.String r1 = r4.streamId
            java.lang.String r0 = r5.streamId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r4.userId
            java.lang.String r0 = r5.userId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            int r1 = r4.channelType
            int r0 = r5.channelType
            if (r1 != r0) goto L_0x0038
            int r1 = r4.streamDirection
            int r0 = r5.streamDirection
            if (r1 != r0) goto L_0x0038
            int r1 = r4.streamType
            int r0 = r5.streamType
            if (r1 != r0) goto L_0x0038
            java.lang.String r1 = r4.mimeType
            java.lang.String r0 = r5.mimeType
            if (r1 != 0) goto L_0x0039
            if (r0 == 0) goto L_0x003f
        L_0x0038:
            return r2
        L_0x0039:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x003f:
            java.util.ArrayList r1 = r4.videoStreams
            java.util.ArrayList r0 = r5.videoStreams
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r4.audioSsrc
            java.lang.String r0 = r5.audioSsrc
            if (r1 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0058
            return r2
        L_0x0052:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0058:
            java.lang.Long r1 = r4.audioEstimatedPlayoutTimestampMS
            java.lang.Long r0 = r5.audioEstimatedPlayoutTimestampMS
            if (r1 != 0) goto L_0x0061
            if (r0 == 0) goto L_0x0067
            return r2
        L_0x0061:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0067:
            java.lang.Float r1 = r4.audioSamplingRateKhz
            java.lang.Float r0 = r5.audioSamplingRateKhz
            if (r1 != 0) goto L_0x0070
            if (r0 == 0) goto L_0x0076
            return r2
        L_0x0070:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0076:
            java.lang.Long r1 = r4.audioE2eDelayMS
            java.lang.Long r0 = r5.audioE2eDelayMS
            if (r1 != 0) goto L_0x007f
            if (r0 == 0) goto L_0x0085
            return r2
        L_0x007f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0085:
            java.lang.String r1 = r4.audioCodec
            java.lang.String r0 = r5.audioCodec
            if (r1 != 0) goto L_0x008e
            if (r0 == 0) goto L_0x0094
            return r2
        L_0x008e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0094:
            java.lang.Float r1 = r4.audioBitrateKbps
            java.lang.Float r0 = r5.audioBitrateKbps
            if (r1 != 0) goto L_0x009d
            if (r0 == 0) goto L_0x00a3
            return r2
        L_0x009d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00a3:
            java.lang.Float r1 = r4.audioTargetBitrateKbps
            java.lang.Float r0 = r5.audioTargetBitrateKbps
            if (r1 != 0) goto L_0x00ac
            if (r0 == 0) goto L_0x00b2
            return r2
        L_0x00ac:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00b2:
            java.lang.Long r1 = r4.audioBytesReceived
            java.lang.Long r0 = r5.audioBytesReceived
            if (r1 != 0) goto L_0x00bb
            if (r0 == 0) goto L_0x00c1
            return r2
        L_0x00bb:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00c1:
            java.lang.Long r1 = r4.audioBytesSent
            java.lang.Long r0 = r5.audioBytesSent
            if (r1 != 0) goto L_0x00ca
            if (r0 == 0) goto L_0x00d0
            return r2
        L_0x00ca:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00d0:
            java.lang.Long r1 = r4.audioPacketsReceived
            java.lang.Long r0 = r5.audioPacketsReceived
            if (r1 != 0) goto L_0x00d9
            if (r0 == 0) goto L_0x00df
            return r2
        L_0x00d9:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00df:
            java.lang.Long r1 = r4.audioPacketsLost
            java.lang.Long r0 = r5.audioPacketsLost
            if (r1 != 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00ee
            return r2
        L_0x00e8:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00ee:
            java.lang.Long r1 = r4.audioFecPacketsReceived
            java.lang.Long r0 = r5.audioFecPacketsReceived
            if (r1 != 0) goto L_0x00f7
            if (r0 == 0) goto L_0x00fd
            return r2
        L_0x00f7:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x00fd:
            java.lang.Long r1 = r4.audioNackCount
            java.lang.Long r0 = r5.audioNackCount
            if (r1 != 0) goto L_0x0106
            if (r0 == 0) goto L_0x010c
            return r2
        L_0x0106:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x010c:
            java.lang.Long r1 = r4.audioRetransmittedPacketsSent
            java.lang.Long r0 = r5.audioRetransmittedPacketsSent
            if (r1 != 0) goto L_0x0115
            if (r0 == 0) goto L_0x011b
            return r2
        L_0x0115:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x011b:
            java.lang.Long r1 = r4.audioJitterMS
            java.lang.Long r0 = r5.audioJitterMS
            if (r1 != 0) goto L_0x0124
            if (r0 == 0) goto L_0x012a
            return r2
        L_0x0124:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x012a:
            java.lang.Long r1 = r4.audioCtpLatencyMs
            java.lang.Long r0 = r5.audioCtpLatencyMs
            if (r1 != 0) goto L_0x0133
            if (r0 == 0) goto L_0x0139
            return r2
        L_0x0133:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0139:
            java.lang.Long r1 = r4.audioCtpRoundtripLatencyMs
            java.lang.Long r0 = r5.audioCtpRoundtripLatencyMs
            if (r1 != 0) goto L_0x0142
            if (r0 == 0) goto L_0x0148
            return r2
        L_0x0142:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0148:
            java.lang.Long r1 = r4.minBitrateKbps
            java.lang.Long r0 = r5.minBitrateKbps
            if (r1 != 0) goto L_0x0151
            if (r0 == 0) goto L_0x0157
            return r2
        L_0x0151:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0157:
            java.lang.Long r1 = r4.startBitrateKbps
            java.lang.Long r0 = r5.startBitrateKbps
            if (r1 != 0) goto L_0x0160
            if (r0 == 0) goto L_0x0166
            return r2
        L_0x0160:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0166:
            java.lang.Long r1 = r4.maxBitrateKbps
            java.lang.Long r0 = r5.maxBitrateKbps
            if (r1 != 0) goto L_0x016f
            if (r0 == 0) goto L_0x0175
            return r2
        L_0x016f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0175:
            java.lang.String r1 = r4.connectionType
            java.lang.String r0 = r5.connectionType
            if (r1 != 0) goto L_0x017e
            if (r0 == 0) goto L_0x0184
            return r2
        L_0x017e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0184:
            java.lang.String r1 = r4.currentIpVersion
            java.lang.String r0 = r5.currentIpVersion
            if (r1 != 0) goto L_0x018d
            if (r0 == 0) goto L_0x0193
            return r2
        L_0x018d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0193:
            java.lang.Long r1 = r4.avgRttMs
            java.lang.Long r0 = r5.avgRttMs
            if (r1 != 0) goto L_0x019c
            if (r0 == 0) goto L_0x01a2
            return r2
        L_0x019c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x01a2:
            java.lang.Long r1 = r4.curRttMs
            java.lang.Long r0 = r5.curRttMs
            if (r1 != 0) goto L_0x01ab
            if (r0 == 0) goto L_0x01b1
            return r2
        L_0x01ab:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x01b1:
            java.lang.Integer r1 = r4.localNetworkCost
            java.lang.Integer r0 = r5.localNetworkCost
            if (r1 != 0) goto L_0x01ba
            if (r0 == 0) goto L_0x01c1
            return r2
        L_0x01ba:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01c1
            return r2
        L_0x01c1:
            java.lang.String r1 = r4.localType
            java.lang.String r0 = r5.localType
            if (r1 != 0) goto L_0x01ca
            if (r0 == 0) goto L_0x01d0
            return r2
        L_0x01ca:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x01d0:
            java.lang.Integer r1 = r4.remoteNetworkCost
            java.lang.Integer r0 = r5.remoteNetworkCost
            if (r1 != 0) goto L_0x01d9
            if (r0 == 0) goto L_0x01df
            return r2
        L_0x01d9:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x01df:
            java.lang.String r1 = r4.remoteType
            java.lang.String r0 = r5.remoteType
            if (r1 != 0) goto L_0x01e8
            if (r0 == 0) goto L_0x01ee
            return r2
        L_0x01e8:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x01ee:
            int r1 = r4.mediaPath
            int r0 = r5.mediaPath
            if (r1 != r0) goto L_0x0038
            java.lang.Long r1 = r4.concealedSamples
            java.lang.Long r0 = r5.concealedSamples
            if (r1 != 0) goto L_0x01fd
            if (r0 == 0) goto L_0x0203
            return r2
        L_0x01fd:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0203:
            java.lang.Long r1 = r4.totalSamplesReceived
            java.lang.Long r0 = r5.totalSamplesReceived
            if (r1 != 0) goto L_0x020c
            if (r0 == 0) goto L_0x0212
            return r2
        L_0x020c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0212:
            java.lang.Long r1 = r4.audioLevel
            java.lang.Long r0 = r5.audioLevel
            if (r1 != 0) goto L_0x021b
            if (r0 == 0) goto L_0x0221
            return r2
        L_0x021b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0221:
            java.lang.Long r1 = r4.availableOutgoingBitrate
            java.lang.Long r0 = r5.availableOutgoingBitrate
            if (r1 != 0) goto L_0x022a
            if (r0 == 0) goto L_0x0231
            return r2
        L_0x022a:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0231
            return r2
        L_0x0231:
            java.lang.Long r1 = r4.nsInferenceTime
            java.lang.Long r0 = r5.nsInferenceTime
            if (r1 != 0) goto L_0x023a
            if (r0 == 0) goto L_0x0240
            return r2
        L_0x023a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x0240:
            java.lang.Boolean r1 = r4.nsCpuFallbackStatus
            java.lang.Boolean r0 = r5.nsCpuFallbackStatus
            if (r1 != 0) goto L_0x0249
            if (r0 == 0) goto L_0x024f
            return r2
        L_0x0249:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x024f:
            java.lang.Integer r1 = r4.noiseSuppressionMode
            java.lang.Integer r0 = r5.noiseSuppressionMode
            if (r1 != 0) goto L_0x0258
            if (r0 == 0) goto L_0x025e
            return r2
        L_0x0258:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x025e:
            com.facebook.rsys.mediastats.gen.ScreenShareStats r1 = r4.screenShareStats
            com.facebook.rsys.mediastats.gen.ScreenShareStats r0 = r5.screenShareStats
            if (r1 != 0) goto L_0x0267
            if (r0 == 0) goto L_0x026e
            return r2
        L_0x0267:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x026e
            return r2
        L_0x026e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.mediastats.gen.MediaStats.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.streamId);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass7TF.A07(this.videoStreams, (((((((AnonymousClass7TF.A08(this.userId, A06) + this.channelType) * 31) + this.streamDirection) * 31) + this.streamType) * 31) + AnonymousClass7TG.A0E(this.mimeType)) * 31) + AnonymousClass7TG.A0E(this.audioSsrc)) * 31) + AnonymousClass7TG.A0C(this.audioEstimatedPlayoutTimestampMS)) * 31) + AnonymousClass7TG.A0C(this.audioSamplingRateKhz)) * 31) + AnonymousClass7TG.A0C(this.audioE2eDelayMS)) * 31) + AnonymousClass7TG.A0E(this.audioCodec)) * 31) + AnonymousClass7TG.A0C(this.audioBitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.audioTargetBitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.audioBytesReceived)) * 31) + AnonymousClass7TG.A0C(this.audioBytesSent)) * 31) + AnonymousClass7TG.A0C(this.audioPacketsReceived)) * 31) + AnonymousClass7TG.A0C(this.audioPacketsLost)) * 31) + AnonymousClass7TG.A0C(this.audioFecPacketsReceived)) * 31) + AnonymousClass7TG.A0C(this.audioNackCount)) * 31) + AnonymousClass7TG.A0C(this.audioRetransmittedPacketsSent)) * 31) + AnonymousClass7TG.A0C(this.audioJitterMS)) * 31) + AnonymousClass7TG.A0C(this.audioCtpLatencyMs)) * 31) + AnonymousClass7TG.A0C(this.audioCtpRoundtripLatencyMs)) * 31) + AnonymousClass7TG.A0C(this.minBitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.startBitrateKbps)) * 31) + AnonymousClass7TG.A0C(this.maxBitrateKbps)) * 31) + AnonymousClass7TG.A0E(this.connectionType)) * 31) + AnonymousClass7TG.A0E(this.currentIpVersion)) * 31) + AnonymousClass7TG.A0C(this.avgRttMs)) * 31) + AnonymousClass7TG.A0C(this.curRttMs)) * 31) + AnonymousClass7TG.A0C(this.localNetworkCost)) * 31) + AnonymousClass7TG.A0E(this.localType)) * 31) + AnonymousClass7TG.A0C(this.remoteNetworkCost)) * 31) + AnonymousClass7TG.A0E(this.remoteType)) * 31) + this.mediaPath) * 31) + AnonymousClass7TG.A0C(this.concealedSamples)) * 31) + AnonymousClass7TG.A0C(this.totalSamplesReceived)) * 31) + AnonymousClass7TG.A0C(this.audioLevel)) * 31) + AnonymousClass7TG.A0C(this.availableOutgoingBitrate)) * 31) + AnonymousClass7TG.A0C(this.nsInferenceTime)) * 31) + AnonymousClass7TG.A0C(this.nsCpuFallbackStatus)) * 31) + AnonymousClass7TG.A0C(this.noiseSuppressionMode)) * 31) + AnonymousClass7TE.A0L(this.screenShareStats);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaStats{");
        C66580MXl.A1V("streamId=", this.streamId, A1A);
        C66580MXl.A1V(",userId=", this.userId, A1A);
        A1A.append(002.A0O(",channelType=", this.channelType));
        A1A.append(002.A0O(",streamDirection=", this.streamDirection));
        A1A.append(002.A0O(",streamType=", this.streamType));
        C66580MXl.A1V(",mimeType=", this.mimeType, A1A);
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append(",videoStreams=");
        A1A.append(AnonymousClass7TF.A0i(this.videoStreams, A1A2));
        C66580MXl.A1V(",audioSsrc=", this.audioSsrc, A1A);
        StringBuilder A1A3 = AnonymousClass7TE.A1A();
        A1A3.append(",audioEstimatedPlayoutTimestampMS=");
        StringBuilder A0c = C66584MXp.A0c(this.audioEstimatedPlayoutTimestampMS, A1A3, A1A);
        A0c.append(",audioSamplingRateKhz=");
        StringBuilder A0c2 = C66584MXp.A0c(this.audioSamplingRateKhz, A0c, A1A);
        A0c2.append(",audioE2eDelayMS=");
        A1A.append(AnonymousClass7TF.A0i(this.audioE2eDelayMS, A0c2));
        C66580MXl.A1V(",audioCodec=", this.audioCodec, A1A);
        StringBuilder A1A4 = AnonymousClass7TE.A1A();
        A1A4.append(",audioBitrateKbps=");
        StringBuilder A0c3 = C66584MXp.A0c(this.audioBitrateKbps, A1A4, A1A);
        A0c3.append(",audioTargetBitrateKbps=");
        StringBuilder A0c4 = C66584MXp.A0c(this.audioTargetBitrateKbps, A0c3, A1A);
        A0c4.append(",audioBytesReceived=");
        StringBuilder A0c5 = C66584MXp.A0c(this.audioBytesReceived, A0c4, A1A);
        A0c5.append(",audioBytesSent=");
        StringBuilder A0c6 = C66584MXp.A0c(this.audioBytesSent, A0c5, A1A);
        A0c6.append(",audioPacketsReceived=");
        StringBuilder A0c7 = C66584MXp.A0c(this.audioPacketsReceived, A0c6, A1A);
        A0c7.append(",audioPacketsLost=");
        StringBuilder A0c8 = C66584MXp.A0c(this.audioPacketsLost, A0c7, A1A);
        A0c8.append(",audioFecPacketsReceived=");
        StringBuilder A0c9 = C66584MXp.A0c(this.audioFecPacketsReceived, A0c8, A1A);
        A0c9.append(",audioNackCount=");
        StringBuilder A0c10 = C66584MXp.A0c(this.audioNackCount, A0c9, A1A);
        A0c10.append(",audioRetransmittedPacketsSent=");
        StringBuilder A0c11 = C66584MXp.A0c(this.audioRetransmittedPacketsSent, A0c10, A1A);
        A0c11.append(",audioJitterMS=");
        StringBuilder A0c12 = C66584MXp.A0c(this.audioJitterMS, A0c11, A1A);
        A0c12.append(",audioCtpLatencyMs=");
        StringBuilder A0c13 = C66584MXp.A0c(this.audioCtpLatencyMs, A0c12, A1A);
        A0c13.append(",audioCtpRoundtripLatencyMs=");
        StringBuilder A0c14 = C66584MXp.A0c(this.audioCtpRoundtripLatencyMs, A0c13, A1A);
        A0c14.append(",minBitrateKbps=");
        StringBuilder A0c15 = C66584MXp.A0c(this.minBitrateKbps, A0c14, A1A);
        A0c15.append(",startBitrateKbps=");
        StringBuilder A0c16 = C66584MXp.A0c(this.startBitrateKbps, A0c15, A1A);
        A0c16.append(",maxBitrateKbps=");
        A1A.append(AnonymousClass7TF.A0i(this.maxBitrateKbps, A0c16));
        C66580MXl.A1V(",connectionType=", this.connectionType, A1A);
        C66580MXl.A1V(",currentIpVersion=", this.currentIpVersion, A1A);
        StringBuilder A1A5 = AnonymousClass7TE.A1A();
        A1A5.append(",avgRttMs=");
        StringBuilder A0c17 = C66584MXp.A0c(this.avgRttMs, A1A5, A1A);
        A0c17.append(",curRttMs=");
        StringBuilder A0c18 = C66584MXp.A0c(this.curRttMs, A0c17, A1A);
        A0c18.append(",localNetworkCost=");
        A1A.append(AnonymousClass7TF.A0i(this.localNetworkCost, A0c18));
        C66580MXl.A1V(",localType=", this.localType, A1A);
        StringBuilder A1A6 = AnonymousClass7TE.A1A();
        A1A6.append(",remoteNetworkCost=");
        A1A.append(AnonymousClass7TF.A0i(this.remoteNetworkCost, A1A6));
        C66580MXl.A1V(",remoteType=", this.remoteType, A1A);
        A1A.append(002.A0O(",mediaPath=", this.mediaPath));
        StringBuilder A1A7 = AnonymousClass7TE.A1A();
        A1A7.append(",concealedSamples=");
        StringBuilder A0c19 = C66584MXp.A0c(this.concealedSamples, A1A7, A1A);
        A0c19.append(",totalSamplesReceived=");
        StringBuilder A0c20 = C66584MXp.A0c(this.totalSamplesReceived, A0c19, A1A);
        A0c20.append(",audioLevel=");
        StringBuilder A0c21 = C66584MXp.A0c(this.audioLevel, A0c20, A1A);
        A0c21.append(",availableOutgoingBitrate=");
        StringBuilder A0c22 = C66584MXp.A0c(this.availableOutgoingBitrate, A0c21, A1A);
        A0c22.append(",nsInferenceTime=");
        StringBuilder A0c23 = C66584MXp.A0c(this.nsInferenceTime, A0c22, A1A);
        A0c23.append(",nsCpuFallbackStatus=");
        StringBuilder A0c24 = C66584MXp.A0c(this.nsCpuFallbackStatus, A0c23, A1A);
        A0c24.append(",noiseSuppressionMode=");
        StringBuilder A0c25 = C66584MXp.A0c(this.noiseSuppressionMode, A0c24, A1A);
        A0c25.append(",screenShareStats=");
        return C66584MXp.A0a(AnonymousClass7TF.A0i(this.screenShareStats, A0c25), A1A);
    }

    public MediaStats(String str, String str2, int i, int i2, int i3, String str3, ArrayList arrayList, String str4, Long l, Float f, Long l2, String str5, Float f2, Float f3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, String str6, String str7, Long l16, Long l17, Integer num, String str8, Integer num2, String str9, int i4, Long l18, Long l19, Long l20, Long l21, Long l22, Boolean bool, Integer num3, ScreenShareStats screenShareStats2) {
        C66581MXm.A1R(str, str2, arrayList);
        this.streamId = str;
        this.userId = str2;
        this.channelType = i;
        this.streamDirection = i2;
        this.streamType = i3;
        this.mimeType = str3;
        this.videoStreams = arrayList;
        this.audioSsrc = str4;
        this.audioEstimatedPlayoutTimestampMS = l;
        this.audioSamplingRateKhz = f;
        this.audioE2eDelayMS = l2;
        this.audioCodec = str5;
        this.audioBitrateKbps = f2;
        this.audioTargetBitrateKbps = f3;
        this.audioBytesReceived = l3;
        this.audioBytesSent = l4;
        this.audioPacketsReceived = l5;
        this.audioPacketsLost = l6;
        this.audioFecPacketsReceived = l7;
        this.audioNackCount = l8;
        this.audioRetransmittedPacketsSent = l9;
        this.audioJitterMS = l10;
        this.audioCtpLatencyMs = l11;
        this.audioCtpRoundtripLatencyMs = l12;
        this.minBitrateKbps = l13;
        this.startBitrateKbps = l14;
        this.maxBitrateKbps = l15;
        this.connectionType = str6;
        this.currentIpVersion = str7;
        this.avgRttMs = l16;
        this.curRttMs = l17;
        this.localNetworkCost = num;
        this.localType = str8;
        this.remoteNetworkCost = num2;
        this.remoteType = str9;
        this.mediaPath = i4;
        this.concealedSamples = l18;
        this.totalSamplesReceived = l19;
        this.audioLevel = l20;
        this.availableOutgoingBitrate = l21;
        this.nsInferenceTime = l22;
        this.nsCpuFallbackStatus = bool;
        this.noiseSuppressionMode = num3;
        this.screenShareStats = screenShareStats2;
    }
}

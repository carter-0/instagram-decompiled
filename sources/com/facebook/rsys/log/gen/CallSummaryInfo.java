package com.facebook.rsys.log.gen;

import X.002;
import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66579MXk;
import X.C66580MXl;
import X.C66583MXo;
import X.C66584MXp;
import X.Pxf;
import com.facebook.djinni.msys.infra.McfReference;

public class CallSummaryInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(67);
    public static long sMcfTypeId;
    public final Long autoRejoinCount;
    public final Long autoRejoinSuccessfulCount;
    public final Long batteryEndLevel;
    public final Long batteryStartLevel;
    public final long callAnsweredTime;
    public final long callConnectedTime;
    public final long callCreatedTime;
    public final long callEndedTime;
    public final String callTrigger;
    public final String clientSessionId;
    public final String coldStartReason;
    public final Long deviceShutdownTime;
    public final String endCallAppState;
    public final String endCallReason;
    public final String endCallSubreason;
    public final Long engineCreatedTime;
    public final Boolean inviteRequestedVideo;
    public final Boolean isAutomation;
    public final boolean isCaller;
    public final Boolean isConnectedEnd;
    public final String joinMode;
    public final Long joinableCompleteTime;
    public final String joiningContext;
    public final long lastUpdatedTime;
    public final String localCallId;
    public final Long localVideoDuration;
    public final Long maxConcurrentConnectedParticipant;
    public final Long mediaGateBlockedFrameCount;
    public final String peerId;
    public final Boolean remoteEnded;
    public final Long remoteVideoDuration;
    public final Long rtcActorId;
    public final String sharedCallId;
    public final long steadyTime;
    public final long systemTime;
    public final String videoEscalationStatus;
    public final Boolean wasDeviceCharged;
    public final String webDeviceId;
    public final String webrtcVersion;

    public class Builder {
        public Long autoRejoinCount;
        public Long autoRejoinSuccessfulCount;
        public Long batteryEndLevel;
        public Long batteryStartLevel;
        public long callAnsweredTime;
        public long callConnectedTime;
        public long callCreatedTime;
        public long callEndedTime;
        public String callTrigger;
        public String clientSessionId;
        public String coldStartReason;
        public Long deviceShutdownTime;
        public String endCallAppState;
        public String endCallReason;
        public String endCallSubreason;
        public Long engineCreatedTime;
        public Boolean inviteRequestedVideo;
        public Boolean isAutomation;
        public boolean isCaller;
        public Boolean isConnectedEnd;
        public String joinMode;
        public Long joinableCompleteTime;
        public String joiningContext;
        public long lastUpdatedTime;
        public String localCallId;
        public Long localVideoDuration;
        public Long maxConcurrentConnectedParticipant;
        public Long mediaGateBlockedFrameCount;
        public String peerId;
        public Boolean remoteEnded;
        public Long remoteVideoDuration;
        public Long rtcActorId;
        public String sharedCallId;
        public long steadyTime;
        public long systemTime;
        public String videoEscalationStatus;
        public Boolean wasDeviceCharged;
        public String webDeviceId;
        public String webrtcVersion;

        public CallSummaryInfo build() {
            return new CallSummaryInfo(this);
        }
    }

    public static native CallSummaryInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011d, code lost:
        if (r1.equals(r0) != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x012c, code lost:
        if (r1.equals(r0) != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x013b, code lost:
        if (r1.equals(r0) != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x014a, code lost:
        if (r1.equals(r0) != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0159, code lost:
        if (r1.equals(r0) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0168, code lost:
        if (r1.equals(r0) != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0177, code lost:
        if (r1.equals(r0) != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0186, code lost:
        if (r1.equals(r0) != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0195, code lost:
        if (r1.equals(r0) != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01b4, code lost:
        if (r1.equals(r0) != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01c3, code lost:
        if (r1.equals(r0) != false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x01d2, code lost:
        if (r1.equals(r0) != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x01e1, code lost:
        if (r1.equals(r0) != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x01f0, code lost:
        if (r1.equals(r0) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x01ff, code lost:
        if (r1.equals(r0) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r1.equals(r0) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r1.equals(r0) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        if (r1.equals(r0) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a5, code lost:
        if (r1.equals(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        if (r1.equals(r0) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c3, code lost:
        if (r1.equals(r0) != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d2, code lost:
        if (r1.equals(r0) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e1, code lost:
        if (r1.equals(r0) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f0, code lost:
        if (r1.equals(r0) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00ff, code lost:
        if (r1.equals(r0) != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x010e, code lost:
        if (r1.equals(r0) != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0211
            boolean r0 = r8 instanceof com.facebook.rsys.log.gen.CallSummaryInfo
            r5 = 0
            if (r0 == 0) goto L_0x001c
            com.facebook.rsys.log.gen.CallSummaryInfo r8 = (com.facebook.rsys.log.gen.CallSummaryInfo) r8
            java.lang.String r1 = r7.localCallId
            java.lang.String r0 = r8.localCallId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = r7.sharedCallId
            java.lang.String r0 = r8.sharedCallId
            if (r1 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x0023
        L_0x001c:
            return r5
        L_0x001d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0023:
            long r3 = r7.systemTime
            long r1 = r8.systemTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            long r3 = r7.steadyTime
            long r1 = r8.steadyTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            long r3 = r7.callCreatedTime
            long r1 = r8.callCreatedTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            java.lang.Long r1 = r7.engineCreatedTime
            java.lang.Long r0 = r8.engineCreatedTime
            if (r1 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x004a
            return r5
        L_0x0044:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x004a:
            long r3 = r7.callAnsweredTime
            long r1 = r8.callAnsweredTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            long r3 = r7.callConnectedTime
            long r1 = r8.callConnectedTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            long r3 = r7.callEndedTime
            long r1 = r8.callEndedTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            java.lang.Long r1 = r7.joinableCompleteTime
            java.lang.Long r0 = r8.joinableCompleteTime
            if (r1 != 0) goto L_0x006b
            if (r0 == 0) goto L_0x0071
            return r5
        L_0x006b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0071:
            long r3 = r7.lastUpdatedTime
            long r1 = r8.lastUpdatedTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            java.lang.String r1 = r7.callTrigger
            java.lang.String r0 = r8.callTrigger
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            boolean r1 = r7.isCaller
            boolean r0 = r8.isCaller
            if (r1 != r0) goto L_0x001c
            java.lang.String r1 = r7.peerId
            java.lang.String r0 = r8.peerId
            if (r1 != 0) goto L_0x0092
            if (r0 == 0) goto L_0x0098
            return r5
        L_0x0092:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0098:
            java.lang.String r1 = r7.endCallReason
            java.lang.String r0 = r8.endCallReason
            if (r1 != 0) goto L_0x00a1
            if (r0 == 0) goto L_0x00a7
            return r5
        L_0x00a1:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00a7:
            java.lang.Boolean r1 = r7.remoteEnded
            java.lang.Boolean r0 = r8.remoteEnded
            if (r1 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b6
            return r5
        L_0x00b0:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00b6:
            java.lang.Boolean r1 = r7.inviteRequestedVideo
            java.lang.Boolean r0 = r8.inviteRequestedVideo
            if (r1 != 0) goto L_0x00bf
            if (r0 == 0) goto L_0x00c5
            return r5
        L_0x00bf:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00c5:
            java.lang.Long r1 = r7.mediaGateBlockedFrameCount
            java.lang.Long r0 = r8.mediaGateBlockedFrameCount
            if (r1 != 0) goto L_0x00ce
            if (r0 == 0) goto L_0x00d4
            return r5
        L_0x00ce:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00d4:
            java.lang.String r1 = r7.videoEscalationStatus
            java.lang.String r0 = r8.videoEscalationStatus
            if (r1 != 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00e3
            return r5
        L_0x00dd:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00e3:
            java.lang.Long r1 = r7.localVideoDuration
            java.lang.Long r0 = r8.localVideoDuration
            if (r1 != 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00f2
            return r5
        L_0x00ec:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x00f2:
            java.lang.Long r1 = r7.remoteVideoDuration
            java.lang.Long r0 = r8.remoteVideoDuration
            if (r1 != 0) goto L_0x00fb
            if (r0 == 0) goto L_0x0101
            return r5
        L_0x00fb:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0101:
            java.lang.Long r1 = r7.batteryStartLevel
            java.lang.Long r0 = r8.batteryStartLevel
            if (r1 != 0) goto L_0x010a
            if (r0 == 0) goto L_0x0110
            return r5
        L_0x010a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0110:
            java.lang.Long r1 = r7.batteryEndLevel
            java.lang.Long r0 = r8.batteryEndLevel
            if (r1 != 0) goto L_0x0119
            if (r0 == 0) goto L_0x011f
            return r5
        L_0x0119:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x011f:
            java.lang.Boolean r1 = r7.wasDeviceCharged
            java.lang.Boolean r0 = r8.wasDeviceCharged
            if (r1 != 0) goto L_0x0128
            if (r0 == 0) goto L_0x012e
            return r5
        L_0x0128:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x012e:
            java.lang.String r1 = r7.joiningContext
            java.lang.String r0 = r8.joiningContext
            if (r1 != 0) goto L_0x0137
            if (r0 == 0) goto L_0x013d
            return r5
        L_0x0137:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x013d:
            java.lang.String r1 = r7.webDeviceId
            java.lang.String r0 = r8.webDeviceId
            if (r1 != 0) goto L_0x0146
            if (r0 == 0) goto L_0x014c
            return r5
        L_0x0146:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x014c:
            java.lang.String r1 = r7.endCallSubreason
            java.lang.String r0 = r8.endCallSubreason
            if (r1 != 0) goto L_0x0155
            if (r0 == 0) goto L_0x015b
            return r5
        L_0x0155:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x015b:
            java.lang.String r1 = r7.coldStartReason
            java.lang.String r0 = r8.coldStartReason
            if (r1 != 0) goto L_0x0164
            if (r0 == 0) goto L_0x016a
            return r5
        L_0x0164:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x016a:
            java.lang.Boolean r1 = r7.isConnectedEnd
            java.lang.Boolean r0 = r8.isConnectedEnd
            if (r1 != 0) goto L_0x0173
            if (r0 == 0) goto L_0x0179
            return r5
        L_0x0173:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0179:
            java.lang.Long r1 = r7.deviceShutdownTime
            java.lang.Long r0 = r8.deviceShutdownTime
            if (r1 != 0) goto L_0x0182
            if (r0 == 0) goto L_0x0188
            return r5
        L_0x0182:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0188:
            java.lang.Long r1 = r7.maxConcurrentConnectedParticipant
            java.lang.Long r0 = r8.maxConcurrentConnectedParticipant
            if (r1 != 0) goto L_0x0191
            if (r0 == 0) goto L_0x0197
            return r5
        L_0x0191:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0197:
            java.lang.Long r1 = r7.rtcActorId
            java.lang.Long r0 = r8.rtcActorId
            if (r1 != 0) goto L_0x01a0
            if (r0 == 0) goto L_0x01a7
            return r5
        L_0x01a0:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a7
            return r5
        L_0x01a7:
            java.lang.Long r1 = r7.autoRejoinCount
            java.lang.Long r0 = r8.autoRejoinCount
            if (r1 != 0) goto L_0x01b0
            if (r0 == 0) goto L_0x01b6
            return r5
        L_0x01b0:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x01b6:
            java.lang.String r1 = r7.joinMode
            java.lang.String r0 = r8.joinMode
            if (r1 != 0) goto L_0x01bf
            if (r0 == 0) goto L_0x01c5
            return r5
        L_0x01bf:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x01c5:
            java.lang.Long r1 = r7.autoRejoinSuccessfulCount
            java.lang.Long r0 = r8.autoRejoinSuccessfulCount
            if (r1 != 0) goto L_0x01ce
            if (r0 == 0) goto L_0x01d4
            return r5
        L_0x01ce:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x01d4:
            java.lang.String r1 = r7.webrtcVersion
            java.lang.String r0 = r8.webrtcVersion
            if (r1 != 0) goto L_0x01dd
            if (r0 == 0) goto L_0x01e3
            return r5
        L_0x01dd:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x01e3:
            java.lang.String r1 = r7.clientSessionId
            java.lang.String r0 = r8.clientSessionId
            if (r1 != 0) goto L_0x01ec
            if (r0 == 0) goto L_0x01f2
            return r5
        L_0x01ec:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x01f2:
            java.lang.String r1 = r7.endCallAppState
            java.lang.String r0 = r8.endCallAppState
            if (r1 != 0) goto L_0x01fb
            if (r0 == 0) goto L_0x0201
            return r5
        L_0x01fb:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0201:
            java.lang.Boolean r1 = r7.isAutomation
            java.lang.Boolean r0 = r8.isAutomation
            if (r1 != 0) goto L_0x020a
            if (r0 == 0) goto L_0x0211
            return r5
        L_0x020a:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0211
            return r5
        L_0x0211:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.log.gen.CallSummaryInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A01 = AnonymousClass7TF.A01(this.steadyTime, AnonymousClass7TF.A01(this.systemTime, (C66583MXo.A06(this.localCallId) + AnonymousClass7TG.A0E(this.sharedCallId)) * 31));
        int A012 = AnonymousClass7TF.A01(this.callConnectedTime, AnonymousClass7TF.A01(this.callAnsweredTime, (AnonymousClass7TF.A01(this.callCreatedTime, A01) + AnonymousClass7TG.A0C(this.engineCreatedTime)) * 31));
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass7TF.A08(this.callTrigger, AnonymousClass7TF.A01(this.lastUpdatedTime, (AnonymousClass7TF.A01(this.callEndedTime, A012) + AnonymousClass7TG.A0C(this.joinableCompleteTime)) * 31)) + (this.isCaller ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.peerId)) * 31) + AnonymousClass7TG.A0E(this.endCallReason)) * 31) + AnonymousClass7TG.A0C(this.remoteEnded)) * 31) + AnonymousClass7TG.A0C(this.inviteRequestedVideo)) * 31) + AnonymousClass7TG.A0C(this.mediaGateBlockedFrameCount)) * 31) + AnonymousClass7TG.A0E(this.videoEscalationStatus)) * 31) + AnonymousClass7TG.A0C(this.localVideoDuration)) * 31) + AnonymousClass7TG.A0C(this.remoteVideoDuration)) * 31) + AnonymousClass7TG.A0C(this.batteryStartLevel)) * 31) + AnonymousClass7TG.A0C(this.batteryEndLevel)) * 31) + AnonymousClass7TG.A0C(this.wasDeviceCharged)) * 31) + AnonymousClass7TG.A0E(this.joiningContext)) * 31) + AnonymousClass7TG.A0E(this.webDeviceId)) * 31) + AnonymousClass7TG.A0E(this.endCallSubreason)) * 31) + AnonymousClass7TG.A0E(this.coldStartReason)) * 31) + AnonymousClass7TG.A0C(this.isConnectedEnd)) * 31) + AnonymousClass7TG.A0C(this.deviceShutdownTime)) * 31) + AnonymousClass7TG.A0C(this.maxConcurrentConnectedParticipant)) * 31) + AnonymousClass7TG.A0C(this.rtcActorId)) * 31) + AnonymousClass7TG.A0C(this.autoRejoinCount)) * 31) + AnonymousClass7TG.A0E(this.joinMode)) * 31) + AnonymousClass7TG.A0C(this.autoRejoinSuccessfulCount)) * 31) + AnonymousClass7TG.A0E(this.webrtcVersion)) * 31) + AnonymousClass7TG.A0E(this.clientSessionId)) * 31) + AnonymousClass7TG.A0E(this.endCallAppState)) * 31) + AnonymousClass7TE.A0L(this.isAutomation);
    }

    public CallSummaryInfo(Builder builder) {
        builder.localCallId.getClass();
        builder.callTrigger.getClass();
        this.localCallId = builder.localCallId;
        this.sharedCallId = builder.sharedCallId;
        this.systemTime = builder.systemTime;
        this.steadyTime = builder.steadyTime;
        this.callCreatedTime = builder.callCreatedTime;
        this.engineCreatedTime = builder.engineCreatedTime;
        this.callAnsweredTime = builder.callAnsweredTime;
        this.callConnectedTime = builder.callConnectedTime;
        this.callEndedTime = builder.callEndedTime;
        this.joinableCompleteTime = builder.joinableCompleteTime;
        this.lastUpdatedTime = builder.lastUpdatedTime;
        this.callTrigger = builder.callTrigger;
        this.isCaller = builder.isCaller;
        this.peerId = builder.peerId;
        this.endCallReason = builder.endCallReason;
        this.remoteEnded = builder.remoteEnded;
        this.inviteRequestedVideo = builder.inviteRequestedVideo;
        this.mediaGateBlockedFrameCount = builder.mediaGateBlockedFrameCount;
        this.videoEscalationStatus = builder.videoEscalationStatus;
        this.localVideoDuration = builder.localVideoDuration;
        this.remoteVideoDuration = builder.remoteVideoDuration;
        this.batteryStartLevel = builder.batteryStartLevel;
        this.batteryEndLevel = builder.batteryEndLevel;
        this.wasDeviceCharged = builder.wasDeviceCharged;
        this.joiningContext = builder.joiningContext;
        this.webDeviceId = builder.webDeviceId;
        this.endCallSubreason = builder.endCallSubreason;
        this.coldStartReason = builder.coldStartReason;
        this.isConnectedEnd = builder.isConnectedEnd;
        this.deviceShutdownTime = builder.deviceShutdownTime;
        this.maxConcurrentConnectedParticipant = builder.maxConcurrentConnectedParticipant;
        this.rtcActorId = builder.rtcActorId;
        this.autoRejoinCount = builder.autoRejoinCount;
        this.joinMode = builder.joinMode;
        this.autoRejoinSuccessfulCount = builder.autoRejoinSuccessfulCount;
        this.webrtcVersion = builder.webrtcVersion;
        this.clientSessionId = builder.clientSessionId;
        this.endCallAppState = builder.endCallAppState;
        this.isAutomation = builder.isAutomation;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallSummaryInfo{");
        C66580MXl.A1V("localCallId=", this.localCallId, A1A);
        C66580MXl.A1V(C66579MXk.A00(455), this.sharedCallId, A1A);
        A1A.append(002.A0Q(",systemTime=", this.systemTime));
        A1A.append(002.A0Q(",steadyTime=", this.steadyTime));
        A1A.append(002.A0Q(",callCreatedTime=", this.callCreatedTime));
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append(",engineCreatedTime=");
        A1A2.append(this.engineCreatedTime);
        Pxf.A1O(A1A, A1A2);
        A1A.append(002.A0Q(",callAnsweredTime=", this.callAnsweredTime));
        A1A.append(002.A0Q(",callConnectedTime=", this.callConnectedTime));
        A1A.append(002.A0Q(",callEndedTime=", this.callEndedTime));
        StringBuilder A1A3 = AnonymousClass7TE.A1A();
        A1A3.append(",joinableCompleteTime=");
        A1A3.append(this.joinableCompleteTime);
        Pxf.A1O(A1A, A1A3);
        A1A.append(002.A0Q(",lastUpdatedTime=", this.lastUpdatedTime));
        C66580MXl.A1V(",callTrigger=", this.callTrigger, A1A);
        A1A.append(002.A1D(",isCaller=", this.isCaller));
        C66580MXl.A1V(",peerId=", this.peerId, A1A);
        C66580MXl.A1V(",endCallReason=", this.endCallReason, A1A);
        StringBuilder A1A4 = AnonymousClass7TE.A1A();
        A1A4.append(C66579MXk.A00(454));
        StringBuilder A0c = C66584MXp.A0c(this.remoteEnded, A1A4, A1A);
        A0c.append(C66579MXk.A00(452));
        StringBuilder A0c2 = C66584MXp.A0c(this.inviteRequestedVideo, A0c, A1A);
        A0c2.append(",mediaGateBlockedFrameCount=");
        A0c2.append(this.mediaGateBlockedFrameCount);
        Pxf.A1O(A1A, A0c2);
        C66580MXl.A1V(",videoEscalationStatus=", this.videoEscalationStatus, A1A);
        StringBuilder A1A5 = AnonymousClass7TE.A1A();
        A1A5.append(",localVideoDuration=");
        StringBuilder A0c3 = C66584MXp.A0c(this.localVideoDuration, A1A5, A1A);
        A0c3.append(",remoteVideoDuration=");
        StringBuilder A0c4 = C66584MXp.A0c(this.remoteVideoDuration, A0c3, A1A);
        A0c4.append(",batteryStartLevel=");
        StringBuilder A0c5 = C66584MXp.A0c(this.batteryStartLevel, A0c4, A1A);
        A0c5.append(",batteryEndLevel=");
        StringBuilder A0c6 = C66584MXp.A0c(this.batteryEndLevel, A0c5, A1A);
        A0c6.append(",wasDeviceCharged=");
        A0c6.append(this.wasDeviceCharged);
        Pxf.A1O(A1A, A0c6);
        C66580MXl.A1V(",joiningContext=", this.joiningContext, A1A);
        C66580MXl.A1V(",webDeviceId=", this.webDeviceId, A1A);
        C66580MXl.A1V(",endCallSubreason=", this.endCallSubreason, A1A);
        C66580MXl.A1V(",coldStartReason=", this.coldStartReason, A1A);
        StringBuilder A1A6 = AnonymousClass7TE.A1A();
        A1A6.append(",isConnectedEnd=");
        StringBuilder A0c7 = C66584MXp.A0c(this.isConnectedEnd, A1A6, A1A);
        A0c7.append(",deviceShutdownTime=");
        StringBuilder A0c8 = C66584MXp.A0c(this.deviceShutdownTime, A0c7, A1A);
        A0c8.append(",maxConcurrentConnectedParticipant=");
        StringBuilder A0c9 = C66584MXp.A0c(this.maxConcurrentConnectedParticipant, A0c8, A1A);
        A0c9.append(",rtcActorId=");
        StringBuilder A0c10 = C66584MXp.A0c(this.rtcActorId, A0c9, A1A);
        A0c10.append(",autoRejoinCount=");
        A0c10.append(this.autoRejoinCount);
        Pxf.A1O(A1A, A0c10);
        C66580MXl.A1V(",joinMode=", this.joinMode, A1A);
        StringBuilder A1A7 = AnonymousClass7TE.A1A();
        A1A7.append(",autoRejoinSuccessfulCount=");
        A1A7.append(this.autoRejoinSuccessfulCount);
        Pxf.A1O(A1A, A1A7);
        C66580MXl.A1V(",webrtcVersion=", this.webrtcVersion, A1A);
        C66580MXl.A1V(",clientSessionId=", this.clientSessionId, A1A);
        C66580MXl.A1V(",endCallAppState=", this.endCallAppState, A1A);
        StringBuilder A1A8 = AnonymousClass7TE.A1A();
        A1A8.append(",isAutomation=");
        return C66584MXp.A0a(AnonymousClass7TF.A0i(this.isAutomation, A1A8), A1A);
    }
}

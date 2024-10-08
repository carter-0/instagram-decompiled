package com.facebook.rsys.call.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import java.util.ArrayList;
import java.util.Map;

public class CallModel {
    public static 2LV CONVERTER = C71546Omh.A00(12);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final CallContext callContext;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final CallInfo callInfo;
    public final int callStartedWithCamera;
    public final String callTrigger;
    public final boolean canSendMultipleVideoStreams;
    public final boolean canSendScreenshareStream;
    public final String clientEndpointId;
    public final int connectionQuality;
    public final int inCallState;
    public final ArrayList initialDataMessages;
    public final int initialDirection;
    public final boolean inviteRequestedVideo;
    public final boolean joinAttemptSent;
    public final int joinMode;
    public final boolean maxParticipantsReached;
    public final ArrayList notifications;
    public final long numSuccessfulRejoins;
    public final long rejoinAttempts;
    public final long rejoinTotalAttempts;
    public final ArrayList remoteParticipants;
    public final int requiredVideoEscalationConsent;
    public final CallParticipant selfParticipant;
    public final String sharedCallId;
    public final boolean supportsSctp;
    public final int transferState;
    public final Map userCapabilities;

    public static native CallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallModel)) {
                return false;
            }
            CallModel callModel = (CallModel) obj;
            if (this.inCallState != callModel.inCallState || this.callCreatedTimestampMs != callModel.callCreatedTimestampMs || this.callAnsweredTimestampMs != callModel.callAnsweredTimestampMs || this.callConnectedTimestampMs != callModel.callConnectedTimestampMs || this.callEndedTimestampMs != callModel.callEndedTimestampMs || this.inviteRequestedVideo != callModel.inviteRequestedVideo || this.acceptRemoteVideoEnabled != callModel.acceptRemoteVideoEnabled || this.requiredVideoEscalationConsent != callModel.requiredVideoEscalationConsent || this.callStartedWithCamera != callModel.callStartedWithCamera || !this.selfParticipant.equals(callModel.selfParticipant) || !this.remoteParticipants.equals(callModel.remoteParticipants) || !this.callContext.equals(callModel.callContext) || !this.callInfo.equals(callModel.callInfo) || this.maxParticipantsReached != callModel.maxParticipantsReached || this.canSendMultipleVideoStreams != callModel.canSendMultipleVideoStreams || this.canSendScreenshareStream != callModel.canSendScreenshareStream) {
                return false;
            }
            String str = this.sharedCallId;
            String str2 = callModel.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.notifications.equals(callModel.notifications)) {
                return false;
            }
            Map map = this.userCapabilities;
            Map map2 = callModel.userCapabilities;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = callModel.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.connectionQuality != callModel.connectionQuality || this.initialDirection != callModel.initialDirection || this.rejoinAttempts != callModel.rejoinAttempts || this.rejoinTotalAttempts != callModel.rejoinTotalAttempts || this.numSuccessfulRejoins != callModel.numSuccessfulRejoins || this.transferState != callModel.transferState || this.joinMode != callModel.joinMode || !this.clientEndpointId.equals(callModel.clientEndpointId) || this.supportsSctp != callModel.supportsSctp || this.joinAttemptSent != callModel.joinAttemptSent) {
                return false;
            }
            String str3 = this.callTrigger;
            String str4 = callModel.callTrigger;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int hashCode;
        int A01 = AnonymousClass7TF.A01(this.callConnectedTimestampMs, AnonymousClass7TF.A01(this.callAnsweredTimestampMs, AnonymousClass7TF.A01(this.callCreatedTimestampMs, C66583MXo.A01(this.inCallState))));
        int A07 = AnonymousClass7TF.A07(this.callContext, AnonymousClass7TF.A07(this.remoteParticipants, AnonymousClass7TF.A07(this.selfParticipant, (((((((AnonymousClass7TF.A01(this.callEndedTimestampMs, A01) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + this.requiredVideoEscalationConsent) * 31) + this.callStartedWithCamera) * 31)));
        int A072 = AnonymousClass7TF.A07(this.notifications, (((((((AnonymousClass7TF.A07(this.callInfo, A07) + (this.maxParticipantsReached ? 1 : 0)) * 31) + (this.canSendMultipleVideoStreams ? 1 : 0)) * 31) + (this.canSendScreenshareStream ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.sharedCallId)) * 31);
        Map map = this.userCapabilities;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int A012 = AnonymousClass7TF.A01(this.rejoinTotalAttempts, AnonymousClass7TF.A01(this.rejoinAttempts, (((((((A072 + hashCode) * 31) + AnonymousClass7TG.A0C(this.initialDataMessages)) * 31) + this.connectionQuality) * 31) + this.initialDirection) * 31));
        return ((((AnonymousClass7TF.A08(this.clientEndpointId, (((AnonymousClass7TF.A01(this.numSuccessfulRejoins, A012) + this.transferState) * 31) + this.joinMode) * 31) + (this.supportsSctp ? 1 : 0)) * 31) + (this.joinAttemptSent ? 1 : 0)) * 31) + C41845B3m.A00(this.callTrigger);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallModel{inCallState=");
        A1A.append(this.inCallState);
        A1A.append(",callCreatedTimestampMs=");
        A1A.append(this.callCreatedTimestampMs);
        A1A.append(",callAnsweredTimestampMs=");
        A1A.append(this.callAnsweredTimestampMs);
        A1A.append(",callConnectedTimestampMs=");
        A1A.append(this.callConnectedTimestampMs);
        A1A.append(",callEndedTimestampMs=");
        A1A.append(this.callEndedTimestampMs);
        A1A.append(",inviteRequestedVideo=");
        A1A.append(this.inviteRequestedVideo);
        A1A.append(",acceptRemoteVideoEnabled=");
        A1A.append(this.acceptRemoteVideoEnabled);
        A1A.append(",requiredVideoEscalationConsent=");
        A1A.append(this.requiredVideoEscalationConsent);
        A1A.append(",callStartedWithCamera=");
        A1A.append(this.callStartedWithCamera);
        A1A.append(",selfParticipant=");
        A1A.append(this.selfParticipant);
        A1A.append(",remoteParticipants=");
        A1A.append(this.remoteParticipants);
        A1A.append(",callContext=");
        A1A.append(this.callContext);
        A1A.append(",callInfo=");
        A1A.append(this.callInfo);
        A1A.append(",maxParticipantsReached=");
        A1A.append(this.maxParticipantsReached);
        A1A.append(",canSendMultipleVideoStreams=");
        A1A.append(this.canSendMultipleVideoStreams);
        A1A.append(",canSendScreenshareStream=");
        A1A.append(this.canSendScreenshareStream);
        A1A.append(",sharedCallId=");
        A1A.append(this.sharedCallId);
        A1A.append(",notifications=");
        A1A.append(this.notifications);
        A1A.append(",userCapabilities=");
        A1A.append(this.userCapabilities);
        A1A.append(",initialDataMessages=");
        A1A.append(this.initialDataMessages);
        A1A.append(",connectionQuality=");
        A1A.append(this.connectionQuality);
        A1A.append(",initialDirection=");
        A1A.append(this.initialDirection);
        A1A.append(",rejoinAttempts=");
        A1A.append(this.rejoinAttempts);
        A1A.append(",rejoinTotalAttempts=");
        A1A.append(this.rejoinTotalAttempts);
        A1A.append(",numSuccessfulRejoins=");
        A1A.append(this.numSuccessfulRejoins);
        A1A.append(",transferState=");
        A1A.append(this.transferState);
        A1A.append(",joinMode=");
        A1A.append(this.joinMode);
        A1A.append(",clientEndpointId=");
        A1A.append(this.clientEndpointId);
        A1A.append(",supportsSctp=");
        A1A.append(this.supportsSctp);
        A1A.append(",joinAttemptSent=");
        A1A.append(this.joinAttemptSent);
        A1A.append(",callTrigger=");
        return C66584MXp.A0a(this.callTrigger, A1A);
    }

    public CallModel(int i, long j, long j2, long j3, long j4, boolean z, boolean z2, int i2, int i3, CallParticipant callParticipant, ArrayList arrayList, CallContext callContext2, CallInfo callInfo2, boolean z3, boolean z4, boolean z5, String str, ArrayList arrayList2, Map map, ArrayList arrayList3, int i4, int i5, long j5, long j6, long j7, int i6, int i7, String str2, boolean z6, boolean z7, String str3) {
        CallContext callContext3 = callContext2;
        CallParticipant callParticipant2 = callParticipant;
        ArrayList arrayList4 = arrayList;
        C66581MXm.A1R(callParticipant2, arrayList4, callContext3);
        ArrayList arrayList5 = arrayList2;
        String str4 = str2;
        CallInfo callInfo3 = callInfo2;
        C66581MXm.A1R(callInfo3, arrayList5, str4);
        this.inCallState = i;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.inviteRequestedVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.requiredVideoEscalationConsent = i2;
        this.callStartedWithCamera = i3;
        this.selfParticipant = callParticipant2;
        this.remoteParticipants = arrayList4;
        this.callContext = callContext3;
        this.callInfo = callInfo3;
        this.maxParticipantsReached = z3;
        this.canSendMultipleVideoStreams = z4;
        this.canSendScreenshareStream = z5;
        this.sharedCallId = str;
        this.notifications = arrayList5;
        this.userCapabilities = map;
        this.initialDataMessages = arrayList3;
        this.connectionQuality = i4;
        this.initialDirection = i5;
        this.rejoinAttempts = j5;
        this.rejoinTotalAttempts = j6;
        this.numSuccessfulRejoins = j7;
        this.transferState = i6;
        this.joinMode = i7;
        this.clientEndpointId = str4;
        this.supportsSctp = z6;
        this.joinAttemptSent = z7;
        this.callTrigger = str3;
    }
}

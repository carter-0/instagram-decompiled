package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.io.File;
import org.json.JSONObject;

public final class Y3I implements Runnable {
    public final /* synthetic */ SE6 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public Y3I(SE6 se6, Object obj, String str) {
        this.A00 = se6;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void run() {
        String A002 = Pxd.A00(353);
        SE6 se6 = this.A00;
        Object obj = this.A01;
        if (obj instanceof CallSummaryInfo) {
            String A003 = Pxd.A00(194);
            try {
                File A004 = SE6.A00(se6, this.A02);
                if (A004 != null) {
                    CallSummaryInfo callSummaryInfo = (CallSummaryInfo) obj;
                    0qQ.A0B(callSummaryInfo, 0);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("localCallId", callSummaryInfo.localCallId);
                    jSONObject.put("sharedCallId", callSummaryInfo.sharedCallId);
                    jSONObject.put("systemTime", callSummaryInfo.systemTime);
                    jSONObject.put("steadyTime", callSummaryInfo.steadyTime);
                    jSONObject.put("callCreatedTime", callSummaryInfo.callCreatedTime);
                    jSONObject.put("engineCreatedTime", callSummaryInfo.engineCreatedTime);
                    jSONObject.put("callAnsweredTime", callSummaryInfo.callAnsweredTime);
                    jSONObject.put("callConnectedTime", callSummaryInfo.callConnectedTime);
                    jSONObject.put("callEndedTime", callSummaryInfo.callEndedTime);
                    jSONObject.put("joinableCompleteTime", callSummaryInfo.joinableCompleteTime);
                    jSONObject.put("lastUpdatedTime", callSummaryInfo.lastUpdatedTime);
                    jSONObject.put("callTrigger", callSummaryInfo.callTrigger);
                    jSONObject.put("isCaller", callSummaryInfo.isCaller);
                    jSONObject.put("peerId", callSummaryInfo.peerId);
                    jSONObject.put("endCallReason", callSummaryInfo.endCallReason);
                    jSONObject.put("remoteEnded", callSummaryInfo.remoteEnded);
                    jSONObject.put("inviteRequestedVideo", callSummaryInfo.inviteRequestedVideo);
                    jSONObject.put("mediaGateBlockedFrameCount", callSummaryInfo.mediaGateBlockedFrameCount);
                    jSONObject.put("videoEscalationStatus", callSummaryInfo.videoEscalationStatus);
                    jSONObject.put("localVideoDuration", callSummaryInfo.localVideoDuration);
                    jSONObject.put("remoteVideoDuration", callSummaryInfo.remoteVideoDuration);
                    jSONObject.put("batteryStartLevel", callSummaryInfo.batteryStartLevel);
                    jSONObject.put("batteryEndLevel", callSummaryInfo.batteryEndLevel);
                    jSONObject.put("wasDeviceCharged", callSummaryInfo.wasDeviceCharged);
                    jSONObject.put("joiningContext", callSummaryInfo.joiningContext);
                    jSONObject.put("webDeviceId", callSummaryInfo.webDeviceId);
                    jSONObject.put("endCallSubreason", callSummaryInfo.endCallSubreason);
                    jSONObject.put("coldStartReason", callSummaryInfo.coldStartReason);
                    jSONObject.put("isConnectedEnd", callSummaryInfo.isConnectedEnd);
                    jSONObject.put("deviceShutdownTime", callSummaryInfo.deviceShutdownTime);
                    jSONObject.put("maxConcurrentConnectedParticipant", callSummaryInfo.maxConcurrentConnectedParticipant);
                    jSONObject.put("rtcActorId", callSummaryInfo.rtcActorId);
                    jSONObject.put("autoRejoinCount", callSummaryInfo.autoRejoinCount);
                    jSONObject.put("joinMode", callSummaryInfo.joinMode);
                    jSONObject.put("autoRejoinSuccessfulCount", callSummaryInfo.autoRejoinSuccessfulCount);
                    jSONObject.put("webrtcVersion", callSummaryInfo.webrtcVersion);
                    jSONObject.put("clientSessionId", callSummaryInfo.clientSessionId);
                    jSONObject.put("endCallAppState", callSummaryInfo.endCallAppState);
                    jSONObject.put("isAutomation", callSummaryInfo.isAutomation);
                    String obj2 = jSONObject.toString();
                    0qQ.A07(obj2);
                    C272134kB.A01(A004, obj2, AnonymousClass15Q.A05);
                }
            } catch (Exception e) {
                0KC.A0C(A002, 002.A0i("Error persisting ", A003, e.getMessage(), 10));
            }
        } else {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2332));
        }
    }
}

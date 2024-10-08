package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Xdf  reason: case insensitive filesystem */
public abstract class C21513Xdf {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.facebook.rsys.log.gen.CallSummaryInfo$Builder] */
    public static final CallSummaryInfo.Builder A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ? obj = new Object();
        obj.localCallId = jSONObject.getString("localCallId");
        Class<String> cls = String.class;
        obj.sharedCallId = (String) A01("sharedCallId", DbS.A0z(cls), jSONObject);
        obj.systemTime = jSONObject.getLong("systemTime");
        obj.steadyTime = jSONObject.getLong("steadyTime");
        obj.callCreatedTime = jSONObject.getLong("callCreatedTime");
        Class cls2 = Long.TYPE;
        obj.engineCreatedTime = (Long) A01("engineCreatedTime", DbS.A0z(cls2), jSONObject);
        obj.callAnsweredTime = jSONObject.getLong("callAnsweredTime");
        obj.callConnectedTime = jSONObject.getLong("callConnectedTime");
        obj.callEndedTime = jSONObject.getLong("callEndedTime");
        obj.joinableCompleteTime = (Long) A01("joinableCompleteTime", DbS.A0z(cls2), jSONObject);
        obj.lastUpdatedTime = jSONObject.getLong("lastUpdatedTime");
        obj.callTrigger = jSONObject.getString("callTrigger");
        obj.isCaller = jSONObject.getBoolean("isCaller");
        obj.peerId = (String) A01("peerId", DbS.A0z(cls), jSONObject);
        obj.endCallReason = (String) A01("endCallReason", DbS.A0z(cls), jSONObject);
        Class cls3 = Boolean.TYPE;
        obj.remoteEnded = (Boolean) A01("remoteEnded", DbS.A0z(cls3), jSONObject);
        obj.inviteRequestedVideo = (Boolean) A01("inviteRequestedVideo", DbS.A0z(cls3), jSONObject);
        Class cls4 = Long.TYPE;
        obj.mediaGateBlockedFrameCount = (Long) A01("mediaGateBlockedFrameCount", DbS.A0z(cls4), jSONObject);
        obj.videoEscalationStatus = (String) A01("videoEscalationStatus", DbS.A0z(cls), jSONObject);
        obj.localVideoDuration = (Long) A01("localVideoDuration", DbS.A0z(cls4), jSONObject);
        obj.remoteVideoDuration = (Long) A01("remoteVideoDuration", DbS.A0z(cls4), jSONObject);
        obj.batteryStartLevel = (Long) A01("batteryStartLevel", DbS.A0z(cls4), jSONObject);
        obj.batteryEndLevel = (Long) A01("batteryEndLevel", DbS.A0z(cls4), jSONObject);
        Class cls5 = Boolean.TYPE;
        obj.wasDeviceCharged = (Boolean) A01("wasDeviceCharged", DbS.A0z(cls5), jSONObject);
        obj.joiningContext = (String) A01("joiningContext", DbS.A0z(cls), jSONObject);
        obj.webDeviceId = (String) A01("webDeviceId", DbS.A0z(cls), jSONObject);
        obj.endCallSubreason = (String) A01("endCallSubreason", DbS.A0z(cls), jSONObject);
        obj.coldStartReason = (String) A01("coldStartReason", DbS.A0z(cls), jSONObject);
        obj.isConnectedEnd = (Boolean) A01("isConnectedEnd", DbS.A0z(cls5), jSONObject);
        Class cls6 = Long.TYPE;
        obj.deviceShutdownTime = (Long) A01("deviceShutdownTime", DbS.A0z(cls6), jSONObject);
        obj.maxConcurrentConnectedParticipant = (Long) A01("maxConcurrentConnectedParticipant", DbS.A0z(cls6), jSONObject);
        obj.rtcActorId = (Long) A01("rtcActorId", DbS.A0z(cls6), jSONObject);
        obj.autoRejoinCount = (Long) A01("autoRejoinCount", DbS.A0z(cls6), jSONObject);
        obj.joinMode = (String) A01("joinMode", DbS.A0z(cls), jSONObject);
        obj.autoRejoinSuccessfulCount = (Long) A01("autoRejoinSuccessfulCount", DbS.A0z(cls6), jSONObject);
        obj.webrtcVersion = (String) A01("webrtcVersion", DbS.A0z(cls), jSONObject);
        obj.clientSessionId = (String) A01("clientSessionId", DbS.A0z(cls), jSONObject);
        obj.endCallAppState = (String) A01("endCallAppState", DbS.A0z(cls), jSONObject);
        obj.isAutomation = (Boolean) A01("isAutomation", DbS.A0z(Boolean.TYPE), jSONObject);
        return obj;
    }

    public static final Object A01(String str, C62230ry r3, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        if (r3.equals(DbS.A0z(Long.TYPE))) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (!r3.equals(DbS.A0z(ArrayList.class))) {
            return jSONObject.get(str);
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            A1C.add(jSONArray.getString(i));
        }
        return A1C;
    }
}

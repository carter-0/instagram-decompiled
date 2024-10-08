package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class VideoBroadcastInitResponseDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        A00.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0453, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0456, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0457, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0458, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x045f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponseDeserializer> r3 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponseDeserializer.class
            monitor-enter(r3)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0460 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0460 }
            A00 = r0     // Catch:{ all -> 0x0460 }
            goto L_0x0019
        L_0x000e:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0460 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0460 }
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            monitor-exit(r3)     // Catch:{ all -> 0x0460 }
            goto L_0x0453
        L_0x0019:
            int r0 = r5.hashCode()     // Catch:{ Exception -> 0x0457 }
            switch(r0) {
                case -2041168456: goto L_0x0440;
                case -2039428490: goto L_0x0433;
                case -2036971626: goto L_0x0426;
                case -1996448119: goto L_0x0419;
                case -1962574392: goto L_0x040c;
                case -1953242922: goto L_0x03ff;
                case -1802903752: goto L_0x03f2;
                case -1650809000: goto L_0x03e5;
                case -1620635397: goto L_0x03d8;
                case -1584948758: goto L_0x03cb;
                case -1396609092: goto L_0x03bd;
                case -1161623056: goto L_0x03af;
                case -1122334557: goto L_0x03a1;
                case -1111046135: goto L_0x0393;
                case -1093908268: goto L_0x0385;
                case -1016336876: goto L_0x0377;
                case -999743699: goto L_0x0369;
                case -961886788: goto L_0x035b;
                case -942024498: goto L_0x034d;
                case -907596817: goto L_0x033f;
                case -869241970: goto L_0x0331;
                case -853241710: goto L_0x0323;
                case -839177260: goto L_0x0315;
                case -765109355: goto L_0x0307;
                case -736787438: goto L_0x02f0;
                case -616627109: goto L_0x02e2;
                case -583345507: goto L_0x02d4;
                case -535019213: goto L_0x02c6;
                case -439159735: goto L_0x02b8;
                case -362085926: goto L_0x02aa;
                case -316008333: goto L_0x029c;
                case -271674120: goto L_0x028e;
                case -263165724: goto L_0x0280;
                case -142925192: goto L_0x0272;
                case -65759451: goto L_0x0264;
                case 28937317: goto L_0x0256;
                case 35269798: goto L_0x0248;
                case 105377053: goto L_0x023a;
                case 121765745: goto L_0x022c;
                case 217505192: goto L_0x021e;
                case 259769754: goto L_0x0210;
                case 375570330: goto L_0x0202;
                case 395645579: goto L_0x01f4;
                case 452782838: goto L_0x01e6;
                case 484039380: goto L_0x01d8;
                case 541657498: goto L_0x01ca;
                case 544223893: goto L_0x01bc;
                case 620453746: goto L_0x01ae;
                case 636249203: goto L_0x01a0;
                case 643752545: goto L_0x0192;
                case 648154620: goto L_0x017b;
                case 709820490: goto L_0x016d;
                case 804735964: goto L_0x015f;
                case 822272317: goto L_0x0151;
                case 957095511: goto L_0x0143;
                case 1027081876: goto L_0x0135;
                case 1058706371: goto L_0x0127;
                case 1098297194: goto L_0x0119;
                case 1103538255: goto L_0x010b;
                case 1105175658: goto L_0x00fd;
                case 1173582466: goto L_0x00ef;
                case 1176571543: goto L_0x00e1;
                case 1340658178: goto L_0x00d3;
                case 1373632294: goto L_0x00c5;
                case 1395497349: goto L_0x00b7;
                case 1418849698: goto L_0x00a9;
                case 1527748552: goto L_0x009b;
                case 1566004466: goto L_0x008d;
                case 1665099749: goto L_0x007f;
                case 1721520993: goto L_0x0071;
                case 1725745867: goto L_0x0063;
                case 1873061351: goto L_0x004c;
                case 1933396294: goto L_0x003e;
                case 2040977419: goto L_0x0030;
                case 2056118302: goto L_0x0022;
                default: goto L_0x0020;
            }     // Catch:{ Exception -> 0x0457 }
        L_0x0020:
            goto L_0x0454
        L_0x0022:
            java.lang.String r1 = "streamVideoAdaptiveBitrateConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0030:
            java.lang.String r1 = "audioOnlyVideoStreamingConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x003e:
            java.lang.String r1 = "rtmpPublishHeaderBase64"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x004c:
            java.lang.String r1 = "availableTabs"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0457 }
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab> r1 = com.facebook.video.common.livestreaming.protocol.LiveWithSocialTab.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField((java.lang.reflect.Field) r2, (java.lang.Class) r1, (X.TA4) r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0063:
            java.lang.String r1 = "canHostInviteGuestAudioOnly"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0071:
            java.lang.String r1 = "canHostInviteGuestsWhileLive"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x007f:
            java.lang.String r1 = "broadcastInterruptionLimitInSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x008d:
            java.lang.String r1 = "liveWithMaxParticipants"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x009b:
            java.lang.String r1 = "fbLivePublishUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00a9:
            java.lang.String r1 = "profileIdIfViewerCanSeeStarsDefaultOnUpsell"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00b7:
            java.lang.String r1 = "videoQualityModel"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00c5:
            java.lang.String r1 = "roiType"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00d3:
            java.lang.String r1 = "isGamingVideo"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00e1:
            java.lang.String r1 = "use1RTTConnectionSetup"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00ef:
            java.lang.String r1 = "streamNetworkSpeedTestPayloadSizeInBytes"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x00fd:
            java.lang.String r1 = "canViewerAdminister"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x010b:
            java.lang.String r1 = "rtcActorId"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0119:
            java.lang.String r1 = "llDesiredLatencyMs"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0127:
            java.lang.String r1 = "videoBroadcastEndscreenConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0135:
            java.lang.String r1 = "shouldShowNotifySubscriberPlugin"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0143:
            java.lang.String r1 = "streamNetworkUseSslFactory"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0151:
            java.lang.String r1 = "canViewerSeeCommunityModerationTools"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x015f:
            java.lang.String r1 = "streamNetworkSpeedTestPayloadTimeoutInSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x016d:
            java.lang.String r1 = "fbLiveFallbackPublishUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x017b:
            java.lang.String r1 = "minimumAgeAudienceRestrictions"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0457 }
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField((java.lang.reflect.Field) r2, (java.lang.Class) r1, (X.TA4) r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0192:
            java.lang.String r1 = "boostedLiveStartTime"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01a0:
            java.lang.String r1 = "streamNetworkConnectionRetryDelayInSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01ae:
            java.lang.String r1 = "latencySetting"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01bc:
            java.lang.String r1 = "streamNetworkMeasurementsIntervalInMs"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01ca:
            java.lang.String r1 = "riskModel"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01d8:
            java.lang.String r1 = "allowBFrame"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01e6:
            java.lang.String r1 = "videoId"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x01f4:
            java.lang.String r1 = "savedFeaturedLinksCount"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0202:
            java.lang.String r1 = "starsCreatorARSettingsID"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0210:
            java.lang.String r1 = "networkLagResumeThreshold"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x021e:
            java.lang.String r1 = "broadcasterUpdateLogIntervalInSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x022c:
            java.lang.String r1 = "disableSpeedTest"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x023a:
            java.lang.String r1 = "fbLiveTransportHeaderBase64"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0248:
            java.lang.String r1 = "fbLiveQuicPublishUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0256:
            java.lang.String r1 = "networkLagStopThreshold"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0264:
            java.lang.String r1 = "rtmpPublishUrl"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0272:
            java.lang.String r1 = "iBPHybridModelConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0280:
            java.lang.String r1 = "hasProfessionalFeaturesForWatch"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x028e:
            java.lang.String r1 = "initialBitratePrediction"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x029c:
            java.lang.String r1 = "streamNetworkConnectionRetryCount"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02aa:
            java.lang.String r1 = "videoBroadcastLiveWithConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02b8:
            java.lang.String r1 = "videoStreamingConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02c6:
            java.lang.String r1 = "resolutionMappingString"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02d4:
            java.lang.String r1 = "liveOnlineEventConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02e2:
            java.lang.String r1 = "liveTraceConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x02f0:
            java.lang.String r1 = "defaultShareToGroupIds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            java.lang.Class<com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse> r0 = com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x0457 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 0
            com.facebook.common.json.FbJsonField r1 = com.facebook.common.json.FbJsonField.jsonField((java.lang.reflect.Field) r2, (java.lang.Class) r1, (X.TA4) r0)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0307:
            java.lang.String r1 = "streamNetworkSendCheckTimeoutMs"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0315:
            java.lang.String r1 = "streamThroughputDecayConstant"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0323:
            java.lang.String r1 = "rawJsonConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0331:
            java.lang.String r1 = "audioStreamingConfig"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x033f:
            java.lang.String r1 = "speedTestMinimumBandwidthThreshold"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x034d:
            java.lang.String r1 = "maxBroadcastDurationSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x035b:
            java.lang.String r1 = "broadcastId"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0369:
            java.lang.String r1 = "passThroughEnabled"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0377:
            java.lang.String r1 = "audioOnlyFormatBitRate"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0385:
            java.lang.String r1 = "boostedLiveAdsStatus"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0393:
            java.lang.String r1 = "latencyTargetType"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03a1:
            java.lang.String r1 = "isViewerClippingEnabled"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03af:
            java.lang.String r1 = "actorId"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03bd:
            java.lang.String r1 = "minBroadcastDurationSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03cb:
            java.lang.String r1 = "isARGiftingEnabled"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03d8:
            java.lang.String r1 = "streamNetworkSpeedTestPayloadChunkSizeInBytes"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03e5:
            java.lang.String r1 = "streamNetworkQueuePercentageOfCapacityToDrop"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03f2:
            java.lang.String r1 = "latencySensitive"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x03ff:
            java.lang.String r1 = "isEligibleMonetizationOnboardingInLive"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x040c:
            java.lang.String r1 = "streamNetworkQueueVideoCapacityInSeconds"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0419:
            java.lang.String r1 = "streamNetworkQueueCapacityInBytes"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0426:
            java.lang.String r1 = "isReceivingStarsEnabled"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0433:
            java.lang.String r1 = "audienceRestrictionsEnabled"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
            goto L_0x044c
        L_0x0440:
            java.lang.String r1 = "streamNetworkShouldProbeRttWithPings"
            boolean r0 = r5.equals(r1)     // Catch:{ Exception -> 0x0457 }
            if (r0 == 0) goto L_0x0454
            com.facebook.common.json.FbJsonField r1 = X.C21056XCh.A05(r1)     // Catch:{ Exception -> 0x0457 }
        L_0x044c:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0460 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0460 }
            goto L_0x0016
        L_0x0453:
            return r1
        L_0x0454:
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0460 }
            return r0
        L_0x0457:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0460 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0460 }
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x0460:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0460 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponseDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public VideoBroadcastInitResponseDeserializer() {
        this.A00 = VideoBroadcastInitResponse.class;
    }
}

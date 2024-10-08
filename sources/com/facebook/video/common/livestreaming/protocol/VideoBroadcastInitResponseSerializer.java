package com.facebook.video.common.livestreaming.protocol;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import X.C291415hE;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.List;
import java.util.Map;

public class VideoBroadcastInitResponseSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(VideoBroadcastInitResponse.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        VideoBroadcastInitResponse videoBroadcastInitResponse = (VideoBroadcastInitResponse) obj;
        if (videoBroadcastInitResponse == null) {
            r4.A0a();
        }
        r4.A0c();
        C291415hE.A04(r4, "rtmpPublishUrl", videoBroadcastInitResponse.rtmpPublishUrl);
        C291415hE.A04(r4, "videoId", videoBroadcastInitResponse.videoId);
        C291415hE.A04(r4, "broadcastId", videoBroadcastInitResponse.broadcastId);
        long j = videoBroadcastInitResponse.minBroadcastDurationSeconds;
        r4.A0q("minBroadcastDurationSeconds");
        r4.A0h(j);
        long j2 = videoBroadcastInitResponse.maxBroadcastDurationSeconds;
        r4.A0q("maxBroadcastDurationSeconds");
        r4.A0h(j2);
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = videoBroadcastInitResponse.videoStreamingConfig;
        if (videoBroadcastVideoStreamingConfig != null) {
            r4.A0q("videoStreamingConfig");
            C291415hE.A00(r4, r5, videoBroadcastVideoStreamingConfig);
        }
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig2 = videoBroadcastInitResponse.audioOnlyVideoStreamingConfig;
        if (videoBroadcastVideoStreamingConfig2 != null) {
            r4.A0q("audioOnlyVideoStreamingConfig");
            C291415hE.A00(r4, r5, videoBroadcastVideoStreamingConfig2);
        }
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = videoBroadcastInitResponse.audioStreamingConfig;
        if (videoBroadcastAudioStreamingConfig != null) {
            r4.A0q("audioStreamingConfig");
            C291415hE.A00(r4, r5, videoBroadcastAudioStreamingConfig);
        }
        C291415hE.A04(r4, "rawJsonConfig", videoBroadcastInitResponse.rawJsonConfig);
        int i = videoBroadcastInitResponse.broadcastInterruptionLimitInSeconds;
        r4.A0q("broadcastInterruptionLimitInSeconds");
        r4.A0g(i);
        int i2 = videoBroadcastInitResponse.audioOnlyFormatBitRate;
        r4.A0q("audioOnlyFormatBitRate");
        r4.A0g(i2);
        boolean z = videoBroadcastInitResponse.passThroughEnabled;
        r4.A0q("passThroughEnabled");
        r4.A0x(z);
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = videoBroadcastInitResponse.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null) {
            r4.A0q("liveTraceConfig");
            C291415hE.A00(r4, r5, videoBroadcastLiveTraceConfig);
        }
        boolean z2 = videoBroadcastInitResponse.allowBFrame;
        r4.A0q("allowBFrame");
        r4.A0x(z2);
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkQueueCapacityInBytes, "streamNetworkQueueCapacityInBytes");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkQueueVideoCapacityInSeconds, "streamNetworkQueueVideoCapacityInSeconds");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkQueuePercentageOfCapacityToDrop, "streamNetworkQueuePercentageOfCapacityToDrop");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkSendCheckTimeoutMs, "streamNetworkSendCheckTimeoutMs");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkConnectionRetryCount, "streamNetworkConnectionRetryCount");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkConnectionRetryDelayInSeconds, "streamNetworkConnectionRetryDelayInSeconds");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkMeasurementsIntervalInMs, "streamNetworkMeasurementsIntervalInMs");
        C291415hE.A02(r4, videoBroadcastInitResponse.streamNetworkShouldProbeRttWithPings, "streamNetworkShouldProbeRttWithPings");
        Double d = videoBroadcastInitResponse.streamThroughputDecayConstant;
        if (d != null) {
            r4.A0q("streamThroughputDecayConstant");
            r4.A0e(d.doubleValue());
        }
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadChunkSizeInBytes, "streamNetworkSpeedTestPayloadChunkSizeInBytes");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadSizeInBytes, "streamNetworkSpeedTestPayloadSizeInBytes");
        C291415hE.A03(r4, videoBroadcastInitResponse.streamNetworkSpeedTestPayloadTimeoutInSeconds, "streamNetworkSpeedTestPayloadTimeoutInSeconds");
        Double d2 = videoBroadcastInitResponse.speedTestMinimumBandwidthThreshold;
        if (d2 != null) {
            r4.A0q("speedTestMinimumBandwidthThreshold");
            r4.A0e(d2.doubleValue());
        }
        C291415hE.A02(r4, videoBroadcastInitResponse.disableSpeedTest, "disableSpeedTest");
        C291415hE.A02(r4, videoBroadcastInitResponse.use1RTTConnectionSetup, "use1RTTConnectionSetup");
        Double d3 = videoBroadcastInitResponse.networkLagStopThreshold;
        if (d3 != null) {
            r4.A0q("networkLagStopThreshold");
            r4.A0e(d3.doubleValue());
        }
        Double d4 = videoBroadcastInitResponse.networkLagResumeThreshold;
        if (d4 != null) {
            r4.A0q("networkLagResumeThreshold");
            r4.A0e(d4.doubleValue());
        }
        C291415hE.A04(r4, "streamVideoAdaptiveBitrateConfig", videoBroadcastInitResponse.streamVideoAdaptiveBitrateConfig);
        C291415hE.A04(r4, "fbLivePublishUrl", videoBroadcastInitResponse.fbLivePublishUrl);
        C291415hE.A04(r4, "fbLiveQuicPublishUrl", videoBroadcastInitResponse.fbLiveQuicPublishUrl);
        C291415hE.A04(r4, "fbLiveFallbackPublishUrl", videoBroadcastInitResponse.fbLiveFallbackPublishUrl);
        C291415hE.A04(r4, "rtmpPublishHeaderBase64", videoBroadcastInitResponse.rtmpPublishHeaderBase64);
        C291415hE.A04(r4, "fbLiveTransportHeaderBase64", videoBroadcastInitResponse.fbLiveTransportHeaderBase64);
        C291415hE.A02(r4, videoBroadcastInitResponse.streamNetworkUseSslFactory, "streamNetworkUseSslFactory");
        C291415hE.A03(r4, videoBroadcastInitResponse.broadcasterUpdateLogIntervalInSeconds, "broadcasterUpdateLogIntervalInSeconds");
        C291415hE.A03(r4, videoBroadcastInitResponse.llDesiredLatencyMs, "llDesiredLatencyMs");
        C291415hE.A02(r4, videoBroadcastInitResponse.isReceivingStarsEnabled, "isReceivingStarsEnabled");
        C291415hE.A02(r4, videoBroadcastInitResponse.isARGiftingEnabled, "isARGiftingEnabled");
        C291415hE.A04(r4, "starsCreatorARSettingsID", videoBroadcastInitResponse.starsCreatorARSettingsID);
        C291415hE.A02(r4, videoBroadcastInitResponse.isEligibleMonetizationOnboardingInLive, "isEligibleMonetizationOnboardingInLive");
        C291415hE.A02(r4, videoBroadcastInitResponse.audienceRestrictionsEnabled, "audienceRestrictionsEnabled");
        List<Integer> list = videoBroadcastInitResponse.minimumAgeAudienceRestrictions;
        if (list != null) {
            r4.A0q("minimumAgeAudienceRestrictions");
            C291415hE.A01(r4, r5, list);
        }
        C291415hE.A02(r4, videoBroadcastInitResponse.latencySensitive, "latencySensitive");
        C291415hE.A03(r4, videoBroadcastInitResponse.savedFeaturedLinksCount, "savedFeaturedLinksCount");
        Map<String, Double> map = videoBroadcastInitResponse.initialBitratePrediction;
        if (map != null) {
            r4.A0q("initialBitratePrediction");
            C291415hE.A00(r4, r5, map);
        }
        int i3 = videoBroadcastInitResponse.liveWithMaxParticipants;
        r4.A0q("liveWithMaxParticipants");
        r4.A0g(i3);
        C291415hE.A04(r4, "actorId", videoBroadcastInitResponse.actorId);
        boolean z3 = videoBroadcastInitResponse.canViewerAdminister;
        r4.A0q("canViewerAdminister");
        r4.A0x(z3);
        boolean z4 = videoBroadcastInitResponse.hasProfessionalFeaturesForWatch;
        r4.A0q("hasProfessionalFeaturesForWatch");
        r4.A0x(z4);
        boolean z5 = videoBroadcastInitResponse.canViewerSeeCommunityModerationTools;
        r4.A0q("canViewerSeeCommunityModerationTools");
        r4.A0x(z5);
        C291415hE.A04(r4, "videoQualityModel", videoBroadcastInitResponse.videoQualityModel);
        List<String> list2 = videoBroadcastInitResponse.defaultShareToGroupIds;
        if (list2 != null) {
            r4.A0q("defaultShareToGroupIds");
            C291415hE.A01(r4, r5, list2);
        }
        C291415hE.A04(r4, "resolutionMappingString", videoBroadcastInitResponse.resolutionMappingString);
        boolean z6 = videoBroadcastInitResponse.isGamingVideo;
        r4.A0q("isGamingVideo");
        r4.A0x(z6);
        boolean z7 = videoBroadcastInitResponse.isViewerClippingEnabled;
        r4.A0q("isViewerClippingEnabled");
        r4.A0x(z7);
        boolean z8 = videoBroadcastInitResponse.canHostInviteGuestAudioOnly;
        r4.A0q("canHostInviteGuestAudioOnly");
        r4.A0x(z8);
        boolean z9 = videoBroadcastInitResponse.canHostInviteGuestsWhileLive;
        r4.A0q("canHostInviteGuestsWhileLive");
        r4.A0x(z9);
        List<LiveWithSocialTab> list3 = videoBroadcastInitResponse.availableTabs;
        if (list3 != null) {
            r4.A0q("availableTabs");
            C291415hE.A01(r4, r5, list3);
        }
        C291415hE.A04(r4, "iBPHybridModelConfig", videoBroadcastInitResponse.iBPHybridModelConfig);
        C291415hE.A04(r4, "rtcActorId", videoBroadcastInitResponse.rtcActorId);
        C291415hE.A04(r4, "riskModel", videoBroadcastInitResponse.riskModel);
        C291415hE.A04(r4, "latencySetting", videoBroadcastInitResponse.latencySetting);
        C291415hE.A04(r4, "latencyTargetType", videoBroadcastInitResponse.latencyTargetType);
        C291415hE.A04(r4, "roiType", videoBroadcastInitResponse.roiType);
        C291415hE.A04(r4, "profileIdIfViewerCanSeeStarsDefaultOnUpsell", videoBroadcastInitResponse.profileIdIfViewerCanSeeStarsDefaultOnUpsell);
        boolean z10 = videoBroadcastInitResponse.shouldShowNotifySubscriberPlugin;
        r4.A0q("shouldShowNotifySubscriberPlugin");
        r4.A0x(z10);
        C291415hE.A04(r4, "boostedLiveAdsStatus", videoBroadcastInitResponse.boostedLiveAdsStatus);
        int i4 = videoBroadcastInitResponse.boostedLiveStartTime;
        r4.A0q("boostedLiveStartTime");
        r4.A0g(i4);
        r4.A0Z();
    }
}

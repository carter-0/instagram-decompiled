package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@AutoGenJsonSerializer
@AutoGenJsonDeserializer
@JsonDeserialize(using = VideoBroadcastInitResponseDeserializer.class)
public class VideoBroadcastInitResponse {
    @JsonProperty("actorId")
    public final String actorId;
    @JsonProperty("allowBFrame")
    public final boolean allowBFrame;
    @JsonProperty("audienceRestrictionsEnabled")
    public final Boolean audienceRestrictionsEnabled;
    @JsonProperty("audioOnlyFormatBitRate")
    public final int audioOnlyFormatBitRate;
    @JsonProperty("audioOnlyVideoStreamingConfig")
    public final VideoBroadcastVideoStreamingConfig audioOnlyVideoStreamingConfig;
    @JsonProperty("audioStreamingConfig")
    public final VideoBroadcastAudioStreamingConfig audioStreamingConfig;
    @JsonProperty("availableTabs")
    public final List<LiveWithSocialTab> availableTabs;
    @JsonProperty("boostedLiveAdsStatus")
    public final String boostedLiveAdsStatus;
    @JsonProperty("boostedLiveStartTime")
    public final int boostedLiveStartTime;
    @JsonProperty("broadcastId")
    public final String broadcastId;
    @JsonProperty("broadcastInterruptionLimitInSeconds")
    public final int broadcastInterruptionLimitInSeconds;
    @JsonProperty("broadcasterUpdateLogIntervalInSeconds")
    public final Integer broadcasterUpdateLogIntervalInSeconds;
    @JsonProperty("canHostInviteGuestAudioOnly")
    public final boolean canHostInviteGuestAudioOnly;
    @JsonProperty("canHostInviteGuestsWhileLive")
    public final boolean canHostInviteGuestsWhileLive;
    @JsonProperty("canViewerAdminister")
    public final boolean canViewerAdminister;
    @JsonProperty("canViewerSeeCommunityModerationTools")
    public final boolean canViewerSeeCommunityModerationTools;
    @JsonProperty("defaultShareToGroupIds")
    public final List<String> defaultShareToGroupIds;
    @JsonProperty("disableSpeedTest")
    public final Boolean disableSpeedTest;
    @JsonProperty("fbLiveFallbackPublishUrl")
    public final String fbLiveFallbackPublishUrl;
    @JsonProperty("fbLivePublishUrl")
    public final String fbLivePublishUrl;
    @JsonProperty("fbLiveQuicPublishUrl")
    public final String fbLiveQuicPublishUrl;
    @JsonProperty("fbLiveTransportHeaderBase64")
    public final String fbLiveTransportHeaderBase64;
    @JsonProperty("hasProfessionalFeaturesForWatch")
    public final boolean hasProfessionalFeaturesForWatch;
    @JsonProperty("iBPHybridModelConfig")
    public final String iBPHybridModelConfig;
    @JsonProperty("initialBitratePrediction")
    public Map<String, Double> initialBitratePrediction;
    @JsonProperty("isARGiftingEnabled")
    public final Boolean isARGiftingEnabled;
    @JsonProperty("isEligibleMonetizationOnboardingInLive")
    public final Boolean isEligibleMonetizationOnboardingInLive;
    @JsonProperty("isGamingVideo")
    public final boolean isGamingVideo;
    @JsonProperty("isReceivingStarsEnabled")
    public final Boolean isReceivingStarsEnabled;
    @JsonProperty("isViewerClippingEnabled")
    public final boolean isViewerClippingEnabled;
    @JsonProperty("latencySensitive")
    public final Boolean latencySensitive;
    @JsonProperty("latencySetting")
    public final String latencySetting;
    @JsonProperty("latencyTargetType")
    public final String latencyTargetType;
    @JsonProperty("liveOnlineEventConfig")
    public final VideoBroadcastLiveOnlineEventConfig liveOnlineEventConfig;
    @JsonProperty("liveTraceConfig")
    public final VideoBroadcastLiveTraceConfig liveTraceConfig;
    @JsonProperty("liveWithMaxParticipants")
    public final int liveWithMaxParticipants;
    @JsonProperty("llDesiredLatencyMs")
    public final Integer llDesiredLatencyMs;
    @JsonProperty("maxBroadcastDurationSeconds")
    public final long maxBroadcastDurationSeconds = 0;
    @JsonProperty("minBroadcastDurationSeconds")
    public final long minBroadcastDurationSeconds = 0;
    @JsonProperty("minimumAgeAudienceRestrictions")
    public final List<Integer> minimumAgeAudienceRestrictions;
    @JsonProperty("networkLagResumeThreshold")
    public final Double networkLagResumeThreshold;
    @JsonProperty("networkLagStopThreshold")
    public final Double networkLagStopThreshold;
    @JsonProperty("passThroughEnabled")
    public final boolean passThroughEnabled;
    @JsonProperty("profileIdIfViewerCanSeeStarsDefaultOnUpsell")
    public final String profileIdIfViewerCanSeeStarsDefaultOnUpsell;
    @JsonProperty("rawJsonConfig")
    public final String rawJsonConfig;
    @JsonProperty("resolutionMappingString")
    public final String resolutionMappingString;
    @JsonProperty("riskModel")
    public final String riskModel;
    @JsonProperty("roiType")
    public final String roiType;
    @JsonProperty("rtcActorId")
    public final String rtcActorId;
    @JsonProperty("rtmpPublishHeaderBase64")
    public final String rtmpPublishHeaderBase64;
    @JsonProperty("rtmpPublishUrl")
    public final String rtmpPublishUrl;
    @JsonProperty("savedFeaturedLinksCount")
    public final Integer savedFeaturedLinksCount;
    @JsonProperty("shouldShowNotifySubscriberPlugin")
    public final boolean shouldShowNotifySubscriberPlugin;
    @JsonProperty("speedTestMinimumBandwidthThreshold")
    public final Double speedTestMinimumBandwidthThreshold;
    @JsonProperty("starsCreatorARSettingsID")
    public final String starsCreatorARSettingsID;
    @JsonProperty("streamNetworkConnectionRetryCount")
    public final Integer streamNetworkConnectionRetryCount;
    @JsonProperty("streamNetworkConnectionRetryDelayInSeconds")
    public final Integer streamNetworkConnectionRetryDelayInSeconds;
    @JsonProperty("streamNetworkMeasurementsIntervalInMs")
    public final Integer streamNetworkMeasurementsIntervalInMs;
    @JsonProperty("streamNetworkQueueCapacityInBytes")
    public final Integer streamNetworkQueueCapacityInBytes;
    @JsonProperty("streamNetworkQueuePercentageOfCapacityToDrop")
    public final Integer streamNetworkQueuePercentageOfCapacityToDrop;
    @JsonProperty("streamNetworkQueueVideoCapacityInSeconds")
    public final Integer streamNetworkQueueVideoCapacityInSeconds;
    @JsonProperty("streamNetworkSendCheckTimeoutMs")
    public final Integer streamNetworkSendCheckTimeoutMs;
    @JsonProperty("streamNetworkShouldProbeRttWithPings")
    public final Boolean streamNetworkShouldProbeRttWithPings;
    @JsonProperty("streamNetworkSpeedTestPayloadChunkSizeInBytes")
    public final Integer streamNetworkSpeedTestPayloadChunkSizeInBytes;
    @JsonProperty("streamNetworkSpeedTestPayloadSizeInBytes")
    public final Integer streamNetworkSpeedTestPayloadSizeInBytes;
    @JsonProperty("streamNetworkSpeedTestPayloadTimeoutInSeconds")
    public final Integer streamNetworkSpeedTestPayloadTimeoutInSeconds;
    @JsonProperty("streamNetworkUseSslFactory")
    public final Boolean streamNetworkUseSslFactory;
    @JsonProperty("streamThroughputDecayConstant")
    public final Double streamThroughputDecayConstant;
    @JsonProperty("streamVideoAdaptiveBitrateConfig")
    public final String streamVideoAdaptiveBitrateConfig;
    @JsonProperty("use1RTTConnectionSetup")
    public final Boolean use1RTTConnectionSetup;
    @JsonProperty("videoBroadcastEndscreenConfig")
    public final VideoBroadcastEndscreenConfig videoBroadcastEndscreenConfig;
    @JsonProperty("videoBroadcastLiveWithConfig")
    public final VideoBroadcastLiveWithConfig videoBroadcastLiveWithConfig;
    @JsonProperty("videoId")
    public final String videoId;
    @JsonProperty("videoQualityModel")
    public final String videoQualityModel;
    @JsonProperty("videoStreamingConfig")
    public final VideoBroadcastVideoStreamingConfig videoStreamingConfig;

    public VideoBroadcastInitResponse(VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig, VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig, VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, Map map, boolean z) {
        this.rtmpPublishUrl = str5;
        this.videoId = str6;
        this.broadcastId = str;
        this.videoStreamingConfig = videoBroadcastVideoStreamingConfig;
        this.audioOnlyVideoStreamingConfig = null;
        this.audioStreamingConfig = videoBroadcastAudioStreamingConfig;
        this.liveOnlineEventConfig = null;
        this.rawJsonConfig = null;
        this.broadcastInterruptionLimitInSeconds = 0;
        this.audioOnlyFormatBitRate = 0;
        this.passThroughEnabled = z;
        this.liveTraceConfig = videoBroadcastLiveTraceConfig;
        this.allowBFrame = false;
        this.streamNetworkQueueCapacityInBytes = null;
        this.streamNetworkQueueVideoCapacityInSeconds = null;
        this.streamNetworkQueuePercentageOfCapacityToDrop = null;
        this.streamNetworkSendCheckTimeoutMs = null;
        this.streamNetworkConnectionRetryCount = null;
        this.streamNetworkConnectionRetryDelayInSeconds = null;
        this.streamNetworkMeasurementsIntervalInMs = null;
        this.streamNetworkShouldProbeRttWithPings = null;
        this.streamThroughputDecayConstant = null;
        this.streamNetworkSpeedTestPayloadChunkSizeInBytes = null;
        this.streamNetworkSpeedTestPayloadSizeInBytes = null;
        this.streamNetworkSpeedTestPayloadTimeoutInSeconds = null;
        this.speedTestMinimumBandwidthThreshold = null;
        this.disableSpeedTest = null;
        this.use1RTTConnectionSetup = null;
        this.networkLagStopThreshold = null;
        this.networkLagResumeThreshold = null;
        this.streamVideoAdaptiveBitrateConfig = null;
        this.fbLivePublishUrl = str3;
        this.fbLiveQuicPublishUrl = str4;
        this.fbLiveFallbackPublishUrl = str2;
        this.rtmpPublishHeaderBase64 = null;
        this.fbLiveTransportHeaderBase64 = null;
        this.streamNetworkUseSslFactory = null;
        this.broadcasterUpdateLogIntervalInSeconds = null;
        this.llDesiredLatencyMs = null;
        this.isReceivingStarsEnabled = null;
        this.isARGiftingEnabled = null;
        this.starsCreatorARSettingsID = null;
        this.isEligibleMonetizationOnboardingInLive = null;
        this.audienceRestrictionsEnabled = null;
        this.minimumAgeAudienceRestrictions = null;
        this.latencySensitive = null;
        this.videoBroadcastEndscreenConfig = null;
        this.savedFeaturedLinksCount = null;
        this.initialBitratePrediction = map;
        this.liveWithMaxParticipants = 2;
        this.actorId = null;
        this.canViewerAdminister = false;
        this.hasProfessionalFeaturesForWatch = false;
        this.canViewerSeeCommunityModerationTools = false;
        this.videoQualityModel = str7;
        this.defaultShareToGroupIds = null;
        this.resolutionMappingString = null;
        this.isGamingVideo = false;
        this.isViewerClippingEnabled = false;
        this.canHostInviteGuestAudioOnly = false;
        this.canHostInviteGuestsWhileLive = false;
        this.availableTabs = list;
        this.iBPHybridModelConfig = null;
        this.rtcActorId = null;
        this.riskModel = null;
        this.latencySetting = null;
        this.videoBroadcastLiveWithConfig = null;
        this.latencyTargetType = null;
        this.roiType = null;
        this.profileIdIfViewerCanSeeStarsDefaultOnUpsell = null;
        this.shouldShowNotifySubscriberPlugin = false;
        this.boostedLiveAdsStatus = null;
        this.boostedLiveStartTime = 0;
    }
}

package com.instagram.service.tigon;

import com.facebook.tigon.iface.TigonSamplingPolicy;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public class IGTigonConfig {
    public final String appId;
    public final boolean appStartedInBackground;
    public final boolean bisectDisablePriorityService;
    public final String capabilities;
    public final String[] combinableResponseHeaders;
    public final boolean deprioritizeImage;
    public final boolean disableBackgroundRetry;
    public final boolean disableSameModuleNotUiGraph;
    public final boolean enableE2eTracingForMhrSampledRequests;
    public final boolean enableIgFixFbcdn;
    public final boolean enableIgFixFbcdnLogging;
    public final boolean enableImageOffscreenThreshold;
    public final boolean enableInlineObservers;
    public final boolean enablePluginInterceptors;
    public final boolean enablePluginObservers;
    public final boolean enableShadowMode;
    public final boolean enableTigonRtcQueue;
    public final boolean enableTransformCallback;
    public final String[] forwardableHeaders;
    public final int imageOffscreenThreshold;
    public final boolean isH3PriChangesLoggingEnabled;
    public final int ligerRetryLimit;
    public final int maxNumRedirectCount;
    public final long maxStreamingCachedBufferSize;
    public final boolean mobileHttpRequestTriggerEnabled;
    public final int networkSwitchErrorDelayMs;
    public final int nonTransientErrorRetryLimit;
    public final boolean prioritizeAppStartMedia;
    public final boolean prioritizeVideo;
    public final boolean prioritizeVideoCover;
    public final String proxyHostAndPortForE2ETest;
    public final int[] redirectErrorCodes;
    public final int retryDelayMaxMs;
    public final int retryDelayMinMs;
    public final String retryStatusCodesStr;
    public final int serverErrorRetryLimit;
    public final boolean shouldForceIgAppId;
    public final TigonSamplingPolicy tigonSamplingPolicy;
    public final int transientErrorRetryLimit;
    public final String triggeredLoggingAllowList;
    public final boolean useDefaultCalculatorPriorities;
    public final boolean useGenericAnalyticsHeaderBuilder;
    public final boolean useIGLigerRetryPolicy;
    public final boolean useNewOrchestration;
    public final boolean useOnBodyExperimental;
}

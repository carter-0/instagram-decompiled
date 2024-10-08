package com.facebook.mqttbypass.implementation;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C249703kE;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class MqttBypassConfig extends AnonymousClass0T0 {
    public final String accessToken;
    public final boolean appJobsEnabled;
    public final String appSpecificInfo;
    public final ScheduledExecutorService asyncExecutor;
    public final int authType;
    public final boolean blockConnectsInBackground;
    public final boolean blockConnectsUntilFirstPublish;
    public final long capabilities;
    public final String deviceId;
    public final DGWClient dgwClient;
    public final boolean disableReconnectsInBackground;
    public final Set enabledPublishTopics;
    public final Set enabledSubscribeTopics;
    public final String familyDeviceId;
    public final int immediateRetryCount;
    public final int initialNetworkState;
    public final boolean isAppInBackground;
    public final int maxPendingPublishDurationInSeconds;
    public final int maxPendingPublishQueueSize;
    public final int reconnectTimeoutInSeconds;
    public String regionHint;
    public final boolean restartOnDrain;
    public final String sandboxOverride;
    public final String userAgent;
    public final String userId;
    public final XAnalyticsHolder xAnalyticsHolder;

    public MqttBypassConfig(String str, String str2, int i, String str3, String str4, String str5, long j, String str6, Set set, Set set2, DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, XAnalyticsHolder xAnalyticsHolder2, String str7, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str8) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0qQ.A0B(str5, 6);
        Set set3 = set;
        0qQ.A0B(set3, 9);
        Set set4 = set2;
        0qQ.A0B(set4, 10);
        DGWClient dGWClient2 = dGWClient;
        0qQ.A0B(dGWClient2, 11);
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        0qQ.A0B(scheduledExecutorService2, 12);
        XAnalyticsHolder xAnalyticsHolder3 = xAnalyticsHolder2;
        0qQ.A0B(xAnalyticsHolder3, 13);
        String str9 = str8;
        0qQ.A0B(str9, 26);
        this.userId = str;
        this.accessToken = str2;
        this.authType = i;
        this.userAgent = str3;
        this.deviceId = str4;
        this.familyDeviceId = str5;
        this.capabilities = j;
        this.regionHint = str6;
        this.enabledPublishTopics = set3;
        this.enabledSubscribeTopics = set4;
        this.dgwClient = dGWClient2;
        this.asyncExecutor = scheduledExecutorService2;
        this.xAnalyticsHolder = xAnalyticsHolder3;
        this.sandboxOverride = str7;
        this.restartOnDrain = z;
        this.immediateRetryCount = i2;
        this.reconnectTimeoutInSeconds = i3;
        this.maxPendingPublishQueueSize = i4;
        this.maxPendingPublishDurationInSeconds = i5;
        this.initialNetworkState = i6;
        this.isAppInBackground = z2;
        this.disableReconnectsInBackground = z3;
        this.appJobsEnabled = z4;
        this.blockConnectsInBackground = z5;
        this.blockConnectsUntilFirstPublish = z6;
        this.appSpecificInfo = str9;
    }

    public static /* synthetic */ MqttBypassConfig copy$default(MqttBypassConfig mqttBypassConfig, String str, String str2, int i, String str3, String str4, String str5, long j, String str6, Set set, Set set2, DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, XAnalyticsHolder xAnalyticsHolder2, String str7, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str8, int i7, Object obj) {
        long j2 = j;
        String str9 = str2;
        String str10 = str;
        String str11 = str8;
        String str12 = str7;
        int i8 = i6;
        int i9 = i7;
        boolean z7 = z;
        int i10 = i2;
        boolean z8 = z5;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z6;
        if ((i7 & 1) != 0) {
            str10 = mqttBypassConfig.userId;
        }
        if ((i7 & 2) != 0) {
            str9 = mqttBypassConfig.accessToken;
        }
        if ((i7 & 4) != 0) {
            i = mqttBypassConfig.authType;
        }
        if ((i7 & 8) != 0) {
            str3 = mqttBypassConfig.userAgent;
        }
        if ((i7 & 16) != 0) {
            str4 = mqttBypassConfig.deviceId;
        }
        if ((i7 & 32) != 0) {
            str5 = mqttBypassConfig.familyDeviceId;
        }
        if ((i7 & 64) != 0) {
            j2 = mqttBypassConfig.capabilities;
        }
        if ((i9 & 128) != 0) {
            str6 = mqttBypassConfig.regionHint;
        }
        if ((i9 & 256) != 0) {
            set = mqttBypassConfig.enabledPublishTopics;
        }
        if ((i9 & 512) != 0) {
            set2 = mqttBypassConfig.enabledSubscribeTopics;
        }
        if ((i9 & 1024) != 0) {
            dGWClient = mqttBypassConfig.dgwClient;
        }
        if ((i9 & C249703kE.FLAG_MOVED) != 0) {
            scheduledExecutorService = mqttBypassConfig.asyncExecutor;
        }
        if ((i9 & 4096) != 0) {
            xAnalyticsHolder2 = mqttBypassConfig.xAnalyticsHolder;
        }
        if ((i9 & 8192) != 0) {
            str12 = mqttBypassConfig.sandboxOverride;
        }
        if ((i9 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z7 = mqttBypassConfig.restartOnDrain;
        }
        if ((i7 & Constants.LOAD_RESULT_PGO) != 0) {
            i10 = mqttBypassConfig.immediateRetryCount;
        }
        if ((i7 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            i11 = mqttBypassConfig.reconnectTimeoutInSeconds;
        }
        if ((i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            i12 = mqttBypassConfig.maxPendingPublishQueueSize;
        }
        if ((i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            i13 = mqttBypassConfig.maxPendingPublishDurationInSeconds;
        }
        if ((i7 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            i8 = mqttBypassConfig.initialNetworkState;
        }
        if ((i7 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            z11 = mqttBypassConfig.isAppInBackground;
        }
        if ((i7 & 2097152) != 0) {
            z10 = mqttBypassConfig.disableReconnectsInBackground;
        }
        if ((i7 & 4194304) != 0) {
            z9 = mqttBypassConfig.appJobsEnabled;
        }
        if ((i7 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            z8 = mqttBypassConfig.blockConnectsInBackground;
        }
        if ((i7 & 16777216) != 0) {
            z12 = mqttBypassConfig.blockConnectsUntilFirstPublish;
        }
        if ((i7 & 33554432) != 0) {
            str11 = mqttBypassConfig.appSpecificInfo;
        }
        return mqttBypassConfig.copy(str10, str9, i, str3, str4, str5, j2, str6, set, set2, dGWClient, scheduledExecutorService, xAnalyticsHolder2, str12, z7, i10, i11, i12, i13, i8, z11, z10, z9, z8, z12, str11);
    }

    public final String component1() {
        return this.userId;
    }

    public final Set component10() {
        return this.enabledSubscribeTopics;
    }

    public final DGWClient component11() {
        return this.dgwClient;
    }

    public final ScheduledExecutorService component12() {
        return this.asyncExecutor;
    }

    public final XAnalyticsHolder component13() {
        return this.xAnalyticsHolder;
    }

    public final String component14() {
        return this.sandboxOverride;
    }

    public final boolean component15() {
        return this.restartOnDrain;
    }

    public final int component16() {
        return this.immediateRetryCount;
    }

    public final int component17() {
        return this.reconnectTimeoutInSeconds;
    }

    public final int component18() {
        return this.maxPendingPublishQueueSize;
    }

    public final int component19() {
        return this.maxPendingPublishDurationInSeconds;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final int component20() {
        return this.initialNetworkState;
    }

    public final boolean component21() {
        return this.isAppInBackground;
    }

    public final boolean component22() {
        return this.disableReconnectsInBackground;
    }

    public final boolean component23() {
        return this.appJobsEnabled;
    }

    public final boolean component24() {
        return this.blockConnectsInBackground;
    }

    public final boolean component25() {
        return this.blockConnectsUntilFirstPublish;
    }

    public final String component26() {
        return this.appSpecificInfo;
    }

    public final int component3() {
        return this.authType;
    }

    public final String component4() {
        return this.userAgent;
    }

    public final String component5() {
        return this.deviceId;
    }

    public final String component6() {
        return this.familyDeviceId;
    }

    public final long component7() {
        return this.capabilities;
    }

    public final String component8() {
        return this.regionHint;
    }

    public final Set component9() {
        return this.enabledPublishTopics;
    }

    public final MqttBypassConfig copy(String str, String str2, int i, String str3, String str4, String str5, long j, String str6, Set set, Set set2, DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, XAnalyticsHolder xAnalyticsHolder2, String str7, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str8) {
        String str9 = str;
        0qQ.A0B(str9, 0);
        String str10 = str2;
        0qQ.A0B(str10, 1);
        String str11 = str3;
        0qQ.A0B(str11, 3);
        String str12 = str4;
        0qQ.A0B(str12, 4);
        String str13 = str5;
        0qQ.A0B(str13, 5);
        Set set3 = set;
        0qQ.A0B(set3, 8);
        Set set4 = set2;
        0qQ.A0B(set4, 9);
        DGWClient dGWClient2 = dGWClient;
        0qQ.A0B(dGWClient2, 10);
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        0qQ.A0B(scheduledExecutorService2, 11);
        XAnalyticsHolder xAnalyticsHolder3 = xAnalyticsHolder2;
        0qQ.A0B(xAnalyticsHolder3, 12);
        String str14 = str8;
        0qQ.A0B(str14, 25);
        return new MqttBypassConfig(str9, str10, i, str11, str12, str13, j, str6, set3, set4, dGWClient2, scheduledExecutorService2, xAnalyticsHolder3, str7, z, i2, i3, i4, i5, i6, z2, z3, z4, z5, z6, str14);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final boolean getAppJobsEnabled() {
        return this.appJobsEnabled;
    }

    public final String getAppSpecificInfo() {
        return this.appSpecificInfo;
    }

    public final ScheduledExecutorService getAsyncExecutor() {
        return this.asyncExecutor;
    }

    public final int getAuthType() {
        return this.authType;
    }

    public final boolean getBlockConnectsInBackground() {
        return this.blockConnectsInBackground;
    }

    public final boolean getBlockConnectsUntilFirstPublish() {
        return this.blockConnectsUntilFirstPublish;
    }

    public final long getCapabilities() {
        return this.capabilities;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final DGWClient getDgwClient() {
        return this.dgwClient;
    }

    public final boolean getDisableReconnectsInBackground() {
        return this.disableReconnectsInBackground;
    }

    public final Set getEnabledPublishTopics() {
        return this.enabledPublishTopics;
    }

    public final Set getEnabledSubscribeTopics() {
        return this.enabledSubscribeTopics;
    }

    public final String getFamilyDeviceId() {
        return this.familyDeviceId;
    }

    public final int getImmediateRetryCount() {
        return this.immediateRetryCount;
    }

    public final int getInitialNetworkState() {
        return this.initialNetworkState;
    }

    public final int getMaxPendingPublishDurationInSeconds() {
        return this.maxPendingPublishDurationInSeconds;
    }

    public final int getMaxPendingPublishQueueSize() {
        return this.maxPendingPublishQueueSize;
    }

    public final int getReconnectTimeoutInSeconds() {
        return this.reconnectTimeoutInSeconds;
    }

    public final String getRegionHint() {
        return this.regionHint;
    }

    public final boolean getRestartOnDrain() {
        return this.restartOnDrain;
    }

    public final String getSandboxOverride() {
        return this.sandboxOverride;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final XAnalyticsHolder getXAnalyticsHolder() {
        return this.xAnalyticsHolder;
    }

    public final boolean isAppInBackground() {
        return this.isAppInBackground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MqttBypassConfig user:");
        sb.append(this.userId);
        sb.append(", agent:");
        sb.append(this.userAgent);
        sb.append(", deviceId:");
        sb.append(this.deviceId);
        sb.append(", familyDeviceId:");
        sb.append(this.familyDeviceId);
        sb.append("capabilities:");
        sb.append(this.capabilities);
        sb.append(", regionHint:");
        sb.append(this.regionHint);
        sb.append(", enabledPublishTopics:");
        sb.append(this.enabledPublishTopics);
        sb.append(", enabledSubscribeTopics:");
        sb.append(this.enabledSubscribeTopics);
        sb.append(", restartOnDrain:");
        sb.append(this.restartOnDrain);
        sb.append(", immediateRetryCount:");
        sb.append(this.immediateRetryCount);
        sb.append(", reconnectTimeoutInSeconds:");
        sb.append(this.reconnectTimeoutInSeconds);
        sb.append("maxPendingPublishQueueSize:");
        sb.append(this.maxPendingPublishQueueSize);
        sb.append(", maxPendingPublishDurationInSeconds:");
        sb.append(this.maxPendingPublishDurationInSeconds);
        sb.append(", initialNetworkState:");
        sb.append(this.initialNetworkState);
        sb.append(", isAppInBackground:");
        sb.append(this.isAppInBackground);
        sb.append(", disableReconnectsInBackground:");
        sb.append(this.disableReconnectsInBackground);
        sb.append(", appJobsEnabled:");
        sb.append(this.appJobsEnabled);
        sb.append(", blockConnectsInBackground:");
        sb.append(this.blockConnectsInBackground);
        sb.append(", blockConnectsUntilFirstPublish:");
        sb.append(this.blockConnectsUntilFirstPublish);
        sb.append(", appSpecificInfo: ");
        sb.append(this.appSpecificInfo);
        return sb.toString();
    }

    public final void setRegionHint(String str) {
        this.regionHint = str;
    }
}

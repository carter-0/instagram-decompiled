package com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin;

import X.0Tu;
import X.0qQ;
import X.182;
import X.2HP;
import X.2HR;
import X.AnonymousClass0yP;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;

public final class IGDirectAndroidPremailboxExperimentSyncPluginPremailbox extends Premailbox {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGDirectAndroidPremailboxExperimentSyncPluginPremailbox(MsysActiveUserSession msysActiveUserSession) {
        super(msysActiveUserSession);
        0qQ.A0B(msysActiveUserSession, 1);
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentCriticalPriorityForDGWRequestsEnabled(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentDatabaseNormalPriorityCongestionDetectionEnabled(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpAndRetrySchemaUpgradeSQLiteFull(boolean z, boolean z2) {
        return z;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentInitContactSyncTraceSampleRate(long j, boolean z) {
        return j;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMailboxInitSyncTraceSampleRate(long j, boolean z) {
        return j;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessageSendTraceSampleRate(long j, boolean z) {
        return j;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloMessageTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloThreadTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableContactTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableDanglingContactTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableMessageTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadContactTruncation(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadTruncation(boolean z, boolean z2) {
        return z;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSecureMessageSendTraceSampleRate(long j, boolean z) {
        return j;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupMailboxEnabledCustomMethod(long j, boolean z) {
        return j;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupSecuremailboxEnabled(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeEnabled(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeTincanActEnabled(boolean z, boolean z2) {
        return z;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelRequestIdSampleRate(String str, long j, boolean z) {
        return j;
    }

    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelSendTraceSampleRate(String str, long j, boolean z) {
        return j;
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTraceOpenTextSendEnabled(boolean z, boolean z2) {
        return z;
    }

    public void IGDirectAndroidPremailboxExperimentSyncPluginPremailboxExtensionsDestroy() {
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgrade(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36324561352011931L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowRetrySchemaUpgrade(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36324561351946394L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCriticalStatementCache(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36328937923690173L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableDasmTrace(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36320816140395392L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMainContextCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(182.A06(0Tu.A05, this.mAppContext.userSession, 36319583484845570L)).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(182.A06(0Tu.A05, this.mAppContext.userSession, 36319583484780033L)).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentNetworkContextCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(182.A06(0Tu.A05, this.mAppContext.userSession, 36319583484911107L)).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentQueueInformationLoggingFilterEnabled(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36319583485042181L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSendTasksOverDgwByDefault(boolean z, boolean z2) {
        return Boolean.valueOf(182.A06(0Tu.A05, this.mAppContext.userSession, 36321726673594017L)).booleanValue();
    }
}

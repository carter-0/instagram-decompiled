package com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin;

import X.0qQ;
import X.2HP;
import X.2HR;
import X.AnonymousClass0yP;
import com.facebook.msys.mci.AccountSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;

public final class IGDirectAndroidDBMetricsExperimentsMobileConfigPluginPostmailbox extends Postmailbox {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGDirectAndroidDBMetricsExperimentsMobileConfigPluginPostmailbox(AccountSession accountSession, MsysActiveUserSession msysActiveUserSession) {
        super(accountSession, msysActiveUserSession);
        0qQ.A0B(accountSession, 1);
        0qQ.A0B(msysActiveUserSession, 2);
    }

    public int IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(int i) {
        return i;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(boolean z, boolean z2) {
        return z;
    }

    public int IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(int i) {
        return 1;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(boolean z, boolean z2) {
        return z;
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlist(boolean z, boolean z2) {
        return z;
    }

    public int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(int i) {
        return (int) ((Number) 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36599456438750744L)).get()).longValue();
    }

    public int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(int i) {
        return (int) ((Number) 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36599456438816281L)).get()).longValue();
    }

    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(boolean z, boolean z2) {
        Object A00;
        2HR A002 = 2HP.A00(this.mAppContext.userSession, AnonymousClass0yP.A00(36324965078807064L));
        if (z2) {
            A00 = A002.get();
        } else {
            A00 = A002.A00();
        }
        0qQ.A09(A00);
        return ((Boolean) A00).booleanValue();
    }
}

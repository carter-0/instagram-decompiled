package com.instagram.realtimeclient.requeststream;

import X.AnonymousClass000;
import X.C253333qc;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import com.instagram.realtimeclient.requeststream.L;

public class GraphQLSubscriptionsSDKConfigurationImpl implements C253333qc {
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    public boolean getBoolForContext(String str, String str2, boolean z) {
        return z;
    }

    public double getDoubleForContext(String str, String str2, double d) {
        return d;
    }

    public double getGlobalDouble(String str, double d) {
        return d;
    }

    public String getGlobalString(String str, String str2) {
        return str2;
    }

    public int getIntForContext(String str, String str2, int i) {
        return i;
    }

    public String getStringForContext(String str, String str2, String str3) {
        return str3;
    }

    public boolean getGlobalBool(String str, boolean z) {
        if (str.equals("graphQLSubscriptionsDisableRetryStrategy")) {
            return L.ig_gqls_sdk_config.disable_gqls_retry_strategy.getAndExpose(this.mUserSession).booleanValue();
        }
        if (str.equals(AnonymousClass000.A00(2297))) {
            return this.mRealtimeClientConfig.isGqlsDebugLogEnable();
        }
        return z;
    }

    public int getGlobalInt(String str, int i) {
        if (str.equals(AnonymousClass000.A00(2296))) {
            return (int) this.mRealtimeClientConfig.getGQLSSamplingWeight();
        }
        return i;
    }

    public GraphQLSubscriptionsSDKConfigurationImpl(UserSession userSession) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = new RealtimeClientConfig(userSession);
    }
}

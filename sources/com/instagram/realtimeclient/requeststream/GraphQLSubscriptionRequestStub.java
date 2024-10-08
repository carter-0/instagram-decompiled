package com.instagram.realtimeclient.requeststream;

import X.0KC;
import X.1Ef;
import X.AnonymousClass2IU;
import X.AnonymousClass7TE;
import X.C17551Va4;
import X.C66580MXl;
import X.VZ3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GraphQLSubscriptionRequestStub implements 1Ef {
    public static final String TAG = "com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub";
    public final Class mJsonHelperClass;
    public final SimpleGraphqlQueryParameters mSimpleGraphqlQueryParameters = new SimpleGraphqlQueryParameters();
    public final IGGraphQLSubscriptionRequestStringStub mTypedGraphQLQueryString;
    public final String mUserSubscriptionId = UUID.randomUUID().toString();

    public class SimpleGraphqlQueryParameters implements AnonymousClass2IU {
        public final Map mParameters;

        public void addParameter(String str, Object obj) {
            this.mParameters.put(str, obj);
        }

        public Map getParamsCopy() {
            return new HashMap(this.mParameters);
        }

        public SimpleGraphqlQueryParameters() {
            this.mParameters = AnonymousClass7TE.A1E();
        }
    }

    public boolean getEnableAsyncQuery() {
        return false;
    }

    public boolean getEnableOfflineCaching() {
        return false;
    }

    public boolean getEnsureCacheWrite() {
        return true;
    }

    public long getFreshCacheAgeMs() {
        return 0;
    }

    public boolean getIgnoreNonCriticalErrors() {
        return true;
    }

    public boolean getMarkHttpRequestAsReplaySafe() {
        return false;
    }

    public long getMaxToleratedCacheAgeMs() {
        return 0;
    }

    public int getNetworkTimeoutSeconds() {
        return 0;
    }

    public boolean getOnlyCacheInitialNetworkResponse() {
        return false;
    }

    public boolean getParseOnClientExecutor() {
        return false;
    }

    public int getRequestPurpose() {
        return 0;
    }

    public int getRetryPolicy() {
        return 0;
    }

    public String getSchema() {
        return null;
    }

    public boolean getTerminateAfterFreshResponse() {
        return false;
    }

    public boolean hasAcsToken() {
        return false;
    }

    public boolean hasOhaiConfig() {
        return false;
    }

    public boolean isMutation() {
        return false;
    }

    public 1Ef addQueryParameter(String str, Object obj) {
        this.mSimpleGraphqlQueryParameters.addParameter(str, obj);
        return this;
    }

    public String getCallName() {
        return this.mTypedGraphQLQueryString.getCallName();
    }

    public String getFriendlyName() {
        return this.mTypedGraphQLQueryString.getQueryName();
    }

    public Class getTreeModelType() {
        0KC.A0C(TAG, "This method should not be callsed.");
        return String.class;
    }

    public GraphQLSubscriptionRequestStub(IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub, Class cls) {
        this.mTypedGraphQLQueryString = iGGraphQLSubscriptionRequestStringStub;
        this.mJsonHelperClass = cls;
    }

    public 1Ef addAdditionalHttpHeader(String str, String str2) {
        throw C66580MXl.A11();
    }

    public 1Ef addAdditionalHttpRequestParam(String str, String str2) {
        throw C66580MXl.A11();
    }

    public 1Ef addTrackedHttpResponseHeader(String str) {
        throw C66580MXl.A11();
    }

    public 1Ef enableFullConsistency() {
        throw C66580MXl.A11();
    }

    public Map getAdaptiveFetchClientParams() {
        return AnonymousClass7TE.A1E();
    }

    public Map getAdditionalHttpHeaders() {
        return AnonymousClass7TE.A1E();
    }

    public Map getAdditionalHttpRequestParams() {
        throw C66580MXl.A11();
    }

    public List getAnalyticTags() {
        return AnonymousClass7TE.A1C();
    }

    public long getCacheFallbackByDuration_EXPERIMENTAL() {
        throw C66580MXl.A11();
    }

    public String getClientTraceId() {
        return this.mUserSubscriptionId;
    }

    public boolean getForceCacheOnNetworkError_EXPERIMENTAL() {
        throw C66580MXl.A11();
    }

    public Class getJsonHelperClass() {
        return this.mJsonHelperClass;
    }

    public String getOverrideRequestURL() {
        throw C66580MXl.A11();
    }

    public IGGraphQLSubscriptionRequestStringStub getQuery() {
        return this.mTypedGraphQLQueryString;
    }

    public AnonymousClass2IU getQueryParams() {
        return this.mSimpleGraphqlQueryParameters;
    }

    public String getSequencingKey() {
        throw C66580MXl.A11();
    }

    public 1Ef setAcsToken(C17551Va4 va4) {
        throw C66580MXl.A11();
    }

    public 1Ef setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        throw C66580MXl.A11();
    }

    public 1Ef setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(boolean z) {
        throw C66580MXl.A11();
    }

    public 1Ef setEnsureCacheWrite(boolean z) {
        throw C66580MXl.A11();
    }

    public 1Ef setForceCacheOnNetworkError_EXPERIMENTAL(boolean z) {
        throw C66580MXl.A11();
    }

    public 1Ef setFreshCacheAgeMs(long j) {
        throw C66580MXl.A11();
    }

    public 1Ef setIgnoreNonCriticalErrors(boolean z) {
        throw C66580MXl.A11();
    }

    public 1Ef setMaxToleratedCacheAgeMs(long j) {
        throw C66580MXl.A11();
    }

    public 1Ef setNetworkTimeoutSeconds(int i) {
        throw C66580MXl.A11();
    }

    public 1Ef setOhaiConfig(VZ3 vz3) {
        throw C66580MXl.A11();
    }

    public 1Ef setRealtimeBackgroundPolicy(int i) {
        throw C66580MXl.A11();
    }

    public 1Ef setRequestPurpose(int i) {
        throw C66580MXl.A11();
    }

    public 1Ef setRetryPolicy(int i) {
        throw C66580MXl.A11();
    }

    public 1Ef setSchemaOverride(String str) {
        throw C66580MXl.A11();
    }
}

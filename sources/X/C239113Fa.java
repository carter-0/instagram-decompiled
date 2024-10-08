package X;

/* renamed from: X.3Fa  reason: invalid class name and case insensitive filesystem */
public final class C239113Fa implements 1Ef, C64091Eg {
    public final 2IS A00;
    public final Class A01;
    public final String A02;
    public final boolean A03;

    public C239113Fa(2IS r2, Class cls, String str, boolean z) {
        0qQ.A0B(r2, 2);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = cls;
        this.A03 = z;
    }

    public final String getSchema() {
        return null;
    }

    public final /* bridge */ /* synthetic */ 1Ef addAdditionalHttpHeader(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef addTrackedHttpResponseHeader(String str) {
        throw new UnsupportedOperationException();
    }

    public final String getCallName() {
        return this.A02;
    }

    public final String getFriendlyName() {
        throw new UnsupportedOperationException();
    }

    public final AnonymousClass2IU getQueryParams() {
        return this.A00;
    }

    public final Class getTreeModelType() {
        return this.A01;
    }

    public final boolean hasAcsToken() {
        return false;
    }

    public final boolean hasOhaiConfig() {
        return false;
    }

    public final boolean isMutation() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ 1Ef setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setEnsureCacheWrite(boolean z) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setFreshCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setMaxToleratedCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setNetworkTimeoutSeconds(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setRequestPurpose(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ 1Ef setRetryPolicy(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean getEnsureCacheWrite() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final long getMaxToleratedCacheAgeMs() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 1Ef setOhaiConfig(VZ3 vz3) {
        throw AnonymousClass00P.createAndThrow();
    }
}

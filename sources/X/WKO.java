package X;

import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImpl;
import com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImpl;
import com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImplHolder;
import com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImpl;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.traffic.nts.iglib.IGReachabilityV2ProviderAppLayerUpcallsImpl;

public final class WKO implements TrafficNTSProvidersAppLayer {
    public final HttpRequestInterceptorProviderImpl A00;
    public final ReachabilityV2ProviderImplHolder A01;

    public final AppFgBgStateProviderImpl getAppFgBgStateProvider() {
        return null;
    }

    public final BackgroundV2TaskSchedulerImpl getBackgroundTaskScheduler() {
        return null;
    }

    public final boolean getEnableMobileProber() {
        return false;
    }

    public final StartupSignalsProviderImpl getStartupSignalsProvider() {
        return null;
    }

    public final XAnalyticsHolder getXAnalyticsHolder() {
        return null;
    }

    public final HttpRequestInterceptorProviderImpl getHttpRequestInterceptorProvider() {
        return this.A00;
    }

    public final ReachabilityV2ProviderImpl getReachabilityV2Provider() {
        ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder = this.A01;
        if (reachabilityV2ProviderImplHolder != null) {
            return reachabilityV2ProviderImplHolder.getReachabilityV2ProviderImpl();
        }
        return null;
    }

    public WKO(1BT r3) {
        HttpRequestInterceptorProviderImpl httpRequestInterceptorProviderImpl;
        ReachabilityV2ProviderImplHolder reachabilityV2ProviderImplHolder = null;
        if (r3.A05) {
            httpRequestInterceptorProviderImpl = new HttpRequestInterceptorProviderImpl();
        } else {
            httpRequestInterceptorProviderImpl = null;
        }
        this.A00 = httpRequestInterceptorProviderImpl;
        reachabilityV2ProviderImplHolder = r3.getEnableReachabilityProvider() ? new ReachabilityV2ProviderImplHolder() : reachabilityV2ProviderImplHolder;
        this.A01 = reachabilityV2ProviderImplHolder;
        if (reachabilityV2ProviderImplHolder != null) {
            reachabilityV2ProviderImplHolder.setUpcallImpl(new IGReachabilityV2ProviderAppLayerUpcallsImpl());
        }
    }
}
